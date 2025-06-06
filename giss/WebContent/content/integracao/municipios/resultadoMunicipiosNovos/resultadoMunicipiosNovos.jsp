<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="resultadoMunicipiosNovos" name="resultadoMunicipiosNovos" >
<h:inputHidden id="hiddenRadioMunicipioManter" value="#{resultMunicNovoBean.radioMunicipioManter}"/>


	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>			
		</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{resultMunicNovoBean.estadoFiltro}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{resultMunicNovoBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{resultMunicNovoBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{resultMunicNovoBean.buscaMunicipioManter}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{resultMunicNovoBean.buscaMunicipio.descricao}"/>
	 </br:brPanelGrid>
	 <br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >
			<t:selectOneRadio id="tipoPesquisa" value="#{resultMunicNovoBean.tipoPesquisa}"
			 	styleClass="HtmlSelectOneRadioBradesco">  
				<f:selectItem value="1" itemValue="1" itemLabel="Todos" />
				<f:selectItem value="2" itemValue="2" itemLabel="Por Agência" />
				<f:selectItem value="3" itemValue="3" itemLabel="Por PAs" />
			</t:selectOneRadio>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguirPesquisa" style="cursor:hand" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_pesquisar}" action="#{resultMunicNovoBean.carregaListaMunicipios}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" rendered="#{resultMunicNovoBean.listaMunicipioNovas != null}">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.resultado_municipios_novos_resultadoPesquisa}:" />
			</br:brPanelGroup>			
		</br:brPanelGrid>
		
		
		<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;"cellpadding="0" cellspacing="0" rendered="#{resultMunicNovoBean.listaMunicipioNovas != null}">	
			<br:brPanelGroup >	
				<t:dataTable id="dataTable" value="#{resultMunicNovoBean.listaMunicipioNovas}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
				headerClass="tabela_celula_destaque_acentuado" width="750px" >	
					
				<t:column width="30px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">
				      <br:brOutputText value=""  escape="false" />
				    </f:facet>		
				    
					<t:selectOneRadio onclick="javascript:habilitaBotaoProsseguir(document.forms[1], this);" id="sorLista" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" >
						<f:selectItems value="#{resultMunicNovoBean.listaControleCheckRadio}"/>
					</t:selectOneRadio>
		    		<t:radio for="sorLista" index="#{result.linha}"  />
				
				</t:column>
				
				<t:column width="150px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.resultado_municipios_novos_codigo}"  />
				    </f:facet>
				      <br:brOutputText value="#{result.codigo}" />
				</t:column>
				
				<t:column width="470px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.resultado_municipios_novos_nome}"  />
				    </f:facet>
				      <br:brOutputText value="#{result.nome}" />
				</t:column>
				  
				  
			    <t:column width="100px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <h:outputText value="#{msgs.resultado_municipios_novos_uf}"  />
				    </f:facet>
	   			   	<br:brOutputText value="#{result.uf}" />
				</t:column>
				</t:dataTable>		
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0"  rendered="#{resultMunicNovoBean.listaMunicipioNovas != null}">	
			<br:brPanelGroup>
			    <brArq:pdcDataScroller id="dataScroller" for="dataTable" 
			            actionListener="#{resultMunicNovoBean.pesquisarListaDependenciasNovas}" rendered="#{resultMunicNovoBean.mostraBotoes}">
				  <f:facet name="previous">
				    <brArq:pdcCommandButton id="anterior"
				      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
				      value="#{msgs.label_anterior}" title="#{msgs.label_anterior}"/>
				  </f:facet>
				  <f:facet name="next">
				    <brArq:pdcCommandButton id="proxima"
				      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
				      value="#{msgs.label_proxima}" title="#{msgs.label_proxima}"/>
				  </f:facet>
				</brArq:pdcDataScroller>			  
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" style="margin-top:6px;" rendered="#{resultMunicNovoBean.listaMunicipioNovas != null}">
			<br:brPanelGroup>
				<f:verbatim><hr class="lin"> </f:verbatim>
			</br:brPanelGroup>			
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0"  rendered="#{resultMunicNovoBean.listaMunicipioNovas != null}">	
			<br:brPanelGroup>
				<br:brPanelGroup style="text-align:right;margin-right:5px;" >
					<br:brCommandButton id="btnRelatorioX"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.manter_dependencia_municipio_prosseguir_btn_relatorio_eos}"
						actionListener="#{resultMunicNovoBean.gerarRelatorioEos}"
						onclick="desbloqTela();">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
				<br:brPanelGroup style="text-align:right;margin-right:5px;" >
					<br:brCommandButton id="btnPlanilha"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.manter_dependencia_municipio_prosseguir_btn_planilha_eletronica}"
						actionListener="#{resultMunicNovoBean.imprimirPlanilha}"
						onclick="desbloqTela();">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
				<br:brPanelGroup style="text-align:right;margin-right:5px;" >
					<br:brCommandButton id="btnConsultarTxt"
						styleClass="HtmlCommandButtonBradesco" 
						value=" #{msgs.planilhaApuracao_resultado_btn_consultar_txt} " 
						action="#{resultMunicNovoBean.consultarTXT}" 
						onclick="desbloquearTela();">
						<brArq:submitCheckClient/> 
					</br:brCommandButton>
				</br:brPanelGroup>
				<br:brPanelGroup style="text-align:right;margin-right:5px;" >
					<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultado_municipios_novos_btn_prosseguir}" 
						action="#{resultMunicNovoBean.prosseguir}" disabled="true">
							<brArq:submitCheckClient/>
					</br:brCommandButton>		
				</br:brPanelGroup>	
			</br:brPanelGroup>		
		</br:brPanelGrid>
	
<f:verbatim>
<script language="javascript">
		function habilitaBotaoProsseguir(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'resultadoMunicipiosNovos:btnProsseguir'){
				form.elements[i].disabled=false;
			}
				
			if (form.elements[i].id == 'resultadoMunicipiosNovos:hiddenRadioMunicipioManter'){		
				hidden = form.elements[i];
				hidden.value = radio.value;
			}
			
		}	
	}
	
</script>
</f:verbatim>
<brArq:validatorScript functionName="validateForm"/>
	
	</br:brPanelGrid>
</brArq:form>

<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{resultMunicNovoBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>