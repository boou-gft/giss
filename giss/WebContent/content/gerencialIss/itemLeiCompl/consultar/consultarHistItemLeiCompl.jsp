<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="manterCodLancamentoForm" name="manterCodLancamentoForm" >
<h:inputHidden id="hiddenProsseguir" value="#{itemServicoLcISSBean.hiddenProsseguir}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_item_servico}:"/>
		</br:brPanelGroup>
		
		<br:brSelectOneMenu style="width:180px" id="descItemServico" value="#{itemServicoLcISSBean.dtoHistorico.codItemLc}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{itemServicoLcISSBean.selectItemServico}"/>
		</br:brSelectOneMenu>
		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_pesquisar}" action="#{itemServicoLcISSBean.pequisarHistorico}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" rendered="#{itemServicoLcISSBean.mostrarLista}">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_resultado_pesquisa_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" rendered="#{itemServicoLcISSBean.mostrarLista}">
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	  	<t:selectOneRadio layout="spread" id="selectTabela" forceId="true" forceIdIndex="false" value="#{itemServicoLcISSBean.codigoSelecionadoRadio}">
			<f:selectItems value="#{itemServicoLcISSBean.selectItemServicoLC}" />
		</t:selectOneRadio>
		<t:div  style="overflow-Y:scroll;overflow-X:scroll; width:750;height:390;display:block" rendered="#{itemServicoLcISSBean.mostrarLista}">
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >	
					
		<t:dataTable id="dataTable" value="#{itemServicoLcISSBean.dtoHistorico.lista}" var="result" rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque" 
			columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="900px" >			
			  <t:column width="25px" >
				<f:facet name="header">
			    </f:facet>		
			  
		    	<t:radio index="#{indexLista}" for=":manterCodLancamentoForm:selectTabela" />
			  </t:column>	
			  <t:column width="200px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_item_servico}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codItemLcFormatado}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="350px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_descricao_item_lei_complementar}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descItemLc}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			   <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_lc_status}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descStatus}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			   <f:facet name="header">
			      <br:brOutputText value="Código Funcional" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codFuncional}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="300px">
			   <f:facet name="header">
			      <br:brOutputText value="Data Atualização" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.dataHoraManutencaoFormatada}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  
			</t:dataTable>	
		</br:brPanelGroup>
	</br:brPanelGrid>		
	</t:div>
 		
 	
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" rendered="#{itemServicoLcISSBean.mostrarLista}">	
		
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGroup>
			    <br:brCommandButton id="btnReativar" styleClass="HtmlCommandButtonBradesco" value="Detalhar" action="#{itemServicoLcISSBean.carregarDetalhar}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			
			
			
			
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
			
		if (form.elements[i].id == 'manterCodLancamentoForm:hiddenProsseguir'){		
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
