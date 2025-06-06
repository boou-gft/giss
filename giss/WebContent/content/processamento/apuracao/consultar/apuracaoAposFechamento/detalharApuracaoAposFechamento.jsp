<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="detalharApuracaoAposFechamentoForm" name="detalharApuracaoAposFechamentoForm" >
<h:inputHidden id="hiddenRadio" value="#{consultarApuracaoAposFechamentoBean.radioTelaConta}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="3" rendered="#{!empty consultarApuracaoAposFechamentoBean.listaDependenciaApuracao}">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_competencia}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.mesAnoCompetencia}" style="margin-right:20px"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.depConsultarApuracaoAposFechamento_label_dependencia}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.dependencia}" style="margin-right:20px"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.depConsultarApuracaoAposFechamento_label_descricao}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.descricao}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>

	<br:brPanelGrid columns="3" rendered="#{!empty consultarApuracaoAposFechamentoBean.listaDependenciaApuracao}">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_base_calculo}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.baseCalculo}" style="margin-right:20px"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_aliquota_padrao}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.aliquotaPadrao}" style="margin-right:20px"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_tipo_incidencia}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.tipoIncidencia}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>

	<br:brPanelGrid columns="3" rendered="#{!empty consultarApuracaoAposFechamentoBean.listaDependenciaApuracao}">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_data_processamento}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.dataProcessamento}"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_estado}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.detalheEstado}" style="margin-right:20px"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.consultarApuracaoAposFechamento_label_municipio}:"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{consultarApuracaoAposFechamentoBean.detalheMunicipio}" style="margin-right:20px"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<f:verbatim> <br> </f:verbatim> 

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable"
							value="#{consultarApuracaoAposFechamentoBean.listaFinal}"
							var="result" cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_direita, alinhamento_direita"
							headerClass="tabela_celula_destaque_acentuado" width="100%">
							<t:column width="25px" style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
							      <br:brOutputText value="" escape="false" />
							    </f:facet>		
								<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems value="#{consultarApuracaoAposFechamentoBean.listaControleCheckRadioConta}"/>
								</t:selectOneRadio>
						    	<t:radio for="sorLista" index="#{result.linha}"  />
							</t:column>
							<t:column width="200px"
								style="height: 23px; padding-right:5px; padding-left:5px;"
								rendered="#{!consultarApuracaoAposFechamentoBean.razaoExiste}">
								<f:facet name="header">
									<br:brOutputText value="Conta" escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.cosif}" />
							</t:column>
							
							<t:column width="200px"
								style="height: 23px; padding-right:5px; padding-left:5px;"
								rendered="#{consultarApuracaoAposFechamentoBean.razaoExiste}">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.label_cosif}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.cosif}" />
							</t:column>
							<t:column
								style="width: 100px;padding-right:5px; padding-left:5px;text-align:center" 
								rendered="#{consultarApuracaoAposFechamentoBean.razaoExiste}">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.consultarApuracaoAposFechamento_label_razao}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.razao}" />
							</t:column>
							
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.consultarApuracaoAposFechamento_label_movimento}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.movimento}" />
							</t:column>
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px;">
								<f:facet name="header">
									<h:outputText
										value="#{msgs.consultarApuracaoAposFechamento_label_tributavel}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.tributavel}" />
							</t:column>
							<t:column width="130px"
								style="padding-right:5px; padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.consultarApuracaoAposFechamento_label_aliquota}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.aliquota}" />
							</t:column>
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px;">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.consultarApuracaoAposFechamento_label_iss}"
										escape="false" />
								</f:facet>
								<br:brOutputText value="#{result.valorIss}" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>
	</br:brPanelGrid>		

	<br:brPanelGrid columns="6" cellpadding="0" cellspacing="0" rendered="#{!empty consultarApuracaoAposFechamentoBean.listaDependenciaApuracao}" width="100%">	
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{msgs.saldos_divergentes_total}" style="width:200px; padding-right:5px; padding-left:5px;"/>	
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoAposFechamentoBean.totalMovimento}" style="width:140px; padding-right:5px; padding-left:5px; text-align:right"/>	
			</br:brPanelGroup>	
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoAposFechamentoBean.totalTributavel}" style="width:140px; padding-right:5px; padding-left:5px; text-align:right"/>	
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brOutputText value="" style="width:130px;text-align:right"/>	
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputFormatBoldBradesco" value="#{consultarApuracaoAposFechamentoBean.totalISSFinal}" style="width:140px; padding-right:5px; padding-left:5px; text-align:right"/>	
			</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" 
				styleClass="HtmlCommandButtonBradesco" 
				value="#{msgs.depConsultarApuracaoAposFechamento_botao_voltar}" 
				action="#{consultarApuracaoAposFechamentoBean.voltarDep}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGroup style="width: 550px">
		</br:brPanelGroup>	
		<br:brPanelGroup style="text-align:right;width:100%" >
			<br:brPanelGrid columns="2">
				<br:brCommandButton styleClass="HtmlCommandButtonBradesco" id="btnProsseguir2" action="#{consultarApuracaoAposFechamentoBean.consultarApuracaoFechamentoConta}" value="#{msgs.consultarApuracaoParcial_btn_prossseguir}" disabled="true">
					<brArq:submitCheckClient/>
				</br:brCommandButton>			
				<br:brCommandButton id="btnPlanilhaEletronica" 
					styleClass="HtmlCommandButtonBradesco" 
					value="Planilha Eletrônica"
					disabled="#{empty consultarApuracaoAposFechamentoBean.listaFinal}" 
					actionListener="#{consultarApuracaoAposFechamentoBean.imprimirPlanilhaDetalhe}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGrid>
		</br:brPanelGroup>	
	</br:brPanelGrid>		
</br:brPanelGrid>

  <f:verbatim>
<script language="javascript">

	function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'detalharApuracaoAposFechamentoForm:btnProsseguir2'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'detalharApuracaoAposFechamentoForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}
	
	function habilitaPesquisar(form){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'detalharApuracaoAposFechamentoForm:btnPesquisar'){
				form.elements[i].disabled=false;
			}			
		}	
	}
	
</script>
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>