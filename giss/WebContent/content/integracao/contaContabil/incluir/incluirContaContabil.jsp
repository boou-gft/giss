<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="incluirContaContabilForm" name="incluirContaContabilForm" >
<br:brPanelGrid columns="1" width="750px" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%" >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.incluircontacontabil_title_informacoes_cadastramento}:"/>
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
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Item da LC Padrão:" />
		</br:brPanelGroup>
		
		
		<br:brPanelGroup>				
			<br:brSelectOneMenu style="cursor:hand;" id="tipoServico" value="#{contaContabilBean.dto.tipoServicoString}">
				<f:selectItem itemValue="" itemLabel="#{msgs.mantercontacontabil_selecione}"/>
				<f:selectItems value="#{contaContabilBean.listaTipoServico}"/>
			</br:brSelectOneMenu>				
		</br:brPanelGroup>
					
	    <br:brPanelGroup style="width:10px" >
		</br:brPanelGroup>
		
	
		<br:brPanelGroup>
			<br:brSelectOneMenu style="width:150px;cursor:hand;" id="listaCosif" value="#{contaContabilBean.dto.cosif}">
				<f:selectItem itemValue="" itemLabel="#{msgs.mantercontacontabil_selecione}"/>
				<f:selectItems value="#{contaContabilBean.selectItemCosif}"/>
				<a4j:support reRender="incluirContaContabilForm" event="onchange" action="#{contaContabilBean.carregarComboRazao}" oncomplete="desbloquearTela()"/>
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
    		<br:brInputText size="8" maxlength="6" id="itemLei" value="#{contaContabilBean.dto.itemDaLei}" onkeyup="aplicamascara('incluirContaContabilForm', 'incluirContaContabilForm:itemLei',numeros);"/>  
		</br:brPanelGroup>

	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;">
		<f:verbatim><hr class="lin"> </f:verbatim>
		<br:brPanelGrid columns="1" width="100%"  style="text-align:right">
		<br:brPanelGroup>
			<br:brCommandButton onclick="javascript: return validateForm(document.forms[1]);" id="btnProsseguir" style="cursor:hand" styleClass="HtmlCommandButtonBradesco" value="#{msgs.mantercontacontabil_btn_prosseguir}" actionListener="#{contaContabilBean.carregaListaContasContabeisIncluir}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>		
		</br:brPanelGrid>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;" rendered="#{contaContabilBean.dto.listaContasContabeis!= null && contaContabilBean.carregaContas}">
		<br:brPanelGrid columns="1"  style="margin-top:6px;">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.incluircontacontabil_conta_contabil}:" />
			</br:brPanelGroup>			
		</br:brPanelGrid>
		
		<br:brPanelGroup>
				<t:div styleClass="barraDeRolagem" rendered="#{contaContabilBean.dto.listaContasContabeis!= null && contaContabilBean.carregaContas}">
						<t:dataTable id="dataTable"
							value="#{contaContabilBean.dto.listaContasContabeis}" var="result"
							 cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							headerClass="tabela_celula_destaque_acentuado" width="750px">
							<f:verbatim>
							</f:verbatim>
							<t:column width="30px" style="padding-right:5px; padding-left:5px;text-align:center">
								<f:facet name="header">
									<t:selectBooleanCheckbox id="todos"
										styleClass="HtmlSelectOneRadioBradesco"
										value="#{contaContabilBean.checkTodosIncluir}">
										<a4j:support event="onclick"
											onsubmit="checkGrid(document.forms[1],this);" />
									</t:selectBooleanCheckbox>
								</f:facet>
								<t:selectBooleanCheckbox id="sor"
									styleClass="HtmlSelectOneRadioBradesco"
									value="#{result.checkGridIncluir}">
									<f:selectItems
										value="#{contaContabilBean.listaControleCheckRadio}" />
									
								</t:selectBooleanCheckbox>
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
							<t:column width="120px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<h:outputText value="#{msgs.label_conta}" />
								</f:facet>
								<br:brOutputText value="#{result.conta}" />
							</t:column>

							<t:column width="400px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<h:outputText value="#{msgs.incluircontacontabil_descricao}" />
								</f:facet>
								<br:brOutputText value="#{result.descricao}" />
							</t:column>

							<t:column width="200px"
								style="padding-right:5px; padding-left:5px;text-align:left">
								<f:facet name="header">
									<h:outputText
										value="Item da LC" />
								</f:facet>
								<br:brInputText styleClass="HtmlInputTextBradesco"
									value="#{result.item}" size="8" id="txtItemLei"
									style="margin-top:2px;margin-left:70px" maxlength="6"
									onkeyup="validaCampo('incluirContaContabilForm');">
									<a4j:support event="onblur" />
								</br:brInputText>
							</t:column>
						</t:dataTable>
				</t:div>
			</br:brPanelGroup>
	<f:verbatim><hr class="lin" > </f:verbatim>
	</br:brPanelGrid>


		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0"
			rendered="#{contaContabilBean.dto.listaContasContabeis!= null && contaContabilBean.carregaContas}">
			
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar"
					styleClass="HtmlCommandButtonBradesco" style="align:left"
					value="#{msgs.incluircontacontabil_btn_voltar}"
					action="#{contaContabilBean.inicializaIncluir}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

			<br:brPanelGroup style="margin-left:377px">
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brCommandButton id="btnPlanilhaEletronica" 
					styleClass="HtmlCommandButtonBradesco" style="margin-left:5px"
					value="#{msgs.incluircontacontabil_btn_planilha_eletronica}"
					disabled="#{contaContabilBean.dto.listaContasContabeis == null}"
					actionListener="#{contaContabilBean.imprimirPlanilha}"
					onclick="desbloqTela()">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brCommandButton id="btnLimparCampos"
					styleClass="HtmlCommandButtonBradesco" style="margin-left:5px"
					value="#{msgs.incluircontacontabil_btn_limpar_campos}"
					action="#{contaContabilBean.limparDadosIncluir}"
					disabled="#{contaContabilBean.dto.listaContasContabeis == null}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brCommandButton id="btnIncluir"
					styleClass="HtmlCommandButtonBradesco" style="margin-left:5px"
					value="#{msgs.incluircontacontabil_btn_incluir}"
					action="#{contaContabilBean.incluirContasContabeis}"
					disabled="#{contaContabilBean.dto.listaContasContabeis == null}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

	</br:brPanelGrid>

<a4j:status id="statusAguarde" onstart="bloquearTela()" onstop="desbloquearTela()" />

<f:verbatim>
<script language="javascript">
	var form = document.forms[1];

	var objTodos = document.getElementById('incluirContaContabilForm:dataTable:todos');
   	if (objTodos != null && objTodos.checked) {
		var objInputs = document.getElementsByTagName("input");
		if (objInputs != null) {
			for (var i = 0; i < objInputs.length; i++) {
				if (objInputs[i].id.indexOf("sor") > -1) {
					objInputs[i].checked = true;
				}
			}
		}
   	}

  function checkGrid(form, checkbox){
	 var checado = false;
	 var hidden;
	 
	 for(i=0; i<form.elements.length; i++){
		 if (form.elements[i].name == 'incluirContaContabilForm:dataTable:todos')
		 	checado = form.elements[i].checked;
		 
		 if (form.elements[i].type == 'checkbox')
	     	 form.elements[i].checked = checado;
	     
	     //Limpeza dos campos caso Checkbox for False	 
	   //  if (form.elements[i].type == 'text'){
	   //  	if (checado == false)
	   //  		form.elements[i].value = '';
	   //  }	 	
	}	
  }

  function limparCamposGrid(form){
	 var checado = false;
	 var indexDataTable = 0;
	 
	 for(i=0; i<form.elements.length; i++){
	 	 //Testo se o registro em foco foi checado
		 if (form.elements[i].name == ('incluirContaContabilForm:dataTable_' + indexDataTable + ':sor')){
	     	 checado = form.elements[i].checked;
	     }	 

         //Vamos testar se o registro foi checado, caso positivo testamos se os dados foram preenchidos
		 if ( (form.elements[i].name == ('incluirContaContabilForm:dataTable_' + indexDataTable + ':txtItemLei') ) ){
		 	   indexDataTable++;
			   if ( checado == false ) {
			   		form.elements[i].value = '';
			   		var objTodos = document.getElementById('incluirContaContabilForm:dataTable:todos');
					if (objTodos != null) {
						objTodos.checked = false;
			   		}
			   }
		  }		 	   
  	}
  }	  
  
  function validaCampo(form){
 
 	for(i=0;i<=99;i++){ 
 		var scampo = document.getElementById(form+':dataTable_'+i+':txtItemLei'); 			
		if(scampo){ 		
			var result = document.getElementById(form+':dataTable_'+i+':txtItemLei').value;
			document.getElementById(form+':dataTable_'+i+':txtItemLei').value = result.replace(/\D/g,"");
		}else{
			return false;
		}
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

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
