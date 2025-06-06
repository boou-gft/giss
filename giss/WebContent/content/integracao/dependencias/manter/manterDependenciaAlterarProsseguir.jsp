<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterDependenciaAlterarForm" name="manterDependenciaAlterarForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manter_dependencia_alterar_prosseguir_title_informacoes_dependencia}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_alterar_prosseguir_label_dependencia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.codigoDependencia}"/>
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="width:20px;" />
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_alterar_prosseguir_label_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{dependenciaBean.descricaoDependencia}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px;" />
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_alterar_prosseguir_label_cnpj}: "/>
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
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_alterar_prosseguir_label_data_abertura}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.dataAbertura}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px;" />
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_alterar_prosseguir_label_data_encerramento}: " />
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
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_alterar_prosseguir_label_agencia_incorporadora}: " /> 
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.agenciaIncorporadora}"/>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" columns="1" width="100%" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.manter_dependencia_consultar_title_informacoes_endereco}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_logradouro}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.logradouro}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px;" />
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_cep}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.cep}"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px;" />
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="Data da mudança: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.dataAtualizacao}" />
		</br:brPanelGroup>
	</br:brPanelGrid>	

	 <br:brPanelGrid columns="1" styleClass="EspacamentoLinhas" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	<br:brPanelGrid columns="7" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_municipio}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.municipio}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px;" />
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.estadoConsulta}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px;" />
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_consultar_label_pais}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.pais}"/>
		</br:brPanelGroup>
				
		<br:brPanelGroup style="width:20px;" />
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="TRAG sem TRAG: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{dependenciaBean.tragSemTrag eq 'S' ? 'Sim' : 'Não'}" />
		</br:brPanelGroup>
	</br:brPanelGrid>	
		
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_informacoesRecolhimento}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >	 		
		

		<br:brPanelGrid columns="1"  cellpadding="0" cellspacing="0" >	
		    <br:brPanelGroup >
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_tipoDepartamento}: "/>
			</br:brPanelGroup>
			<br:brPanelGrid style="margin-top:5px" cellpadding="0" cellspacing="0" >	
		    	<br:brPanelGroup >
				</br:brPanelGroup>	
			</br:brPanelGrid>
			 <br:brPanelGroup>	
				<br:brSelectOneRadio id="tipoDepartamento" styleClass="HtmlSelectOneRadioBradesco" value="#{dependenciaBean.indTributavel}" disabled="#{dependenciaBean.disabledIndTrib}">
					<f:selectItem itemValue="1" itemLabel="#{msgs.resultadoDependenciasNovasInformacoes_tributavel}"/>
					<f:selectItem itemValue="2" itemLabel="#{msgs.resultadoDependenciasNovasInformacoes_naoTributavel}"/>
					<brArq:commonsValidator type="required" arg="#{msgs.resultadoDependenciasNovasInformacoes_tipoDepartamento}" server="false" client="true"/>
				</br:brSelectOneRadio>
			</br:brPanelGroup>	
		</br:brPanelGrid>		
		<br:brPanelGroup style="width:20px">
		</br:brPanelGroup>	
		
		<br:brPanelGrid columns="1"  cellpadding="0" cellspacing="0" >	
		    <br:brPanelGroup >
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_inscricaoMunicipal}: "/>
			</br:brPanelGroup>
			<br:brPanelGrid style="margin-top:5px" cellpadding="0" cellspacing="0" >	
		    	<br:brPanelGroup >
				</br:brPanelGroup>	
			</br:brPanelGrid>
			 <br:brPanelGroup>	
				<br:brInputText styleClass="HtmlInputTextBradesco" value="#{dependenciaBean.inscricaoMunicipal}" size="23" maxlength="18" id="txtInscricaoMunicipal">
			    	<brArq:commonsValidator type="required" arg="#{msgs.resultadoDependenciasNovasInformacoes_inscricaoMunicipal}" server="false" client="true"/>
				</br:brInputText>
			</br:brPanelGroup>	
		</br:brPanelGrid>
		
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
			<br:brCommandButton id="btnLocDep"   styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_locDependencia}" action="#{dependenciaBean.localizarDependenciaManter}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
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
	
	
		<t:dataTable id="tabelaAqruivos" value="#{dependenciaBean.dto.listaPaa}" var="arquivo" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" 
			rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			headerClass="tabela_celula_destaque_acentuado" width="535px"
			style="width:100%">
			<t:column  width="2%">
			<t:selectManyCheckbox id="checkboxRegistro" value="#{dependenciaBean.codigosSelecionadosTabela}" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
				<f:selectItems value="#{dependenciaBean.selectItemLista}" />
				<a4j:support event="onclick" action="#{dependenciaBean.verificarCheck}" reRender="tabelaAqruivos" />
			</t:selectManyCheckbox>
				<f:facet name="header">
					<br:brOutputText value="Sel." />
				</f:facet>
				<t:checkbox index="#{indexLista}" for="checkboxRegistro" >
				</t:checkbox>	
					
			</t:column>
			<t:column  width="2%">
				<f:facet name="header">
					<br:brOutputText value="Contab." />
				</f:facet>
				<t:selectManyCheckbox id="checkboxRegistroCont" value="#{dependenciaBean.codigosSelecionadosTabelaCont}" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
					<f:selectItems value="#{dependenciaBean.selectItemListaCont}" />
					<a4j:support event="onclick" action="#{dependenciaBean.verificarCheck}" reRender="tabelaAqruivos" />
				</t:selectManyCheckbox>
				<t:checkbox index="#{indexLista}" for="checkboxRegistroCont"/>
			</t:column>
			
			<t:column width="15%">
				<f:facet name="header">
					<br:brOutputText value="Código do PA" />
				</f:facet>
				<br:brOutputText value="#{arquivo.codPaa}" />
			</t:column>
			<t:column width="30%">
				<f:facet name="header">
					<br:brOutputText value="Nome do PA" />
				</f:facet>
				<br:brOutputText value="#{arquivo.descPaa}" />
			</t:column>
			<t:column width="30%">
				<f:facet name="header">
					<br:brOutputText value="Municipio do PA" />
				</f:facet>
				<br:brOutputText value="#{arquivo.municipio}" />
			</t:column>
			<t:column width="10%">
				<f:facet name="header">
					<br:brOutputText value="UF do PA" />
				</f:facet>
				<br:brOutputText value="#{arquivo.uf}" />
			</t:column>
			<t:column width="30%">
				<f:facet name="header">
					<br:brOutputText value="Data da Seleção" />
				</f:facet>
				<br:brOutputText value="#{arquivo.dataAtualizacao}" />
			</t:column>
			</t:dataTable>
		
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="align:left" value="#{msgs.manter_dependencia_alterar_btn_voltar}" action="#{dependenciaBean.voltarManterAlterar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="margin-left:620px">
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="text-align:right;width:290px">
			<br:brCommandButton id="btnFinalizar"  onclick="javascript: return validateForm(document.forms[1]);" styleClass="HtmlCommandButtonBradesco"  value="#{msgs.manter_dependencia_alterar_btn_finalizar}" actionListener="#{dependenciaBean.finalizaAlteracaoDependencia}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>	

</br:brPanelGrid>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
