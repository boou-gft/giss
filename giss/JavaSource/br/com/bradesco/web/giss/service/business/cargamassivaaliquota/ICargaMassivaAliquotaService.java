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
 * @propósito: <p>Classe responsável por.</p>
 *
 * @author: BRQ <BR/>
 * @equipe: BRQ <BR/>
 * @version: 1.0
 * @see
 */
public interface ICargaMassivaAliquotaService {

	/**
	 * @nome: listarCargaMassivaIssProprio
	 * @propósito: Método responsável por listarCargaMassivaIssProprio.
	 *
	 * @param filtro ManterAliquotaFiltroDTO
	 * @return List<RemessaAliquotaDTO>
	 */
	List<RemessaAliquotaDTO> listarCargaMassivaIssProprio(ManterAliquotaFiltroDTO filtro);
	
	/**
	 * @nome: listarCargaMassivaIssGerencial
	 * @propósito: Método responsável por listarCargaMassivaIssGerencial.
	 *
	 * @param filtro ManterAliquotaFiltroDTO
	 * @return List<RemessaAliquotaDTO>
	 */
	List<RemessaAliquotaDTO> listarCargaMassivaIssGerencial(ManterAliquotaFiltroDTO filtro);
	
	/**
	 * @nome: listarManterAliquotaIssProprio
	 * @propósito: Método responsável por listarManterAliquotaIssProprio.
	 *
	 * @param filtro ManterAliquotaFiltroDTO
	 * @return List<ManterAliquotaDTO>
	 */
	List<ManterAliquotaDTO> listarManterAliquotaIssProprio(ManterAliquotaFiltroDTO filtro);
	
	/**
	 * @nome: listarManterAliquotaIssGerencial
	 * @propósito: Método responsável por listarManterAliquotaIssGerencial.
	 *
	 * @param filtro ManterAliquotaFiltroDTO
	 * @return List<ManterAliquotaDTO>
	 */
	List<ManterAliquotaDTO> listarManterAliquotaIssGerencial(ManterAliquotaFiltroDTO filtro);

	/**
	 * @nome: detalharCargaMassivaIssProprio
	 * @propósito: Método responsável por detalharCargaMassivaIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return List<ItemRemessaAliquotaDTO>
	 */
	List<ItemRemessaAliquotaDTO> detalharCargaMassivaIssProprio(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: detalharCargaMassivaIssGerencial
	 * @propósito: Método responsável por detalharCargaMassivaIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return List<ItemRemessaAliquotaDTO>
	 */
	List<ItemRemessaAliquotaDTO> detalharCargaMassivaIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: detalharManterAliquotaIssProprio
	 * @propósito: Método responsável por detalharManterAliquotaIssProprio.
	 *
	 * @param manterAliquotaDTO ManterAliquotaDTO
	 * @param tipoTela String
	 * @return List<ItemManterAliquotaDTO>
	 */
	List<ItemManterAliquotaDTO> detalharManterAliquotaIssProprio(ManterAliquotaDTO manterAliquotaDTO, String tipoTela);
	
	/**
	 * @nome: detalharManterAliquotaIssGerencial
	 * @propósito: Método responsável por detalharManterAliquotaIssGerencial.
	 *
	 * @param manterAliquotaDTO ManterAliquotaDTO
	 * @param tipoTela String
	 * @return List<ItemManterAliquotaDTO>
	 */
	List<ItemManterAliquotaDTO> detalharManterAliquotaIssGerencial(ManterAliquotaDTO manterAliquotaDTO, String tipoTela);
	
	/**
	 * @nome: rejeitarIssProprio
	 * @propósito: Método responsável por rejeitarIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String rejeitarIssProprio(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: rejeitarIssGerencial
	 * @propósito: Método responsável por rejeitarIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String rejeitarIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO);

	/**
	 * @nome: conferirIssProprio
	 * @propósito: Método responsável por conferirIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String conferirIssProprio(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: conferirIssGerencial
	 * @propósito: Método responsável por conferirIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String conferirIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO);

	/**
	 * @nome: aprovarIssProprio
	 * @propósito: Método responsável por aprovarIssProprio.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String aprovarIssProprio(RemessaAliquotaDTO remessaAliquotaDTO);
	
	/**
	 * @nome: aprovarIssGerencial
	 * @propósito: Método responsável por aprovarIssGerencial.
	 *
	 * @param remessaAliquotaDTO RemessaAliquotaDTO
	 * @return String
	 */
	String aprovarIssGerencial(RemessaAliquotaDTO remessaAliquotaDTO);

	/**
	 * @nome: gerarRelatorioCargaMassivaTXT
	 * @propósito: Método responsável por gerarRelatorioCargaMassivaTXT.
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
	 * @propósito: Método responsável por modificarAliquotaIssProprio.
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
	 * @propósito: Método responsável por modificarAliquotaIssGerencial.
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
	 * @propósito: Método responsável por solicitarRemessa.
	 *
	 * @return String
	 */
	String solicitarRemessa();

}
