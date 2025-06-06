<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterContaContabilForm" name="manterContaContabilForm" >
<h:inputHidden id="hiddenRadio" value="#{contaContabilBean.codListaPesquisaRadio}"/>

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0" border="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.mantercontacontabil_title_informacoes_pesquisa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="7" cellpadding="0" cellspacing="0">
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.mantercontacontabil_tipo_servico}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px" >
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_cosif}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup >
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Razão Contabil:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup >
		</br:brPanelGroup>
		
		
		<br:brPanelGroup>				
			<br:brSelectOneMenu style="cursor:hand;" id="tipoServico" value="#{contaContabilBean.dto.tipoServicoString}">
				<f:selectItem itemValue="" itemLabel="#{msgs.mantercontacontabil_selecione}"/>
				<f:selectItems value="#{contaContabilBean.listaTipoServico}"/>
				<a4j:support reRender="manterContaContabilForm" event="onchange"  oncomplete="desbloquearTela()"/>
			</br:brSelectOneMenu>				
		</br:brPanelGroup>
					
	    <br:brPanelGroup style="width:10px" >
		</br:brPanelGroup>
		
	
		<br:brPanelGroup>
			<br:brSelectOneMenu style="width:150px;cursor:hand;" id="listaCosif" value="#{contaContabilBean.dto.cosif}">
				<f:selectItem itemValue="" itemLabel="#{msgs.mantercontacontabil_selecione}"/>
				<f:selectItems value="#{contaContabilBean.selectItemCosif}"/>
				<a4j:support reRender="manterContaContabilForm" event="onchange" action="#{contaContabilBean.carregarComboRazao}" oncomplete="desbloquearTela()"/>
			</br:brSelectOneMenu>				
		</br:brPanelGroup>
			
		<br:brPanelGroup style="width:10px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brSelectOneMenu style="width:150px;cursor:hand;" id="listaRazao" value="#{contaContabilBean.dto.razao}">
				<f:selectItem itemValue="" itemLabel="#{msgs.mantercontacontabil_selecione}"/>
				<f:selectItems value="#{contaContabilBean.listaRazao}"/>
			</br:brSelectOneMenu>				
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px" >
		</br:brPanelGroup>
	
		<br:brPanelGroup>
		</br:brPanelGroup>

	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" style="cursor:hand" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_prosseguir}" actionListener="#{contaContabilBean.carregaListaContasContabeis}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{contaContabilBean.carregaContas}">
		
		<br:brPanelGroup style="width:750px">
				<t:div styleClass="barraDeRolagem">
						<t:dataTable id="dataTable"
							value="#{contaContabilBean.dto.listaContasContabeis}" var="result"
							cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							headerClass="tabela_celula_destaque_acentuado" width="750px">
							<t:column width="30px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText value="" escape="false" />
								</f:facet>
								<t:selectOneRadio
									onclick="javascript:radioGridPesquisa(document.forms[1], this);"
									id="sorLista" style="cursor:hand"
									styleClass="HtmlSelectOneRadioBradesco" layout="spread"
									forceId="true" forceIdIndex="false">
									<f:selectItems
										value="#{contaContabilBean.listaControleCheckRadio}" />
								</t:selectOneRadio>
								<t:radio for="sorLista" index="#{result.linha}" />
							</t:column>
							<t:column width="120px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_cosif}" />
								</f:facet>
								<br:brOutputText value="#{result.cosifFormatado}" />
							</t:column>
							<t:column width="120px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_razao}" />
								</f:facet>
								<br:brOutputText value="#{result.razao}" />
							</t:column>
							<t:column width="110px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.mantercontacontabil_grid_conta_prosseguir}" />
								</f:facet>
								<br:brOutputText value="#{result.conta}" />
							</t:column>
							<t:column width="430px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.mantercontacontabil_grid_descricao_prosseguir}" />
								</f:facet>
								<br:brOutputText value="#{result.descricao}" />
							</t:column>
							<t:column width="100px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<h:outputText
										value="Item da LC" />
								</f:facet>
								<br:brOutputText value="#{result.item}" />
							</t:column>
							<t:column width="200px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<br:brOutputText
										value="#{msgs.mantercontacontabil_grid_atualizacao_prosseguir}" />
								</f:facet>
								<br:brOutputText value="#{result.atualizacao}" />
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>
	</br:brPanelGrid>	
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" rendered="#{contaContabilBean.dto.listaContasContabeis!= null && contaContabilBean.carregaContas}" >
		<f:verbatim>&nbsp;</f:verbatim>			
		<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGrid>
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="6" width="100%" rendered="#{contaContabilBean.dto.listaContasContabeis!= null && contaContabilBean.carregaContas}" >
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="align:left" value="#{msgs.mantercontacontabil_btn_voltar_prosseguir}" action="#{contaContabilBean.inicializaManter}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="margin-left:390px">
		</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brCommandButton id="btnPlanilhaEletronica"
					styleClass="HtmlCommandButtonBradesco" style="margin-left:5px"
					value="#{msgs.mantercontacontabil_btn_excluir_planilha_eletronica}"
					disabled="#{contaContabilBean.dto.listaContasContabeis == null}"
					actionListener="#{contaContabilBean.imprimirManterRazaoContabil}"
					onclick="desbloqTela()">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brCommandButton id="btnAlterar"
					styleClass="HtmlCommandButtonBradesco"  style="margin-left:5px"
					value="#{msgs.mantercontacontabil_btn_alterar_prosseguir}"
					action="#{contaContabilBean.carregaAlteracao}" disabled="true">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brCommandButton id="btnExcluir"
					styleClass="HtmlCommandButtonBradesco" style="margin-left:5px"
					value="#{msgs.mantercontacontabil_btn_excluir_prosseguir}"
					action="#{contaContabilBean.carregaExclusao}" disabled="true">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

		</br:brPanelGrid>		
				
</br:brPanelGrid>
<a4j:status id="statusAguarde" onstart="bloquearTela()" onstop="desbloquearTela()" />
<f:verbatim>

<script language="javascript">
	var formulario = document.forms[1];
	var combo = '';
	
	for(i=0; i<formulario.elements.length; i++)
	{
		if (formulario.elements[i].id == 'manterContaContabilForm:tipoServico'){
			combo= formulario.elements[i].value;
		}
		
		if (formulario.elements[i].id == 'manterContaContabilForm:btnProsseguir'){
			if (combo == "" || combo == null)
				formulario.elements[i].disabled=true;
			else{
				formulario.elements[i].disabled=false;					
			}		
		}				
	}	


	function habilitarProsseguir(form, object){	
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'manterContaContabilForm:btnProsseguir'){
				if (object.value == "" || object.value == null)
					form.elements[i].disabled=true;
				else
					form.elements[i].disabled=false;						
			}				
		}		
	}
	
	function radioGridPesquisa(form, radio){	
		var hidden;
		for(i=0; i<form.elements.length; i++)
		{
			if (form.elements[i].id == 'manterContaContabilForm:btnAlterar'){
				form.elements[i].disabled=false;
			}
			if (form.elements[i].id == 'manterContaContabilForm:btnExcluir'){
				form.elements[i].disabled=false;
			}
			if (form.elements[i].id == 'manterContaContabilForm:btnPlanilhaEletronica'){
				form.elements[i].disabled=false;
			}	
			if (form.elements[i].id == 'manterContaContabilForm:hiddenRadio'){		
				hidden = form.elements[i];
				hidden.value = radio.value;	
			}
			
		}	
	}

	function formataCampo(campo) { 
        var boleanoMascara; 
        var mascara = '###-###';
        var campoSoNumeros = campo.value.replace(/\-/g,""); 
        var posicaoCampo = 0;    
        var NovoValorCampo="";
        var TamanhoMascara = campoSoNumeros.length; 
        if (TamanhoMascara < 6){
			for(var f = TamanhoMascara; f < 6; f++){
				campoSoNumeros =  campoSoNumeros + "0";
			}
			
        }  
        TamanhoMascara = campoSoNumeros.length > 6 ? 6 : campoSoNumeros.length;
        for(var i=0; i<= TamanhoMascara; i++) { 
             boleanoMascara  = mascara.charAt(i) == "-";
             if (boleanoMascara) { 
                     NovoValorCampo += mascara.charAt(i); 
                       TamanhoMascara++;
             }else { 
                     NovoValorCampo += campoSoNumeros.charAt(posicaoCampo); 
                     posicaoCampo++; 
               }              
        }      
        campo.value = NovoValorCampo;
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

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
