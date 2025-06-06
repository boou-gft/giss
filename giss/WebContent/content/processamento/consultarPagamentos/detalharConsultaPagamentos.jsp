<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="detalharConsultaPagamentos" name="detalharConsultaPagamentos" >

<br:brPanelGrid  width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" width="750" style="margin-top:15px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_empresa}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.empresa} - #{consultarPagamentosBean.dtoDetalhe.descEmpresa}" />
		</br:brPanelGroup>	
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_produto}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.codIdenticacaoTransIss} - #{consultarPagamentosBean.dtoDetalhe.produto}" />
		</br:brPanelGroup>		
	</br:brPanelGrid>

	<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_competencia}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.competencia}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_municipio}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.codMunicipio} - #{consultarPagamentosBean.dtoDetalhe.municipio}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_valor_iss_pgto}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.valorIssPgto}" />
		</br:brPanelGroup>
	</br:brPanelGrid>		
			
	<%-- 	
	<br:brPanelGrid columns="2" style="margin-top:9px" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_valor_base_calc_iss}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.baseIss}" />
		</br:brPanelGroup>		
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_valor_iss_pgto}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.valorIssPgto}" />
		</br:brPanelGroup>	
	</br:brPanelGrid>
	--%>

	<br:brPanelGrid columns="2" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_data_original}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.dtAgendamento}" />
		</br:brPanelGroup>	
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_data_agendamento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.dtPagamento}" />
		</br:brPanelGroup>		
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="2" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_status}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.codStatus} - #{consultarPagamentosBean.dtoDetalhe.descStatus}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_tipo_credito}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.codTipoCredito} - #{consultarPagamentosBean.dtoDetalhe.descTipoCredito}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_codigo_movimento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.codMovimento}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_usuario}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.nomePrograma}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_data_inclusao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarPagamentosBean.dtoDetalhe.dtHoraInclusao}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup> </br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0">	
 		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" action="#{liberarPagtoISSBean.voltarPagConPagtos}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
</br:brPanelGrid>
</brArq:form>
	