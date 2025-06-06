<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="detalharPagtoManualIndividual" name="detalharPagtoManualIndividual" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" width="100%">
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_competencia}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText disabled="true" size="40" maxlength="5" id="txtCompetencia" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.competencia}" onkeyup=" "/> 	
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_empresa}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText disabled="true" size="40" maxlength="5" id="txtEmpresa" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.empresa} - #{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.descEmpresa}" onkeyup=" "/> 	
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_servico_produto}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText disabled="true" size="40" maxlength="5" id="txtServicoProduto" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.codProduto} - #{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.descricaoProd}" onkeyup=""/> 	
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_municipio}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText disabled="true" size="40" maxlength="5" id="txtMunicipio" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.codMunicipio} - #{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.municipio}" onkeyup=" "/> 	
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_banco}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText disabled="true" size="40" maxlength="5" id="txtBanco" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.banco}" onkeyup=" "/> 	
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_agencia}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText disabled="true" size="40" maxlength="5" id="txtAgencia" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.agencia}" onkeyup=" "/> 	
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText disabled="true" size="40" maxlength="5" id="txtConta" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.conta}-#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.digitoConta}" onkeyup=" "/> 	
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_valor_iss}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText disabled="true" size="40" maxlength="5" id="txtValorIss" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.valorIssPgto}" onkeyup=" "/> 	
		</br:brPanelGroup>
		 
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_juros}:" />	
		</br:brPanelGroup>	 
		<br:brPanelGroup>
			<br:brInputText size="40" maxlength="6" id="txtJuros" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.valorJuros}" onblur="vNumero(this,'9(3)V99')"/> 	
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_multa}:" />	
		</br:brPanelGroup>	 
		<br:brPanelGroup>
			<br:brInputText size="40" maxlength="19" id="txtMulta" value="#{pesquisarPagamentoManualBean.dtoPgtoManualIndiv.valorMulta}" onblur="vNumero(this,'9(16)V99')"/> 	
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" style="float:left" action="#{pesquisarPagamentoManualBean.voltarCalcular}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnAgendar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.btn_iss_gerencial_agendar}" action="#{pesquisarPagamentoManualBean.agendarPgtoIndividual}" style="float:right">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	
	 
</br:brPanelGrid>
	
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>