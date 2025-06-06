<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="relatorioForm" name="relatorioForm" >
<br:brPanelGrid columns="1" width="900" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="750"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.mantercontacontabil_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Período:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>

		<br:brPanelGroup>
			<br:brInputText id="txtMesBase" value="#{relatorioISSBean.dto.mesPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('relatorioForm','relatorioForm:txtMesBase','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('relatorioForm','relatorioForm:txtMesBase',numeros);" onkeyup="proximoCampo(2,'relatorioForm','relatorioForm:txtMesBase','relatorioForm:txtAnoBase');">
				<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
			</br:brInputText>
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText id="txtAnoBase" value="#{relatorioISSBean.dto.anoPeriodoInicial}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('relatorioForm','relatorioForm:txtAnoBase', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()">
				<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
			</br:brInputText>
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="até" />
		<br:brPanelGroup>
			<br:brInputText id="txtMesBase2" value="#{relatorioISSBean.dto.mesPeriodoFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="2" size="3" onblur="validarData('relatorioForm','relatorioForm:txtMesBase2','mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}')" onchange="habilitaBotaoConsultar()" onkeypress="aplicamascara('relatorioForm','relatorioForm:txtMesBase2',numeros);" onkeyup="proximoCampo(2,'relatorioForm','relatorioForm:txtMesBase2','relatorioForm:txtAnoBase2');">
				<brArq:commonsValidator type="required" arg="#{msgs.label_mes_base}" server="false" client="true" />
			</br:brInputText>
			<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
			<br:brInputText id="txtAnoBase2" value="#{relatorioISSBean.dto.anoPeriodoFinal}" styleClass="HtmlInputTextBradesco" style="text-align: right" maxlength="4" size="5" onblur="validarData('relatorioForm','relatorioForm:txtAnoBase2', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');" onchange="habilitaBotaoConsultar()" onkeypress="onlyNum()" onfocus="cleanClipboard()">
				<brArq:commonsValidator type="required" arg="#{msgs.label_ano_base}" server="false" client="true" />
			</br:brInputText>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" width="750">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio_ibge}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		
			
		
		<br:brSelectOneMenu style="width:180px; margin-left: 2px;" id="estado" value="#{relatorioISSBean.dto.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{relatorioISSBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="10" size="25" value="#{relatorioISSBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton style="margin-left: 3px;" image="/images/lupa.gif" id="buttonBuscarMunicipio" action="#{relatorioISSBean.pesquisarMunicipio}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="30" size="72" value="#{relatorioISSBean.buscaMunicipio.descricao}"/>
		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:5px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	<br:brPanelGrid columns="1" style="text-align:right" cellpadding="0" cellspacing="0" width="750">	
		<br:brCommandButton id="btnIncluirMun" styleClass="HtmlCommandButtonBradesco"
			  value="Adicionar Município" action="#{relatorioISSBean.adicionarMun}" >
			<brArq:submitCheckClient/>
		</br:brCommandButton>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">	
		<t:div  style="overflow-Y:scroll;:scroll;height:200;width:750">
			<t:dataTable id="dataTableMun" value="#{relatorioISSBean.dto.listaMunicipio}" var="resultMun" rowIndexVar="indexMun"
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				headerClass="tabela_celula_destaque_acentuado"  width="">			
			  <t:column width="25px" style="padding-right:5px; padding-left:5px">
			    <f:facet name="header">      
					<t:selectOneRadio id="sorListaMun" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{relatorioISSBean.itemSelecionadoMun}">
						<f:selectItems value="#{relatorioISSBean.listaControleRadioMun}"/>
					</t:selectOneRadio>
			    </f:facet>		
		    	<t:radio for="sorListaMun" index="#{indexMun}"  />
			  </t:column>
			  <t:column width="200px" style="padding-right:5px; padding-left:5px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.geral_codigo_municipio_ibge}" />
			    </f:facet>
			    <br:brOutputText value="#{resultMun.codMunicipio}"/>
			  </t:column>
			  <t:column width="500px" style="padding-right:5px; padding-left:5px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_municipio}" />
			    </f:facet>
			    <br:brOutputText value="#{resultMun.descMunicipios}"/>
			  </t:column>
			  <t:column width="140px" style="padding-right:5px; padding-left:5px" >
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_uf}" />
			    </f:facet>
			    <br:brOutputText value="#{resultMun.siglaUf}"/>
			  </t:column>
			</t:dataTable>	
		</t:div>	
	</br:brPanelGrid>	
	<br:brPanelGrid columns="1" width="750"  style="text-align:right" cellpadding="0" cellspacing="0">	
		<br:brPanelGroup>
			<br:brCommandButton id="btnExcluirMun" styleClass="HtmlCommandButtonBradesco" value="Excluir Município" action="#{relatorioISSBean.excluirMun}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0"  width="750">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="Empresa:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>	

		<br:brSelectOneMenu style="width:500px" id="empresa" value="#{relatorioISSBean.codEmpresaSelecionada}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItem itemValue="99999" itemLabel="TODAS EMPRESAS"/>
			<f:selectItems value="#{relatorioISSBean.listaEmpresa}"/>
		</br:brSelectOneMenu>
		
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGrid width="100%" style="text-align:right">
			<br:brCommandButton  id="btnIncluirEmp" styleClass="HtmlCommandButtonBradesco"
				  value="Adicionar Empresa" action="#{relatorioISSBean.adicionarEmp}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGrid>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_produto}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>	
		
		<br:brSelectOneMenu style="width:370px" id="produto" value="#{relatorioISSBean.dto.codProduto}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItem itemValue="1" itemLabel="#{msgs.label_leasing}"/>
			<f:selectItem itemValue="2" itemLabel="#{msgs.label_fundos}"/>
			<f:selectItem itemValue="3" itemLabel="#{msgs.label_cartoes_anuid}"/>
			<f:selectItem itemValue="4" itemLabel="#{msgs.label_consorcio}"/>
			<f:selectItem itemValue="5" itemLabel="#{msgs.label_cartoes_paliativo}"/>
			<f:selectItem itemValue="6" itemLabel="#{msgs.label_cartoes_comissoes}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>	
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">	
		<t:div  style="overflow-Y:scroll;;height:200;width:720">
			<t:dataTable id="dataTableEmp" value="#{relatorioISSBean.dto.listaEmpresa}" var="resultEmp" rowIndexVar="indexEmp"
				cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
				headerClass="tabela_celula_destaque_acentuado"  width="">			
				<t:column width="25px" style="padding-right:5px; padding-left:5px">
					<f:facet name="header">      
						<t:selectOneRadio id="sorListaEmp" styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false" value="#{relatorioISSBean.itemSelecionadoEmp}">
							<f:selectItems value="#{relatorioISSBean.listaControleRadioEmp}"/>
						</t:selectOneRadio>
				    </f:facet>		
			    	<t:radio for="sorListaEmp" index="#{indexEmp}"  />
				</t:column>
				<t:column width="840px" >
				    <f:facet name="header">
				      <br:brOutputText value="Empresa:" />
				    </f:facet>
				    <br:brOutputText value="#{resultEmp.descEmpresaFormatada}"/>
				</t:column>
				 
			</t:dataTable>	
		</t:div>	
	</br:brPanelGrid>	
	<br:brPanelGrid columns="1" width="750"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnExcluirEmp" styleClass="HtmlCommandButtonBradesco" value="Excluir Empresa" action="#{relatorioISSBean.excluirEmp}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" width="750"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimpar" styleClass="HtmlCommandButtonBradesco" value="Limpar" action="#{relatorioISSBean.iniciarTela}" style="margin-right:5px" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnPlanilha"
				styleClass="HtmlCommandButtonBradesco"
				value="Excel"
				action="#{relatorioISSBean.imprimirPlanilha}"
				onclick="desbloqTela();" style="margin-right:5px">
				<brArq:submitCheckClient />
			</br:brCommandButton>	
			<br:brCommandButton id="btnConsultarTxt" 
				styleClass="HtmlCommandButtonBradesco" 
				value="TXT" 
				action="#{relatorioISSBean.consultarTXT}" 
				onclick="desbloquearTela();" >
				<brArq:submitCheckClient/> 
			</br:brCommandButton>
				</br:brPanelGroup>
	</br:brPanelGrid> 
</br:brPanelGrid>

</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{relatorioISSBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>