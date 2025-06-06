package br.com.bradesco.web.giss.service.business.cargamassivaaliquota;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;

import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ItemManterAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ItemRemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.ManterAliquotaFiltroDTO;
import br.com.bradesco.web.giss.service.business.cargamassivaaliquota.bean.RemessaAliquotaDTO;
import br.com.bradesco.web.giss.service.report.base.exception.ReportException;

import com.lowagie.text.DocumentException;

/**
 * @nome: ICargaMassivaAliquotaService.java
 * 
 * @prop�sito: <p>Classe respons�vel por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public interface ICargaMassivaAliquotaService {

	/**
	 * @nome: listarCargaMassivaIssProprio
	 * @prop�sito: M�todo respons�vel por listarCargaMassivaIssProprio.
	 *
	 * @param filtro ManterAliquotaFiltroDTO
	 * @return List<RemessaAliquotaDTO>
	 */
	List<RemessaAliquotaDTO> listarCargaMassivaIssProprio(ManterAliquotaFiltroDTO filtro);
	
	/**
	 * @nome: listarCargaMassivaIssGerencial
	 * @prop�sito: M�todo respons�vel por listarCargaMassivaIssGerencial.
	 *
	 * @param filtro ManterAliquotaFiltroDTO
	 * @return List<RemessaAliquotaDTO>
	 */
	List<RemessaAliquotaDTO> listarCargaMassivaIssGerencial(ManterAliquotaFiltroDTO filtro);
	
	/**
	 * @nome: listarManterAliquotaIssProprio
	 * @prop�sito: M�todo respons�vel por listarManterAliquotaIssProprio.
	 *
	 * @param filtro ManterAliquotaFiltroDTO
	 * @return List<ManterAliquotaDTO>
	 */
	List<ManterAliquotaDTO> listarManterAliquotaIssProprio(ManterAliquotaFiltroDTO filtro);
	
	/**
	 * @nome: listarManterAliquotaIssGerencial
	 * @prop�sito: M�todo respons�vel por listarManterAliquotaIssGerencial.
	 *
	 * @param filtro ManterAliquotaFiltroDTO
	 * @return List<ManterAliquotaDTO>
	 */
	List<ManterAliquotaDTO> listarManterAliquotaIssGerencial(ManterAliquotaFiltroDTO filtro);

	/**
	 * @nome: detalharCargaMassivaIssProprio
	 * @prop�sito: M�todo respons�vel por detalharCargaMassivaIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return List<ItemRemessaAliquotaDTO>
	 */
	List<ItemRemessaAliquotaDTO> detalharCargaMassivaIssProprio(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: detalharCargaMassivaIssGerencial
	 * @prop�sito: M�todo respons�vel por detalharCargaMassivaIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return List<ItemRemessaAliquotaDTO>
	 */
	List<ItemRemessaAliquotaDTO> detalharCargaMassivaIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: detalharManterAliquotaIssProprio
	 * @prop�sito: M�todo respons�vel por detalharManterAliquotaIssProprio.
	 *
	 * @param manterAliquotaDTO ManterAliquotaDTO
	 * @param tipoTela String
	 * @return List<ItemManterAliquotaDTO>
	 */
	List<ItemManterAliquotaDTO> detalharManterAliquotaIssProprio(ManterAliquotaDTO manterAliquotaDTO, String tipoTela);
	
	/**
	 * @nome: detalharManterAliquotaIssGerencial
	 * @prop�sito: M�todo respons�vel por detalharManterAliquotaIssGerencial.
	 *
	 * @param manterAliquotaDTO ManterAliquotaDTO
	 * @param tipoTela String
	 * @return List<ItemManterAliquotaDTO>
	 */
	List<ItemManterAliquotaDTO> detalharManterAliquotaIssGerencial(ManterAliquotaDTO manterAliquotaDTO, String tipoTela);
	
	/**
	 * @nome: rejeitarIssProprio
	 * @prop�sito: M�todo respons�vel por rejeitarIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String rejeitarIssProprio(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: rejeitarIssGerencial
	 * @prop�sito: M�todo respons�vel por rejeitarIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String rejeitarIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO);

	/**
	 * @nome: conferirIssProprio
	 * @prop�sito: M�todo respons�vel por conferirIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String conferirIssProprio(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: conferirIssGerencial
	 * @prop�sito: M�todo respons�vel por conferirIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String conferirIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO);

	/**
	 * @nome: aprovarIssProprio
	 * @prop�sito: M�todo respons�vel por aprovarIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String aprovarIssProprio(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: aprovarIssGerencial
	 * @prop�sito: M�todo respons�vel por aprovarIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String aprovarIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO);

	/**
	 * @nome: gerarRelatorioCargaMassivaTXT
	 * @prop�sito: M�todo respons�vel por gerarRelatorioCargaMassivaTXT.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @param lista List<ItemRemessaAliquotaDTO>
	 * @param isIssProprio Boolean
	 * @param outputStream ServletOutputStream
	 * @throws DocumentException
	 * @throws ReportException
	 * @throws IOException
	 */
	void gerarRelatorioCargaMassivaTXT(RemessaAliquotaDTO remessaAliquotaDTO, List<ItemRemessaAliquotaDTO> lista, 
		Boolean isIssProprio, ServletOutputStream outputStream) throws DocumentException, ReportException, IOException;

	/**
	 * @nome: modificarAliquotaIssProprio
	 * @prop�sito: M�todo respons�vel por modificarAliquotaIssProprio.
	 *
	 * @param manterAliquotaDTO ManterAliquotaDTO
	 * @param listaSelecionados List<ItemManterAliquotaDTO>
	 * @param tipoTela String
	 * @return String
	 */
	String modificarAliquotaIssProprio(ManterAliquotaDTO manterAliquotaDTO,
			List<ItemManterAliquotaDTO> listaSelecionados, String tipoTela);
	
	/**
	 * @nome: modificarAliquotaIssGerencial
	 * @prop�sito: M�todo respons�vel por modificarAliquotaIssGerencial.
	 *
	 * @param manterAliquotaDTO ManterAliquotaDTO
	 * @param listaSelecionados List<ItemManterAliquotaDTO>
	 * @param tipoTela String
	 * @return String
	 */
	String modificarAliquotaIssGerencial(ManterAliquotaDTO manterAliquotaDTO,
			List<ItemManterAliquotaDTO> listaSelecionados, String tipoTela);

	/**
	 * @nome: solicitarRemessa
	 * @prop�sito: M�todo respons�vel por solicitarRemessa.
	 *
	 * @return String
	 */
	String solicitarRemessa();

}
