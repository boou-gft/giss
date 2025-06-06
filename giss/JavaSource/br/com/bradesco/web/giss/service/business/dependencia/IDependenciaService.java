/*
 * =========================================================================
 * 
 * Cliente:      	Bradesco 
 * Projeto:      	INSERIR AQUI O NOME DO PROJETO
 * Desenvolvimento: BRADESCO
 * -------------------------------------------------------------------------
 * Última revisao:
 * $Source: /SGCAP/giss/01.Fontes/02.Baixa_Plataforma/01.Web/giss/src/br/com/bradesco/web/giss/service/business/dependencia/IDependenciaService.java,v $
 * $Id: IDependenciaService.java,v 1.1 2021/05/30 15:53:16 local_welber Exp $
 * $State: Exp $
 * -------------------------------------------------------------------------
 * Revisao - Histórico:
 * $Log: IDependenciaService.java,v $
 * Revision 1.1  2021/05/30 15:53:16  local_welber
 * Commit incial do projeto
 *
 * Revision 1.3  2017/11/10 13:10:59  gmichelini
 * Inclusão do botão Gerar Relatório EOS nas telas
 *
 * Tarifas Cobradas (PAs)
 * Resultado Municípios Novos
 * Manter Município
 *
 * Revision 1.2  2017/06/06 12:32:03  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2017/04/11 14:08:47  gmichelini
 * *** empty log message ***
 *
 * Revision 1.2  2012/12/10 15:20:13  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/11/22 15:41:36  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2012/10/01 15:16:08  gmichelini
 * *** empty log message ***
 *
 * Revision 1.1  2009/03/12 13:31:10  cpm.com.br\edwin.costa
 * Plugin WDE para o eclipse
 *
 *
 * =========================================================================
 */

package br.com.bradesco.web.giss.service.business.dependencia;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.dependencia.bean.AgenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.ConsultarMunicipiosNovosDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasHistoricasSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasMunicipioDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DependenciasNovasDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DetalhesDependenciasHistoricoEntradaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.DetalhesDependenciasHistoricoSaidaDTO;
import br.com.bradesco.web.giss.service.business.dependencia.bean.MunicipioDTO;
import br.com.bradesco.web.giss.service.business.dependenciasencerradas.bean.DependeciasEncerradasDTO;
import br.com.bradesco.web.giss.view.bean.model.dependencia.EstadosComboBean;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: Dependencia
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IDependenciaService {
	
	public List<SelectItem> listarComboEstados();
	
	public List<DependenciasNovasDTO> listarDependenciasNovas(Long empresa, Integer codDependencia);
	
	public List<AgenciaDTO> listarAgenciasMunicipio(String codigoMunicipio);
	
	public DependenciaDTO consultarInformacoesDependencia(DependenciasNovasDTO dependenciasNovasDTO);
	
	public DependenciaDTO consultarInformacoesDependencia(String municipio, String numeroSequenciaDependencia, String codigoPessoaJuridica, String dataAtualizacao);
	
	public DependenciaDTO consultarInformacoesDependencia(DependeciasEncerradasDTO dependenciaEncerrDTO);

	public List<MunicipioDTO> listarMunicipios(String estadoFiltro);
	
	public List<MunicipioDTO> listarMunicipiosComLoop(String estadoFiltro);
	
	public DependenciasMunicipioDTO listarDependenciasMunicipio(String codigoMunicipio, Integer codDependencia, String codPessoaJuridica);
	
	public DependenciasMunicipioDTO listarDependenciasMunicipioComLoop(String codigoMunicipio, Integer codDependencia, String codPessoaJuridica);
	
	public DependenciaDTO incluirDependenciaNova(String codigoPessoaJuridica, String numeroUnidadeOrganizacional, String codigoMunicipioManter, String inscricaoMunicipal, String codigoAgenciaIncorpDepto, String nomeAgenciaIncorpDepto, String ccm, int tipoDepartamento );

	public DependenciaDTO incluirDependencia(String codigoPessoaJuridica, String numeroUnidadeOrganizacional, String codigoMunicipioManter, String inscricaoMunicipal, String codigoAgenciaIncorpDepto, String nomeAgenciaIncorpDepto, String ccm, int tipoDepartamento );

	public DependenciaDTO excluirDependencia(String codigoPessoaJuridica, String numeroSequencialDependencia);
	
	public DependenciaDTO alterarDependencia(String codigoPessoaJuridica, String numeroUnidadeOrganizacional, String codigoMunicipioManter, String inscricaoMunicipal, String codigoAgenciaIncorpDepto, String nomeAgenciaIncorpDepto, String ccm, int tipoDepartamento, DependenciaDTO dto);
	
	public DependenciasHistoricasSaidaDTO listarDependenciasMunicipioHistorico(String codMunicipio, Integer codDependencia, String codPessoaJuridica);
	
	public List<DependeciasEncerradasDTO> listarDependenciasEncerradas(String dataDe, String dataAte);
	
	public DetalhesDependenciasHistoricoSaidaDTO consultaDependenciaHistorico(DetalhesDependenciasHistoricoEntradaDTO entrada);
	
	public DependenciaDTO consultarInformacoesDependenciaUnidOrgan(String codigoDependencia);
	
	public List<MunicipioDTO> listarHistMunicipiosPorEstado(String estadoFiltro);

	public List<EstadosComboBean> listagemEstados();
	
	public String ConsultarMunicipiosNovos(ConsultarMunicipiosNovosDTO entrada);
	
}

