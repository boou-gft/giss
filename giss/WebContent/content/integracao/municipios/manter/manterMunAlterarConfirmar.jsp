<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterMunicipioContasForm" name="manterMunicipioContasForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_infoMunicipio}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_codigo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.codigoMunicipio}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_nome}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.nomeMunicipio}" />
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.nomeUnidadeFederativa}" />
		</br:brPanelGroup>	
		 <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_aliquota}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.aliquota}%" />
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
		
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_informacoesConta}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_tipoServico}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.tipoServico}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_conta}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.codigoConta}" />
		</br:brPanelGroup>	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_razao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.razao}" />
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_codigoTributo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterMunicipioBean.codigoTributo}" />
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
		
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manterMunicipio_subtitulo_informacoesAliquota}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="9" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_aliquota}:" style="margin-right:6px;" />						
    	</br:brPanelGroup>
    					
		<br:brPanelGroup>						
		   	<br:brInputText value="#{manterMunicipioBean.aliquotaConfirm}" size="6" maxlength="5" id="txtAliquota" alt="percentual"/>
		   	<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="%"/>    	
		</br:brPanelGroup>			
		
		<br:brPanelGroup style="width:20px;">
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_codigoTributo}:" style="margin-right:6px;" />						
    	</br:brPanelGroup>
		
	    <br:brPanelGroup>
			<br:brInputText size="6" maxlength="6" id="txtCodTributo" value="#{manterMunicipioBean.codigoTributoConfirm}" onkeyup="aplicamascara('manterMunicipioContasForm','manterMunicipioContasForm:txtCodTributo',numeros);">						
				<brArq:commonsValidator type="integer"  arg="#{msgs.resultado_municipios_novos_incluir_vencimento}" server="false" client="true" />
			</br:brInputText>
    	</br:brPanelGroup>
	
		<br:brPanelGroup style="width:20px;">
		</br:brPanelGroup>
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manterMunicipio_label_vigencia}:" style="margin-right:6px;" />
		</br:brPanelGroup>		
	
		<br:brPanelGroup>
			 	<app:calendar id="calendarioDe" value="#{manterMunicipioBean.dataInicioVigencia}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>	
		
	<f:verbatim><hr class="lin"> </f:verbatim>
		
	<br:brPanelGrid columns="4" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manterMunicipio_botao_voltar}" action="#{manterMunicipioBean.voltarMunicipioContas}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>					
		
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manterMunicipio_botao_limparCampos}" action="#{manterMunicipioBean.limparCamposContas}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnFinalizar" style="margin-left:5px;" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manterMunicipio_botao_finalizar}" onclick="javascript: return validateForm(document.forms[1]);" action="#{manterMunicipioBean.executaAlterarMunicipio}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>							
	</br:brPanelGrid>
	
</br:brPanelGrid>	
	
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>