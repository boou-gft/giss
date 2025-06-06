package br.com.bradesco.web.giss.service.data.pdc;

import br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.IAgenciaIncorporaDepartamentoResultPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.IAgendarPgtoIndividualPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.agendarpgtolote.IAgendarPgtoLotePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.agendarselecionadosoutodos.IAgendarSelecionadosOuTodosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alteraraliquota.IAlterarAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarcadastroemp.IAlterarCadastroEmpPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.IAlterarCodLancamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarcontacontabil.IAlterarContaContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterardependencia.IAlterarDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alteraritemcomplementar.IAlterarItemComplementarPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarmunicipio.IAlterarMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarmunicipioiss.IAlterarMunicipioISSPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.alterarpercentualtransicao.IAlterarPercentualTransicaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassiva.IAprovarCargaMassivaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.aprovarcargamassivagerencial.IAprovarCargaMassivaGerencialPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.IAtualizarAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.authenticationservice.IAuthenticationServicePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.calcularselecionadosoutodos.ICalcularSelecionadosOuTodosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.cancelartedtransferencia.ICancelarTedTransferenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.comboestados.IComboEstadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combolistadependencias.ICombolistadependenciasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combolistamunicipios.ICombolistamunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotipoincidencia.IComboTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.combotiposervico.IComboTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassiva.IConferirRejeitarCargaMassivaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.conferirrejeitarcargamassivagerencial.IConferirRejeitarCargaMassivaGerencialPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaapuracaopa.IConsultaApuracaoPaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.IConsultaApurParcialIssPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.IConsultaConciliacaoApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultadependenciahistorico.IConsultaDependenciaHistoricoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultahistoricocodigoslancamento.IConsultaHistoricoCodigosLancamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaraliquota.IConsultarAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultararquivoemp.IConsultarArquivoEmpPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarcompetencia.IConsultarCompetenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarcontas.IConsultarContasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultardependencia.IConsultarDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.IConsultarDependenciaAliquotaZeradaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciasencerradas.IConsultarDependenciasEncerradasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultardependenciaunidorganiz.IConsultarDependenciaUnidOrganizPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.IConsultarHistoricoMinMaxAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotipoincidencia.IConsultarHistoricoTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarhistoricotiposervico.IConsultarHistoricoTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarinformacoesaliquota.IConsultarInformacoesAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarliberarpagto.IConsultarLiberarPagtoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.IConsultarListaContasTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarlupacnpjemp.IConsultarLupaCnpjEmpPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarlupamunicipio.IConsultarLupaMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.IConsultarMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiosnovos.IConsultarMunicipiosNovosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiotabelahistorico.IConsultarMunicipioTabelaHistoricoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarmunicipiouf.IConsultarMunicipioUfPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.IConsultarOscilacaoNegativaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.IConsultarProcessarContabilidadePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultarrelacaopa.IConsultarRelacaoPaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.IConsultarTarifasCobradasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultartipoincidencia.IConsultarTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharcargamassiva.IDetalharCargaMassivaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.IDetalharDenpendenciasEncerradasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.IDetalharHistoricoEmpresaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.IDetalharHistoricoItemLeiComplPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharhistoricotipoincidencia.IDetalharHistoricoTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.IDetalharJustificativaApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.detalharmunicipiohistorico.IDetalharMunicipioHistoricoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.efetivaselecmunicipiossemconv.IEfetivaSelecMunicipiosSemConvPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirbalancete.IExcluirBalancetePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.IExcluirCodLancamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluircontacontabil.IExcluirContaContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluircontaempresa.IExcluirContaEmpresaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirctacontabil.IExcluirCtaContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirdependencia.IExcluirDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirempresa.IExcluirEmpresaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluiritemcomplementar.IExcluirItemComplementarPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirmunicipio.IExcluirMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.excluirpercentualtransicao.IExcluirPercentualTransicaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.executarbalancetefiscalizacoesiss.IExecutarBalanceteFiscalizacoesIssPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.gerarbalancete.IGerarBalancetePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.gerardependenciasplanapuracao.IGerarDependenciasPlanApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.IGerarRelatorioApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelatoriosaliquotas.IGerarRelatoriosAliquotasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluiralterarcontasmunicipio.IIncluirAlterarContasMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirapuracaoajuste.IIncluirApuracaoAjustePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirbalancete.IIncluirBalancetePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluircadastroemp.IIncluirCadastroEmpPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluircodlancamento.IIncluirCodLancamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluircontacontabil.IIncluirContaContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluircontaempresa.IIncluirContaEmpresaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirdependencia.IIncluirDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirdependenciasnovas.IIncluirDependenciasNovasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluiritemcomplementar.IIncluirItemComplementarPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirjustificativa.IIncluirJustificativaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.IIncluirMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirpercentualtransicao.IIncluirPercentualTransicaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.incluirtipoincidencia.IIncluirTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.ILiberarPagamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaapuracaoparcialfinal.IListaApuracaoParcialFinalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listacontasmunaliqdif.IListaContasMunAliqDifPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listadepapuracaoaposfechiss.IListaDepApuracaoAposFechISSPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.IListaDependenciaPorMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listahistmunicipioporestado.IListaHistMunicipioPorEstadoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaintermediariabalancetes.IListaIntermediariaBalancetesPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipio.IListaMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanter.IListaMunicipiosEstadoManterPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listamunicipiosestadomanterall.IListaMunicipiosEstadoManterAllPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao.IListaPlanilhaApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.IListaPlanilhaApuracao2PDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaragenciaincorporadepartamento.IListarAgenciaIncorporaDepartamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.IListarAliquotaZeradaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentoiss.IListarApuracaoAposFechamentoISSPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.IListarApuracaoFinalAposFechamentoISSPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensal.IListarApuracaoMensalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.IListarApuracaoMensalNvContaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalreprocessamento.IListarApuracaoMensalReprocessamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.IListarApuracaoMensalTotalizadaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.IListarApuracaoMovimentoNaoTributavelPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.IListarApuracaoParcialDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.IListarApuracaoParcialNvContaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.IListarApuracaoReprocessamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.IListarApurAposFechamentoNvContaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.IListarBalancetesPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarbalancetesparametrizados.IListarBalancetesParametrizadosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.IListarCargaMassivaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcargamassivagerencial.IListarCargaMassivaGerencialPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcodlancamento.IListarCodLancamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcombocosifemp.IListarComboCosifEmpPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcomboctareceita.IListarComboCtaReceitaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcombodescitemserv.IListarComboDescItemServPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcomboestado.IListarComboEstadoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcomborazao.IListarComboRazaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcombosistcontabil.IListarComboSistContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.IListarConciliacaoApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.IListarConciliacaoApuracaoLoopPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.IListarConsultaPagamentosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeis.IListarContasContabeisPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.IListarContasContabeisPeriodoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeistiposervico.IListarContasContabeisTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontasemp.IListarContasEmpPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontasnaoconstantesbase.IListarContasNaoConstantesBasePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.IListarContasTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardepapurmensalresulpesq.IListarDepApurMensalResulPesqPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.IListarDependenciaApuracaoMensalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciaplanilhaapuracao.IListarDependenciaPlanilhaApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.IListarDependenciasMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.IListarDependenciasNovasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldodivergente.IListarDependenciasSaldoDivergentePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.IListarDependenciasSaldoRecolhimentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listardiferencasretificadorcontabil.IListarDiferencasRetificadorContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarempcadastros.IListarEmpCadastrosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarempresa.IListarEmpresaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarempresasbalancetes.IListarEmpresasBalancetesPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarestadosbalancetes.IListarEstadosBalancetesPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarhistcodlancamento.IListarHistCodLancamentoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.IListarHistMunicEstadoDependenciasPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricoempresa.IListarHistoricoEmpresaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricoitemleicompl.IListarHistoricoItemLeiComplPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarhistoricomunicipio.IListarHistoricoMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listaritemcomplementar.IListarItemComplementarPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarlcaliquota.IListarLcAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmovnaotributavelnvconta.IListarMovNaoTributavelNvContaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipioaliquotadif.IListarMunicipioAliquotaDifPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiomanterall.IListarMunicipioManterAllPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipios.IListarMunicipiosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosbalancetes.IListarMunicipiosBalancetesPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovos.IListarMunicipiosNovosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiosnovosall.IListarMunicipiosNovosAllPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarnaoelegiveis.IListarNaoElegiveisPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarpagamentomanual.IListarPagamentoManualPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarmunicipiossemconvenio.IListarMunicipiosSemConvenioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarpedidobalancetes.IListarPedidoBalancetesPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarpercentualtransicao.IListarPercentualTransicaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarpgtosnaogerados.IListarPgtosNaoGeradosPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.IListarPgtosVencidosCompPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.IListarPlanilhaApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentodependencia.IListarReprocessamentoDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessamentopormunicipio.IListarReprocessamentoPorMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarreprocessarapuracao.IListarReprocessarApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.IListarResulApurMensalDifPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarresulpesqapurmensaldif.IListarResulPesqApurMensalDifPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarresultmunnovosall.IListarResultMunNovosAllPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorcontabil.IListarRetificadorContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarretificadorliberacao.IListarRetificadorLiberacaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listartipoincidencia.IListarTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listartiposervico.IListarTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.IListarValoresMesTotalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listarvalormestotalnvconta.IListarValorMesTotalNvContaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.IListaSaldosDivergentesPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.logtransmissaoarquivo.ILogTransmissaoArquivoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.IManterAliquotaDetalhePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.IManterAliquotaListaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.manteraliquotamanutencao.IManterAliquotaManutencaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.IManterTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.mantertiposervico.IManterTipoServicoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.manutencaologtransarquivo.IManutencaoLogTransArquivoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.obterdescdependencia.IObterDescDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepalterar.IParametrizacaoDepAlterarPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepconsultar.IParametrizacaoDepConsultarPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepexcluir.IParametrizacaoDepExcluirPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizacaodepincluir.IParametrizacaoDepIncluirPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.parametrizarminmaxaliquota.IParametrizarMinMaxAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.IProcessarContabilidadePDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.IProcessarRetificadorContabilPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.processarretificadorliberacao.IProcessarRetificadorLiberacaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.reativaritemservicolc.IReativarItemServicoLcPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.reativarmunicipioiss.IReativarMunicipioISSPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.IReprocessarApuracaoPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativa.IResultadoPesquisaOscilacaoNegativaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.resultadopesquisaoscilacaonegativaplanilha.IResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.resultpesqapurmovnaotributavel.IResultPesqApurMovNaoTributavelPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.solicitarremessaaliquota.ISolicitarRemessaAliquotaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopordependencia.ISolicitarReprocessamentoPorDependenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.solicitarreprocessamentopormunicipio.ISolicitarReprocessamentoPorMunicipioPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.validainclusaotipoincidencia.IValidaInclusaoTipoIncidenciaPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.consultararquivoempsemanal.IConsultarArquivoEmpSemanalPDCAdapter;
import br.com.bradesco.web.giss.service.data.pdc.gerarrelhisttransacoes.IGerarRelHistTransacoesPDCAdapter;
/**
 * 
 * <p>
 * <b>T�tulo:</b> Arquitetura Bradesco Canal Internet.
 * </p>
 * <p>
 * <b>Descri��o:</b>
 * </p>
 * <p>
 * F�brica para criar os adaptadores definidos no sistema.
 * </p>
 * 
 * @author GFT Iberia Solutions / Emagine <BR/> copyright Copyright (c) 2006
 *         <BR/> created <BR/>
 * @version 1.0
 *
 * Esta classe foi automaticamente gerada com 
 * <a href="http://www.bradesco.com.br">Generador de Adaptadores</a>
 */
 
public class FactoryAdapter {

    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AuthenticationService.
     */
    private IAuthenticationServicePDCAdapter pdcAuthenticationService;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ManterTipoServico.
     */
    private IManterTipoServicoPDCAdapter pdcManterTipoServico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarTipoServico.
     */
    private IListarTipoServicoPDCAdapter pdcListarTipoServico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirTipoIncidencia.
     */
    private IIncluirTipoIncidenciaPDCAdapter pdcIncluirTipoIncidencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ManterTipoIncidencia.
     */
    private IManterTipoIncidenciaPDCAdapter pdcManterTipoIncidencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirDependencia.
     */
    private IExcluirDependenciaPDCAdapter pdcExcluirDependencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ComboEstados.
     */
    private IComboEstadosPDCAdapter pdcComboEstados;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ComboTipoIncidencia.
     */
    private IComboTipoIncidenciaPDCAdapter pdcComboTipoIncidencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirMunicipio.
     */
    private IExcluirMunicipioPDCAdapter pdcExcluirMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarDependenciaUnidOrganiz.
     */
    private IConsultarDependenciaUnidOrganizPDCAdapter pdcConsultarDependenciaUnidOrganiz;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoAposFechamentoISS.
     */
    private IListarApuracaoAposFechamentoISSPDCAdapter pdcListarApuracaoAposFechamentoISS;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ComboTipoServico.
     */
    private IComboTipoServicoPDCAdapter pdcComboTipoServico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ValidaInclusaoTipoIncidencia.
     */
    private IValidaInclusaoTipoIncidenciaPDCAdapter pdcValidaInclusaoTipoIncidencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarReprocessamentoDependencia.
     */
    private IListarReprocessamentoDependenciaPDCAdapter pdcListarReprocessamentoDependencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarReprocessamentoPorMunicipio.
     */
    private IListarReprocessamentoPorMunicipioPDCAdapter pdcListarReprocessamentoPorMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador DetalharHistoricoTipoIncidencia.
     */
    private IDetalharHistoricoTipoIncidenciaPDCAdapter pdcDetalharHistoricoTipoIncidencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoMensalReprocessamento.
     */
    private IListarApuracaoMensalReprocessamentoPDCAdapter pdcListarApuracaoMensalReprocessamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarTipoIncidencia.
     */
    private IConsultarTipoIncidenciaPDCAdapter pdcConsultarTipoIncidencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarDependenciasSaldoDivergente.
     */
    private IListarDependenciasSaldoDivergentePDCAdapter pdcListarDependenciasSaldoDivergente;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaSaldosDivergentes.
     */
    private IListaSaldosDivergentesPDCAdapter pdcListaSaldosDivergentes;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarContasNaoConstantesBase.
     */
    private IListarContasNaoConstantesBasePDCAdapter pdcListarContasNaoConstantesBase;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AgenciaIncorporaDepartamentoResult.
     */
    private IAgenciaIncorporaDepartamentoResultPDCAdapter pdcAgenciaIncorporaDepartamentoResult;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarDependenciasSaldoRecolhimento.
     */
    private IListarDependenciasSaldoRecolhimentoPDCAdapter pdcListarDependenciasSaldoRecolhimento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador DetalharDenpendenciasEncerradas.
     */
    private IDetalharDenpendenciasEncerradasPDCAdapter pdcDetalharDenpendenciasEncerradas;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirDependencia.
     */
    private IIncluirDependenciaPDCAdapter pdcIncluirDependencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarEmpresa.
     */
    private IListarEmpresaPDCAdapter pdcListarEmpresa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ObterDescDependencia.
     */
    private IObterDescDependenciaPDCAdapter pdcObterDescDependencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaMunicipio.
     */
    private IListaMunicipioPDCAdapter pdcListaMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarDependenciasNovas.
     */
    private IListarDependenciasNovasPDCAdapter pdcListarDependenciasNovas;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirDependenciasNovas.
     */
    private IIncluirDependenciasNovasPDCAdapter pdcIncluirDependenciasNovas;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AtualizarAliquota.
     */
    private IAtualizarAliquotaPDCAdapter pdcAtualizarAliquota;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarDepApurMensalResulPesq.
     */
    private IListarDepApurMensalResulPesqPDCAdapter pdcListarDepApurMensalResulPesq;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarResulPesqApurMensalDif.
     */
    private IListarResulPesqApurMensalDifPDCAdapter pdcListarResulPesqApurMensalDif;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarAgenciaIncorporaDepartamento.
     */
    private IListarAgenciaIncorporaDepartamentoPDCAdapter pdcListarAgenciaIncorporaDepartamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarResulApurMensalDif.
     */
    private IListarResulApurMensalDifPDCAdapter pdcListarResulApurMensalDif;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarMunicipioAliquotaDif.
     */
    private IListarMunicipioAliquotaDifPDCAdapter pdcListarMunicipioAliquotaDif;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaApuracaoParcialFinal.
     */
    private IListaApuracaoParcialFinalPDCAdapter pdcListaApuracaoParcialFinal;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarContas.
     */
    private IConsultarContasPDCAdapter pdcConsultarContas;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoReprocessamento.
     */
    private IListarApuracaoReprocessamentoPDCAdapter pdcListarApuracaoReprocessamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador SolicitarReprocessamentoPorDependencia.
     */
    private ISolicitarReprocessamentoPorDependenciaPDCAdapter pdcSolicitarReprocessamentoPorDependencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador SolicitarReprocessamentoPorMunicipio.
     */
    private ISolicitarReprocessamentoPorMunicipioPDCAdapter pdcSolicitarReprocessamentoPorMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarMunicipio.
     */
    private IAlterarMunicipioPDCAdapter pdcAlterarMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirMunicipio.
     */
    private IIncluirMunicipioPDCAdapter pdcIncluirMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarHistoricoTipoIncidencia.
     */
    private IConsultarHistoricoTipoIncidenciaPDCAdapter pdcConsultarHistoricoTipoIncidencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarHistMunicEstadoDependencias.
     */
    private IListarHistMunicEstadoDependenciasPDCAdapter pdcListarHistMunicEstadoDependencias;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExecutarBalanceteFiscalizacoesIss.
     */
    private IExecutarBalanceteFiscalizacoesIssPDCAdapter pdcExecutarBalanceteFiscalizacoesIss;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarMunicipiosBalancetes.
     */
    private IListarMunicipiosBalancetesPDCAdapter pdcListarMunicipiosBalancetes;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarEmpresasBalancetes.
     */
    private IListarEmpresasBalancetesPDCAdapter pdcListarEmpresasBalancetes;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarEstadosBalancetes.
     */
    private IListarEstadosBalancetesPDCAdapter pdcListarEstadosBalancetes;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaIntermediariaBalancetes.
     */
    private IListaIntermediariaBalancetesPDCAdapter pdcListaIntermediariaBalancetes;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarPedidoBalancetes.
     */
    private IListarPedidoBalancetesPDCAdapter pdcListarPedidoBalancetes;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirBalancete.
     */
    private IIncluirBalancetePDCAdapter pdcIncluirBalancete;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirBalancete.
     */
    private IExcluirBalancetePDCAdapter pdcExcluirBalancete;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador GerarBalancete.
     */
    private IGerarBalancetePDCAdapter pdcGerarBalancete;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarBalancetesParametrizados.
     */
    private IListarBalancetesParametrizadosPDCAdapter pdcListarBalancetesParametrizados;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarBalancetes.
     */
    private IListarBalancetesPDCAdapter pdcListarBalancetes;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarCodLancamento.
     */
    private IAlterarCodLancamentoPDCAdapter pdcAlterarCodLancamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirCodLancamento.
     */
    private IIncluirCodLancamentoPDCAdapter pdcIncluirCodLancamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarMunicipio.
     */
    private IConsultarMunicipioPDCAdapter pdcConsultarMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaMunicipiosEstadoManter.
     */
    private IListaMunicipiosEstadoManterPDCAdapter pdcListaMunicipiosEstadoManter;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarMunicipiosNovos.
     */
    private IListarMunicipiosNovosPDCAdapter pdcListarMunicipiosNovos;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarMunicipiosNovosAll.
     */
    private IListarMunicipiosNovosAllPDCAdapter pdcListarMunicipiosNovosAll;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarMunicipioManterAll.
     */
    private IListarMunicipioManterAllPDCAdapter pdcListarMunicipioManterAll;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarDependencia.
     */
    private IAlterarDependenciaPDCAdapter pdcAlterarDependencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarDependencia.
     */
    private IConsultarDependenciaPDCAdapter pdcConsultarDependencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirCodLancamento.
     */
    private IExcluirCodLancamentoPDCAdapter pdcExcluirCodLancamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaHistMunicipioPorEstado.
     */
    private IListaHistMunicipioPorEstadoPDCAdapter pdcListaHistMunicipioPorEstado;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarHistoricoTipoServico.
     */
    private IConsultarHistoricoTipoServicoPDCAdapter pdcConsultarHistoricoTipoServico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarTipoIncidencia.
     */
    private IListarTipoIncidenciaPDCAdapter pdcListarTipoIncidencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaDependenciaPorMunicipio.
     */
    private IListaDependenciaPorMunicipioPDCAdapter pdcListaDependenciaPorMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarOscilacaoNegativa.
     */
    private IConsultarOscilacaoNegativaPDCAdapter pdcConsultarOscilacaoNegativa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoMovimentoNaoTributavel.
     */
    private IListarApuracaoMovimentoNaoTributavelPDCAdapter pdcListarApuracaoMovimentoNaoTributavel;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarAliquotaZerada.
     */
    private IListarAliquotaZeradaPDCAdapter pdcListarAliquotaZerada;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoFinalAposFechamentoISS.
     */
    private IListarApuracaoFinalAposFechamentoISSPDCAdapter pdcListarApuracaoFinalAposFechamentoISS;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoMensalTotalizada.
     */
    private IListarApuracaoMensalTotalizadaPDCAdapter pdcListarApuracaoMensalTotalizada;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarDependenciasEncerradas.
     */
    private IConsultarDependenciasEncerradasPDCAdapter pdcConsultarDependenciasEncerradas;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarContaContabil.
     */
    private IAlterarContaContabilPDCAdapter pdcAlterarContaContabil;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarRelacaoPa.
     */
    private IConsultarRelacaoPaPDCAdapter pdcConsultarRelacaoPa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirApuracaoAjuste.
     */
    private IIncluirApuracaoAjustePDCAdapter pdcIncluirApuracaoAjuste;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultaApurParcialIss.
     */
    private IConsultaApurParcialIssPDCAdapter pdcConsultaApurParcialIss;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultaConciliacaoApuracao.
     */
    private IConsultaConciliacaoApuracaoPDCAdapter pdcConsultaConciliacaoApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultaApuracaoPa.
     */
    private IConsultaApuracaoPaPDCAdapter pdcConsultaApuracaoPa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarMunicipiosNovos.
     */
    private IConsultarMunicipiosNovosPDCAdapter pdcConsultarMunicipiosNovos;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarItemComplementar.
     */
    private IAlterarItemComplementarPDCAdapter pdcAlterarItemComplementar;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarTarifasCobradas.
     */
    private IConsultarTarifasCobradasPDCAdapter pdcConsultarTarifasCobradas;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirItemComplementar.
     */
    private IExcluirItemComplementarPDCAdapter pdcExcluirItemComplementar;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultaHistoricoCodigosLancamento.
     */
    private IConsultaHistoricoCodigosLancamentoPDCAdapter pdcConsultaHistoricoCodigosLancamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarLupaCnpjEmp.
     */
    private IConsultarLupaCnpjEmpPDCAdapter pdcConsultarLupaCnpjEmp;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarComboSistContabil.
     */
    private IListarComboSistContabilPDCAdapter pdcListarComboSistContabil;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarComboDescItemServ.
     */
    private IListarComboDescItemServPDCAdapter pdcListarComboDescItemServ;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirContaEmpresa.
     */
    private IExcluirContaEmpresaPDCAdapter pdcExcluirContaEmpresa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirEmpresa.
     */
    private IExcluirEmpresaPDCAdapter pdcExcluirEmpresa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirContaEmpresa.
     */
    private IIncluirContaEmpresaPDCAdapter pdcIncluirContaEmpresa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarContasEmp.
     */
    private IListarContasEmpPDCAdapter pdcListarContasEmp;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarComboCosifEmp.
     */
    private IListarComboCosifEmpPDCAdapter pdcListarComboCosifEmp;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarComboCtaReceita.
     */
    private IListarComboCtaReceitaPDCAdapter pdcListarComboCtaReceita;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarComboRazao.
     */
    private IListarComboRazaoPDCAdapter pdcListarComboRazao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirContaContabil.
     */
    private IIncluirContaContabilPDCAdapter pdcIncluirContaContabil;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarAliquota.
     */
    private IAlterarAliquotaPDCAdapter pdcAlterarAliquota;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarAliquota.
     */
    private IConsultarAliquotaPDCAdapter pdcConsultarAliquota;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarLupaMunicipio.
     */
    private IConsultarLupaMunicipioPDCAdapter pdcConsultarLupaMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarLcAliquota.
     */
    private IListarLcAliquotaPDCAdapter pdcListarLcAliquota;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarMunicipios.
     */
    private IListarMunicipiosPDCAdapter pdcListarMunicipios;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarComboEstado.
     */
    private IListarComboEstadoPDCAdapter pdcListarComboEstado;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirItemComplementar.
     */
    private IIncluirItemComplementarPDCAdapter pdcIncluirItemComplementar;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaContasMunAliqDif.
     */
    private IListaContasMunAliqDifPDCAdapter pdcListaContasMunAliqDif;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarProcessarContabilidade.
     */
    private IConsultarProcessarContabilidadePDCAdapter pdcConsultarProcessarContabilidade;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ProcessarContabilidade.
     */
    private IProcessarContabilidadePDCAdapter pdcProcessarContabilidade;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirCtaContabil.
     */
    private IExcluirCtaContabilPDCAdapter pdcExcluirCtaContabil;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirContaContabil.
     */
    private IExcluirContaContabilPDCAdapter pdcExcluirContaContabil;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarDependenciasMunicipio.
     */
    private IListarDependenciasMunicipioPDCAdapter pdcListarDependenciasMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarValoresMesTotal.
     */
    private IListarValoresMesTotalPDCAdapter pdcListarValoresMesTotal;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarCompetencia.
     */
    private IConsultarCompetenciaPDCAdapter pdcConsultarCompetencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultaDependenciaHistorico.
     */
    private IConsultaDependenciaHistoricoPDCAdapter pdcConsultaDependenciaHistorico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarMunicipioTabelaHistorico.
     */
    private IConsultarMunicipioTabelaHistoricoPDCAdapter pdcConsultarMunicipioTabelaHistorico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarContasTipoServico.
     */
    private IListarContasTipoServicoPDCAdapter pdcListarContasTipoServico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarContasContabeisTipoServico.
     */
    private IListarContasContabeisTipoServicoPDCAdapter pdcListarContasContabeisTipoServico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarContasContabeis.
     */
    private IListarContasContabeisPDCAdapter pdcListarContasContabeis;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarContasContabeisPeriodo.
     */
    private IListarContasContabeisPeriodoPDCAdapter pdcListarContasContabeisPeriodo;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarDependenciaAliquotaZerada.
     */
    private IConsultarDependenciaAliquotaZeradaPDCAdapter pdcConsultarDependenciaAliquotaZerada;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaDepApuracaoAposFechISS.
     */
    private IListaDepApuracaoAposFechISSPDCAdapter pdcListaDepApuracaoAposFechISS;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoParcialDependencia.
     */
    private IListarApuracaoParcialDependenciaPDCAdapter pdcListarApuracaoParcialDependencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarDependenciaApuracaoMensal.
     */
    private IListarDependenciaApuracaoMensalPDCAdapter pdcListarDependenciaApuracaoMensal;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarDependenciaPlanilhaApuracao.
     */
    private IListarDependenciaPlanilhaApuracaoPDCAdapter pdcListarDependenciaPlanilhaApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ResultPesqApurMovNaoTributavel.
     */
    private IResultPesqApurMovNaoTributavelPDCAdapter pdcResultPesqApurMovNaoTributavel;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ResultadoPesquisaOscilacaoNegativa.
     */
    private IResultadoPesquisaOscilacaoNegativaPDCAdapter pdcResultadoPesquisaOscilacaoNegativa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ResultadoPesquisaOscilacaoNegativaPlanilha.
     */
    private IResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter pdcResultadoPesquisaOscilacaoNegativaPlanilha;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaMunicipiosEstadoManterAll.
     */
    private IListaMunicipiosEstadoManterAllPDCAdapter pdcListaMunicipiosEstadoManterAll;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarCodLancamento.
     */
    private IListarCodLancamentoPDCAdapter pdcListarCodLancamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarHistCodLancamento.
     */
    private IListarHistCodLancamentoPDCAdapter pdcListarHistCodLancamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoMensalNvConta.
     */
    private IListarApuracaoMensalNvContaPDCAdapter pdcListarApuracaoMensalNvConta;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoParcialNvConta.
     */
    private IListarApuracaoParcialNvContaPDCAdapter pdcListarApuracaoParcialNvConta;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApurAposFechamentoNvConta.
     */
    private IListarApurAposFechamentoNvContaPDCAdapter pdcListarApurAposFechamentoNvConta;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarMovNaoTributavelNvConta.
     */
    private IListarMovNaoTributavelNvContaPDCAdapter pdcListarMovNaoTributavelNvConta;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarValorMesTotalNvConta.
     */
    private IListarValorMesTotalNvContaPDCAdapter pdcListarValorMesTotalNvConta;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarApuracaoMensal.
     */
    private IListarApuracaoMensalPDCAdapter pdcListarApuracaoMensal;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirAlterarContasMunicipio.
     */
    private IIncluirAlterarContasMunicipioPDCAdapter pdcIncluirAlterarContasMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarListaContasTipoServico.
     */
    private IConsultarListaContasTipoServicoPDCAdapter pdcConsultarListaContasTipoServico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaPlanilhaApuracao.
     */
    private IListaPlanilhaApuracaoPDCAdapter pdcListaPlanilhaApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListaPlanilhaApuracao2.
     */
    private IListaPlanilhaApuracao2PDCAdapter pdcListaPlanilhaApuracao2;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarResultMunNovosAll.
     */
    private IListarResultMunNovosAllPDCAdapter pdcListarResultMunNovosAll;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarPlanilhaApuracao.
     */
    private IListarPlanilhaApuracaoPDCAdapter pdcListarPlanilhaApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador GerarDependenciasPlanApuracao.
     */
    private IGerarDependenciasPlanApuracaoPDCAdapter pdcGerarDependenciasPlanApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador LiberarPagamento.
     */
    private ILiberarPagamentoPDCAdapter pdcLiberarPagamento;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador DetalharJustificativaApuracao.
     */
    private IDetalharJustificativaApuracaoPDCAdapter pdcDetalharJustificativaApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirJustificativa.
     */
    private IIncluirJustificativaPDCAdapter pdcIncluirJustificativa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarConciliacaoApuracao.
     */
    private IListarConciliacaoApuracaoPDCAdapter pdcListarConciliacaoApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarConciliacaoApuracaoLoop.
     */
    private IListarConciliacaoApuracaoLoopPDCAdapter pdcListarConciliacaoApuracaoLoop;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ParametrizarMinMaxAliquota.
     */
    private IParametrizarMinMaxAliquotaPDCAdapter pdcParametrizarMinMaxAliquota;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarHistoricoMinMaxAliquota.
     */
    private IConsultarHistoricoMinMaxAliquotaPDCAdapter pdcConsultarHistoricoMinMaxAliquota;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarMunicipioISS.
     */
    private IAlterarMunicipioISSPDCAdapter pdcAlterarMunicipioISS;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ReativarMunicipioISS.
     */
    private IReativarMunicipioISSPDCAdapter pdcReativarMunicipioISS;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarHistoricoMunicipio.
     */
    private IListarHistoricoMunicipioPDCAdapter pdcListarHistoricoMunicipio;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarHistoricoItemLeiCompl.
     */
    private IListarHistoricoItemLeiComplPDCAdapter pdcListarHistoricoItemLeiCompl;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador DetalharHistoricoItemLeiCompl.
     */
    private IDetalharHistoricoItemLeiComplPDCAdapter pdcDetalharHistoricoItemLeiCompl;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarMunicipioUf.
     */
    private IConsultarMunicipioUfPDCAdapter pdcConsultarMunicipioUf;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarHistoricoEmpresa.
     */
    private IListarHistoricoEmpresaPDCAdapter pdcListarHistoricoEmpresa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarItemComplementar.
     */
    private IListarItemComplementarPDCAdapter pdcListarItemComplementar;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ReativarItemServicoLc.
     */
    private IReativarItemServicoLcPDCAdapter pdcReativarItemServicoLc;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarArquivoEmp.
     */
    private IConsultarArquivoEmpPDCAdapter pdcConsultarArquivoEmp;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador DetalharMunicipioHistorico.
     */
    private IDetalharMunicipioHistoricoPDCAdapter pdcDetalharMunicipioHistorico;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarCadastroEmp.
     */
    private IAlterarCadastroEmpPDCAdapter pdcAlterarCadastroEmp;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirCadastroEmp.
     */
    private IIncluirCadastroEmpPDCAdapter pdcIncluirCadastroEmp;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarEmpCadastros.
     */
    private IListarEmpCadastrosPDCAdapter pdcListarEmpCadastros;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador DetalharHistoricoEmpresa.
     */
    private IDetalharHistoricoEmpresaPDCAdapter pdcDetalharHistoricoEmpresa;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador GerarRelatoriosAliquotas.
     */
    private IGerarRelatoriosAliquotasPDCAdapter pdcGerarRelatoriosAliquotas;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarInformacoesAliquota.
     */
    private IConsultarInformacoesAliquotaPDCAdapter pdcConsultarInformacoesAliquota;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador GerarRelatorioApuracao.
     */
    private IGerarRelatorioApuracaoPDCAdapter pdcGerarRelatorioApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarLiberarPagto.
     */
    private IConsultarLiberarPagtoPDCAdapter pdcConsultarLiberarPagto;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AgendarPgtoLote.
     */
    private IAgendarPgtoLotePDCAdapter pdcAgendarPgtoLote;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarPgtosNaoGerados.
     */
    private IListarPgtosNaoGeradosPDCAdapter pdcListarPgtosNaoGerados;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarPgtosVencidosComp.
     */
    private IListarPgtosVencidosCompPDCAdapter pdcListarPgtosVencidosComp;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarNaoElegiveis.
     */
    private IListarNaoElegiveisPDCAdapter pdcListarNaoElegiveis;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarPagamentoManual.
     */
    private IListarPagamentoManualPDCAdapter pdcListarPagamentoManual;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarConsultaPagamentos.
     */
    private IListarConsultaPagamentosPDCAdapter pdcListarConsultaPagamentos;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AgendarPgtoIndividual.
     */
    private IAgendarPgtoIndividualPDCAdapter pdcAgendarPgtoIndividual;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AgendarSelecionadosOuTodos.
     */
    private IAgendarSelecionadosOuTodosPDCAdapter pdcAgendarSelecionadosOuTodos;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarPercentualTransicao.
     */
    private IListarPercentualTransicaoPDCAdapter pdcListarPercentualTransicao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador IncluirPercentualTransicao.
     */
    private IIncluirPercentualTransicaoPDCAdapter pdcIncluirPercentualTransicao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AlterarPercentualTransicao.
     */
    private IAlterarPercentualTransicaoPDCAdapter pdcAlterarPercentualTransicao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ExcluirPercentualTransicao.
     */
    private IExcluirPercentualTransicaoPDCAdapter pdcExcluirPercentualTransicao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador CancelarTedTransferencia.
     */
    private ICancelarTedTransferenciaPDCAdapter pdcCancelarTedTransferencia;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador CalcularSelecionadosOuTodos.
     */
    private ICalcularSelecionadosOuTodosPDCAdapter pdcCalcularSelecionadosOuTodos;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarCargaMassiva.
     */
    private IListarCargaMassivaPDCAdapter pdcListarCargaMassiva;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador DetalharCargaMassiva.
     */
    private IDetalharCargaMassivaPDCAdapter pdcDetalharCargaMassiva;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AprovarCargaMassiva.
     */
    private IAprovarCargaMassivaPDCAdapter pdcAprovarCargaMassiva;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConferirRejeitarCargaMassiva.
     */
    private IConferirRejeitarCargaMassivaPDCAdapter pdcConferirRejeitarCargaMassiva;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ManterAliquotaLista.
     */
    private IManterAliquotaListaPDCAdapter pdcManterAliquotaLista;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ManterAliquotaDetalhe.
     */
    private IManterAliquotaDetalhePDCAdapter pdcManterAliquotaDetalhe;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ManterAliquotaManutencao.
     */
    private IManterAliquotaManutencaoPDCAdapter pdcManterAliquotaManutencao;
    
    private IListarMunicipiosSemConvenioPDCAdapter pdcListarMunicipiosSemConvenio;
    
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador EfetivaSelecMunicipiosSemConv.
     */
    private IEfetivaSelecMunicipiosSemConvPDCAdapter pdcEfetivaSelecMunicipiosSemConv;
    /**
         * M�todo invocado para obter um adaptador ListarMunicipiosSemConvenio.
         * 
         * @return Adaptador ListarMunicipiosSemConvenio
         */
    public IListarMunicipiosSemConvenioPDCAdapter getListarMunicipiosSemConvenioPDCAdapter() {
      return pdcListarMunicipiosSemConvenio;
    }
    /**
         * M�todo invocado para establecer um adaptador ListarMunicipiosSemConvenio.
         * 
         * @param pdcListarMunicipiosSemConvenio
         *            Adaptador ListarMunicipiosSemConvenio
         */
    public void setListarMunicipiosSemConvenioPDCAdapter(IListarMunicipiosSemConvenioPDCAdapter pdcListarMunicipiosSemConvenio) {
      this.pdcListarMunicipiosSemConvenio = pdcListarMunicipiosSemConvenio;
    }

    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador SolicitarRemessaAliquota.
     */
    private ISolicitarRemessaAliquotaPDCAdapter pdcSolicitarRemessaAliquota;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarCargaMassivaGerencial.
     */
    private IListarCargaMassivaGerencialPDCAdapter pdcListarCargaMassivaGerencial;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConferirRejeitarCargaMassivaGerencial.
     */
    private IConferirRejeitarCargaMassivaGerencialPDCAdapter pdcConferirRejeitarCargaMassivaGerencial;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarRetificadorContabil.
     */
    private IListarRetificadorContabilPDCAdapter pdcListarRetificadorContabil;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador AprovarCargaMassivaGerencial.
     */
    private IAprovarCargaMassivaGerencialPDCAdapter pdcAprovarCargaMassivaGerencial;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ProcessarRetificadorContabil.
     */
    private IProcessarRetificadorContabilPDCAdapter pdcProcessarRetificadorContabil;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarRetificadorLiberacao.
     */
    private IListarRetificadorLiberacaoPDCAdapter pdcListarRetificadorLiberacao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ProcessarRetificadorLiberacao.
     */
    private IProcessarRetificadorLiberacaoPDCAdapter pdcProcessarRetificadorLiberacao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarDiferencasRetificadorContabil.
     */
    private IListarDiferencasRetificadorContabilPDCAdapter pdcListarDiferencasRetificadorContabil;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ListarReprocessarApuracao.
     */
    private IListarReprocessarApuracaoPDCAdapter pdcListarReprocessarApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ReprocessarApuracao.
     */
    private IReprocessarApuracaoPDCAdapter pdcReprocessarApuracao;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ParametrizacaoDepIncluir.
     */
    private IParametrizacaoDepIncluirPDCAdapter pdcParametrizacaoDepIncluir;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ParametrizacaoDepAlterar.
     */
    private IParametrizacaoDepAlterarPDCAdapter pdcParametrizacaoDepAlterar;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ParametrizacaoDepExcluir.
     */
    private IParametrizacaoDepExcluirPDCAdapter pdcParametrizacaoDepExcluir;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ParametrizacaoDepConsultar.
     */
    private IParametrizacaoDepConsultarPDCAdapter pdcParametrizacaoDepConsultar;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ManutencaoLogTransArquivo.
     */
    private IManutencaoLogTransArquivoPDCAdapter pdcManutencaoLogTransArquivo;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador LogTransmissaoArquivo.
     */
    private ILogTransmissaoArquivoPDCAdapter pdcLogTransmissaoArquivo;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador Combolistamunicipios.
     */
    private ICombolistamunicipiosPDCAdapter pdcCombolistamunicipios;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador Combolistadependencias.
     */
    private ICombolistadependenciasPDCAdapter pdcCombolistadependencias;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador ConsultarArquivoEmpSemanal.
     */
    private IConsultarArquivoEmpSemanalPDCAdapter pdcConsultarArquivoEmpSemanal;
    /**
     * Vari�vel que cont�m uma inst�ncia do adaptador GerarRelHistTransacoes.
     */
    private IGerarRelHistTransacoesPDCAdapter pdcGerarRelHistTransacoes;

    /**
     * M�todo invocado para obter um adaptador AuthenticationService.
     * 
     * @return Adaptador AuthenticationService
     */
    public IAuthenticationServicePDCAdapter getAuthenticationServicePDCAdapter() {
        return pdcAuthenticationService;
    }

    /**
     * M�todo invocado para establecer um adaptador AuthenticationService.
     * 
     * @param pdcAuthenticationService
     *            Adaptador AuthenticationService
     */
    public void setAuthenticationServicePDCAdapter(IAuthenticationServicePDCAdapter pdcAuthenticationService) {
        this.pdcAuthenticationService = pdcAuthenticationService;
    }
    /**
     * M�todo invocado para obter um adaptador ManterTipoServico.
     * 
     * @return Adaptador ManterTipoServico
     */
    public IManterTipoServicoPDCAdapter getManterTipoServicoPDCAdapter() {
        return pdcManterTipoServico;
    }

    /**
     * M�todo invocado para establecer um adaptador ManterTipoServico.
     * 
     * @param pdcManterTipoServico
     *            Adaptador ManterTipoServico
     */
    public void setManterTipoServicoPDCAdapter(IManterTipoServicoPDCAdapter pdcManterTipoServico) {
        this.pdcManterTipoServico = pdcManterTipoServico;
    }
    /**
     * M�todo invocado para obter um adaptador ListarTipoServico.
     * 
     * @return Adaptador ListarTipoServico
     */
    public IListarTipoServicoPDCAdapter getListarTipoServicoPDCAdapter() {
        return pdcListarTipoServico;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarTipoServico.
     * 
     * @param pdcListarTipoServico
     *            Adaptador ListarTipoServico
     */
    public void setListarTipoServicoPDCAdapter(IListarTipoServicoPDCAdapter pdcListarTipoServico) {
        this.pdcListarTipoServico = pdcListarTipoServico;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirTipoIncidencia.
     * 
     * @return Adaptador IncluirTipoIncidencia
     */
    public IIncluirTipoIncidenciaPDCAdapter getIncluirTipoIncidenciaPDCAdapter() {
        return pdcIncluirTipoIncidencia;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirTipoIncidencia.
     * 
     * @param pdcIncluirTipoIncidencia
     *            Adaptador IncluirTipoIncidencia
     */
    public void setIncluirTipoIncidenciaPDCAdapter(IIncluirTipoIncidenciaPDCAdapter pdcIncluirTipoIncidencia) {
        this.pdcIncluirTipoIncidencia = pdcIncluirTipoIncidencia;
    }
    /**
     * M�todo invocado para obter um adaptador ManterTipoIncidencia.
     * 
     * @return Adaptador ManterTipoIncidencia
     */
    public IManterTipoIncidenciaPDCAdapter getManterTipoIncidenciaPDCAdapter() {
        return pdcManterTipoIncidencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ManterTipoIncidencia.
     * 
     * @param pdcManterTipoIncidencia
     *            Adaptador ManterTipoIncidencia
     */
    public void setManterTipoIncidenciaPDCAdapter(IManterTipoIncidenciaPDCAdapter pdcManterTipoIncidencia) {
        this.pdcManterTipoIncidencia = pdcManterTipoIncidencia;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirDependencia.
     * 
     * @return Adaptador ExcluirDependencia
     */
    public IExcluirDependenciaPDCAdapter getExcluirDependenciaPDCAdapter() {
        return pdcExcluirDependencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirDependencia.
     * 
     * @param pdcExcluirDependencia
     *            Adaptador ExcluirDependencia
     */
    public void setExcluirDependenciaPDCAdapter(IExcluirDependenciaPDCAdapter pdcExcluirDependencia) {
        this.pdcExcluirDependencia = pdcExcluirDependencia;
    }
    /**
     * M�todo invocado para obter um adaptador ComboEstados.
     * 
     * @return Adaptador ComboEstados
     */
    public IComboEstadosPDCAdapter getComboEstadosPDCAdapter() {
        return pdcComboEstados;
    }

    /**
     * M�todo invocado para establecer um adaptador ComboEstados.
     * 
     * @param pdcComboEstados
     *            Adaptador ComboEstados
     */
    public void setComboEstadosPDCAdapter(IComboEstadosPDCAdapter pdcComboEstados) {
        this.pdcComboEstados = pdcComboEstados;
    }
    /**
     * M�todo invocado para obter um adaptador ComboTipoIncidencia.
     * 
     * @return Adaptador ComboTipoIncidencia
     */
    public IComboTipoIncidenciaPDCAdapter getComboTipoIncidenciaPDCAdapter() {
        return pdcComboTipoIncidencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ComboTipoIncidencia.
     * 
     * @param pdcComboTipoIncidencia
     *            Adaptador ComboTipoIncidencia
     */
    public void setComboTipoIncidenciaPDCAdapter(IComboTipoIncidenciaPDCAdapter pdcComboTipoIncidencia) {
        this.pdcComboTipoIncidencia = pdcComboTipoIncidencia;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirMunicipio.
     * 
     * @return Adaptador ExcluirMunicipio
     */
    public IExcluirMunicipioPDCAdapter getExcluirMunicipioPDCAdapter() {
        return pdcExcluirMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirMunicipio.
     * 
     * @param pdcExcluirMunicipio
     *            Adaptador ExcluirMunicipio
     */
    public void setExcluirMunicipioPDCAdapter(IExcluirMunicipioPDCAdapter pdcExcluirMunicipio) {
        this.pdcExcluirMunicipio = pdcExcluirMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarDependenciaUnidOrganiz.
     * 
     * @return Adaptador ConsultarDependenciaUnidOrganiz
     */
    public IConsultarDependenciaUnidOrganizPDCAdapter getConsultarDependenciaUnidOrganizPDCAdapter() {
        return pdcConsultarDependenciaUnidOrganiz;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarDependenciaUnidOrganiz.
     * 
     * @param pdcConsultarDependenciaUnidOrganiz
     *            Adaptador ConsultarDependenciaUnidOrganiz
     */
    public void setConsultarDependenciaUnidOrganizPDCAdapter(IConsultarDependenciaUnidOrganizPDCAdapter pdcConsultarDependenciaUnidOrganiz) {
        this.pdcConsultarDependenciaUnidOrganiz = pdcConsultarDependenciaUnidOrganiz;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoAposFechamentoISS.
     * 
     * @return Adaptador ListarApuracaoAposFechamentoISS
     */
    public IListarApuracaoAposFechamentoISSPDCAdapter getListarApuracaoAposFechamentoISSPDCAdapter() {
        return pdcListarApuracaoAposFechamentoISS;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoAposFechamentoISS.
     * 
     * @param pdcListarApuracaoAposFechamentoISS
     *            Adaptador ListarApuracaoAposFechamentoISS
     */
    public void setListarApuracaoAposFechamentoISSPDCAdapter(IListarApuracaoAposFechamentoISSPDCAdapter pdcListarApuracaoAposFechamentoISS) {
        this.pdcListarApuracaoAposFechamentoISS = pdcListarApuracaoAposFechamentoISS;
    }
    /**
     * M�todo invocado para obter um adaptador ComboTipoServico.
     * 
     * @return Adaptador ComboTipoServico
     */
    public IComboTipoServicoPDCAdapter getComboTipoServicoPDCAdapter() {
        return pdcComboTipoServico;
    }

    /**
     * M�todo invocado para establecer um adaptador ComboTipoServico.
     * 
     * @param pdcComboTipoServico
     *            Adaptador ComboTipoServico
     */
    public void setComboTipoServicoPDCAdapter(IComboTipoServicoPDCAdapter pdcComboTipoServico) {
        this.pdcComboTipoServico = pdcComboTipoServico;
    }
    /**
     * M�todo invocado para obter um adaptador ValidaInclusaoTipoIncidencia.
     * 
     * @return Adaptador ValidaInclusaoTipoIncidencia
     */
    public IValidaInclusaoTipoIncidenciaPDCAdapter getValidaInclusaoTipoIncidenciaPDCAdapter() {
        return pdcValidaInclusaoTipoIncidencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ValidaInclusaoTipoIncidencia.
     * 
     * @param pdcValidaInclusaoTipoIncidencia
     *            Adaptador ValidaInclusaoTipoIncidencia
     */
    public void setValidaInclusaoTipoIncidenciaPDCAdapter(IValidaInclusaoTipoIncidenciaPDCAdapter pdcValidaInclusaoTipoIncidencia) {
        this.pdcValidaInclusaoTipoIncidencia = pdcValidaInclusaoTipoIncidencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListarReprocessamentoDependencia.
     * 
     * @return Adaptador ListarReprocessamentoDependencia
     */
    public IListarReprocessamentoDependenciaPDCAdapter getListarReprocessamentoDependenciaPDCAdapter() {
        return pdcListarReprocessamentoDependencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarReprocessamentoDependencia.
     * 
     * @param pdcListarReprocessamentoDependencia
     *            Adaptador ListarReprocessamentoDependencia
     */
    public void setListarReprocessamentoDependenciaPDCAdapter(IListarReprocessamentoDependenciaPDCAdapter pdcListarReprocessamentoDependencia) {
        this.pdcListarReprocessamentoDependencia = pdcListarReprocessamentoDependencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListarReprocessamentoPorMunicipio.
     * 
     * @return Adaptador ListarReprocessamentoPorMunicipio
     */
    public IListarReprocessamentoPorMunicipioPDCAdapter getListarReprocessamentoPorMunicipioPDCAdapter() {
        return pdcListarReprocessamentoPorMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarReprocessamentoPorMunicipio.
     * 
     * @param pdcListarReprocessamentoPorMunicipio
     *            Adaptador ListarReprocessamentoPorMunicipio
     */
    public void setListarReprocessamentoPorMunicipioPDCAdapter(IListarReprocessamentoPorMunicipioPDCAdapter pdcListarReprocessamentoPorMunicipio) {
        this.pdcListarReprocessamentoPorMunicipio = pdcListarReprocessamentoPorMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador DetalharHistoricoTipoIncidencia.
     * 
     * @return Adaptador DetalharHistoricoTipoIncidencia
     */
    public IDetalharHistoricoTipoIncidenciaPDCAdapter getDetalharHistoricoTipoIncidenciaPDCAdapter() {
        return pdcDetalharHistoricoTipoIncidencia;
    }

    /**
     * M�todo invocado para establecer um adaptador DetalharHistoricoTipoIncidencia.
     * 
     * @param pdcDetalharHistoricoTipoIncidencia
     *            Adaptador DetalharHistoricoTipoIncidencia
     */
    public void setDetalharHistoricoTipoIncidenciaPDCAdapter(IDetalharHistoricoTipoIncidenciaPDCAdapter pdcDetalharHistoricoTipoIncidencia) {
        this.pdcDetalharHistoricoTipoIncidencia = pdcDetalharHistoricoTipoIncidencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoMensalReprocessamento.
     * 
     * @return Adaptador ListarApuracaoMensalReprocessamento
     */
    public IListarApuracaoMensalReprocessamentoPDCAdapter getListarApuracaoMensalReprocessamentoPDCAdapter() {
        return pdcListarApuracaoMensalReprocessamento;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoMensalReprocessamento.
     * 
     * @param pdcListarApuracaoMensalReprocessamento
     *            Adaptador ListarApuracaoMensalReprocessamento
     */
    public void setListarApuracaoMensalReprocessamentoPDCAdapter(IListarApuracaoMensalReprocessamentoPDCAdapter pdcListarApuracaoMensalReprocessamento) {
        this.pdcListarApuracaoMensalReprocessamento = pdcListarApuracaoMensalReprocessamento;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarTipoIncidencia.
     * 
     * @return Adaptador ConsultarTipoIncidencia
     */
    public IConsultarTipoIncidenciaPDCAdapter getConsultarTipoIncidenciaPDCAdapter() {
        return pdcConsultarTipoIncidencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarTipoIncidencia.
     * 
     * @param pdcConsultarTipoIncidencia
     *            Adaptador ConsultarTipoIncidencia
     */
    public void setConsultarTipoIncidenciaPDCAdapter(IConsultarTipoIncidenciaPDCAdapter pdcConsultarTipoIncidencia) {
        this.pdcConsultarTipoIncidencia = pdcConsultarTipoIncidencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListarDependenciasSaldoDivergente.
     * 
     * @return Adaptador ListarDependenciasSaldoDivergente
     */
    public IListarDependenciasSaldoDivergentePDCAdapter getListarDependenciasSaldoDivergentePDCAdapter() {
        return pdcListarDependenciasSaldoDivergente;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarDependenciasSaldoDivergente.
     * 
     * @param pdcListarDependenciasSaldoDivergente
     *            Adaptador ListarDependenciasSaldoDivergente
     */
    public void setListarDependenciasSaldoDivergentePDCAdapter(IListarDependenciasSaldoDivergentePDCAdapter pdcListarDependenciasSaldoDivergente) {
        this.pdcListarDependenciasSaldoDivergente = pdcListarDependenciasSaldoDivergente;
    }
    /**
     * M�todo invocado para obter um adaptador ListaSaldosDivergentes.
     * 
     * @return Adaptador ListaSaldosDivergentes
     */
    public IListaSaldosDivergentesPDCAdapter getListaSaldosDivergentesPDCAdapter() {
        return pdcListaSaldosDivergentes;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaSaldosDivergentes.
     * 
     * @param pdcListaSaldosDivergentes
     *            Adaptador ListaSaldosDivergentes
     */
    public void setListaSaldosDivergentesPDCAdapter(IListaSaldosDivergentesPDCAdapter pdcListaSaldosDivergentes) {
        this.pdcListaSaldosDivergentes = pdcListaSaldosDivergentes;
    }
    /**
     * M�todo invocado para obter um adaptador ListarContasNaoConstantesBase.
     * 
     * @return Adaptador ListarContasNaoConstantesBase
     */
    public IListarContasNaoConstantesBasePDCAdapter getListarContasNaoConstantesBasePDCAdapter() {
        return pdcListarContasNaoConstantesBase;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarContasNaoConstantesBase.
     * 
     * @param pdcListarContasNaoConstantesBase
     *            Adaptador ListarContasNaoConstantesBase
     */
    public void setListarContasNaoConstantesBasePDCAdapter(IListarContasNaoConstantesBasePDCAdapter pdcListarContasNaoConstantesBase) {
        this.pdcListarContasNaoConstantesBase = pdcListarContasNaoConstantesBase;
    }
    /**
     * M�todo invocado para obter um adaptador AgenciaIncorporaDepartamentoResult.
     * 
     * @return Adaptador AgenciaIncorporaDepartamentoResult
     */
    public IAgenciaIncorporaDepartamentoResultPDCAdapter getAgenciaIncorporaDepartamentoResultPDCAdapter() {
        return pdcAgenciaIncorporaDepartamentoResult;
    }

    /**
     * M�todo invocado para establecer um adaptador AgenciaIncorporaDepartamentoResult.
     * 
     * @param pdcAgenciaIncorporaDepartamentoResult
     *            Adaptador AgenciaIncorporaDepartamentoResult
     */
    public void setAgenciaIncorporaDepartamentoResultPDCAdapter(IAgenciaIncorporaDepartamentoResultPDCAdapter pdcAgenciaIncorporaDepartamentoResult) {
        this.pdcAgenciaIncorporaDepartamentoResult = pdcAgenciaIncorporaDepartamentoResult;
    }
    /**
     * M�todo invocado para obter um adaptador ListarDependenciasSaldoRecolhimento.
     * 
     * @return Adaptador ListarDependenciasSaldoRecolhimento
     */
    public IListarDependenciasSaldoRecolhimentoPDCAdapter getListarDependenciasSaldoRecolhimentoPDCAdapter() {
        return pdcListarDependenciasSaldoRecolhimento;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarDependenciasSaldoRecolhimento.
     * 
     * @param pdcListarDependenciasSaldoRecolhimento
     *            Adaptador ListarDependenciasSaldoRecolhimento
     */
    public void setListarDependenciasSaldoRecolhimentoPDCAdapter(IListarDependenciasSaldoRecolhimentoPDCAdapter pdcListarDependenciasSaldoRecolhimento) {
        this.pdcListarDependenciasSaldoRecolhimento = pdcListarDependenciasSaldoRecolhimento;
    }
    /**
     * M�todo invocado para obter um adaptador DetalharDenpendenciasEncerradas.
     * 
     * @return Adaptador DetalharDenpendenciasEncerradas
     */
    public IDetalharDenpendenciasEncerradasPDCAdapter getDetalharDenpendenciasEncerradasPDCAdapter() {
        return pdcDetalharDenpendenciasEncerradas;
    }

    /**
     * M�todo invocado para establecer um adaptador DetalharDenpendenciasEncerradas.
     * 
     * @param pdcDetalharDenpendenciasEncerradas
     *            Adaptador DetalharDenpendenciasEncerradas
     */
    public void setDetalharDenpendenciasEncerradasPDCAdapter(IDetalharDenpendenciasEncerradasPDCAdapter pdcDetalharDenpendenciasEncerradas) {
        this.pdcDetalharDenpendenciasEncerradas = pdcDetalharDenpendenciasEncerradas;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirDependencia.
     * 
     * @return Adaptador IncluirDependencia
     */
    public IIncluirDependenciaPDCAdapter getIncluirDependenciaPDCAdapter() {
        return pdcIncluirDependencia;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirDependencia.
     * 
     * @param pdcIncluirDependencia
     *            Adaptador IncluirDependencia
     */
    public void setIncluirDependenciaPDCAdapter(IIncluirDependenciaPDCAdapter pdcIncluirDependencia) {
        this.pdcIncluirDependencia = pdcIncluirDependencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListarEmpresa.
     * 
     * @return Adaptador ListarEmpresa
     */
    public IListarEmpresaPDCAdapter getListarEmpresaPDCAdapter() {
        return pdcListarEmpresa;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarEmpresa.
     * 
     * @param pdcListarEmpresa
     *            Adaptador ListarEmpresa
     */
    public void setListarEmpresaPDCAdapter(IListarEmpresaPDCAdapter pdcListarEmpresa) {
        this.pdcListarEmpresa = pdcListarEmpresa;
    }
    /**
     * M�todo invocado para obter um adaptador ObterDescDependencia.
     * 
     * @return Adaptador ObterDescDependencia
     */
    public IObterDescDependenciaPDCAdapter getObterDescDependenciaPDCAdapter() {
        return pdcObterDescDependencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ObterDescDependencia.
     * 
     * @param pdcObterDescDependencia
     *            Adaptador ObterDescDependencia
     */
    public void setObterDescDependenciaPDCAdapter(IObterDescDependenciaPDCAdapter pdcObterDescDependencia) {
        this.pdcObterDescDependencia = pdcObterDescDependencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListaMunicipio.
     * 
     * @return Adaptador ListaMunicipio
     */
    public IListaMunicipioPDCAdapter getListaMunicipioPDCAdapter() {
        return pdcListaMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaMunicipio.
     * 
     * @param pdcListaMunicipio
     *            Adaptador ListaMunicipio
     */
    public void setListaMunicipioPDCAdapter(IListaMunicipioPDCAdapter pdcListaMunicipio) {
        this.pdcListaMunicipio = pdcListaMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ListarDependenciasNovas.
     * 
     * @return Adaptador ListarDependenciasNovas
     */
    public IListarDependenciasNovasPDCAdapter getListarDependenciasNovasPDCAdapter() {
        return pdcListarDependenciasNovas;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarDependenciasNovas.
     * 
     * @param pdcListarDependenciasNovas
     *            Adaptador ListarDependenciasNovas
     */
    public void setListarDependenciasNovasPDCAdapter(IListarDependenciasNovasPDCAdapter pdcListarDependenciasNovas) {
        this.pdcListarDependenciasNovas = pdcListarDependenciasNovas;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirDependenciasNovas.
     * 
     * @return Adaptador IncluirDependenciasNovas
     */
    public IIncluirDependenciasNovasPDCAdapter getIncluirDependenciasNovasPDCAdapter() {
        return pdcIncluirDependenciasNovas;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirDependenciasNovas.
     * 
     * @param pdcIncluirDependenciasNovas
     *            Adaptador IncluirDependenciasNovas
     */
    public void setIncluirDependenciasNovasPDCAdapter(IIncluirDependenciasNovasPDCAdapter pdcIncluirDependenciasNovas) {
        this.pdcIncluirDependenciasNovas = pdcIncluirDependenciasNovas;
    }
    /**
     * M�todo invocado para obter um adaptador AtualizarAliquota.
     * 
     * @return Adaptador AtualizarAliquota
     */
    public IAtualizarAliquotaPDCAdapter getAtualizarAliquotaPDCAdapter() {
        return pdcAtualizarAliquota;
    }

    /**
     * M�todo invocado para establecer um adaptador AtualizarAliquota.
     * 
     * @param pdcAtualizarAliquota
     *            Adaptador AtualizarAliquota
     */
    public void setAtualizarAliquotaPDCAdapter(IAtualizarAliquotaPDCAdapter pdcAtualizarAliquota) {
        this.pdcAtualizarAliquota = pdcAtualizarAliquota;
    }
    /**
     * M�todo invocado para obter um adaptador ListarDepApurMensalResulPesq.
     * 
     * @return Adaptador ListarDepApurMensalResulPesq
     */
    public IListarDepApurMensalResulPesqPDCAdapter getListarDepApurMensalResulPesqPDCAdapter() {
        return pdcListarDepApurMensalResulPesq;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarDepApurMensalResulPesq.
     * 
     * @param pdcListarDepApurMensalResulPesq
     *            Adaptador ListarDepApurMensalResulPesq
     */
    public void setListarDepApurMensalResulPesqPDCAdapter(IListarDepApurMensalResulPesqPDCAdapter pdcListarDepApurMensalResulPesq) {
        this.pdcListarDepApurMensalResulPesq = pdcListarDepApurMensalResulPesq;
    }
    /**
     * M�todo invocado para obter um adaptador ListarResulPesqApurMensalDif.
     * 
     * @return Adaptador ListarResulPesqApurMensalDif
     */
    public IListarResulPesqApurMensalDifPDCAdapter getListarResulPesqApurMensalDifPDCAdapter() {
        return pdcListarResulPesqApurMensalDif;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarResulPesqApurMensalDif.
     * 
     * @param pdcListarResulPesqApurMensalDif
     *            Adaptador ListarResulPesqApurMensalDif
     */
    public void setListarResulPesqApurMensalDifPDCAdapter(IListarResulPesqApurMensalDifPDCAdapter pdcListarResulPesqApurMensalDif) {
        this.pdcListarResulPesqApurMensalDif = pdcListarResulPesqApurMensalDif;
    }
    /**
     * M�todo invocado para obter um adaptador ListarAgenciaIncorporaDepartamento.
     * 
     * @return Adaptador ListarAgenciaIncorporaDepartamento
     */
    public IListarAgenciaIncorporaDepartamentoPDCAdapter getListarAgenciaIncorporaDepartamentoPDCAdapter() {
        return pdcListarAgenciaIncorporaDepartamento;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarAgenciaIncorporaDepartamento.
     * 
     * @param pdcListarAgenciaIncorporaDepartamento
     *            Adaptador ListarAgenciaIncorporaDepartamento
     */
    public void setListarAgenciaIncorporaDepartamentoPDCAdapter(IListarAgenciaIncorporaDepartamentoPDCAdapter pdcListarAgenciaIncorporaDepartamento) {
        this.pdcListarAgenciaIncorporaDepartamento = pdcListarAgenciaIncorporaDepartamento;
    }
    /**
     * M�todo invocado para obter um adaptador ListarResulApurMensalDif.
     * 
     * @return Adaptador ListarResulApurMensalDif
     */
    public IListarResulApurMensalDifPDCAdapter getListarResulApurMensalDifPDCAdapter() {
        return pdcListarResulApurMensalDif;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarResulApurMensalDif.
     * 
     * @param pdcListarResulApurMensalDif
     *            Adaptador ListarResulApurMensalDif
     */
    public void setListarResulApurMensalDifPDCAdapter(IListarResulApurMensalDifPDCAdapter pdcListarResulApurMensalDif) {
        this.pdcListarResulApurMensalDif = pdcListarResulApurMensalDif;
    }
    /**
     * M�todo invocado para obter um adaptador ListarMunicipioAliquotaDif.
     * 
     * @return Adaptador ListarMunicipioAliquotaDif
     */
    public IListarMunicipioAliquotaDifPDCAdapter getListarMunicipioAliquotaDifPDCAdapter() {
        return pdcListarMunicipioAliquotaDif;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarMunicipioAliquotaDif.
     * 
     * @param pdcListarMunicipioAliquotaDif
     *            Adaptador ListarMunicipioAliquotaDif
     */
    public void setListarMunicipioAliquotaDifPDCAdapter(IListarMunicipioAliquotaDifPDCAdapter pdcListarMunicipioAliquotaDif) {
        this.pdcListarMunicipioAliquotaDif = pdcListarMunicipioAliquotaDif;
    }
    /**
     * M�todo invocado para obter um adaptador ListaApuracaoParcialFinal.
     * 
     * @return Adaptador ListaApuracaoParcialFinal
     */
    public IListaApuracaoParcialFinalPDCAdapter getListaApuracaoParcialFinalPDCAdapter() {
        return pdcListaApuracaoParcialFinal;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaApuracaoParcialFinal.
     * 
     * @param pdcListaApuracaoParcialFinal
     *            Adaptador ListaApuracaoParcialFinal
     */
    public void setListaApuracaoParcialFinalPDCAdapter(IListaApuracaoParcialFinalPDCAdapter pdcListaApuracaoParcialFinal) {
        this.pdcListaApuracaoParcialFinal = pdcListaApuracaoParcialFinal;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarContas.
     * 
     * @return Adaptador ConsultarContas
     */
    public IConsultarContasPDCAdapter getConsultarContasPDCAdapter() {
        return pdcConsultarContas;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarContas.
     * 
     * @param pdcConsultarContas
     *            Adaptador ConsultarContas
     */
    public void setConsultarContasPDCAdapter(IConsultarContasPDCAdapter pdcConsultarContas) {
        this.pdcConsultarContas = pdcConsultarContas;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoReprocessamento.
     * 
     * @return Adaptador ListarApuracaoReprocessamento
     */
    public IListarApuracaoReprocessamentoPDCAdapter getListarApuracaoReprocessamentoPDCAdapter() {
        return pdcListarApuracaoReprocessamento;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoReprocessamento.
     * 
     * @param pdcListarApuracaoReprocessamento
     *            Adaptador ListarApuracaoReprocessamento
     */
    public void setListarApuracaoReprocessamentoPDCAdapter(IListarApuracaoReprocessamentoPDCAdapter pdcListarApuracaoReprocessamento) {
        this.pdcListarApuracaoReprocessamento = pdcListarApuracaoReprocessamento;
    }
    /**
     * M�todo invocado para obter um adaptador SolicitarReprocessamentoPorDependencia.
     * 
     * @return Adaptador SolicitarReprocessamentoPorDependencia
     */
    public ISolicitarReprocessamentoPorDependenciaPDCAdapter getSolicitarReprocessamentoPorDependenciaPDCAdapter() {
        return pdcSolicitarReprocessamentoPorDependencia;
    }

    /**
     * M�todo invocado para establecer um adaptador SolicitarReprocessamentoPorDependencia.
     * 
     * @param pdcSolicitarReprocessamentoPorDependencia
     *            Adaptador SolicitarReprocessamentoPorDependencia
     */
    public void setSolicitarReprocessamentoPorDependenciaPDCAdapter(ISolicitarReprocessamentoPorDependenciaPDCAdapter pdcSolicitarReprocessamentoPorDependencia) {
        this.pdcSolicitarReprocessamentoPorDependencia = pdcSolicitarReprocessamentoPorDependencia;
    }
    /**
     * M�todo invocado para obter um adaptador SolicitarReprocessamentoPorMunicipio.
     * 
     * @return Adaptador SolicitarReprocessamentoPorMunicipio
     */
    public ISolicitarReprocessamentoPorMunicipioPDCAdapter getSolicitarReprocessamentoPorMunicipioPDCAdapter() {
        return pdcSolicitarReprocessamentoPorMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador SolicitarReprocessamentoPorMunicipio.
     * 
     * @param pdcSolicitarReprocessamentoPorMunicipio
     *            Adaptador SolicitarReprocessamentoPorMunicipio
     */
    public void setSolicitarReprocessamentoPorMunicipioPDCAdapter(ISolicitarReprocessamentoPorMunicipioPDCAdapter pdcSolicitarReprocessamentoPorMunicipio) {
        this.pdcSolicitarReprocessamentoPorMunicipio = pdcSolicitarReprocessamentoPorMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarMunicipio.
     * 
     * @return Adaptador AlterarMunicipio
     */
    public IAlterarMunicipioPDCAdapter getAlterarMunicipioPDCAdapter() {
        return pdcAlterarMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarMunicipio.
     * 
     * @param pdcAlterarMunicipio
     *            Adaptador AlterarMunicipio
     */
    public void setAlterarMunicipioPDCAdapter(IAlterarMunicipioPDCAdapter pdcAlterarMunicipio) {
        this.pdcAlterarMunicipio = pdcAlterarMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirMunicipio.
     * 
     * @return Adaptador IncluirMunicipio
     */
    public IIncluirMunicipioPDCAdapter getIncluirMunicipioPDCAdapter() {
        return pdcIncluirMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirMunicipio.
     * 
     * @param pdcIncluirMunicipio
     *            Adaptador IncluirMunicipio
     */
    public void setIncluirMunicipioPDCAdapter(IIncluirMunicipioPDCAdapter pdcIncluirMunicipio) {
        this.pdcIncluirMunicipio = pdcIncluirMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarHistoricoTipoIncidencia.
     * 
     * @return Adaptador ConsultarHistoricoTipoIncidencia
     */
    public IConsultarHistoricoTipoIncidenciaPDCAdapter getConsultarHistoricoTipoIncidenciaPDCAdapter() {
        return pdcConsultarHistoricoTipoIncidencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarHistoricoTipoIncidencia.
     * 
     * @param pdcConsultarHistoricoTipoIncidencia
     *            Adaptador ConsultarHistoricoTipoIncidencia
     */
    public void setConsultarHistoricoTipoIncidenciaPDCAdapter(IConsultarHistoricoTipoIncidenciaPDCAdapter pdcConsultarHistoricoTipoIncidencia) {
        this.pdcConsultarHistoricoTipoIncidencia = pdcConsultarHistoricoTipoIncidencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListarHistMunicEstadoDependencias.
     * 
     * @return Adaptador ListarHistMunicEstadoDependencias
     */
    public IListarHistMunicEstadoDependenciasPDCAdapter getListarHistMunicEstadoDependenciasPDCAdapter() {
        return pdcListarHistMunicEstadoDependencias;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarHistMunicEstadoDependencias.
     * 
     * @param pdcListarHistMunicEstadoDependencias
     *            Adaptador ListarHistMunicEstadoDependencias
     */
    public void setListarHistMunicEstadoDependenciasPDCAdapter(IListarHistMunicEstadoDependenciasPDCAdapter pdcListarHistMunicEstadoDependencias) {
        this.pdcListarHistMunicEstadoDependencias = pdcListarHistMunicEstadoDependencias;
    }
    /**
     * M�todo invocado para obter um adaptador ExecutarBalanceteFiscalizacoesIss.
     * 
     * @return Adaptador ExecutarBalanceteFiscalizacoesIss
     */
    public IExecutarBalanceteFiscalizacoesIssPDCAdapter getExecutarBalanceteFiscalizacoesIssPDCAdapter() {
        return pdcExecutarBalanceteFiscalizacoesIss;
    }

    /**
     * M�todo invocado para establecer um adaptador ExecutarBalanceteFiscalizacoesIss.
     * 
     * @param pdcExecutarBalanceteFiscalizacoesIss
     *            Adaptador ExecutarBalanceteFiscalizacoesIss
     */
    public void setExecutarBalanceteFiscalizacoesIssPDCAdapter(IExecutarBalanceteFiscalizacoesIssPDCAdapter pdcExecutarBalanceteFiscalizacoesIss) {
        this.pdcExecutarBalanceteFiscalizacoesIss = pdcExecutarBalanceteFiscalizacoesIss;
    }
    /**
     * M�todo invocado para obter um adaptador ListarMunicipiosBalancetes.
     * 
     * @return Adaptador ListarMunicipiosBalancetes
     */
    public IListarMunicipiosBalancetesPDCAdapter getListarMunicipiosBalancetesPDCAdapter() {
        return pdcListarMunicipiosBalancetes;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarMunicipiosBalancetes.
     * 
     * @param pdcListarMunicipiosBalancetes
     *            Adaptador ListarMunicipiosBalancetes
     */
    public void setListarMunicipiosBalancetesPDCAdapter(IListarMunicipiosBalancetesPDCAdapter pdcListarMunicipiosBalancetes) {
        this.pdcListarMunicipiosBalancetes = pdcListarMunicipiosBalancetes;
    }
    /**
     * M�todo invocado para obter um adaptador ListarEmpresasBalancetes.
     * 
     * @return Adaptador ListarEmpresasBalancetes
     */
    public IListarEmpresasBalancetesPDCAdapter getListarEmpresasBalancetesPDCAdapter() {
        return pdcListarEmpresasBalancetes;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarEmpresasBalancetes.
     * 
     * @param pdcListarEmpresasBalancetes
     *            Adaptador ListarEmpresasBalancetes
     */
    public void setListarEmpresasBalancetesPDCAdapter(IListarEmpresasBalancetesPDCAdapter pdcListarEmpresasBalancetes) {
        this.pdcListarEmpresasBalancetes = pdcListarEmpresasBalancetes;
    }
    /**
     * M�todo invocado para obter um adaptador ListarEstadosBalancetes.
     * 
     * @return Adaptador ListarEstadosBalancetes
     */
    public IListarEstadosBalancetesPDCAdapter getListarEstadosBalancetesPDCAdapter() {
        return pdcListarEstadosBalancetes;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarEstadosBalancetes.
     * 
     * @param pdcListarEstadosBalancetes
     *            Adaptador ListarEstadosBalancetes
     */
    public void setListarEstadosBalancetesPDCAdapter(IListarEstadosBalancetesPDCAdapter pdcListarEstadosBalancetes) {
        this.pdcListarEstadosBalancetes = pdcListarEstadosBalancetes;
    }
    /**
     * M�todo invocado para obter um adaptador ListaIntermediariaBalancetes.
     * 
     * @return Adaptador ListaIntermediariaBalancetes
     */
    public IListaIntermediariaBalancetesPDCAdapter getListaIntermediariaBalancetesPDCAdapter() {
        return pdcListaIntermediariaBalancetes;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaIntermediariaBalancetes.
     * 
     * @param pdcListaIntermediariaBalancetes
     *            Adaptador ListaIntermediariaBalancetes
     */
    public void setListaIntermediariaBalancetesPDCAdapter(IListaIntermediariaBalancetesPDCAdapter pdcListaIntermediariaBalancetes) {
        this.pdcListaIntermediariaBalancetes = pdcListaIntermediariaBalancetes;
    }
    /**
     * M�todo invocado para obter um adaptador ListarPedidoBalancetes.
     * 
     * @return Adaptador ListarPedidoBalancetes
     */
    public IListarPedidoBalancetesPDCAdapter getListarPedidoBalancetesPDCAdapter() {
        return pdcListarPedidoBalancetes;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarPedidoBalancetes.
     * 
     * @param pdcListarPedidoBalancetes
     *            Adaptador ListarPedidoBalancetes
     */
    public void setListarPedidoBalancetesPDCAdapter(IListarPedidoBalancetesPDCAdapter pdcListarPedidoBalancetes) {
        this.pdcListarPedidoBalancetes = pdcListarPedidoBalancetes;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirBalancete.
     * 
     * @return Adaptador IncluirBalancete
     */
    public IIncluirBalancetePDCAdapter getIncluirBalancetePDCAdapter() {
        return pdcIncluirBalancete;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirBalancete.
     * 
     * @param pdcIncluirBalancete
     *            Adaptador IncluirBalancete
     */
    public void setIncluirBalancetePDCAdapter(IIncluirBalancetePDCAdapter pdcIncluirBalancete) {
        this.pdcIncluirBalancete = pdcIncluirBalancete;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirBalancete.
     * 
     * @return Adaptador ExcluirBalancete
     */
    public IExcluirBalancetePDCAdapter getExcluirBalancetePDCAdapter() {
        return pdcExcluirBalancete;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirBalancete.
     * 
     * @param pdcExcluirBalancete
     *            Adaptador ExcluirBalancete
     */
    public void setExcluirBalancetePDCAdapter(IExcluirBalancetePDCAdapter pdcExcluirBalancete) {
        this.pdcExcluirBalancete = pdcExcluirBalancete;
    }
    /**
     * M�todo invocado para obter um adaptador GerarBalancete.
     * 
     * @return Adaptador GerarBalancete
     */
    public IGerarBalancetePDCAdapter getGerarBalancetePDCAdapter() {
        return pdcGerarBalancete;
    }

    /**
     * M�todo invocado para establecer um adaptador GerarBalancete.
     * 
     * @param pdcGerarBalancete
     *            Adaptador GerarBalancete
     */
    public void setGerarBalancetePDCAdapter(IGerarBalancetePDCAdapter pdcGerarBalancete) {
        this.pdcGerarBalancete = pdcGerarBalancete;
    }
    /**
     * M�todo invocado para obter um adaptador ListarBalancetesParametrizados.
     * 
     * @return Adaptador ListarBalancetesParametrizados
     */
    public IListarBalancetesParametrizadosPDCAdapter getListarBalancetesParametrizadosPDCAdapter() {
        return pdcListarBalancetesParametrizados;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarBalancetesParametrizados.
     * 
     * @param pdcListarBalancetesParametrizados
     *            Adaptador ListarBalancetesParametrizados
     */
    public void setListarBalancetesParametrizadosPDCAdapter(IListarBalancetesParametrizadosPDCAdapter pdcListarBalancetesParametrizados) {
        this.pdcListarBalancetesParametrizados = pdcListarBalancetesParametrizados;
    }
    /**
     * M�todo invocado para obter um adaptador ListarBalancetes.
     * 
     * @return Adaptador ListarBalancetes
     */
    public IListarBalancetesPDCAdapter getListarBalancetesPDCAdapter() {
        return pdcListarBalancetes;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarBalancetes.
     * 
     * @param pdcListarBalancetes
     *            Adaptador ListarBalancetes
     */
    public void setListarBalancetesPDCAdapter(IListarBalancetesPDCAdapter pdcListarBalancetes) {
        this.pdcListarBalancetes = pdcListarBalancetes;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarCodLancamento.
     * 
     * @return Adaptador AlterarCodLancamento
     */
    public IAlterarCodLancamentoPDCAdapter getAlterarCodLancamentoPDCAdapter() {
        return pdcAlterarCodLancamento;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarCodLancamento.
     * 
     * @param pdcAlterarCodLancamento
     *            Adaptador AlterarCodLancamento
     */
    public void setAlterarCodLancamentoPDCAdapter(IAlterarCodLancamentoPDCAdapter pdcAlterarCodLancamento) {
        this.pdcAlterarCodLancamento = pdcAlterarCodLancamento;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirCodLancamento.
     * 
     * @return Adaptador IncluirCodLancamento
     */
    public IIncluirCodLancamentoPDCAdapter getIncluirCodLancamentoPDCAdapter() {
        return pdcIncluirCodLancamento;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirCodLancamento.
     * 
     * @param pdcIncluirCodLancamento
     *            Adaptador IncluirCodLancamento
     */
    public void setIncluirCodLancamentoPDCAdapter(IIncluirCodLancamentoPDCAdapter pdcIncluirCodLancamento) {
        this.pdcIncluirCodLancamento = pdcIncluirCodLancamento;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarMunicipio.
     * 
     * @return Adaptador ConsultarMunicipio
     */
    public IConsultarMunicipioPDCAdapter getConsultarMunicipioPDCAdapter() {
        return pdcConsultarMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarMunicipio.
     * 
     * @param pdcConsultarMunicipio
     *            Adaptador ConsultarMunicipio
     */
    public void setConsultarMunicipioPDCAdapter(IConsultarMunicipioPDCAdapter pdcConsultarMunicipio) {
        this.pdcConsultarMunicipio = pdcConsultarMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ListaMunicipiosEstadoManter.
     * 
     * @return Adaptador ListaMunicipiosEstadoManter
     */
    public IListaMunicipiosEstadoManterPDCAdapter getListaMunicipiosEstadoManterPDCAdapter() {
        return pdcListaMunicipiosEstadoManter;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaMunicipiosEstadoManter.
     * 
     * @param pdcListaMunicipiosEstadoManter
     *            Adaptador ListaMunicipiosEstadoManter
     */
    public void setListaMunicipiosEstadoManterPDCAdapter(IListaMunicipiosEstadoManterPDCAdapter pdcListaMunicipiosEstadoManter) {
        this.pdcListaMunicipiosEstadoManter = pdcListaMunicipiosEstadoManter;
    }
    /**
     * M�todo invocado para obter um adaptador ListarMunicipiosNovos.
     * 
     * @return Adaptador ListarMunicipiosNovos
     */
    public IListarMunicipiosNovosPDCAdapter getListarMunicipiosNovosPDCAdapter() {
        return pdcListarMunicipiosNovos;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarMunicipiosNovos.
     * 
     * @param pdcListarMunicipiosNovos
     *            Adaptador ListarMunicipiosNovos
     */
    public void setListarMunicipiosNovosPDCAdapter(IListarMunicipiosNovosPDCAdapter pdcListarMunicipiosNovos) {
        this.pdcListarMunicipiosNovos = pdcListarMunicipiosNovos;
    }
    /**
     * M�todo invocado para obter um adaptador ListarMunicipiosNovosAll.
     * 
     * @return Adaptador ListarMunicipiosNovosAll
     */
    public IListarMunicipiosNovosAllPDCAdapter getListarMunicipiosNovosAllPDCAdapter() {
        return pdcListarMunicipiosNovosAll;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarMunicipiosNovosAll.
     * 
     * @param pdcListarMunicipiosNovosAll
     *            Adaptador ListarMunicipiosNovosAll
     */
    public void setListarMunicipiosNovosAllPDCAdapter(IListarMunicipiosNovosAllPDCAdapter pdcListarMunicipiosNovosAll) {
        this.pdcListarMunicipiosNovosAll = pdcListarMunicipiosNovosAll;
    }
    /**
     * M�todo invocado para obter um adaptador ListarMunicipioManterAll.
     * 
     * @return Adaptador ListarMunicipioManterAll
     */
    public IListarMunicipioManterAllPDCAdapter getListarMunicipioManterAllPDCAdapter() {
        return pdcListarMunicipioManterAll;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarMunicipioManterAll.
     * 
     * @param pdcListarMunicipioManterAll
     *            Adaptador ListarMunicipioManterAll
     */
    public void setListarMunicipioManterAllPDCAdapter(IListarMunicipioManterAllPDCAdapter pdcListarMunicipioManterAll) {
        this.pdcListarMunicipioManterAll = pdcListarMunicipioManterAll;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarDependencia.
     * 
     * @return Adaptador AlterarDependencia
     */
    public IAlterarDependenciaPDCAdapter getAlterarDependenciaPDCAdapter() {
        return pdcAlterarDependencia;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarDependencia.
     * 
     * @param pdcAlterarDependencia
     *            Adaptador AlterarDependencia
     */
    public void setAlterarDependenciaPDCAdapter(IAlterarDependenciaPDCAdapter pdcAlterarDependencia) {
        this.pdcAlterarDependencia = pdcAlterarDependencia;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarDependencia.
     * 
     * @return Adaptador ConsultarDependencia
     */
    public IConsultarDependenciaPDCAdapter getConsultarDependenciaPDCAdapter() {
        return pdcConsultarDependencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarDependencia.
     * 
     * @param pdcConsultarDependencia
     *            Adaptador ConsultarDependencia
     */
    public void setConsultarDependenciaPDCAdapter(IConsultarDependenciaPDCAdapter pdcConsultarDependencia) {
        this.pdcConsultarDependencia = pdcConsultarDependencia;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirCodLancamento.
     * 
     * @return Adaptador ExcluirCodLancamento
     */
    public IExcluirCodLancamentoPDCAdapter getExcluirCodLancamentoPDCAdapter() {
        return pdcExcluirCodLancamento;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirCodLancamento.
     * 
     * @param pdcExcluirCodLancamento
     *            Adaptador ExcluirCodLancamento
     */
    public void setExcluirCodLancamentoPDCAdapter(IExcluirCodLancamentoPDCAdapter pdcExcluirCodLancamento) {
        this.pdcExcluirCodLancamento = pdcExcluirCodLancamento;
    }
    /**
     * M�todo invocado para obter um adaptador ListaHistMunicipioPorEstado.
     * 
     * @return Adaptador ListaHistMunicipioPorEstado
     */
    public IListaHistMunicipioPorEstadoPDCAdapter getListaHistMunicipioPorEstadoPDCAdapter() {
        return pdcListaHistMunicipioPorEstado;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaHistMunicipioPorEstado.
     * 
     * @param pdcListaHistMunicipioPorEstado
     *            Adaptador ListaHistMunicipioPorEstado
     */
    public void setListaHistMunicipioPorEstadoPDCAdapter(IListaHistMunicipioPorEstadoPDCAdapter pdcListaHistMunicipioPorEstado) {
        this.pdcListaHistMunicipioPorEstado = pdcListaHistMunicipioPorEstado;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarHistoricoTipoServico.
     * 
     * @return Adaptador ConsultarHistoricoTipoServico
     */
    public IConsultarHistoricoTipoServicoPDCAdapter getConsultarHistoricoTipoServicoPDCAdapter() {
        return pdcConsultarHistoricoTipoServico;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarHistoricoTipoServico.
     * 
     * @param pdcConsultarHistoricoTipoServico
     *            Adaptador ConsultarHistoricoTipoServico
     */
    public void setConsultarHistoricoTipoServicoPDCAdapter(IConsultarHistoricoTipoServicoPDCAdapter pdcConsultarHistoricoTipoServico) {
        this.pdcConsultarHistoricoTipoServico = pdcConsultarHistoricoTipoServico;
    }
    /**
     * M�todo invocado para obter um adaptador ListarTipoIncidencia.
     * 
     * @return Adaptador ListarTipoIncidencia
     */
    public IListarTipoIncidenciaPDCAdapter getListarTipoIncidenciaPDCAdapter() {
        return pdcListarTipoIncidencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarTipoIncidencia.
     * 
     * @param pdcListarTipoIncidencia
     *            Adaptador ListarTipoIncidencia
     */
    public void setListarTipoIncidenciaPDCAdapter(IListarTipoIncidenciaPDCAdapter pdcListarTipoIncidencia) {
        this.pdcListarTipoIncidencia = pdcListarTipoIncidencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListaDependenciaPorMunicipio.
     * 
     * @return Adaptador ListaDependenciaPorMunicipio
     */
    public IListaDependenciaPorMunicipioPDCAdapter getListaDependenciaPorMunicipioPDCAdapter() {
        return pdcListaDependenciaPorMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaDependenciaPorMunicipio.
     * 
     * @param pdcListaDependenciaPorMunicipio
     *            Adaptador ListaDependenciaPorMunicipio
     */
    public void setListaDependenciaPorMunicipioPDCAdapter(IListaDependenciaPorMunicipioPDCAdapter pdcListaDependenciaPorMunicipio) {
        this.pdcListaDependenciaPorMunicipio = pdcListaDependenciaPorMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarOscilacaoNegativa.
     * 
     * @return Adaptador ConsultarOscilacaoNegativa
     */
    public IConsultarOscilacaoNegativaPDCAdapter getConsultarOscilacaoNegativaPDCAdapter() {
        return pdcConsultarOscilacaoNegativa;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarOscilacaoNegativa.
     * 
     * @param pdcConsultarOscilacaoNegativa
     *            Adaptador ConsultarOscilacaoNegativa
     */
    public void setConsultarOscilacaoNegativaPDCAdapter(IConsultarOscilacaoNegativaPDCAdapter pdcConsultarOscilacaoNegativa) {
        this.pdcConsultarOscilacaoNegativa = pdcConsultarOscilacaoNegativa;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoMovimentoNaoTributavel.
     * 
     * @return Adaptador ListarApuracaoMovimentoNaoTributavel
     */
    public IListarApuracaoMovimentoNaoTributavelPDCAdapter getListarApuracaoMovimentoNaoTributavelPDCAdapter() {
        return pdcListarApuracaoMovimentoNaoTributavel;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoMovimentoNaoTributavel.
     * 
     * @param pdcListarApuracaoMovimentoNaoTributavel
     *            Adaptador ListarApuracaoMovimentoNaoTributavel
     */
    public void setListarApuracaoMovimentoNaoTributavelPDCAdapter(IListarApuracaoMovimentoNaoTributavelPDCAdapter pdcListarApuracaoMovimentoNaoTributavel) {
        this.pdcListarApuracaoMovimentoNaoTributavel = pdcListarApuracaoMovimentoNaoTributavel;
    }
    /**
     * M�todo invocado para obter um adaptador ListarAliquotaZerada.
     * 
     * @return Adaptador ListarAliquotaZerada
     */
    public IListarAliquotaZeradaPDCAdapter getListarAliquotaZeradaPDCAdapter() {
        return pdcListarAliquotaZerada;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarAliquotaZerada.
     * 
     * @param pdcListarAliquotaZerada
     *            Adaptador ListarAliquotaZerada
     */
    public void setListarAliquotaZeradaPDCAdapter(IListarAliquotaZeradaPDCAdapter pdcListarAliquotaZerada) {
        this.pdcListarAliquotaZerada = pdcListarAliquotaZerada;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoFinalAposFechamentoISS.
     * 
     * @return Adaptador ListarApuracaoFinalAposFechamentoISS
     */
    public IListarApuracaoFinalAposFechamentoISSPDCAdapter getListarApuracaoFinalAposFechamentoISSPDCAdapter() {
        return pdcListarApuracaoFinalAposFechamentoISS;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoFinalAposFechamentoISS.
     * 
     * @param pdcListarApuracaoFinalAposFechamentoISS
     *            Adaptador ListarApuracaoFinalAposFechamentoISS
     */
    public void setListarApuracaoFinalAposFechamentoISSPDCAdapter(IListarApuracaoFinalAposFechamentoISSPDCAdapter pdcListarApuracaoFinalAposFechamentoISS) {
        this.pdcListarApuracaoFinalAposFechamentoISS = pdcListarApuracaoFinalAposFechamentoISS;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoMensalTotalizada.
     * 
     * @return Adaptador ListarApuracaoMensalTotalizada
     */
    public IListarApuracaoMensalTotalizadaPDCAdapter getListarApuracaoMensalTotalizadaPDCAdapter() {
        return pdcListarApuracaoMensalTotalizada;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoMensalTotalizada.
     * 
     * @param pdcListarApuracaoMensalTotalizada
     *            Adaptador ListarApuracaoMensalTotalizada
     */
    public void setListarApuracaoMensalTotalizadaPDCAdapter(IListarApuracaoMensalTotalizadaPDCAdapter pdcListarApuracaoMensalTotalizada) {
        this.pdcListarApuracaoMensalTotalizada = pdcListarApuracaoMensalTotalizada;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarDependenciasEncerradas.
     * 
     * @return Adaptador ConsultarDependenciasEncerradas
     */
    public IConsultarDependenciasEncerradasPDCAdapter getConsultarDependenciasEncerradasPDCAdapter() {
        return pdcConsultarDependenciasEncerradas;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarDependenciasEncerradas.
     * 
     * @param pdcConsultarDependenciasEncerradas
     *            Adaptador ConsultarDependenciasEncerradas
     */
    public void setConsultarDependenciasEncerradasPDCAdapter(IConsultarDependenciasEncerradasPDCAdapter pdcConsultarDependenciasEncerradas) {
        this.pdcConsultarDependenciasEncerradas = pdcConsultarDependenciasEncerradas;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarContaContabil.
     * 
     * @return Adaptador AlterarContaContabil
     */
    public IAlterarContaContabilPDCAdapter getAlterarContaContabilPDCAdapter() {
        return pdcAlterarContaContabil;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarContaContabil.
     * 
     * @param pdcAlterarContaContabil
     *            Adaptador AlterarContaContabil
     */
    public void setAlterarContaContabilPDCAdapter(IAlterarContaContabilPDCAdapter pdcAlterarContaContabil) {
        this.pdcAlterarContaContabil = pdcAlterarContaContabil;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarRelacaoPa.
     * 
     * @return Adaptador ConsultarRelacaoPa
     */
    public IConsultarRelacaoPaPDCAdapter getConsultarRelacaoPaPDCAdapter() {
        return pdcConsultarRelacaoPa;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarRelacaoPa.
     * 
     * @param pdcConsultarRelacaoPa
     *            Adaptador ConsultarRelacaoPa
     */
    public void setConsultarRelacaoPaPDCAdapter(IConsultarRelacaoPaPDCAdapter pdcConsultarRelacaoPa) {
        this.pdcConsultarRelacaoPa = pdcConsultarRelacaoPa;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirApuracaoAjuste.
     * 
     * @return Adaptador IncluirApuracaoAjuste
     */
    public IIncluirApuracaoAjustePDCAdapter getIncluirApuracaoAjustePDCAdapter() {
        return pdcIncluirApuracaoAjuste;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirApuracaoAjuste.
     * 
     * @param pdcIncluirApuracaoAjuste
     *            Adaptador IncluirApuracaoAjuste
     */
    public void setIncluirApuracaoAjustePDCAdapter(IIncluirApuracaoAjustePDCAdapter pdcIncluirApuracaoAjuste) {
        this.pdcIncluirApuracaoAjuste = pdcIncluirApuracaoAjuste;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultaApurParcialIss.
     * 
     * @return Adaptador ConsultaApurParcialIss
     */
    public IConsultaApurParcialIssPDCAdapter getConsultaApurParcialIssPDCAdapter() {
        return pdcConsultaApurParcialIss;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultaApurParcialIss.
     * 
     * @param pdcConsultaApurParcialIss
     *            Adaptador ConsultaApurParcialIss
     */
    public void setConsultaApurParcialIssPDCAdapter(IConsultaApurParcialIssPDCAdapter pdcConsultaApurParcialIss) {
        this.pdcConsultaApurParcialIss = pdcConsultaApurParcialIss;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultaConciliacaoApuracao.
     * 
     * @return Adaptador ConsultaConciliacaoApuracao
     */
    public IConsultaConciliacaoApuracaoPDCAdapter getConsultaConciliacaoApuracaoPDCAdapter() {
        return pdcConsultaConciliacaoApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultaConciliacaoApuracao.
     * 
     * @param pdcConsultaConciliacaoApuracao
     *            Adaptador ConsultaConciliacaoApuracao
     */
    public void setConsultaConciliacaoApuracaoPDCAdapter(IConsultaConciliacaoApuracaoPDCAdapter pdcConsultaConciliacaoApuracao) {
        this.pdcConsultaConciliacaoApuracao = pdcConsultaConciliacaoApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultaApuracaoPa.
     * 
     * @return Adaptador ConsultaApuracaoPa
     */
    public IConsultaApuracaoPaPDCAdapter getConsultaApuracaoPaPDCAdapter() {
        return pdcConsultaApuracaoPa;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultaApuracaoPa.
     * 
     * @param pdcConsultaApuracaoPa
     *            Adaptador ConsultaApuracaoPa
     */
    public void setConsultaApuracaoPaPDCAdapter(IConsultaApuracaoPaPDCAdapter pdcConsultaApuracaoPa) {
        this.pdcConsultaApuracaoPa = pdcConsultaApuracaoPa;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarMunicipiosNovos.
     * 
     * @return Adaptador ConsultarMunicipiosNovos
     */
    public IConsultarMunicipiosNovosPDCAdapter getConsultarMunicipiosNovosPDCAdapter() {
        return pdcConsultarMunicipiosNovos;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarMunicipiosNovos.
     * 
     * @param pdcConsultarMunicipiosNovos
     *            Adaptador ConsultarMunicipiosNovos
     */
    public void setConsultarMunicipiosNovosPDCAdapter(IConsultarMunicipiosNovosPDCAdapter pdcConsultarMunicipiosNovos) {
        this.pdcConsultarMunicipiosNovos = pdcConsultarMunicipiosNovos;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarItemComplementar.
     * 
     * @return Adaptador AlterarItemComplementar
     */
    public IAlterarItemComplementarPDCAdapter getAlterarItemComplementarPDCAdapter() {
        return pdcAlterarItemComplementar;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarItemComplementar.
     * 
     * @param pdcAlterarItemComplementar
     *            Adaptador AlterarItemComplementar
     */
    public void setAlterarItemComplementarPDCAdapter(IAlterarItemComplementarPDCAdapter pdcAlterarItemComplementar) {
        this.pdcAlterarItemComplementar = pdcAlterarItemComplementar;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarTarifasCobradas.
     * 
     * @return Adaptador ConsultarTarifasCobradas
     */
    public IConsultarTarifasCobradasPDCAdapter getConsultarTarifasCobradasPDCAdapter() {
        return pdcConsultarTarifasCobradas;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarTarifasCobradas.
     * 
     * @param pdcConsultarTarifasCobradas
     *            Adaptador ConsultarTarifasCobradas
     */
    public void setConsultarTarifasCobradasPDCAdapter(IConsultarTarifasCobradasPDCAdapter pdcConsultarTarifasCobradas) {
        this.pdcConsultarTarifasCobradas = pdcConsultarTarifasCobradas;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirItemComplementar.
     * 
     * @return Adaptador ExcluirItemComplementar
     */
    public IExcluirItemComplementarPDCAdapter getExcluirItemComplementarPDCAdapter() {
        return pdcExcluirItemComplementar;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirItemComplementar.
     * 
     * @param pdcExcluirItemComplementar
     *            Adaptador ExcluirItemComplementar
     */
    public void setExcluirItemComplementarPDCAdapter(IExcluirItemComplementarPDCAdapter pdcExcluirItemComplementar) {
        this.pdcExcluirItemComplementar = pdcExcluirItemComplementar;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultaHistoricoCodigosLancamento.
     * 
     * @return Adaptador ConsultaHistoricoCodigosLancamento
     */
    public IConsultaHistoricoCodigosLancamentoPDCAdapter getConsultaHistoricoCodigosLancamentoPDCAdapter() {
        return pdcConsultaHistoricoCodigosLancamento;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultaHistoricoCodigosLancamento.
     * 
     * @param pdcConsultaHistoricoCodigosLancamento
     *            Adaptador ConsultaHistoricoCodigosLancamento
     */
    public void setConsultaHistoricoCodigosLancamentoPDCAdapter(IConsultaHistoricoCodigosLancamentoPDCAdapter pdcConsultaHistoricoCodigosLancamento) {
        this.pdcConsultaHistoricoCodigosLancamento = pdcConsultaHistoricoCodigosLancamento;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarLupaCnpjEmp.
     * 
     * @return Adaptador ConsultarLupaCnpjEmp
     */
    public IConsultarLupaCnpjEmpPDCAdapter getConsultarLupaCnpjEmpPDCAdapter() {
        return pdcConsultarLupaCnpjEmp;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarLupaCnpjEmp.
     * 
     * @param pdcConsultarLupaCnpjEmp
     *            Adaptador ConsultarLupaCnpjEmp
     */
    public void setConsultarLupaCnpjEmpPDCAdapter(IConsultarLupaCnpjEmpPDCAdapter pdcConsultarLupaCnpjEmp) {
        this.pdcConsultarLupaCnpjEmp = pdcConsultarLupaCnpjEmp;
    }
    /**
     * M�todo invocado para obter um adaptador ListarComboSistContabil.
     * 
     * @return Adaptador ListarComboSistContabil
     */
    public IListarComboSistContabilPDCAdapter getListarComboSistContabilPDCAdapter() {
        return pdcListarComboSistContabil;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarComboSistContabil.
     * 
     * @param pdcListarComboSistContabil
     *            Adaptador ListarComboSistContabil
     */
    public void setListarComboSistContabilPDCAdapter(IListarComboSistContabilPDCAdapter pdcListarComboSistContabil) {
        this.pdcListarComboSistContabil = pdcListarComboSistContabil;
    }
    /**
     * M�todo invocado para obter um adaptador ListarComboDescItemServ.
     * 
     * @return Adaptador ListarComboDescItemServ
     */
    public IListarComboDescItemServPDCAdapter getListarComboDescItemServPDCAdapter() {
        return pdcListarComboDescItemServ;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarComboDescItemServ.
     * 
     * @param pdcListarComboDescItemServ
     *            Adaptador ListarComboDescItemServ
     */
    public void setListarComboDescItemServPDCAdapter(IListarComboDescItemServPDCAdapter pdcListarComboDescItemServ) {
        this.pdcListarComboDescItemServ = pdcListarComboDescItemServ;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirContaEmpresa.
     * 
     * @return Adaptador ExcluirContaEmpresa
     */
    public IExcluirContaEmpresaPDCAdapter getExcluirContaEmpresaPDCAdapter() {
        return pdcExcluirContaEmpresa;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirContaEmpresa.
     * 
     * @param pdcExcluirContaEmpresa
     *            Adaptador ExcluirContaEmpresa
     */
    public void setExcluirContaEmpresaPDCAdapter(IExcluirContaEmpresaPDCAdapter pdcExcluirContaEmpresa) {
        this.pdcExcluirContaEmpresa = pdcExcluirContaEmpresa;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirEmpresa.
     * 
     * @return Adaptador ExcluirEmpresa
     */
    public IExcluirEmpresaPDCAdapter getExcluirEmpresaPDCAdapter() {
        return pdcExcluirEmpresa;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirEmpresa.
     * 
     * @param pdcExcluirEmpresa
     *            Adaptador ExcluirEmpresa
     */
    public void setExcluirEmpresaPDCAdapter(IExcluirEmpresaPDCAdapter pdcExcluirEmpresa) {
        this.pdcExcluirEmpresa = pdcExcluirEmpresa;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirContaEmpresa.
     * 
     * @return Adaptador IncluirContaEmpresa
     */
    public IIncluirContaEmpresaPDCAdapter getIncluirContaEmpresaPDCAdapter() {
        return pdcIncluirContaEmpresa;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirContaEmpresa.
     * 
     * @param pdcIncluirContaEmpresa
     *            Adaptador IncluirContaEmpresa
     */
    public void setIncluirContaEmpresaPDCAdapter(IIncluirContaEmpresaPDCAdapter pdcIncluirContaEmpresa) {
        this.pdcIncluirContaEmpresa = pdcIncluirContaEmpresa;
    }
    /**
     * M�todo invocado para obter um adaptador ListarContasEmp.
     * 
     * @return Adaptador ListarContasEmp
     */
    public IListarContasEmpPDCAdapter getListarContasEmpPDCAdapter() {
        return pdcListarContasEmp;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarContasEmp.
     * 
     * @param pdcListarContasEmp
     *            Adaptador ListarContasEmp
     */
    public void setListarContasEmpPDCAdapter(IListarContasEmpPDCAdapter pdcListarContasEmp) {
        this.pdcListarContasEmp = pdcListarContasEmp;
    }
    /**
     * M�todo invocado para obter um adaptador ListarComboCosifEmp.
     * 
     * @return Adaptador ListarComboCosifEmp
     */
    public IListarComboCosifEmpPDCAdapter getListarComboCosifEmpPDCAdapter() {
        return pdcListarComboCosifEmp;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarComboCosifEmp.
     * 
     * @param pdcListarComboCosifEmp
     *            Adaptador ListarComboCosifEmp
     */
    public void setListarComboCosifEmpPDCAdapter(IListarComboCosifEmpPDCAdapter pdcListarComboCosifEmp) {
        this.pdcListarComboCosifEmp = pdcListarComboCosifEmp;
    }
    /**
     * M�todo invocado para obter um adaptador ListarComboCtaReceita.
     * 
     * @return Adaptador ListarComboCtaReceita
     */
    public IListarComboCtaReceitaPDCAdapter getListarComboCtaReceitaPDCAdapter() {
        return pdcListarComboCtaReceita;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarComboCtaReceita.
     * 
     * @param pdcListarComboCtaReceita
     *            Adaptador ListarComboCtaReceita
     */
    public void setListarComboCtaReceitaPDCAdapter(IListarComboCtaReceitaPDCAdapter pdcListarComboCtaReceita) {
        this.pdcListarComboCtaReceita = pdcListarComboCtaReceita;
    }
    /**
     * M�todo invocado para obter um adaptador ListarComboRazao.
     * 
     * @return Adaptador ListarComboRazao
     */
    public IListarComboRazaoPDCAdapter getListarComboRazaoPDCAdapter() {
        return pdcListarComboRazao;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarComboRazao.
     * 
     * @param pdcListarComboRazao
     *            Adaptador ListarComboRazao
     */
    public void setListarComboRazaoPDCAdapter(IListarComboRazaoPDCAdapter pdcListarComboRazao) {
        this.pdcListarComboRazao = pdcListarComboRazao;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirContaContabil.
     * 
     * @return Adaptador IncluirContaContabil
     */
    public IIncluirContaContabilPDCAdapter getIncluirContaContabilPDCAdapter() {
        return pdcIncluirContaContabil;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirContaContabil.
     * 
     * @param pdcIncluirContaContabil
     *            Adaptador IncluirContaContabil
     */
    public void setIncluirContaContabilPDCAdapter(IIncluirContaContabilPDCAdapter pdcIncluirContaContabil) {
        this.pdcIncluirContaContabil = pdcIncluirContaContabil;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarAliquota.
     * 
     * @return Adaptador AlterarAliquota
     */
    public IAlterarAliquotaPDCAdapter getAlterarAliquotaPDCAdapter() {
        return pdcAlterarAliquota;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarAliquota.
     * 
     * @param pdcAlterarAliquota
     *            Adaptador AlterarAliquota
     */
    public void setAlterarAliquotaPDCAdapter(IAlterarAliquotaPDCAdapter pdcAlterarAliquota) {
        this.pdcAlterarAliquota = pdcAlterarAliquota;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarAliquota.
     * 
     * @return Adaptador ConsultarAliquota
     */
    public IConsultarAliquotaPDCAdapter getConsultarAliquotaPDCAdapter() {
        return pdcConsultarAliquota;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarAliquota.
     * 
     * @param pdcConsultarAliquota
     *            Adaptador ConsultarAliquota
     */
    public void setConsultarAliquotaPDCAdapter(IConsultarAliquotaPDCAdapter pdcConsultarAliquota) {
        this.pdcConsultarAliquota = pdcConsultarAliquota;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarLupaMunicipio.
     * 
     * @return Adaptador ConsultarLupaMunicipio
     */
    public IConsultarLupaMunicipioPDCAdapter getConsultarLupaMunicipioPDCAdapter() {
        return pdcConsultarLupaMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarLupaMunicipio.
     * 
     * @param pdcConsultarLupaMunicipio
     *            Adaptador ConsultarLupaMunicipio
     */
    public void setConsultarLupaMunicipioPDCAdapter(IConsultarLupaMunicipioPDCAdapter pdcConsultarLupaMunicipio) {
        this.pdcConsultarLupaMunicipio = pdcConsultarLupaMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ListarLcAliquota.
     * 
     * @return Adaptador ListarLcAliquota
     */
    public IListarLcAliquotaPDCAdapter getListarLcAliquotaPDCAdapter() {
        return pdcListarLcAliquota;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarLcAliquota.
     * 
     * @param pdcListarLcAliquota
     *            Adaptador ListarLcAliquota
     */
    public void setListarLcAliquotaPDCAdapter(IListarLcAliquotaPDCAdapter pdcListarLcAliquota) {
        this.pdcListarLcAliquota = pdcListarLcAliquota;
    }
    /**
     * M�todo invocado para obter um adaptador ListarMunicipios.
     * 
     * @return Adaptador ListarMunicipios
     */
    public IListarMunicipiosPDCAdapter getListarMunicipiosPDCAdapter() {
        return pdcListarMunicipios;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarMunicipios.
     * 
     * @param pdcListarMunicipios
     *            Adaptador ListarMunicipios
     */
    public void setListarMunicipiosPDCAdapter(IListarMunicipiosPDCAdapter pdcListarMunicipios) {
        this.pdcListarMunicipios = pdcListarMunicipios;
    }
    /**
     * M�todo invocado para obter um adaptador ListarComboEstado.
     * 
     * @return Adaptador ListarComboEstado
     */
    public IListarComboEstadoPDCAdapter getListarComboEstadoPDCAdapter() {
        return pdcListarComboEstado;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarComboEstado.
     * 
     * @param pdcListarComboEstado
     *            Adaptador ListarComboEstado
     */
    public void setListarComboEstadoPDCAdapter(IListarComboEstadoPDCAdapter pdcListarComboEstado) {
        this.pdcListarComboEstado = pdcListarComboEstado;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirItemComplementar.
     * 
     * @return Adaptador IncluirItemComplementar
     */
    public IIncluirItemComplementarPDCAdapter getIncluirItemComplementarPDCAdapter() {
        return pdcIncluirItemComplementar;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirItemComplementar.
     * 
     * @param pdcIncluirItemComplementar
     *            Adaptador IncluirItemComplementar
     */
    public void setIncluirItemComplementarPDCAdapter(IIncluirItemComplementarPDCAdapter pdcIncluirItemComplementar) {
        this.pdcIncluirItemComplementar = pdcIncluirItemComplementar;
    }
    /**
     * M�todo invocado para obter um adaptador ListaContasMunAliqDif.
     * 
     * @return Adaptador ListaContasMunAliqDif
     */
    public IListaContasMunAliqDifPDCAdapter getListaContasMunAliqDifPDCAdapter() {
        return pdcListaContasMunAliqDif;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaContasMunAliqDif.
     * 
     * @param pdcListaContasMunAliqDif
     *            Adaptador ListaContasMunAliqDif
     */
    public void setListaContasMunAliqDifPDCAdapter(IListaContasMunAliqDifPDCAdapter pdcListaContasMunAliqDif) {
        this.pdcListaContasMunAliqDif = pdcListaContasMunAliqDif;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarProcessarContabilidade.
     * 
     * @return Adaptador ConsultarProcessarContabilidade
     */
    public IConsultarProcessarContabilidadePDCAdapter getConsultarProcessarContabilidadePDCAdapter() {
        return pdcConsultarProcessarContabilidade;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarProcessarContabilidade.
     * 
     * @param pdcConsultarProcessarContabilidade
     *            Adaptador ConsultarProcessarContabilidade
     */
    public void setConsultarProcessarContabilidadePDCAdapter(IConsultarProcessarContabilidadePDCAdapter pdcConsultarProcessarContabilidade) {
        this.pdcConsultarProcessarContabilidade = pdcConsultarProcessarContabilidade;
    }
    /**
     * M�todo invocado para obter um adaptador ProcessarContabilidade.
     * 
     * @return Adaptador ProcessarContabilidade
     */
    public IProcessarContabilidadePDCAdapter getProcessarContabilidadePDCAdapter() {
        return pdcProcessarContabilidade;
    }

    /**
     * M�todo invocado para establecer um adaptador ProcessarContabilidade.
     * 
     * @param pdcProcessarContabilidade
     *            Adaptador ProcessarContabilidade
     */
    public void setProcessarContabilidadePDCAdapter(IProcessarContabilidadePDCAdapter pdcProcessarContabilidade) {
        this.pdcProcessarContabilidade = pdcProcessarContabilidade;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirCtaContabil.
     * 
     * @return Adaptador ExcluirCtaContabil
     */
    public IExcluirCtaContabilPDCAdapter getExcluirCtaContabilPDCAdapter() {
        return pdcExcluirCtaContabil;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirCtaContabil.
     * 
     * @param pdcExcluirCtaContabil
     *            Adaptador ExcluirCtaContabil
     */
    public void setExcluirCtaContabilPDCAdapter(IExcluirCtaContabilPDCAdapter pdcExcluirCtaContabil) {
        this.pdcExcluirCtaContabil = pdcExcluirCtaContabil;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirContaContabil.
     * 
     * @return Adaptador ExcluirContaContabil
     */
    public IExcluirContaContabilPDCAdapter getExcluirContaContabilPDCAdapter() {
        return pdcExcluirContaContabil;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirContaContabil.
     * 
     * @param pdcExcluirContaContabil
     *            Adaptador ExcluirContaContabil
     */
    public void setExcluirContaContabilPDCAdapter(IExcluirContaContabilPDCAdapter pdcExcluirContaContabil) {
        this.pdcExcluirContaContabil = pdcExcluirContaContabil;
    }
    /**
     * M�todo invocado para obter um adaptador ListarDependenciasMunicipio.
     * 
     * @return Adaptador ListarDependenciasMunicipio
     */
    public IListarDependenciasMunicipioPDCAdapter getListarDependenciasMunicipioPDCAdapter() {
        return pdcListarDependenciasMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarDependenciasMunicipio.
     * 
     * @param pdcListarDependenciasMunicipio
     *            Adaptador ListarDependenciasMunicipio
     */
    public void setListarDependenciasMunicipioPDCAdapter(IListarDependenciasMunicipioPDCAdapter pdcListarDependenciasMunicipio) {
        this.pdcListarDependenciasMunicipio = pdcListarDependenciasMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ListarValoresMesTotal.
     * 
     * @return Adaptador ListarValoresMesTotal
     */
    public IListarValoresMesTotalPDCAdapter getListarValoresMesTotalPDCAdapter() {
        return pdcListarValoresMesTotal;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarValoresMesTotal.
     * 
     * @param pdcListarValoresMesTotal
     *            Adaptador ListarValoresMesTotal
     */
    public void setListarValoresMesTotalPDCAdapter(IListarValoresMesTotalPDCAdapter pdcListarValoresMesTotal) {
        this.pdcListarValoresMesTotal = pdcListarValoresMesTotal;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarCompetencia.
     * 
     * @return Adaptador ConsultarCompetencia
     */
    public IConsultarCompetenciaPDCAdapter getConsultarCompetenciaPDCAdapter() {
        return pdcConsultarCompetencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarCompetencia.
     * 
     * @param pdcConsultarCompetencia
     *            Adaptador ConsultarCompetencia
     */
    public void setConsultarCompetenciaPDCAdapter(IConsultarCompetenciaPDCAdapter pdcConsultarCompetencia) {
        this.pdcConsultarCompetencia = pdcConsultarCompetencia;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultaDependenciaHistorico.
     * 
     * @return Adaptador ConsultaDependenciaHistorico
     */
    public IConsultaDependenciaHistoricoPDCAdapter getConsultaDependenciaHistoricoPDCAdapter() {
        return pdcConsultaDependenciaHistorico;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultaDependenciaHistorico.
     * 
     * @param pdcConsultaDependenciaHistorico
     *            Adaptador ConsultaDependenciaHistorico
     */
    public void setConsultaDependenciaHistoricoPDCAdapter(IConsultaDependenciaHistoricoPDCAdapter pdcConsultaDependenciaHistorico) {
        this.pdcConsultaDependenciaHistorico = pdcConsultaDependenciaHistorico;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarMunicipioTabelaHistorico.
     * 
     * @return Adaptador ConsultarMunicipioTabelaHistorico
     */
    public IConsultarMunicipioTabelaHistoricoPDCAdapter getConsultarMunicipioTabelaHistoricoPDCAdapter() {
        return pdcConsultarMunicipioTabelaHistorico;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarMunicipioTabelaHistorico.
     * 
     * @param pdcConsultarMunicipioTabelaHistorico
     *            Adaptador ConsultarMunicipioTabelaHistorico
     */
    public void setConsultarMunicipioTabelaHistoricoPDCAdapter(IConsultarMunicipioTabelaHistoricoPDCAdapter pdcConsultarMunicipioTabelaHistorico) {
        this.pdcConsultarMunicipioTabelaHistorico = pdcConsultarMunicipioTabelaHistorico;
    }
    /**
     * M�todo invocado para obter um adaptador ListarContasTipoServico.
     * 
     * @return Adaptador ListarContasTipoServico
     */
    public IListarContasTipoServicoPDCAdapter getListarContasTipoServicoPDCAdapter() {
        return pdcListarContasTipoServico;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarContasTipoServico.
     * 
     * @param pdcListarContasTipoServico
     *            Adaptador ListarContasTipoServico
     */
    public void setListarContasTipoServicoPDCAdapter(IListarContasTipoServicoPDCAdapter pdcListarContasTipoServico) {
        this.pdcListarContasTipoServico = pdcListarContasTipoServico;
    }
    /**
     * M�todo invocado para obter um adaptador ListarContasContabeisTipoServico.
     * 
     * @return Adaptador ListarContasContabeisTipoServico
     */
    public IListarContasContabeisTipoServicoPDCAdapter getListarContasContabeisTipoServicoPDCAdapter() {
        return pdcListarContasContabeisTipoServico;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarContasContabeisTipoServico.
     * 
     * @param pdcListarContasContabeisTipoServico
     *            Adaptador ListarContasContabeisTipoServico
     */
    public void setListarContasContabeisTipoServicoPDCAdapter(IListarContasContabeisTipoServicoPDCAdapter pdcListarContasContabeisTipoServico) {
        this.pdcListarContasContabeisTipoServico = pdcListarContasContabeisTipoServico;
    }
    /**
     * M�todo invocado para obter um adaptador ListarContasContabeis.
     * 
     * @return Adaptador ListarContasContabeis
     */
    public IListarContasContabeisPDCAdapter getListarContasContabeisPDCAdapter() {
        return pdcListarContasContabeis;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarContasContabeis.
     * 
     * @param pdcListarContasContabeis
     *            Adaptador ListarContasContabeis
     */
    public void setListarContasContabeisPDCAdapter(IListarContasContabeisPDCAdapter pdcListarContasContabeis) {
        this.pdcListarContasContabeis = pdcListarContasContabeis;
    }
    /**
     * M�todo invocado para obter um adaptador ListarContasContabeisPeriodo.
     * 
     * @return Adaptador ListarContasContabeisPeriodo
     */
    public IListarContasContabeisPeriodoPDCAdapter getListarContasContabeisPeriodoPDCAdapter() {
        return pdcListarContasContabeisPeriodo;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarContasContabeisPeriodo.
     * 
     * @param pdcListarContasContabeisPeriodo
     *            Adaptador ListarContasContabeisPeriodo
     */
    public void setListarContasContabeisPeriodoPDCAdapter(IListarContasContabeisPeriodoPDCAdapter pdcListarContasContabeisPeriodo) {
        this.pdcListarContasContabeisPeriodo = pdcListarContasContabeisPeriodo;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarDependenciaAliquotaZerada.
     * 
     * @return Adaptador ConsultarDependenciaAliquotaZerada
     */
    public IConsultarDependenciaAliquotaZeradaPDCAdapter getConsultarDependenciaAliquotaZeradaPDCAdapter() {
        return pdcConsultarDependenciaAliquotaZerada;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarDependenciaAliquotaZerada.
     * 
     * @param pdcConsultarDependenciaAliquotaZerada
     *            Adaptador ConsultarDependenciaAliquotaZerada
     */
    public void setConsultarDependenciaAliquotaZeradaPDCAdapter(IConsultarDependenciaAliquotaZeradaPDCAdapter pdcConsultarDependenciaAliquotaZerada) {
        this.pdcConsultarDependenciaAliquotaZerada = pdcConsultarDependenciaAliquotaZerada;
    }
    /**
     * M�todo invocado para obter um adaptador ListaDepApuracaoAposFechISS.
     * 
     * @return Adaptador ListaDepApuracaoAposFechISS
     */
    public IListaDepApuracaoAposFechISSPDCAdapter getListaDepApuracaoAposFechISSPDCAdapter() {
        return pdcListaDepApuracaoAposFechISS;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaDepApuracaoAposFechISS.
     * 
     * @param pdcListaDepApuracaoAposFechISS
     *            Adaptador ListaDepApuracaoAposFechISS
     */
    public void setListaDepApuracaoAposFechISSPDCAdapter(IListaDepApuracaoAposFechISSPDCAdapter pdcListaDepApuracaoAposFechISS) {
        this.pdcListaDepApuracaoAposFechISS = pdcListaDepApuracaoAposFechISS;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoParcialDependencia.
     * 
     * @return Adaptador ListarApuracaoParcialDependencia
     */
    public IListarApuracaoParcialDependenciaPDCAdapter getListarApuracaoParcialDependenciaPDCAdapter() {
        return pdcListarApuracaoParcialDependencia;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoParcialDependencia.
     * 
     * @param pdcListarApuracaoParcialDependencia
     *            Adaptador ListarApuracaoParcialDependencia
     */
    public void setListarApuracaoParcialDependenciaPDCAdapter(IListarApuracaoParcialDependenciaPDCAdapter pdcListarApuracaoParcialDependencia) {
        this.pdcListarApuracaoParcialDependencia = pdcListarApuracaoParcialDependencia;
    }
    /**
     * M�todo invocado para obter um adaptador ListarDependenciaApuracaoMensal.
     * 
     * @return Adaptador ListarDependenciaApuracaoMensal
     */
    public IListarDependenciaApuracaoMensalPDCAdapter getListarDependenciaApuracaoMensalPDCAdapter() {
        return pdcListarDependenciaApuracaoMensal;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarDependenciaApuracaoMensal.
     * 
     * @param pdcListarDependenciaApuracaoMensal
     *            Adaptador ListarDependenciaApuracaoMensal
     */
    public void setListarDependenciaApuracaoMensalPDCAdapter(IListarDependenciaApuracaoMensalPDCAdapter pdcListarDependenciaApuracaoMensal) {
        this.pdcListarDependenciaApuracaoMensal = pdcListarDependenciaApuracaoMensal;
    }
    /**
     * M�todo invocado para obter um adaptador ListarDependenciaPlanilhaApuracao.
     * 
     * @return Adaptador ListarDependenciaPlanilhaApuracao
     */
    public IListarDependenciaPlanilhaApuracaoPDCAdapter getListarDependenciaPlanilhaApuracaoPDCAdapter() {
        return pdcListarDependenciaPlanilhaApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarDependenciaPlanilhaApuracao.
     * 
     * @param pdcListarDependenciaPlanilhaApuracao
     *            Adaptador ListarDependenciaPlanilhaApuracao
     */
    public void setListarDependenciaPlanilhaApuracaoPDCAdapter(IListarDependenciaPlanilhaApuracaoPDCAdapter pdcListarDependenciaPlanilhaApuracao) {
        this.pdcListarDependenciaPlanilhaApuracao = pdcListarDependenciaPlanilhaApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador ResultPesqApurMovNaoTributavel.
     * 
     * @return Adaptador ResultPesqApurMovNaoTributavel
     */
    public IResultPesqApurMovNaoTributavelPDCAdapter getResultPesqApurMovNaoTributavelPDCAdapter() {
        return pdcResultPesqApurMovNaoTributavel;
    }

    /**
     * M�todo invocado para establecer um adaptador ResultPesqApurMovNaoTributavel.
     * 
     * @param pdcResultPesqApurMovNaoTributavel
     *            Adaptador ResultPesqApurMovNaoTributavel
     */
    public void setResultPesqApurMovNaoTributavelPDCAdapter(IResultPesqApurMovNaoTributavelPDCAdapter pdcResultPesqApurMovNaoTributavel) {
        this.pdcResultPesqApurMovNaoTributavel = pdcResultPesqApurMovNaoTributavel;
    }
    /**
     * M�todo invocado para obter um adaptador ResultadoPesquisaOscilacaoNegativa.
     * 
     * @return Adaptador ResultadoPesquisaOscilacaoNegativa
     */
    public IResultadoPesquisaOscilacaoNegativaPDCAdapter getResultadoPesquisaOscilacaoNegativaPDCAdapter() {
        return pdcResultadoPesquisaOscilacaoNegativa;
    }

    /**
     * M�todo invocado para establecer um adaptador ResultadoPesquisaOscilacaoNegativa.
     * 
     * @param pdcResultadoPesquisaOscilacaoNegativa
     *            Adaptador ResultadoPesquisaOscilacaoNegativa
     */
    public void setResultadoPesquisaOscilacaoNegativaPDCAdapter(IResultadoPesquisaOscilacaoNegativaPDCAdapter pdcResultadoPesquisaOscilacaoNegativa) {
        this.pdcResultadoPesquisaOscilacaoNegativa = pdcResultadoPesquisaOscilacaoNegativa;
    }
    /**
     * M�todo invocado para obter um adaptador ResultadoPesquisaOscilacaoNegativaPlanilha.
     * 
     * @return Adaptador ResultadoPesquisaOscilacaoNegativaPlanilha
     */
    public IResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter getResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter() {
        return pdcResultadoPesquisaOscilacaoNegativaPlanilha;
    }

    /**
     * M�todo invocado para establecer um adaptador ResultadoPesquisaOscilacaoNegativaPlanilha.
     * 
     * @param pdcResultadoPesquisaOscilacaoNegativaPlanilha
     *            Adaptador ResultadoPesquisaOscilacaoNegativaPlanilha
     */
    public void setResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter(IResultadoPesquisaOscilacaoNegativaPlanilhaPDCAdapter pdcResultadoPesquisaOscilacaoNegativaPlanilha) {
        this.pdcResultadoPesquisaOscilacaoNegativaPlanilha = pdcResultadoPesquisaOscilacaoNegativaPlanilha;
    }
    /**
     * M�todo invocado para obter um adaptador ListaMunicipiosEstadoManterAll.
     * 
     * @return Adaptador ListaMunicipiosEstadoManterAll
     */
    public IListaMunicipiosEstadoManterAllPDCAdapter getListaMunicipiosEstadoManterAllPDCAdapter() {
        return pdcListaMunicipiosEstadoManterAll;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaMunicipiosEstadoManterAll.
     * 
     * @param pdcListaMunicipiosEstadoManterAll
     *            Adaptador ListaMunicipiosEstadoManterAll
     */
    public void setListaMunicipiosEstadoManterAllPDCAdapter(IListaMunicipiosEstadoManterAllPDCAdapter pdcListaMunicipiosEstadoManterAll) {
        this.pdcListaMunicipiosEstadoManterAll = pdcListaMunicipiosEstadoManterAll;
    }
    /**
     * M�todo invocado para obter um adaptador ListarCodLancamento.
     * 
     * @return Adaptador ListarCodLancamento
     */
    public IListarCodLancamentoPDCAdapter getListarCodLancamentoPDCAdapter() {
        return pdcListarCodLancamento;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarCodLancamento.
     * 
     * @param pdcListarCodLancamento
     *            Adaptador ListarCodLancamento
     */
    public void setListarCodLancamentoPDCAdapter(IListarCodLancamentoPDCAdapter pdcListarCodLancamento) {
        this.pdcListarCodLancamento = pdcListarCodLancamento;
    }
    /**
     * M�todo invocado para obter um adaptador ListarHistCodLancamento.
     * 
     * @return Adaptador ListarHistCodLancamento
     */
    public IListarHistCodLancamentoPDCAdapter getListarHistCodLancamentoPDCAdapter() {
        return pdcListarHistCodLancamento;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarHistCodLancamento.
     * 
     * @param pdcListarHistCodLancamento
     *            Adaptador ListarHistCodLancamento
     */
    public void setListarHistCodLancamentoPDCAdapter(IListarHistCodLancamentoPDCAdapter pdcListarHistCodLancamento) {
        this.pdcListarHistCodLancamento = pdcListarHistCodLancamento;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoMensalNvConta.
     * 
     * @return Adaptador ListarApuracaoMensalNvConta
     */
    public IListarApuracaoMensalNvContaPDCAdapter getListarApuracaoMensalNvContaPDCAdapter() {
        return pdcListarApuracaoMensalNvConta;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoMensalNvConta.
     * 
     * @param pdcListarApuracaoMensalNvConta
     *            Adaptador ListarApuracaoMensalNvConta
     */
    public void setListarApuracaoMensalNvContaPDCAdapter(IListarApuracaoMensalNvContaPDCAdapter pdcListarApuracaoMensalNvConta) {
        this.pdcListarApuracaoMensalNvConta = pdcListarApuracaoMensalNvConta;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoParcialNvConta.
     * 
     * @return Adaptador ListarApuracaoParcialNvConta
     */
    public IListarApuracaoParcialNvContaPDCAdapter getListarApuracaoParcialNvContaPDCAdapter() {
        return pdcListarApuracaoParcialNvConta;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoParcialNvConta.
     * 
     * @param pdcListarApuracaoParcialNvConta
     *            Adaptador ListarApuracaoParcialNvConta
     */
    public void setListarApuracaoParcialNvContaPDCAdapter(IListarApuracaoParcialNvContaPDCAdapter pdcListarApuracaoParcialNvConta) {
        this.pdcListarApuracaoParcialNvConta = pdcListarApuracaoParcialNvConta;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApurAposFechamentoNvConta.
     * 
     * @return Adaptador ListarApurAposFechamentoNvConta
     */
    public IListarApurAposFechamentoNvContaPDCAdapter getListarApurAposFechamentoNvContaPDCAdapter() {
        return pdcListarApurAposFechamentoNvConta;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApurAposFechamentoNvConta.
     * 
     * @param pdcListarApurAposFechamentoNvConta
     *            Adaptador ListarApurAposFechamentoNvConta
     */
    public void setListarApurAposFechamentoNvContaPDCAdapter(IListarApurAposFechamentoNvContaPDCAdapter pdcListarApurAposFechamentoNvConta) {
        this.pdcListarApurAposFechamentoNvConta = pdcListarApurAposFechamentoNvConta;
    }
    /**
     * M�todo invocado para obter um adaptador ListarMovNaoTributavelNvConta.
     * 
     * @return Adaptador ListarMovNaoTributavelNvConta
     */
    public IListarMovNaoTributavelNvContaPDCAdapter getListarMovNaoTributavelNvContaPDCAdapter() {
        return pdcListarMovNaoTributavelNvConta;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarMovNaoTributavelNvConta.
     * 
     * @param pdcListarMovNaoTributavelNvConta
     *            Adaptador ListarMovNaoTributavelNvConta
     */
    public void setListarMovNaoTributavelNvContaPDCAdapter(IListarMovNaoTributavelNvContaPDCAdapter pdcListarMovNaoTributavelNvConta) {
        this.pdcListarMovNaoTributavelNvConta = pdcListarMovNaoTributavelNvConta;
    }
    /**
     * M�todo invocado para obter um adaptador ListarValorMesTotalNvConta.
     * 
     * @return Adaptador ListarValorMesTotalNvConta
     */
    public IListarValorMesTotalNvContaPDCAdapter getListarValorMesTotalNvContaPDCAdapter() {
        return pdcListarValorMesTotalNvConta;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarValorMesTotalNvConta.
     * 
     * @param pdcListarValorMesTotalNvConta
     *            Adaptador ListarValorMesTotalNvConta
     */
    public void setListarValorMesTotalNvContaPDCAdapter(IListarValorMesTotalNvContaPDCAdapter pdcListarValorMesTotalNvConta) {
        this.pdcListarValorMesTotalNvConta = pdcListarValorMesTotalNvConta;
    }
    /**
     * M�todo invocado para obter um adaptador ListarApuracaoMensal.
     * 
     * @return Adaptador ListarApuracaoMensal
     */
    public IListarApuracaoMensalPDCAdapter getListarApuracaoMensalPDCAdapter() {
        return pdcListarApuracaoMensal;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarApuracaoMensal.
     * 
     * @param pdcListarApuracaoMensal
     *            Adaptador ListarApuracaoMensal
     */
    public void setListarApuracaoMensalPDCAdapter(IListarApuracaoMensalPDCAdapter pdcListarApuracaoMensal) {
        this.pdcListarApuracaoMensal = pdcListarApuracaoMensal;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirAlterarContasMunicipio.
     * 
     * @return Adaptador IncluirAlterarContasMunicipio
     */
    public IIncluirAlterarContasMunicipioPDCAdapter getIncluirAlterarContasMunicipioPDCAdapter() {
        return pdcIncluirAlterarContasMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirAlterarContasMunicipio.
     * 
     * @param pdcIncluirAlterarContasMunicipio
     *            Adaptador IncluirAlterarContasMunicipio
     */
    public void setIncluirAlterarContasMunicipioPDCAdapter(IIncluirAlterarContasMunicipioPDCAdapter pdcIncluirAlterarContasMunicipio) {
        this.pdcIncluirAlterarContasMunicipio = pdcIncluirAlterarContasMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarListaContasTipoServico.
     * 
     * @return Adaptador ConsultarListaContasTipoServico
     */
    public IConsultarListaContasTipoServicoPDCAdapter getConsultarListaContasTipoServicoPDCAdapter() {
        return pdcConsultarListaContasTipoServico;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarListaContasTipoServico.
     * 
     * @param pdcConsultarListaContasTipoServico
     *            Adaptador ConsultarListaContasTipoServico
     */
    public void setConsultarListaContasTipoServicoPDCAdapter(IConsultarListaContasTipoServicoPDCAdapter pdcConsultarListaContasTipoServico) {
        this.pdcConsultarListaContasTipoServico = pdcConsultarListaContasTipoServico;
    }
    /**
     * M�todo invocado para obter um adaptador ListaPlanilhaApuracao.
     * 
     * @return Adaptador ListaPlanilhaApuracao
     */
    public IListaPlanilhaApuracaoPDCAdapter getListaPlanilhaApuracaoPDCAdapter() {
        return pdcListaPlanilhaApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaPlanilhaApuracao.
     * 
     * @param pdcListaPlanilhaApuracao
     *            Adaptador ListaPlanilhaApuracao
     */
    public void setListaPlanilhaApuracaoPDCAdapter(IListaPlanilhaApuracaoPDCAdapter pdcListaPlanilhaApuracao) {
        this.pdcListaPlanilhaApuracao = pdcListaPlanilhaApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador ListaPlanilhaApuracao2.
     * 
     * @return Adaptador ListaPlanilhaApuracao2
     */
    public IListaPlanilhaApuracao2PDCAdapter getListaPlanilhaApuracao2PDCAdapter() {
        return pdcListaPlanilhaApuracao2;
    }

    /**
     * M�todo invocado para establecer um adaptador ListaPlanilhaApuracao2.
     * 
     * @param pdcListaPlanilhaApuracao2
     *            Adaptador ListaPlanilhaApuracao2
     */
    public void setListaPlanilhaApuracao2PDCAdapter(IListaPlanilhaApuracao2PDCAdapter pdcListaPlanilhaApuracao2) {
        this.pdcListaPlanilhaApuracao2 = pdcListaPlanilhaApuracao2;
    }
    /**
     * M�todo invocado para obter um adaptador ListarResultMunNovosAll.
     * 
     * @return Adaptador ListarResultMunNovosAll
     */
    public IListarResultMunNovosAllPDCAdapter getListarResultMunNovosAllPDCAdapter() {
        return pdcListarResultMunNovosAll;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarResultMunNovosAll.
     * 
     * @param pdcListarResultMunNovosAll
     *            Adaptador ListarResultMunNovosAll
     */
    public void setListarResultMunNovosAllPDCAdapter(IListarResultMunNovosAllPDCAdapter pdcListarResultMunNovosAll) {
        this.pdcListarResultMunNovosAll = pdcListarResultMunNovosAll;
    }
    /**
     * M�todo invocado para obter um adaptador ListarPlanilhaApuracao.
     * 
     * @return Adaptador ListarPlanilhaApuracao
     */
    public IListarPlanilhaApuracaoPDCAdapter getListarPlanilhaApuracaoPDCAdapter() {
        return pdcListarPlanilhaApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarPlanilhaApuracao.
     * 
     * @param pdcListarPlanilhaApuracao
     *            Adaptador ListarPlanilhaApuracao
     */
    public void setListarPlanilhaApuracaoPDCAdapter(IListarPlanilhaApuracaoPDCAdapter pdcListarPlanilhaApuracao) {
        this.pdcListarPlanilhaApuracao = pdcListarPlanilhaApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador GerarDependenciasPlanApuracao.
     * 
     * @return Adaptador GerarDependenciasPlanApuracao
     */
    public IGerarDependenciasPlanApuracaoPDCAdapter getGerarDependenciasPlanApuracaoPDCAdapter() {
        return pdcGerarDependenciasPlanApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador GerarDependenciasPlanApuracao.
     * 
     * @param pdcGerarDependenciasPlanApuracao
     *            Adaptador GerarDependenciasPlanApuracao
     */
    public void setGerarDependenciasPlanApuracaoPDCAdapter(IGerarDependenciasPlanApuracaoPDCAdapter pdcGerarDependenciasPlanApuracao) {
        this.pdcGerarDependenciasPlanApuracao = pdcGerarDependenciasPlanApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador LiberarPagamento.
     * 
     * @return Adaptador LiberarPagamento
     */
    public ILiberarPagamentoPDCAdapter getLiberarPagamentoPDCAdapter() {
        return pdcLiberarPagamento;
    }

    /**
     * M�todo invocado para establecer um adaptador LiberarPagamento.
     * 
     * @param pdcLiberarPagamento
     *            Adaptador LiberarPagamento
     */
    public void setLiberarPagamentoPDCAdapter(ILiberarPagamentoPDCAdapter pdcLiberarPagamento) {
        this.pdcLiberarPagamento = pdcLiberarPagamento;
    }
    /**
     * M�todo invocado para obter um adaptador DetalharJustificativaApuracao.
     * 
     * @return Adaptador DetalharJustificativaApuracao
     */
    public IDetalharJustificativaApuracaoPDCAdapter getDetalharJustificativaApuracaoPDCAdapter() {
        return pdcDetalharJustificativaApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador DetalharJustificativaApuracao.
     * 
     * @param pdcDetalharJustificativaApuracao
     *            Adaptador DetalharJustificativaApuracao
     */
    public void setDetalharJustificativaApuracaoPDCAdapter(IDetalharJustificativaApuracaoPDCAdapter pdcDetalharJustificativaApuracao) {
        this.pdcDetalharJustificativaApuracao = pdcDetalharJustificativaApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirJustificativa.
     * 
     * @return Adaptador IncluirJustificativa
     */
    public IIncluirJustificativaPDCAdapter getIncluirJustificativaPDCAdapter() {
        return pdcIncluirJustificativa;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirJustificativa.
     * 
     * @param pdcIncluirJustificativa
     *            Adaptador IncluirJustificativa
     */
    public void setIncluirJustificativaPDCAdapter(IIncluirJustificativaPDCAdapter pdcIncluirJustificativa) {
        this.pdcIncluirJustificativa = pdcIncluirJustificativa;
    }
    /**
     * M�todo invocado para obter um adaptador ListarConciliacaoApuracao.
     * 
     * @return Adaptador ListarConciliacaoApuracao
     */
    public IListarConciliacaoApuracaoPDCAdapter getListarConciliacaoApuracaoPDCAdapter() {
        return pdcListarConciliacaoApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarConciliacaoApuracao.
     * 
     * @param pdcListarConciliacaoApuracao
     *            Adaptador ListarConciliacaoApuracao
     */
    public void setListarConciliacaoApuracaoPDCAdapter(IListarConciliacaoApuracaoPDCAdapter pdcListarConciliacaoApuracao) {
        this.pdcListarConciliacaoApuracao = pdcListarConciliacaoApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador ListarConciliacaoApuracaoLoop.
     * 
     * @return Adaptador ListarConciliacaoApuracaoLoop
     */
    public IListarConciliacaoApuracaoLoopPDCAdapter getListarConciliacaoApuracaoLoopPDCAdapter() {
        return pdcListarConciliacaoApuracaoLoop;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarConciliacaoApuracaoLoop.
     * 
     * @param pdcListarConciliacaoApuracaoLoop
     *            Adaptador ListarConciliacaoApuracaoLoop
     */
    public void setListarConciliacaoApuracaoLoopPDCAdapter(IListarConciliacaoApuracaoLoopPDCAdapter pdcListarConciliacaoApuracaoLoop) {
        this.pdcListarConciliacaoApuracaoLoop = pdcListarConciliacaoApuracaoLoop;
    }
    /**
     * M�todo invocado para obter um adaptador ParametrizarMinMaxAliquota.
     * 
     * @return Adaptador ParametrizarMinMaxAliquota
     */
    public IParametrizarMinMaxAliquotaPDCAdapter getParametrizarMinMaxAliquotaPDCAdapter() {
        return pdcParametrizarMinMaxAliquota;
    }

    /**
     * M�todo invocado para establecer um adaptador ParametrizarMinMaxAliquota.
     * 
     * @param pdcParametrizarMinMaxAliquota
     *            Adaptador ParametrizarMinMaxAliquota
     */
    public void setParametrizarMinMaxAliquotaPDCAdapter(IParametrizarMinMaxAliquotaPDCAdapter pdcParametrizarMinMaxAliquota) {
        this.pdcParametrizarMinMaxAliquota = pdcParametrizarMinMaxAliquota;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarHistoricoMinMaxAliquota.
     * 
     * @return Adaptador ConsultarHistoricoMinMaxAliquota
     */
    public IConsultarHistoricoMinMaxAliquotaPDCAdapter getConsultarHistoricoMinMaxAliquotaPDCAdapter() {
        return pdcConsultarHistoricoMinMaxAliquota;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarHistoricoMinMaxAliquota.
     * 
     * @param pdcConsultarHistoricoMinMaxAliquota
     *            Adaptador ConsultarHistoricoMinMaxAliquota
     */
    public void setConsultarHistoricoMinMaxAliquotaPDCAdapter(IConsultarHistoricoMinMaxAliquotaPDCAdapter pdcConsultarHistoricoMinMaxAliquota) {
        this.pdcConsultarHistoricoMinMaxAliquota = pdcConsultarHistoricoMinMaxAliquota;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarMunicipioISS.
     * 
     * @return Adaptador AlterarMunicipioISS
     */
    public IAlterarMunicipioISSPDCAdapter getAlterarMunicipioISSPDCAdapter() {
        return pdcAlterarMunicipioISS;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarMunicipioISS.
     * 
     * @param pdcAlterarMunicipioISS
     *            Adaptador AlterarMunicipioISS
     */
    public void setAlterarMunicipioISSPDCAdapter(IAlterarMunicipioISSPDCAdapter pdcAlterarMunicipioISS) {
        this.pdcAlterarMunicipioISS = pdcAlterarMunicipioISS;
    }
    /**
     * M�todo invocado para obter um adaptador ReativarMunicipioISS.
     * 
     * @return Adaptador ReativarMunicipioISS
     */
    public IReativarMunicipioISSPDCAdapter getReativarMunicipioISSPDCAdapter() {
        return pdcReativarMunicipioISS;
    }

    /**
     * M�todo invocado para establecer um adaptador ReativarMunicipioISS.
     * 
     * @param pdcReativarMunicipioISS
     *            Adaptador ReativarMunicipioISS
     */
    public void setReativarMunicipioISSPDCAdapter(IReativarMunicipioISSPDCAdapter pdcReativarMunicipioISS) {
        this.pdcReativarMunicipioISS = pdcReativarMunicipioISS;
    }
    /**
     * M�todo invocado para obter um adaptador ListarHistoricoMunicipio.
     * 
     * @return Adaptador ListarHistoricoMunicipio
     */
    public IListarHistoricoMunicipioPDCAdapter getListarHistoricoMunicipioPDCAdapter() {
        return pdcListarHistoricoMunicipio;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarHistoricoMunicipio.
     * 
     * @param pdcListarHistoricoMunicipio
     *            Adaptador ListarHistoricoMunicipio
     */
    public void setListarHistoricoMunicipioPDCAdapter(IListarHistoricoMunicipioPDCAdapter pdcListarHistoricoMunicipio) {
        this.pdcListarHistoricoMunicipio = pdcListarHistoricoMunicipio;
    }
    /**
     * M�todo invocado para obter um adaptador ListarHistoricoItemLeiCompl.
     * 
     * @return Adaptador ListarHistoricoItemLeiCompl
     */
    public IListarHistoricoItemLeiComplPDCAdapter getListarHistoricoItemLeiComplPDCAdapter() {
        return pdcListarHistoricoItemLeiCompl;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarHistoricoItemLeiCompl.
     * 
     * @param pdcListarHistoricoItemLeiCompl
     *            Adaptador ListarHistoricoItemLeiCompl
     */
    public void setListarHistoricoItemLeiComplPDCAdapter(IListarHistoricoItemLeiComplPDCAdapter pdcListarHistoricoItemLeiCompl) {
        this.pdcListarHistoricoItemLeiCompl = pdcListarHistoricoItemLeiCompl;
    }
    /**
     * M�todo invocado para obter um adaptador DetalharHistoricoItemLeiCompl.
     * 
     * @return Adaptador DetalharHistoricoItemLeiCompl
     */
    public IDetalharHistoricoItemLeiComplPDCAdapter getDetalharHistoricoItemLeiComplPDCAdapter() {
        return pdcDetalharHistoricoItemLeiCompl;
    }

    /**
     * M�todo invocado para establecer um adaptador DetalharHistoricoItemLeiCompl.
     * 
     * @param pdcDetalharHistoricoItemLeiCompl
     *            Adaptador DetalharHistoricoItemLeiCompl
     */
    public void setDetalharHistoricoItemLeiComplPDCAdapter(IDetalharHistoricoItemLeiComplPDCAdapter pdcDetalharHistoricoItemLeiCompl) {
        this.pdcDetalharHistoricoItemLeiCompl = pdcDetalharHistoricoItemLeiCompl;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarMunicipioUf.
     * 
     * @return Adaptador ConsultarMunicipioUf
     */
    public IConsultarMunicipioUfPDCAdapter getConsultarMunicipioUfPDCAdapter() {
        return pdcConsultarMunicipioUf;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarMunicipioUf.
     * 
     * @param pdcConsultarMunicipioUf
     *            Adaptador ConsultarMunicipioUf
     */
    public void setConsultarMunicipioUfPDCAdapter(IConsultarMunicipioUfPDCAdapter pdcConsultarMunicipioUf) {
        this.pdcConsultarMunicipioUf = pdcConsultarMunicipioUf;
    }
    /**
     * M�todo invocado para obter um adaptador ListarHistoricoEmpresa.
     * 
     * @return Adaptador ListarHistoricoEmpresa
     */
    public IListarHistoricoEmpresaPDCAdapter getListarHistoricoEmpresaPDCAdapter() {
        return pdcListarHistoricoEmpresa;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarHistoricoEmpresa.
     * 
     * @param pdcListarHistoricoEmpresa
     *            Adaptador ListarHistoricoEmpresa
     */
    public void setListarHistoricoEmpresaPDCAdapter(IListarHistoricoEmpresaPDCAdapter pdcListarHistoricoEmpresa) {
        this.pdcListarHistoricoEmpresa = pdcListarHistoricoEmpresa;
    }
    /**
     * M�todo invocado para obter um adaptador ListarItemComplementar.
     * 
     * @return Adaptador ListarItemComplementar
     */
    public IListarItemComplementarPDCAdapter getListarItemComplementarPDCAdapter() {
        return pdcListarItemComplementar;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarItemComplementar.
     * 
     * @param pdcListarItemComplementar
     *            Adaptador ListarItemComplementar
     */
    public void setListarItemComplementarPDCAdapter(IListarItemComplementarPDCAdapter pdcListarItemComplementar) {
        this.pdcListarItemComplementar = pdcListarItemComplementar;
    }
    /**
     * M�todo invocado para obter um adaptador ReativarItemServicoLc.
     * 
     * @return Adaptador ReativarItemServicoLc
     */
    public IReativarItemServicoLcPDCAdapter getReativarItemServicoLcPDCAdapter() {
        return pdcReativarItemServicoLc;
    }

    /**
     * M�todo invocado para establecer um adaptador ReativarItemServicoLc.
     * 
     * @param pdcReativarItemServicoLc
     *            Adaptador ReativarItemServicoLc
     */
    public void setReativarItemServicoLcPDCAdapter(IReativarItemServicoLcPDCAdapter pdcReativarItemServicoLc) {
        this.pdcReativarItemServicoLc = pdcReativarItemServicoLc;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarArquivoEmp.
     * 
     * @return Adaptador ConsultarArquivoEmp
     */
    public IConsultarArquivoEmpPDCAdapter getConsultarArquivoEmpPDCAdapter() {
        return pdcConsultarArquivoEmp;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarArquivoEmp.
     * 
     * @param pdcConsultarArquivoEmp
     *            Adaptador ConsultarArquivoEmp
     */
    public void setConsultarArquivoEmpPDCAdapter(IConsultarArquivoEmpPDCAdapter pdcConsultarArquivoEmp) {
        this.pdcConsultarArquivoEmp = pdcConsultarArquivoEmp;
    }
    /**
     * M�todo invocado para obter um adaptador DetalharMunicipioHistorico.
     * 
     * @return Adaptador DetalharMunicipioHistorico
     */
    public IDetalharMunicipioHistoricoPDCAdapter getDetalharMunicipioHistoricoPDCAdapter() {
        return pdcDetalharMunicipioHistorico;
    }

    /**
     * M�todo invocado para establecer um adaptador DetalharMunicipioHistorico.
     * 
     * @param pdcDetalharMunicipioHistorico
     *            Adaptador DetalharMunicipioHistorico
     */
    public void setDetalharMunicipioHistoricoPDCAdapter(IDetalharMunicipioHistoricoPDCAdapter pdcDetalharMunicipioHistorico) {
        this.pdcDetalharMunicipioHistorico = pdcDetalharMunicipioHistorico;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarCadastroEmp.
     * 
     * @return Adaptador AlterarCadastroEmp
     */
    public IAlterarCadastroEmpPDCAdapter getAlterarCadastroEmpPDCAdapter() {
        return pdcAlterarCadastroEmp;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarCadastroEmp.
     * 
     * @param pdcAlterarCadastroEmp
     *            Adaptador AlterarCadastroEmp
     */
    public void setAlterarCadastroEmpPDCAdapter(IAlterarCadastroEmpPDCAdapter pdcAlterarCadastroEmp) {
        this.pdcAlterarCadastroEmp = pdcAlterarCadastroEmp;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirCadastroEmp.
     * 
     * @return Adaptador IncluirCadastroEmp
     */
    public IIncluirCadastroEmpPDCAdapter getIncluirCadastroEmpPDCAdapter() {
        return pdcIncluirCadastroEmp;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirCadastroEmp.
     * 
     * @param pdcIncluirCadastroEmp
     *            Adaptador IncluirCadastroEmp
     */
    public void setIncluirCadastroEmpPDCAdapter(IIncluirCadastroEmpPDCAdapter pdcIncluirCadastroEmp) {
        this.pdcIncluirCadastroEmp = pdcIncluirCadastroEmp;
    }
    /**
     * M�todo invocado para obter um adaptador ListarEmpCadastros.
     * 
     * @return Adaptador ListarEmpCadastros
     */
    public IListarEmpCadastrosPDCAdapter getListarEmpCadastrosPDCAdapter() {
        return pdcListarEmpCadastros;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarEmpCadastros.
     * 
     * @param pdcListarEmpCadastros
     *            Adaptador ListarEmpCadastros
     */
    public void setListarEmpCadastrosPDCAdapter(IListarEmpCadastrosPDCAdapter pdcListarEmpCadastros) {
        this.pdcListarEmpCadastros = pdcListarEmpCadastros;
    }
    /**
     * M�todo invocado para obter um adaptador DetalharHistoricoEmpresa.
     * 
     * @return Adaptador DetalharHistoricoEmpresa
     */
    public IDetalharHistoricoEmpresaPDCAdapter getDetalharHistoricoEmpresaPDCAdapter() {
        return pdcDetalharHistoricoEmpresa;
    }

    /**
     * M�todo invocado para establecer um adaptador DetalharHistoricoEmpresa.
     * 
     * @param pdcDetalharHistoricoEmpresa
     *            Adaptador DetalharHistoricoEmpresa
     */
    public void setDetalharHistoricoEmpresaPDCAdapter(IDetalharHistoricoEmpresaPDCAdapter pdcDetalharHistoricoEmpresa) {
        this.pdcDetalharHistoricoEmpresa = pdcDetalharHistoricoEmpresa;
    }
    /**
     * M�todo invocado para obter um adaptador GerarRelatoriosAliquotas.
     * 
     * @return Adaptador GerarRelatoriosAliquotas
     */
    public IGerarRelatoriosAliquotasPDCAdapter getGerarRelatoriosAliquotasPDCAdapter() {
        return pdcGerarRelatoriosAliquotas;
    }

    /**
     * M�todo invocado para establecer um adaptador GerarRelatoriosAliquotas.
     * 
     * @param pdcGerarRelatoriosAliquotas
     *            Adaptador GerarRelatoriosAliquotas
     */
    public void setGerarRelatoriosAliquotasPDCAdapter(IGerarRelatoriosAliquotasPDCAdapter pdcGerarRelatoriosAliquotas) {
        this.pdcGerarRelatoriosAliquotas = pdcGerarRelatoriosAliquotas;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarInformacoesAliquota.
     * 
     * @return Adaptador ConsultarInformacoesAliquota
     */
    public IConsultarInformacoesAliquotaPDCAdapter getConsultarInformacoesAliquotaPDCAdapter() {
        return pdcConsultarInformacoesAliquota;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarInformacoesAliquota.
     * 
     * @param pdcConsultarInformacoesAliquota
     *            Adaptador ConsultarInformacoesAliquota
     */
    public void setConsultarInformacoesAliquotaPDCAdapter(IConsultarInformacoesAliquotaPDCAdapter pdcConsultarInformacoesAliquota) {
        this.pdcConsultarInformacoesAliquota = pdcConsultarInformacoesAliquota;
    }
    /**
     * M�todo invocado para obter um adaptador GerarRelatorioApuracao.
     * 
     * @return Adaptador GerarRelatorioApuracao
     */
    public IGerarRelatorioApuracaoPDCAdapter getGerarRelatorioApuracaoPDCAdapter() {
        return pdcGerarRelatorioApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador GerarRelatorioApuracao.
     * 
     * @param pdcGerarRelatorioApuracao
     *            Adaptador GerarRelatorioApuracao
     */
    public void setGerarRelatorioApuracaoPDCAdapter(IGerarRelatorioApuracaoPDCAdapter pdcGerarRelatorioApuracao) {
        this.pdcGerarRelatorioApuracao = pdcGerarRelatorioApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador ConsultarLiberarPagto.
     * 
     * @return Adaptador ConsultarLiberarPagto
     */
    public IConsultarLiberarPagtoPDCAdapter getConsultarLiberarPagtoPDCAdapter() {
        return pdcConsultarLiberarPagto;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarLiberarPagto.
     * 
     * @param pdcConsultarLiberarPagto
     *            Adaptador ConsultarLiberarPagto
     */
    public void setConsultarLiberarPagtoPDCAdapter(IConsultarLiberarPagtoPDCAdapter pdcConsultarLiberarPagto) {
        this.pdcConsultarLiberarPagto = pdcConsultarLiberarPagto;
    }
    /**
     * M�todo invocado para obter um adaptador AgendarPgtoLote.
     * 
     * @return Adaptador AgendarPgtoLote
     */
    public IAgendarPgtoLotePDCAdapter getAgendarPgtoLotePDCAdapter() {
        return pdcAgendarPgtoLote;
    }

    /**
     * M�todo invocado para establecer um adaptador AgendarPgtoLote.
     * 
     * @param pdcAgendarPgtoLote
     *            Adaptador AgendarPgtoLote
     */
    public void setAgendarPgtoLotePDCAdapter(IAgendarPgtoLotePDCAdapter pdcAgendarPgtoLote) {
        this.pdcAgendarPgtoLote = pdcAgendarPgtoLote;
    }
    /**
     * M�todo invocado para obter um adaptador ListarPgtosNaoGerados.
     * 
     * @return Adaptador ListarPgtosNaoGerados
     */
    public IListarPgtosNaoGeradosPDCAdapter getListarPgtosNaoGeradosPDCAdapter() {
        return pdcListarPgtosNaoGerados;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarPgtosNaoGerados.
     * 
     * @param pdcListarPgtosNaoGerados
     *            Adaptador ListarPgtosNaoGerados
     */
    public void setListarPgtosNaoGeradosPDCAdapter(IListarPgtosNaoGeradosPDCAdapter pdcListarPgtosNaoGerados) {
        this.pdcListarPgtosNaoGerados = pdcListarPgtosNaoGerados;
    }
    /**
     * M�todo invocado para obter um adaptador ListarPgtosVencidosComp.
     * 
     * @return Adaptador ListarPgtosVencidosComp
     */
    public IListarPgtosVencidosCompPDCAdapter getListarPgtosVencidosCompPDCAdapter() {
        return pdcListarPgtosVencidosComp;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarPgtosVencidosComp.
     * 
     * @param pdcListarPgtosVencidosComp
     *            Adaptador ListarPgtosVencidosComp
     */
    public void setListarPgtosVencidosCompPDCAdapter(IListarPgtosVencidosCompPDCAdapter pdcListarPgtosVencidosComp) {
        this.pdcListarPgtosVencidosComp = pdcListarPgtosVencidosComp;
    }
    /**
     * M�todo invocado para obter um adaptador ListarNaoElegiveis.
     * 
     * @return Adaptador ListarNaoElegiveis
     */
    public IListarNaoElegiveisPDCAdapter getListarNaoElegiveisPDCAdapter() {
        return pdcListarNaoElegiveis;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarNaoElegiveis.
     * 
     * @param pdcListarNaoElegiveis
     *            Adaptador ListarNaoElegiveis
     */
    public void setListarNaoElegiveisPDCAdapter(IListarNaoElegiveisPDCAdapter pdcListarNaoElegiveis) {
        this.pdcListarNaoElegiveis = pdcListarNaoElegiveis;
    }
    /**
     * M�todo invocado para obter um adaptador ListarPagamentoManual.
     * 
     * @return Adaptador ListarPagamentoManual
     */
    public IListarPagamentoManualPDCAdapter getListarPagamentoManualPDCAdapter() {
        return pdcListarPagamentoManual;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarPagamentoManual.
     * 
     * @param pdcListarPagamentoManual
     *            Adaptador ListarPagamentoManual
     */
    public void setListarPagamentoManualPDCAdapter(IListarPagamentoManualPDCAdapter pdcListarPagamentoManual) {
        this.pdcListarPagamentoManual = pdcListarPagamentoManual;
    }
    /**
     * M�todo invocado para obter um adaptador ListarConsultaPagamentos.
     * 
     * @return Adaptador ListarConsultaPagamentos
     */
    public IListarConsultaPagamentosPDCAdapter getListarConsultaPagamentosPDCAdapter() {
        return pdcListarConsultaPagamentos;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarConsultaPagamentos.
     * 
     * @param pdcListarConsultaPagamentos
     *            Adaptador ListarConsultaPagamentos
     */
    public void setListarConsultaPagamentosPDCAdapter(IListarConsultaPagamentosPDCAdapter pdcListarConsultaPagamentos) {
        this.pdcListarConsultaPagamentos = pdcListarConsultaPagamentos;
    }
    /**
     * M�todo invocado para obter um adaptador AgendarPgtoIndividual.
     * 
     * @return Adaptador AgendarPgtoIndividual
     */
    public IAgendarPgtoIndividualPDCAdapter getAgendarPgtoIndividualPDCAdapter() {
        return pdcAgendarPgtoIndividual;
    }

    /**
     * M�todo invocado para establecer um adaptador AgendarPgtoIndividual.
     * 
     * @param pdcAgendarPgtoIndividual
     *            Adaptador AgendarPgtoIndividual
     */
    public void setAgendarPgtoIndividualPDCAdapter(IAgendarPgtoIndividualPDCAdapter pdcAgendarPgtoIndividual) {
        this.pdcAgendarPgtoIndividual = pdcAgendarPgtoIndividual;
    }
    /**
     * M�todo invocado para obter um adaptador AgendarSelecionadosOuTodos.
     * 
     * @return Adaptador AgendarSelecionadosOuTodos
     */
    public IAgendarSelecionadosOuTodosPDCAdapter getAgendarSelecionadosOuTodosPDCAdapter() {
        return pdcAgendarSelecionadosOuTodos;
    }

    /**
     * M�todo invocado para establecer um adaptador AgendarSelecionadosOuTodos.
     * 
     * @param pdcAgendarSelecionadosOuTodos
     *            Adaptador AgendarSelecionadosOuTodos
     */
    public void setAgendarSelecionadosOuTodosPDCAdapter(IAgendarSelecionadosOuTodosPDCAdapter pdcAgendarSelecionadosOuTodos) {
        this.pdcAgendarSelecionadosOuTodos = pdcAgendarSelecionadosOuTodos;
    }
    /**
     * M�todo invocado para obter um adaptador ListarPercentualTransicao.
     * 
     * @return Adaptador ListarPercentualTransicao
     */
    public IListarPercentualTransicaoPDCAdapter getListarPercentualTransicaoPDCAdapter() {
        return pdcListarPercentualTransicao;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarPercentualTransicao.
     * 
     * @param pdcListarPercentualTransicao
     *            Adaptador ListarPercentualTransicao
     */
    public void setListarPercentualTransicaoPDCAdapter(IListarPercentualTransicaoPDCAdapter pdcListarPercentualTransicao) {
        this.pdcListarPercentualTransicao = pdcListarPercentualTransicao;
    }
    /**
     * M�todo invocado para obter um adaptador IncluirPercentualTransicao.
     * 
     * @return Adaptador IncluirPercentualTransicao
     */
    public IIncluirPercentualTransicaoPDCAdapter getIncluirPercentualTransicaoPDCAdapter() {
        return pdcIncluirPercentualTransicao;
    }

    /**
     * M�todo invocado para establecer um adaptador IncluirPercentualTransicao.
     * 
     * @param pdcIncluirPercentualTransicao
     *            Adaptador IncluirPercentualTransicao
     */
    public void setIncluirPercentualTransicaoPDCAdapter(IIncluirPercentualTransicaoPDCAdapter pdcIncluirPercentualTransicao) {
        this.pdcIncluirPercentualTransicao = pdcIncluirPercentualTransicao;
    }
    /**
     * M�todo invocado para obter um adaptador AlterarPercentualTransicao.
     * 
     * @return Adaptador AlterarPercentualTransicao
     */
    public IAlterarPercentualTransicaoPDCAdapter getAlterarPercentualTransicaoPDCAdapter() {
        return pdcAlterarPercentualTransicao;
    }

    /**
     * M�todo invocado para establecer um adaptador AlterarPercentualTransicao.
     * 
     * @param pdcAlterarPercentualTransicao
     *            Adaptador AlterarPercentualTransicao
     */
    public void setAlterarPercentualTransicaoPDCAdapter(IAlterarPercentualTransicaoPDCAdapter pdcAlterarPercentualTransicao) {
        this.pdcAlterarPercentualTransicao = pdcAlterarPercentualTransicao;
    }
    /**
     * M�todo invocado para obter um adaptador ExcluirPercentualTransicao.
     * 
     * @return Adaptador ExcluirPercentualTransicao
     */
    public IExcluirPercentualTransicaoPDCAdapter getExcluirPercentualTransicaoPDCAdapter() {
        return pdcExcluirPercentualTransicao;
    }

    /**
     * M�todo invocado para establecer um adaptador ExcluirPercentualTransicao.
     * 
     * @param pdcExcluirPercentualTransicao
     *            Adaptador ExcluirPercentualTransicao
     */
    public void setExcluirPercentualTransicaoPDCAdapter(IExcluirPercentualTransicaoPDCAdapter pdcExcluirPercentualTransicao) {
        this.pdcExcluirPercentualTransicao = pdcExcluirPercentualTransicao;
    }
    /**
     * M�todo invocado para obter um adaptador CancelarTedTransferencia.
     * 
     * @return Adaptador CancelarTedTransferencia
     */
    public ICancelarTedTransferenciaPDCAdapter getCancelarTedTransferenciaPDCAdapter() {
        return pdcCancelarTedTransferencia;
    }

    /**
     * M�todo invocado para establecer um adaptador CancelarTedTransferencia.
     * 
     * @param pdcCancelarTedTransferencia
     *            Adaptador CancelarTedTransferencia
     */
    public void setCancelarTedTransferenciaPDCAdapter(ICancelarTedTransferenciaPDCAdapter pdcCancelarTedTransferencia) {
        this.pdcCancelarTedTransferencia = pdcCancelarTedTransferencia;
    }
    /**
     * M�todo invocado para obter um adaptador CalcularSelecionadosOuTodos.
     * 
     * @return Adaptador CalcularSelecionadosOuTodos
     */
    public ICalcularSelecionadosOuTodosPDCAdapter getCalcularSelecionadosOuTodosPDCAdapter() {
        return pdcCalcularSelecionadosOuTodos;
    }

    /**
     * M�todo invocado para establecer um adaptador CalcularSelecionadosOuTodos.
     * 
     * @param pdcCalcularSelecionadosOuTodos
     *            Adaptador CalcularSelecionadosOuTodos
     */
    public void setCalcularSelecionadosOuTodosPDCAdapter(ICalcularSelecionadosOuTodosPDCAdapter pdcCalcularSelecionadosOuTodos) {
        this.pdcCalcularSelecionadosOuTodos = pdcCalcularSelecionadosOuTodos;
    }
    /**
     * M�todo invocado para obter um adaptador ListarCargaMassiva.
     * 
     * @return Adaptador ListarCargaMassiva
     */
    public IListarCargaMassivaPDCAdapter getListarCargaMassivaPDCAdapter() {
        return pdcListarCargaMassiva;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarCargaMassiva.
     * 
     * @param pdcListarCargaMassiva
     *            Adaptador ListarCargaMassiva
     */
    public void setListarCargaMassivaPDCAdapter(IListarCargaMassivaPDCAdapter pdcListarCargaMassiva) {
        this.pdcListarCargaMassiva = pdcListarCargaMassiva;
    }
    /**
     * M�todo invocado para obter um adaptador DetalharCargaMassiva.
     * 
     * @return Adaptador DetalharCargaMassiva
     */
    public IDetalharCargaMassivaPDCAdapter getDetalharCargaMassivaPDCAdapter() {
        return pdcDetalharCargaMassiva;
    }

    /**
     * M�todo invocado para establecer um adaptador DetalharCargaMassiva.
     * 
     * @param pdcDetalharCargaMassiva
     *            Adaptador DetalharCargaMassiva
     */
    public void setDetalharCargaMassivaPDCAdapter(IDetalharCargaMassivaPDCAdapter pdcDetalharCargaMassiva) {
        this.pdcDetalharCargaMassiva = pdcDetalharCargaMassiva;
    }
    /**
     * M�todo invocado para obter um adaptador AprovarCargaMassiva.
     * 
     * @return Adaptador AprovarCargaMassiva
     */
    public IAprovarCargaMassivaPDCAdapter getAprovarCargaMassivaPDCAdapter() {
        return pdcAprovarCargaMassiva;
    }

    /**
     * M�todo invocado para establecer um adaptador AprovarCargaMassiva.
     * 
     * @param pdcAprovarCargaMassiva
     *            Adaptador AprovarCargaMassiva
     */
    public void setAprovarCargaMassivaPDCAdapter(IAprovarCargaMassivaPDCAdapter pdcAprovarCargaMassiva) {
        this.pdcAprovarCargaMassiva = pdcAprovarCargaMassiva;
    }
    /**
     * M�todo invocado para obter um adaptador ConferirRejeitarCargaMassiva.
     * 
     * @return Adaptador ConferirRejeitarCargaMassiva
     */
    public IConferirRejeitarCargaMassivaPDCAdapter getConferirRejeitarCargaMassivaPDCAdapter() {
        return pdcConferirRejeitarCargaMassiva;
    }

    /**
     * M�todo invocado para establecer um adaptador ConferirRejeitarCargaMassiva.
     * 
     * @param pdcConferirRejeitarCargaMassiva
     *            Adaptador ConferirRejeitarCargaMassiva
     */
    public void setConferirRejeitarCargaMassivaPDCAdapter(IConferirRejeitarCargaMassivaPDCAdapter pdcConferirRejeitarCargaMassiva) {
        this.pdcConferirRejeitarCargaMassiva = pdcConferirRejeitarCargaMassiva;
    }
    /**
     * M�todo invocado para obter um adaptador ManterAliquotaLista.
     * 
     * @return Adaptador ManterAliquotaLista
     */
    public IManterAliquotaListaPDCAdapter getManterAliquotaListaPDCAdapter() {
        return pdcManterAliquotaLista;
    }

    /**
     * M�todo invocado para establecer um adaptador ManterAliquotaLista.
     * 
     * @param pdcManterAliquotaLista
     *            Adaptador ManterAliquotaLista
     */
    public void setManterAliquotaListaPDCAdapter(IManterAliquotaListaPDCAdapter pdcManterAliquotaLista) {
        this.pdcManterAliquotaLista = pdcManterAliquotaLista;
    }
    /**
     * M�todo invocado para obter um adaptador ManterAliquotaDetalhe.
     * 
     * @return Adaptador ManterAliquotaDetalhe
     */
    public IManterAliquotaDetalhePDCAdapter getManterAliquotaDetalhePDCAdapter() {
        return pdcManterAliquotaDetalhe;
    }

    /**
     * M�todo invocado para establecer um adaptador ManterAliquotaDetalhe.
     * 
     * @param pdcManterAliquotaDetalhe
     *            Adaptador ManterAliquotaDetalhe
     */
    public void setManterAliquotaDetalhePDCAdapter(IManterAliquotaDetalhePDCAdapter pdcManterAliquotaDetalhe) {
        this.pdcManterAliquotaDetalhe = pdcManterAliquotaDetalhe;
    }
    /**
     * M�todo invocado para obter um adaptador ManterAliquotaManutencao.
     * 
     * @return Adaptador ManterAliquotaManutencao
     */
    public IManterAliquotaManutencaoPDCAdapter getManterAliquotaManutencaoPDCAdapter() {
        return pdcManterAliquotaManutencao;
    }

    /**
     * M�todo invocado para establecer um adaptador ManterAliquotaManutencao.
     * 
     * @param pdcManterAliquotaManutencao
     *            Adaptador ManterAliquotaManutencao
     */
    public void setManterAliquotaManutencaoPDCAdapter(IManterAliquotaManutencaoPDCAdapter pdcManterAliquotaManutencao) {
        this.pdcManterAliquotaManutencao = pdcManterAliquotaManutencao;
    }
    /**
     * M�todo invocado para obter um adaptador SolicitarRemessaAliquota.
     * 
     * @return Adaptador SolicitarRemessaAliquota
     */
    public ISolicitarRemessaAliquotaPDCAdapter getSolicitarRemessaAliquotaPDCAdapter() {
        return pdcSolicitarRemessaAliquota;
    }

    /**
     * M�todo invocado para establecer um adaptador SolicitarRemessaAliquota.
     * 
     * @param pdcSolicitarRemessaAliquota
     *            Adaptador SolicitarRemessaAliquota
     */
    public void setSolicitarRemessaAliquotaPDCAdapter(ISolicitarRemessaAliquotaPDCAdapter pdcSolicitarRemessaAliquota) {
        this.pdcSolicitarRemessaAliquota = pdcSolicitarRemessaAliquota;
    }
    /**
     * M�todo invocado para obter um adaptador ListarCargaMassivaGerencial.
     * 
     * @return Adaptador ListarCargaMassivaGerencial
     */
    public IListarCargaMassivaGerencialPDCAdapter getListarCargaMassivaGerencialPDCAdapter() {
        return pdcListarCargaMassivaGerencial;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarCargaMassivaGerencial.
     * 
     * @param pdcListarCargaMassivaGerencial
     *            Adaptador ListarCargaMassivaGerencial
     */
    public void setListarCargaMassivaGerencialPDCAdapter(IListarCargaMassivaGerencialPDCAdapter pdcListarCargaMassivaGerencial) {
        this.pdcListarCargaMassivaGerencial = pdcListarCargaMassivaGerencial;
    }
    /**
     * M�todo invocado para obter um adaptador ConferirRejeitarCargaMassivaGerencial.
     * 
     * @return Adaptador ConferirRejeitarCargaMassivaGerencial
     */
    public IConferirRejeitarCargaMassivaGerencialPDCAdapter getConferirRejeitarCargaMassivaGerencialPDCAdapter() {
        return pdcConferirRejeitarCargaMassivaGerencial;
    }

    /**
     * M�todo invocado para establecer um adaptador ConferirRejeitarCargaMassivaGerencial.
     * 
     * @param pdcConferirRejeitarCargaMassivaGerencial
     *            Adaptador ConferirRejeitarCargaMassivaGerencial
     */
    public void setConferirRejeitarCargaMassivaGerencialPDCAdapter(IConferirRejeitarCargaMassivaGerencialPDCAdapter pdcConferirRejeitarCargaMassivaGerencial) {
        this.pdcConferirRejeitarCargaMassivaGerencial = pdcConferirRejeitarCargaMassivaGerencial;
    }
    /**
     * M�todo invocado para obter um adaptador ListarRetificadorContabil.
     * 
     * @return Adaptador ListarRetificadorContabil
     */
    public IListarRetificadorContabilPDCAdapter getListarRetificadorContabilPDCAdapter() {
        return pdcListarRetificadorContabil;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarRetificadorContabil.
     * 
     * @param pdcListarRetificadorContabil
     *            Adaptador ListarRetificadorContabil
     */
    public void setListarRetificadorContabilPDCAdapter(IListarRetificadorContabilPDCAdapter pdcListarRetificadorContabil) {
        this.pdcListarRetificadorContabil = pdcListarRetificadorContabil;
    }
    /**
     * M�todo invocado para obter um adaptador AprovarCargaMassivaGerencial.
     * 
     * @return Adaptador AprovarCargaMassivaGerencial
     */
    public IAprovarCargaMassivaGerencialPDCAdapter getAprovarCargaMassivaGerencialPDCAdapter() {
        return pdcAprovarCargaMassivaGerencial;
    }

    /**
     * M�todo invocado para establecer um adaptador AprovarCargaMassivaGerencial.
     * 
     * @param pdcAprovarCargaMassivaGerencial
     *            Adaptador AprovarCargaMassivaGerencial
     */
    public void setAprovarCargaMassivaGerencialPDCAdapter(IAprovarCargaMassivaGerencialPDCAdapter pdcAprovarCargaMassivaGerencial) {
        this.pdcAprovarCargaMassivaGerencial = pdcAprovarCargaMassivaGerencial;
    }
    /**
     * M�todo invocado para obter um adaptador ProcessarRetificadorContabil.
     * 
     * @return Adaptador ProcessarRetificadorContabil
     */
    public IProcessarRetificadorContabilPDCAdapter getProcessarRetificadorContabilPDCAdapter() {
        return pdcProcessarRetificadorContabil;
    }

    /**
     * M�todo invocado para establecer um adaptador ProcessarRetificadorContabil.
     * 
     * @param pdcProcessarRetificadorContabil
     *            Adaptador ProcessarRetificadorContabil
     */
    public void setProcessarRetificadorContabilPDCAdapter(IProcessarRetificadorContabilPDCAdapter pdcProcessarRetificadorContabil) {
        this.pdcProcessarRetificadorContabil = pdcProcessarRetificadorContabil;
    }
    /**
     * M�todo invocado para obter um adaptador ListarRetificadorLiberacao.
     * 
     * @return Adaptador ListarRetificadorLiberacao
     */
    public IListarRetificadorLiberacaoPDCAdapter getListarRetificadorLiberacaoPDCAdapter() {
        return pdcListarRetificadorLiberacao;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarRetificadorLiberacao.
     * 
     * @param pdcListarRetificadorLiberacao
     *            Adaptador ListarRetificadorLiberacao
     */
    public void setListarRetificadorLiberacaoPDCAdapter(IListarRetificadorLiberacaoPDCAdapter pdcListarRetificadorLiberacao) {
        this.pdcListarRetificadorLiberacao = pdcListarRetificadorLiberacao;
    }
    /**
     * M�todo invocado para obter um adaptador ProcessarRetificadorLiberacao.
     * 
     * @return Adaptador ProcessarRetificadorLiberacao
     */
    public IProcessarRetificadorLiberacaoPDCAdapter getProcessarRetificadorLiberacaoPDCAdapter() {
        return pdcProcessarRetificadorLiberacao;
    }

    /**
     * M�todo invocado para establecer um adaptador ProcessarRetificadorLiberacao.
     * 
     * @param pdcProcessarRetificadorLiberacao
     *            Adaptador ProcessarRetificadorLiberacao
     */
    public void setProcessarRetificadorLiberacaoPDCAdapter(IProcessarRetificadorLiberacaoPDCAdapter pdcProcessarRetificadorLiberacao) {
        this.pdcProcessarRetificadorLiberacao = pdcProcessarRetificadorLiberacao;
    }
    /**
     * M�todo invocado para obter um adaptador ListarDiferencasRetificadorContabil.
     * 
     * @return Adaptador ListarDiferencasRetificadorContabil
     */
    public IListarDiferencasRetificadorContabilPDCAdapter getListarDiferencasRetificadorContabilPDCAdapter() {
        return pdcListarDiferencasRetificadorContabil;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarDiferencasRetificadorContabil.
     * 
     * @param pdcListarDiferencasRetificadorContabil
     *            Adaptador ListarDiferencasRetificadorContabil
     */
    public void setListarDiferencasRetificadorContabilPDCAdapter(IListarDiferencasRetificadorContabilPDCAdapter pdcListarDiferencasRetificadorContabil) {
        this.pdcListarDiferencasRetificadorContabil = pdcListarDiferencasRetificadorContabil;
    }
    /**
     * M�todo invocado para obter um adaptador ListarReprocessarApuracao.
     * 
     * @return Adaptador ListarReprocessarApuracao
     */
    public IListarReprocessarApuracaoPDCAdapter getListarReprocessarApuracaoPDCAdapter() {
        return pdcListarReprocessarApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador ListarReprocessarApuracao.
     * 
     * @param pdcListarReprocessarApuracao
     *            Adaptador ListarReprocessarApuracao
     */
    public void setListarReprocessarApuracaoPDCAdapter(IListarReprocessarApuracaoPDCAdapter pdcListarReprocessarApuracao) {
        this.pdcListarReprocessarApuracao = pdcListarReprocessarApuracao;
    }
    /**
     * M�todo invocado para obter um adaptador ReprocessarApuracao.
     * 
     * @return Adaptador ReprocessarApuracao
     */
    public IReprocessarApuracaoPDCAdapter getReprocessarApuracaoPDCAdapter() {
        return pdcReprocessarApuracao;
    }

    /**
     * M�todo invocado para establecer um adaptador ReprocessarApuracao.
     * 
     * @param pdcReprocessarApuracao
     *            Adaptador ReprocessarApuracao
     */
    public void setReprocessarApuracaoPDCAdapter(IReprocessarApuracaoPDCAdapter pdcReprocessarApuracao) {
        this.pdcReprocessarApuracao = pdcReprocessarApuracao;
    }
    
    /**
     * M�todo invocado para obter um adaptador ParametrizacaoDepIncluir.
     * 
     * @return Adaptador ParametrizacaoDepIncluir
     */
    public IParametrizacaoDepIncluirPDCAdapter getParametrizacaoDepIncluirPDCAdapter() {
        return pdcParametrizacaoDepIncluir;
    }

    /**
     * M�todo invocado para establecer um adaptador ParametrizacaoDepIncluir.
     * 
     * @param pdcParametrizacaoDepIncluir
     *            Adaptador ParametrizacaoDepIncluir
     */
    public void setParametrizacaoDepIncluirPDCAdapter(IParametrizacaoDepIncluirPDCAdapter pdcParametrizacaoDepIncluir) {
        this.pdcParametrizacaoDepIncluir = pdcParametrizacaoDepIncluir;
    }

	/**
     * M�todo invocado para obter um adaptador EfetivaSelecMunicipiosSemConv.
     * 
     * @return Adaptador EfetivaSelecMunicipiosSemConv
     */
    public IEfetivaSelecMunicipiosSemConvPDCAdapter getEfetivaSelecMunicipiosSemConvPDCAdapter() {
        return pdcEfetivaSelecMunicipiosSemConv;
    }

    /**
     * M�todo invocado para establecer um adaptador EfetivaSelecMunicipiosSemConv.
     * 
     * @param pdcEfetivaSelecMunicipiosSemConv
     *            Adaptador EfetivaSelecMunicipiosSemConv
     */
    public void setEfetivaSelecMunicipiosSemConvPDCAdapter(IEfetivaSelecMunicipiosSemConvPDCAdapter pdcEfetivaSelecMunicipiosSemConv) {
        this.pdcEfetivaSelecMunicipiosSemConv = pdcEfetivaSelecMunicipiosSemConv;
    }
    
    /**
     * M�todo invocado para obter um adaptador ParametrizacaoDepAlterar.
     * 
     * @return Adaptador ParametrizacaoDepAlterar
     */
    public IParametrizacaoDepAlterarPDCAdapter getParametrizacaoDepAlterarPDCAdapter() {
        return pdcParametrizacaoDepAlterar;
    }

    /**
     * M�todo invocado para establecer um adaptador ParametrizacaoDepAlterar.
     * 
     * @param pdcParametrizacaoDepAlterar
     *            Adaptador ParametrizacaoDepAlterar
     */
    public void setParametrizacaoDepAlterarPDCAdapter(IParametrizacaoDepAlterarPDCAdapter pdcParametrizacaoDepAlterar) {
        this.pdcParametrizacaoDepAlterar = pdcParametrizacaoDepAlterar;
    }
    /**
     * M�todo invocado para obter um adaptador ParametrizacaoDepExcluir.
     * 
     * @return Adaptador ParametrizacaoDepExcluir
     */
    public IParametrizacaoDepExcluirPDCAdapter getParametrizacaoDepExcluirPDCAdapter() {
        return pdcParametrizacaoDepExcluir;
    }

    /**
     * M�todo invocado para establecer um adaptador ParametrizacaoDepExcluir.
     * 
     * @param pdcParametrizacaoDepExcluir
     *            Adaptador ParametrizacaoDepExcluir
     */
    public void setParametrizacaoDepExcluirPDCAdapter(IParametrizacaoDepExcluirPDCAdapter pdcParametrizacaoDepExcluir) {
        this.pdcParametrizacaoDepExcluir = pdcParametrizacaoDepExcluir;
    }
    /**
     * M�todo invocado para obter um adaptador ParametrizacaoDepConsultar.
     * 
     * @return Adaptador ParametrizacaoDepConsultar
     */
    public IParametrizacaoDepConsultarPDCAdapter getParametrizacaoDepConsultarPDCAdapter() {
        return pdcParametrizacaoDepConsultar;
    }

    /**
     * M�todo invocado para establecer um adaptador ParametrizacaoDepConsultar.
     * 
     * @param pdcParametrizacaoDepConsultar
     *            Adaptador ParametrizacaoDepConsultar
     */
    public void setParametrizacaoDepConsultarPDCAdapter(IParametrizacaoDepConsultarPDCAdapter pdcParametrizacaoDepConsultar) {
        this.pdcParametrizacaoDepConsultar = pdcParametrizacaoDepConsultar;
    }
    
    /**
     * M�todo invocado para obter um adaptador ManutencaoLogTransArquivo.
     * 
     * @return Adaptador ManutencaoLogTransArquivo
     */
    public IManutencaoLogTransArquivoPDCAdapter getManutencaoLogTransArquivoPDCAdapter() {
        return pdcManutencaoLogTransArquivo;
    }

    /**
     * M�todo invocado para establecer um adaptador ManutencaoLogTransArquivo.
     * 
     * @param pdcManutencaoLogTransArquivo
     *            Adaptador ManutencaoLogTransArquivo
     */
    public void setManutencaoLogTransArquivoPDCAdapter(IManutencaoLogTransArquivoPDCAdapter pdcManutencaoLogTransArquivo) {
        this.pdcManutencaoLogTransArquivo = pdcManutencaoLogTransArquivo;
    }
    /**
     * M�todo invocado para obter um adaptador LogTransmissaoArquivo.
     * 
     * @return Adaptador LogTransmissaoArquivo
     */
    public ILogTransmissaoArquivoPDCAdapter getLogTransmissaoArquivoPDCAdapter() {
        return pdcLogTransmissaoArquivo;
    }

    /**
     * M�todo invocado para establecer um adaptador LogTransmissaoArquivo.
     * 
     * @param pdcLogTransmissaoArquivo
     *            Adaptador LogTransmissaoArquivo
     */
    public void setLogTransmissaoArquivoPDCAdapter(ILogTransmissaoArquivoPDCAdapter pdcLogTransmissaoArquivo) {
        this.pdcLogTransmissaoArquivo = pdcLogTransmissaoArquivo;
    }
    
    /**
     * M�todo invocado para obter um adaptador Combolistamunicipios.
     * 
     * @return Adaptador Combolistamunicipios
     */
    public ICombolistamunicipiosPDCAdapter getCombolistamunicipiosPDCAdapter() {
        return pdcCombolistamunicipios;
    }

    /**
     * M�todo invocado para establecer um adaptador Combolistamunicipios.
     * 
     * @param pdcCombolistamunicipios
     *            Adaptador Combolistamunicipios
     */
    public void setCombolistamunicipiosPDCAdapter(ICombolistamunicipiosPDCAdapter pdcCombolistamunicipios) {
        this.pdcCombolistamunicipios = pdcCombolistamunicipios;
    }
    
    /**
     * M�todo invocado para obter um adaptador Combolistadependencias.
     * 
     * @return Adaptador Combolistadependencias
     */
    public ICombolistadependenciasPDCAdapter getCombolistadependenciasPDCAdapter() {
        return pdcCombolistadependencias;
    }

    /**
     * M�todo invocado para establecer um adaptador Combolistadependencias.
     * 
     * @param pdcCombolistadependencias
     *            Adaptador Combolistadependencias
     */
    public void setCombolistadependenciasPDCAdapter(ICombolistadependenciasPDCAdapter pdcCombolistadependencias) {
        this.pdcCombolistadependencias = pdcCombolistadependencias;
}
    /**
     * M�todo invocado para obter um adaptador ConsultarArquivoEmpSemanal.
     * 
     * @return Adaptador ConsultarArquivoEmpSemanal
     */
    public IConsultarArquivoEmpSemanalPDCAdapter getConsultarArquivoEmpSemanalPDCAdapter() {
        return pdcConsultarArquivoEmpSemanal;
    }

    /**
     * M�todo invocado para establecer um adaptador ConsultarArquivoEmpSemanal.
     * 
     * @param pdcConsultarArquivoEmpSemanal
     *            Adaptador ConsultarArquivoEmpSemanal
     */
    public void setConsultarArquivoEmpSemanalPDCAdapter(IConsultarArquivoEmpSemanalPDCAdapter pdcConsultarArquivoEmpSemanal) {
        this.pdcConsultarArquivoEmpSemanal = pdcConsultarArquivoEmpSemanal;
    }
    /**
     * M�todo invocado para obter um adaptador GerarRelHistTransacoes.
     * 
     * @return Adaptador GerarRelHistTransacoes
     */
    public IGerarRelHistTransacoesPDCAdapter getGerarRelHistTransacoesPDCAdapter() {
        return pdcGerarRelHistTransacoes;
    }

    /**
     * M�todo invocado para establecer um adaptador GerarRelHistTransacoes.
     * 
     * @param pdcGerarRelHistTransacoes
     *            Adaptador GerarRelHistTransacoes
     */
    public void setGerarRelHistTransacoesPDCAdapter(IGerarRelHistTransacoesPDCAdapter pdcGerarRelHistTransacoes) {
        this.pdcGerarRelHistTransacoes = pdcGerarRelHistTransacoes;
    }
    
    /**
     * Construtor.
     * 
     */
    private FactoryAdapter() {

    };

    /**
     * M�todo utilizado para obter uma inst�ncia da F�brica.
     * 
     * @return Objeto FactoryAdapter (a f�brica de adaptadores).
     */
    public static FactoryAdapter getInstance() {
        return new FactoryAdapter();
    }
}
