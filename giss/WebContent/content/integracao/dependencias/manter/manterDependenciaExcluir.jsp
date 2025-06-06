<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="manterDependenciaExcluirForm" name="manterDependenciaExcluirForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manter_dependencia_excluir_title_informacoes_dependencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_dependencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.codigoDependencia}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 20px" />	
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{dependenciaBean.descricaoDependencia}"/>
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="width: 20px" />	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_cnpj}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{dependenciaBean.cnpj}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 	
	
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_data_abertura}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.dataAbertura}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 20px" />	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_data_encerramento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.dataEncerramento}"/>
		</br:brPanelGroup>	
	</br:brPanelGrid>	
	
	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_agencia_incorporadora}: " /> 
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.agenciaIncorporadora}"/>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manter_dependencia_excluir_title_informacoes_endereco}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_logradouro}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.logradouro}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 20px" />	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_cep}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.cep}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	

	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_municipio}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.municipio}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 20px" />	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.estadoConsulta}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 20px" />	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_pais}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.pais}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manter_dependencia_excluir_title_informacoes_recolhimento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_excluir_label_tipo_departamento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.tipoDepartamento}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 20px" />	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_inscricao_municipal}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.inscricaoMunicipal}"/>
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
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlInputTextBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_estado}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.estadoMunicIncorpDepto}" id="lblEstado2"/>
		</br:brPanelGroup>	
			
		<br:brPanelGroup style="width: 20px" />	
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlInputTextBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_municipio}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.municIncorpDepto}" id="lblMunicipio2"/>
		</br:brPanelGroup>	
			
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_dependencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.codigoAgenciaIncorpDepto}" />
		</br:brPanelGroup>				
		
		<br:brPanelGroup style="width: 20px" />			
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.nomeAgenciaIncorpDepto}" />
		</br:brPanelGroup>		
				
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manter_dependencia_excluir_btn_voltar}" action="#{dependenciaBean.voltarManterExcluir}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:200px" >
			<br:brCommandButton  id="btnFinalizar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.manter_dependencia_excluir_btn_finalizar}" actionListener="#{dependenciaBean.finalizarExclusaoDependencia}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>	
	
</br:brPanelGrid>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
