<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="planilhaApuracaoISSResultado" name="planilhaApuracaoISSResultado" >

<h:inputHidden id="hiddenRadio" value="#{planApuracaoIssBean.radioTelaResultado}"/>

<br:brPanelGrid columns="1" width="850" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" rendered="#{planApuracaoIssBean.mostrarCabecalho}">	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.planilhaApuracao_label_periodo} #{msgs.geral_de}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{planApuracaoIssBean.planApuracaoEntrada.mesApuracaoContabilInicio}/#{planApuracaoIssBean.planApuracaoEntrada.anoApuracaoContabilInicio}"/>
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value=" #{msgs.geral_ate}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{planApuracaoIssBean.planApuracaoEntrada.mesApuracaoContabilFim}/#{planApuracaoIssBean.planApuracaoEntrada.anoApuracaoContabilFim}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>		
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" width="100%">
		<br:brPanelGroup  style="width:900px;text-align:right;">
			<br:brSelectBooleanCheckbox value="#{planApuracaoIssBean.checkAberturaConta}"/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Abertura por Conta" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>		
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.planilhaApuracao_resultado_label_resultado_pesquisa}:"/>
		</br:brPanelGroup>

			<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"
				cellpadding="0" cellspacing="0">
			<t:div styleClass="barraDeRolagem">
				<br:brPanelGroup>
						<t:dataTable id="dataTable"
							value="#{planApuracaoIssBean.listaSaidaPlanilha}" var="result"
							cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_centro,alinhamento_esquerda,alinhamento_esquerda,alinhamento_esquerda,alinhamento_esquerda,alinhamento_esquerda,alinhamento_direita,alinhamento_direita,alinhamento_centro"
							headerClass="tabela_celula_destaque_acentuado" width="850px">
							
							<t:column width="30px">
								<f:facet name="header">
									<t:selectBooleanCheckbox id="todos" 
										styleClass="HtmlSelectOneRadioBradesco"
										value="">
										<a4j:support event="onclick"
											onsubmit="checkGrid(document.forms[1],this);validarCheckbox(this);" />
									</t:selectBooleanCheckbox>
								</f:facet>
								
								<t:selectManyCheckbox
									onclick="validarCheckbox(this)"
									value="#{planApuracaoIssBean.itemApuracaoSelecionado}"
									id="sorLista" styleClass="HtmlSelectOneRadioBradesco"
									layout="spread" forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{planApuracaoIssBean.listaControleResultado}" />
								</t:selectManyCheckbox>
								<t:checkbox for="sorLista" index="#{result.linha}" />
							</t:column>
							
							
							
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Competência" />
								</f:facet>
								<br:brOutputText value="#{result.dataCompetenciaFormatada}" 	  rendered="#{planApuracaoIssBean.mostrarCabecalho}" />
								<br:brOutputText value="#{result.dataCompetenciaNormalFormatada}" rendered="#{!planApuracaoIssBean.mostrarCabecalho}" />
							</t:column>
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.planilhaApuracao_resultado_grid_dependencia}" />
								</f:facet>
								<br:brOutputText value="#{result.codDepPa}" />
							</t:column>
							
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.planilhaApuracao_resultado_grid_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result.descDepPa}" />
							</t:column>
							
							<t:column width="170px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Município" />
								</f:facet>
								<br:brOutputText value="#{result.municipio}" />
							</t:column>
							
							<t:column width="170px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Estado" />
								</f:facet>
								<br:brOutputText value="#{result.uf}" />
							</t:column>
							
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.planilhaApuracao_resultado_grid_receita}" />
								</f:facet>
								<br:brOutputText value="#{result.valorReceita}"
									converter="decimalBrazillianConverter" />
							</t:column>
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.planilhaApuracao_resultado_grid_iss_recolher}" />
								</f:facet>
								<br:brOutputText value="#{result.valorTributoApuracao}"
									converter="decimalBrazillianConverter" />
							</t:column>
							
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="TRAG sem TRAG?" />
								</f:facet>
								<br:brOutputText value="#{result.tragSemTrag eq 'S' ? 'Sim' : 'Não'}" />
							</t:column>
						</t:dataTable>
				</br:brPanelGroup>
			</t:div>
			<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" style="width:865px;height:20px">
			
					
					<br:brPanelGroup style="width:300px; text-align:left;margin-left:150px">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;"
							value="Total das Agências Listadas:" />
					</br:brPanelGroup>

									
					<br:brPanelGroup style="width:150px; text-align:right">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;" value=""/>
					</br:brPanelGroup>

					<br:brPanelGroup style="width:120px; text-align:right">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;" value="#{planApuracaoIssBean.totalAgencia}" />
					</br:brPanelGroup>
					
					
					
					
					<br:brPanelGroup style="width:300px; text-align:left;margin-left:150px">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;"
							value="Total dos PAs Listados:" />
					</br:brPanelGroup>

					
					<br:brPanelGroup style="width:150px; text-align:right">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;" value=""/>
					</br:brPanelGroup>

					<br:brPanelGroup style="width:120px; text-align:right">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;" value="#{planApuracaoIssBean.totalPa}" />
					</br:brPanelGroup>
					
					

					<br:brPanelGroup style="width:300px; text-align:left;margin-left:150px">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;"
							value="#{msgs.planilhaApuracao_resultado_grid_total}" />
					</br:brPanelGroup>


					<br:brPanelGroup style="width:150px; text-align:right">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;"
							value="#{planApuracaoIssBean.totalMunicipioReceita}"
							converter="decimalBrazillianConverter" />
					</br:brPanelGroup>

					<br:brPanelGroup style="width:120px; text-align:right">
						<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
							style="margin-right:0px;"
							value="#{planApuracaoIssBean.totalMunicipiolIss}"
							converter="decimalBrazillianConverter" />
					</br:brPanelGroup>

				</br:brPanelGrid>
			</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px">
			<br:brCommandButton id="btnVoltar" rendered="#{planApuracaoIssBean.mostrarCabecalho}" styleClass="HtmlCommandButtonBradesco" value="#{msgs.planilhaApuracao_resultado_btn_Voltar}" action="#{planApuracaoIssBean.voltarPesquisar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:300px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:100px" >
		<br:brPanelGrid columns="3">
			<br:brCommandButton id="btnPlanilhaEletronica" 
						styleClass="HtmlCommandButtonBradesco" 
						value=" #{msgs.planilhaApuracao_resultado_btn_consultar_planilha_eletronica}"
						actionListener="#{planApuracaoIssBean.imprimirPlanilhaEletronica}" 
						rendered="#{planApuracaoIssBean.mostrarCabecalho}"
						disabled="#{empty planApuracaoIssBean.listaSaidaPlanilha}"
						onclick="desbloquearTela();">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnConsultarTxt" styleClass="HtmlCommandButtonBradesco" value=" #{msgs.planilhaApuracao_resultado_btn_consultar_txt} " action="#{planApuracaoIssBean.consultarTXT}" onclick="desbloquearTela();" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnConsultarPdf" styleClass="HtmlCommandButtonBradesco" value=" #{msgs.planilhaApuracao_resultado_btn_consultar_pdf} " action="#{planApuracaoIssBean.consultarPDF}" onclick="desbloquearTela();" disabled="true">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGrid>
		</br:brPanelGroup>
	</br:brPanelGrid>	
</br:brPanelGrid>

<f:verbatim>
<script language="javascript">

habilitarBotoes(document.forms[1]);

function habilitarBotoes(form, radio){
	var objHiddenRadio = document.getElementById(form.name + ':hiddenRadio');
	var rdoConsultaSelecionado = false;
	if (!radio) {
		var objRdoConsulta = document.getElementsByName('sorLista');
		for (var i = 0; i < objRdoConsulta.length; i++) {
			if (objRdoConsulta[i].checked) {
				objHiddenRadio.value = objRdoConsulta[i].value;
				rdoConsultaSelecionado = true;
				break;
			}
		}
	} else {
		objHiddenRadio.value = radio.value;
		rdoConsultaSelecionado = radio.checked;
	}

	var objBtnConsultarTxt = document.getElementById(form.name + ':btnConsultarTxt');
	var objBtnConsultarPdf = document.getElementById(form.name + ':btnConsultarPdf');
	if (rdoConsultaSelecionado) {
		objBtnConsultarPdf.disabled = false;		
		objBtnConsultarTxt.disabled = false;
	} else {
		objBtnConsultarPdf.disabled = true;		
		objBtnConsultarTxt.disabled = true;
	}
}

function checkGrid(form, checkbox){
	 var checado = false;
	 var hidden;
	 
	 for(i=0; i<form.elements.length; i++){
		 if (form.elements[i].name == 'planilhaApuracaoISSResultado:dataTable:todos')
		 	checado = form.elements[i].checked;
		 
		 if (form.elements[i].type == 'checkbox')
	     	 form.elements[i].checked = checado;
	     
	     //Limpeza dos campos caso Checkbox for False	 
	     if (form.elements[i].type == 'text'){
	     	if (checado == false)
	     		form.elements[i].value = '';
	     }	 	
	}	
 }
 
function validarCheckbox(chk) {
	var checkboxes = document.getElementsByName('sorLista');
	var btnTxt = document.getElementById('planilhaApuracaoISSResultado:btnConsultarTxt');
	var btnPDF = document.getElementById('planilhaApuracaoISSResultado:btnConsultarPdf');
	var qtdeCheckboxes = 0;
	var qtdeCheckboxesDesabilitados = 0;
	
	btnTxt.disabled = false;
	btnPDF.disabled = false;

	for ( var i = 0; i < checkboxes.length; i++) {
		if (checkboxes[i].type == 'checkbox') {
			if (checkboxes[i].checked == true) {
				qtdeCheckboxes++;
			}
			else{
				qtdeCheckboxesDesabilitados++;
			}

			if(qtdeCheckboxesDesabilitados == checkboxes.length){
				btnTxt.disabled = true;
				btnPDF.disabled = true;
			}
		}
	}
}
</script>
</f:verbatim>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>