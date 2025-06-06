<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="historicoDependenciaConsultar" name="historicoDependenciaConsultar" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historicoDependencia_informacoes_dependencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_dependencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.codigoDependencia}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{histDependenciaBean.descricaoDependencia}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_cnpj}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{histDependenciaBean.cnpj}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 	
	
    <br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_data_abertura}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.dataAbertura}"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_data_encerramento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.dataEncerramento}"/>
		</br:brPanelGroup>	
	</br:brPanelGrid>	
	
	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_agencia_incorporadora}: " /> 
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.agenciaIncorporadora}"/>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historicoDependencia_informacoes_endereco}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_logradouro}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.logradouro}" />
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_cep}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.cep}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	

	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_municipio}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.municipio}" />
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.estado}"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_pais}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.pais}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historicoDependencia_informacoes_recolhimento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_tipo_departamento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.tipoDepartamento}"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_inscricao_municipal}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.inscricaoMunicipal}"/>
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
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_dependencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.codigoAgenciaIncorpDepto}" />
		</br:brPanelGroup>				
		
		<br:brPanelGroup style="width: 20px" />			
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.nomeAgenciaIncorpDepto}" />
		</br:brPanelGroup>		
				
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historicoDependencia_informacoes_recolhimento_ant}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historicoDependencia_tipo_departamento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.tipoDepartamentoAnt}"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_inscricao_municipal}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.inscricaoMunicipalAnt}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>	

<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_subtitulo_agenciaIncorporadora_ant}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>		
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_dependencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.codigoAgenciaIncorpDeptoAnt}" />
		</br:brPanelGroup>				
		
		<br:brPanelGroup style="width: 20px" />			
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{histDependenciaBean.nomeAgenciaIncorpDeptoAnt}" />
		</br:brPanelGroup>		
				
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="PAs Relacionados: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<app:scrollableDataTable id="tabelaAqruivos" value="#{histDependenciaBean.listaPaaHist}" var="arquivo" rowIndexVar="indexLista" width="100%">
			<app:scrollableColumn  width="2%">
			<t:selectManyCheckbox id="checkboxRegistro" value="#{histDependenciaBean.codigosSelecionadosTabela}" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" disabled="true">
				<f:selectItems value="#{histDependenciaBean.selectItemLista}" />
			</t:selectManyCheckbox>
				<f:facet name="header">
					<br:brOutputText value="Sel." />
				</f:facet>
				<t:checkbox index="#{indexLista}" for="checkboxRegistro" >
				</t:checkbox>	
					
			</app:scrollableColumn>
			<app:scrollableColumn  width="2%">
				<f:facet name="header">
					<br:brOutputText value="Contab." />
				</f:facet>
				<t:selectManyCheckbox id="checkboxRegistroCont" value="#{histDependenciaBean.codigosSelecionadosTabelaCont}" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" disabled="true">
					<f:selectItems value="#{histDependenciaBean.selectItemListaCont}" />
				</t:selectManyCheckbox>
				<t:checkbox index="#{indexLista}" for="checkboxRegistroCont"/>
			</app:scrollableColumn>
			<app:scrollableColumn width="15%">
				<f:facet name="header">
					<br:brOutputText value="Código do PA" />
				</f:facet>
				<br:brOutputText value="#{arquivo.codPaa}" />
			</app:scrollableColumn>
			<app:scrollableColumn width="35%">
				<f:facet name="header">
					<br:brOutputText value="Nome do PA" />
				</f:facet>
				<br:brOutputText value="#{arquivo.descPaa}" />
			</app:scrollableColumn>
			<app:scrollableColumn width="35%">
				<f:facet name="header">
					<br:brOutputText value="Municipio do PA" />
				</f:facet>
				<br:brOutputText value="#{arquivo.municipio}" />
			</app:scrollableColumn>
			<app:scrollableColumn width="15%">
				<f:facet name="header">
					<br:brOutputText value="UF do PA" />
				</f:facet>
				<br:brOutputText value="#{arquivo.uf}" />
			</app:scrollableColumn>
			
		</app:scrollableDataTable>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco"  value="#{msgs.historicoDependencia_voltar}" action="conHistoricoDependenciasAvancar">	
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>	

</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
