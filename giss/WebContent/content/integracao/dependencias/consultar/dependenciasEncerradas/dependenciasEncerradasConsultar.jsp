<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="dependenciasEncerradasConsultarForm" name="dependenciasEncerradasConsultarForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.dependencias_encerradas_title_informacoes_dependencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_dependencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.codigoDependencia}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{dependeciasEncerradasBean.descricaoDependencia}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_cnpj}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{dependeciasEncerradasBean.cnpj}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 	
	
    <br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_data_abertura}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.dataAbertura}"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_data_encerramento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.dataEncerramento}"/>
		</br:brPanelGroup>	
	</br:brPanelGrid>	
	
	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_agencia_incorpadora}: " /> 
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.agenciaIncorporadora}"/>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.dependencias_encerradas_title_informaçoes_endereco}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_logradouro}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.logradouro}" />
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_cep}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.cep}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	

	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_municipio}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.municipio}" />
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.estado}"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_pais}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.pais}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.dependencias_encerradas_title_informacoes_recolhimento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.dependencias_encerradas_label_tipo_departamento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.tipoDepartamento}"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_inscricao_municipal}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.inscricaoMunicipal}"/>
		</br:brPanelGroup>	
	</br:brPanelGrid>	
	
	

<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_subtitulo_agenciaIncorporadora}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>		
	
	
	<br:brPanelGrid columns="7" cellpadding="0" cellspacing="0">
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlInputTextBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_estado}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.estadoMunicIncorpDepto}" id="lblEstado2"/>
		</br:brPanelGroup>	
			
		<br:brPanelGroup style="width: 20px" />	
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlInputTextBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_municipio}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.municIncorpDepto}" id="lblMunicipio2"/>
		</br:brPanelGroup>	
			
	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_dependencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.codigoAgenciaIncorpDepto}" />
		</br:brPanelGroup>				
		
		<br:brPanelGroup style="width: 20px" />			
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependeciasEncerradasBean.nomeAgenciaIncorpDepto}" />
		</br:brPanelGroup>		
				
	</br:brPanelGrid>
	
		
	<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco"  value="#{msgs.dependencias_encerradas_btn_voltar}" action="#{dependeciasEncerradasBean.voltarDependenciasEncerradas}">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>	
	
</br:brPanelGrid>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
