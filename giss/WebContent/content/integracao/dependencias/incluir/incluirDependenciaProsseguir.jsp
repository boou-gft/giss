<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="incluirDependenciaForm" name="incluirDependenciaForm" >

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.incluirDependencia_subTitulo_informacoesDependencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_dependencia}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.codigoDependencia}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width: 20px" />	
		
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_descricao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.descricaoDependencia}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 20px" />	
		
      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_cnpj}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.cnpj}" />
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_dataAbertura}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.dataAbertura}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 20px" />	
		
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_dataEncerramento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.dataEncerramento}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_agencia}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.agenciaIncorporadora}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.incluirDependencia_subTitulo_informacoesEndereco}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>


	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_logradouro}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.logradouro}" />
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="width: 20px" />	
		
	     <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_cep}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.cep}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_municipio}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.municipio}" />
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="width: 20px" />	
		
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.estado}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 20px" />	
		
	     <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.incluirDependencia_label_pais}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.pais}" />
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.incluirDependencia_subTitulo_informacoesRecolhimento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>


	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="5"  >
		<br:brPanelGroup>	
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-bottom:5px;" >
					<br:brPanelGroup>
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
						<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.incluirDependencia_label_ccm}: "/>	
					</br:brPanelGroup>		
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >	
				    <br:brPanelGroup>	
				    	<br:brInputText value="#{dependenciaBean.ccm}" size="15" maxlength="8" id="txtccm" onkeyup="aplicamascara('incluirDependenciaForm', 'incluirDependenciaForm:txtccm',numeros);">  
				    	</br:brInputText>	
					</br:brPanelGroup>		
				</br:brPanelGrid>	
		</br:brPanelGroup>		
		 <br:brPanelGroup style="width:20px">
	    </br:brPanelGroup>	
		 <br:brPanelGroup>
		 	 <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	 
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	 
					<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.incluirDependencia_label_tipoDepartamento}: "/>
				</br:brPanelGroup>				
				<br:brPanelGroup>
					<br:brSelectOneRadio id="radioTipoDepartamento" styleClass="HtmlSelectOneRadioBradesco" value="#{dependenciaBean.indTributavel}" >
						<f:selectItem itemLabel="#{msgs.incluirDependencia_label_tributavel}" itemValue="1" />   
			            <f:selectItem itemLabel="#{msgs.incluirDependencia_label_naoTributavel}" itemValue="2" />   
			            <brArq:commonsValidator type="required" arg="#{msgs.resultadoDependenciasNovasInformacoes_tipoDepartamento}" server="false" client="true"/>
			    	</br:brSelectOneRadio>
			    </br:brPanelGroup>			
		    </br:brPanelGrid>	
	    </br:brPanelGroup>	
		 <br:brPanelGroup style="width:20px">
	    </br:brPanelGroup>	
	    <br:brPanelGroup>	
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" style="margin-bottom:5px;" >
					<br:brPanelGroup>
						<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
						<br:brOutputText styleClass="HtmlOutputLabelBoldBradesco" value="#{msgs.incluirDependencia_label_insMunicipal}: "/>	
					</br:brPanelGroup>		
				</br:brPanelGrid>					
				<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0"  >	
				    <br:brPanelGroup>	
				    	<br:brInputText value="#{dependenciaBean.inscricaoMunicipal}" size="23" maxlength="18" id="txtInscricaoMunicipal">
					    </br:brInputText>	
					</br:brPanelGroup>		
				</br:brPanelGrid>	
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_subtitulo_agenciaIncorporadora}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="7" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		
		<br:brSelectOneMenu id="empresa" value="#{dependenciaBean.indiceComboEmpresaIncorpora}">
			<f:selectItems value="#{dependenciaBean.listaEmpresa}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{dependenciaBean.codDepIncorpora}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscar" action="#{dependenciaBean.carregarDependenciaIncorporaDepNova}">
			<brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputDepend" size="45" disabled="true" value="#{dependenciaBean.descDepIncorpora}" />
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>		
		<br:brPanelGroup style="text-align:right;width:90px" >
			<br:brCommandButton id="btnLocDep"   styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_locDependencia}" action="#{dependenciaBean.localizarDependenciaIncluir}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="4" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton  id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.excluir_conta_contabil_btn_voltar}" action="#{dependenciaBean.voltarPesquisarIncluir}" >	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:100px" >
			<br:brCommandButton id="btnLimpar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_limparCampos}" action="#{dependenciaBean.limparCamposInformacoesDepNovas}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		<br:brPanelGroup style="text-align:right;width:90px" >
			<br:brCommandButton id="btnFinalizar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_finalizar}" actionListener="#{dependenciaBean.finalizaInclusaoDependencia}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>

</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
	