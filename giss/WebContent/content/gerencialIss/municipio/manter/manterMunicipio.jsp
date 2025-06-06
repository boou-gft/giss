<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="incluirCodLancamentoForm" name="incluirCodLancamentoForm" >
<h:inputHidden id="hiddenProsseguir" value="#{municipioISSBean.hiddenProsseguir}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.mantercontacontabil_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio_ibge}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{municipioISSBean.dtoManter.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{municipioISSBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="10" size="15" value="#{municipioISSBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{municipioISSBean.pesquisarMunicipio}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{municipioISSBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>
		
    
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			
			
			<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco"
				  value="Pesquisar" action="#{municipioISSBean.pesquisar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim> <br> </f:verbatim> 

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{municipioISSBean.mostrarLista}">	
		<t:div  style="overflow-Y:scroll; height:275;display:block">
		<t:selectOneRadio layout="spread" id="selectTabela" forceId="true" forceIdIndex="false" value="#{municipioISSBean.itemTabelaSelecionado}">
			<f:selectItems value="#{municipioISSBean.listaControleRadio}" />
		</t:selectOneRadio>
		<t:dataTable id="dataTable" value="#{municipioISSBean.dtoManter.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">			
			  <t:column width="5%">
				<f:facet name="header">
					<br:brOutputText value="" />
				</f:facet>
				<t:radio index="#{indexLista}" for=":incluirCodLancamentoForm:selectTabela" />
			  </t:column>
			  <t:column width="100px" >
			    <f:facet name="header">
			      <br:brOutputText value="Código" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codMunicipio}"  style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="200px" >
			    <f:facet name="header">
			      <h:outputText value="Nome" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descMunicipios}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="80px">
			    <f:facet name="header">
			      <br:brOutputText value="UF" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.siglaUf}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="80px">
			    <f:facet name="header">
			      <br:brOutputText value="Status" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descStatus}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  
			</t:dataTable>	
			</t:div>	
	</br:brPanelGrid>		
 	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{municipioISSBean.mostrarLista}">	
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_ALT_MUNICIPIO">
				<br:brCommandButton id="btnAlterar" styleClass="HtmlCommandButtonBradesco" value="Alterar" action="#{municipioISSBean.carregarAlterar}"  style="margin-right:5px" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</authz:authorize>
			<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_EXC_MUNICIPIO">
				<br:brCommandButton id="btnExcluir" styleClass="HtmlCommandButtonBradesco" value="Excluir" onclick="	
						if(!confirm('Deseja excluir o Municipio?')){
							setHiddenProssegue(document.forms[1],false);
						}else{
							setHiddenProssegue(document.forms[1],true);
					    };" action="#{municipioISSBean.excluir}"  style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</authz:authorize>
			<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_EXC_MUNICIPIO">
				<br:brCommandButton id="btnReativar" styleClass="HtmlCommandButtonBradesco" value="Reativar" onclick="	
						if(!confirm('Deseja reativar o Municipio?')){
							setHiddenProssegue(document.forms[1],false);
						}else{
							setHiddenProssegue(document.forms[1],true);
					    };" action="#{municipioISSBean.reativar}" style="margin-right:5px" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</authz:authorize>
			<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_DET_MUNICIPIO">
				<br:brCommandButton id="btnDetalhar" styleClass="HtmlCommandButtonBradesco" value="Detalhar" action="#{municipioISSBean.carregarDetalhar}" style="margin-right:5px" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</authz:authorize>
			<authz:authorize ifAllGranted="ROLE_MENU_ISS_GER_DET_MUNICIPIO">
				<br:brCommandButton id="btnPlanilha"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.manter_dependencia_municipio_prosseguir_btn_planilha_eletronica}"
					actionListener="#{municipioISSBean.imprimirPlanilha}"
					onclick="desbloqTela();" >
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</authz:authorize>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
</br:brPanelGrid>


<brArq:validatorScript functionName="validateForm"/>
<f:verbatim>
<script>
function setHiddenProssegue(form, flag){	
	var hidden;	
	
	for(i=0; i<form.elements.length; i++)
	{
			
		if (form.elements[i].id == 'incluirCodLancamentoForm:hiddenProsseguir'){		
			hidden = form.elements[i];
			hidden.value = flag;				
		}		
	}	
}
function Somaiuscula(formato, keypress, objeto){
	campo = eval(objeto);
	caracteres = 'abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQSTUVWXYZ01234567890-./: ';
	if (caracteres.search(String.fromCharCode(keypress))!=1){
		campo.value = campo.value.toUpperCase();
	}
}

function validaTecla(valores, event) { 

    var BCK=8, //backspace 

    ETR=13, //return 

    DEL=127, //delete 

    //MIN=45, //'-' 

    //LEFT=37, 

    //RIGHT=39, 

    //UP=38, 

    //DOWN=40, 

    key,tecla; 

    if(BrowserDetect.browser == 'Firefox' && event.which) { 
	tecla=event.which; 
    } else if(BrowserDetect.browser == 'Explorer' && event.keyCode) { 
	tecla=event.keyCode; 
    } else { 
	return true; 
    }
 
    key=String.fromCharCode(tecla); 

    switch(tecla) { 

        case ETR: 

        case BCK: 

        case DEL: 

        //case MIN: 

        //case LEFT: 

        //case RIGHT: 

        //case UP: 

        //case DOWN: 

            return true; 

        default: 

            if(valores.indexOf(key)!=-1) { 
	        return true; 
            } 
     } 
    
    return false; 
} 

</script>
 </f:verbatim>
</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{municipioISSBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>