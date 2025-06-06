package br.com.bradesco.web.giss.service.report.integracao.cargamassivaaliquota;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ItemRemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;
import br.com.bradesco.web.giss.utils.DateUtils;
import br.com.bradesco.web.giss.utils.GissUtil;
import br.com.bradesco.web.giss.utils.TabelaTxt;

public class CargaMassivaReportTXT {

	private RemessaAliquotaDTO dto;
	private List<ItemRemessaAliquotaDTO> lista;
	private Boolean isIssProprio;
	private OutputStreamWriter osw;
	
	/**
	 * Construtor, recebe o documento como fonte de dados
	 * 
	 * @param dto RemessaAliquotaDTO
	 * @param lista List<ItemRemessaAliquotaDTO>
	 * @param isIssProprio Boolean
	 * @param out OutputStream
	 */
	public CargaMassivaReportTXT(
			RemessaAliquotaDTO dto,
			List<ItemRemessaAliquotaDTO> lista,
			Boolean isIssProprio, OutputStream out) {
		this.dto = dto;
		this.lista = lista;
		this.isIssProprio = isIssProprio;
		this.osw = new OutputStreamWriter(out);
	}
	
	/**
	 * Gera o documento
	 * 
	 * @throws IOException
	 */
	public void gerar() throws ReportException, IOException {
		TabelaTxt txt = new TabelaTxt();
		montarCabecalhoTabela(txt);

		for (int i = 0; i < lista.size(); i++) {
			ItemRemessaAliquotaDTO itemDto = lista.get(i);
			montarTabela(dto, itemDto, txt);
		}
		try {
			txt.geraTxt(osw);
			osw.flush();
		} catch (IOException e) {
			throw new ReportException("Erro finalizar a geracao do relatorio TXT", e);
		}
	}
	
	private void montarCabecalhoTabela(TabelaTxt txt) throws ReportException {
		try {
			txt.add(GissUtil.getFacesMessage("label_remessa"));
			txt.add(GissUtil.getFacesMessage("label_situacao"));
			txt.add(GissUtil.getFacesMessage("label_usuario_carga"));
			txt.add(GissUtil.getFacesMessage("label_data_hora"));
			txt.add(GissUtil.getFacesMessage("label_usuario_conferencia"));
			txt.add(GissUtil.getFacesMessage("label_data_hora"));
			txt.add(GissUtil.getFacesMessage("label_usuario_aprovacao"));
			txt.add(GissUtil.getFacesMessage("label_data_hora"));
			txt.add(GissUtil.getFacesMessage("label_municipio"));			
			txt.add(GissUtil.getFacesMessage("label_descricao"));
			txt.add(GissUtil.getFacesMessage("label_uf"));
			txt.add(GissUtil.getFacesMessage("label_item_servico"));
			txt.add(GissUtil.getFacesMessage("label_aliquota_atualizar"));
			if (isIssProprio) {
				txt.add(GissUtil.getFacesMessage("label_aliquota_iss_proprio"));
			}
			txt.add(GissUtil.getFacesMessage("label_aliquota_iss_gerencial"));
			txt.quebraLinha();
		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar o cabecalho durante a geracao do relatorio TXT",
					e);
		}
	}
	
	private void montarTabela(RemessaAliquotaDTO dto, ItemRemessaAliquotaDTO itemDto, TabelaTxt txt) {
		try {
			txt.add(String.valueOf(dto.getNumeroRemessa()));
			txt.add(String.valueOf(dto.getSituacaoRemessa().getDescricao()));
			txt.add(String.valueOf(dto.getUsuarioCarga().getCodigo()));
			txt.add(String.valueOf(DateUtils.format(dto.getUsuarioCarga().getData(), GissUtil.DATA_HORA_COMPLETA_FORMATADO)));
			txt.add(String.valueOf(dto.getUsuarioConferencia().getCodigo()));
			txt.add(String.valueOf(DateUtils.format(dto.getUsuarioConferencia().getData(), GissUtil.DATA_HORA_COMPLETA_FORMATADO)));
			txt.add(String.valueOf(dto.getUsuarioAprovacao().getCodigo()));
			txt.add(String.valueOf(DateUtils.format(dto.getUsuarioAprovacao().getData(), GissUtil.DATA_HORA_COMPLETA_FORMATADO)));
			txt.add(String.valueOf(itemDto.getCodigoMunicipio()));
			txt.add(String.valueOf(itemDto.getNomeMunicipio()));
			txt.add(String.valueOf(itemDto.getUf()));
			txt.add(String.valueOf(itemDto.getItemServicoFormatado()));
			txt.add(String.valueOf(itemDto.getAliquotaAtual()));
			if (isIssProprio) {
				txt.add(String.valueOf(itemDto.getAliquotaISSProprio()));
			}
			txt.add(String.valueOf(itemDto.getAliquotaISSGerencial()));
			txt.quebraLinha();
		} catch (Exception e) {
			throw new ReportException(
					"Erro ao montar a tabela durante a geracao do relatorio TXT",
					e);
		}
	}
}
