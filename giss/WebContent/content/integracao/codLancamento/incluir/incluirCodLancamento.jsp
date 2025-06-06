<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="incluirCodLancamentoForm" name="incluirCodLancamentoForm" >
<h:inputHidden id="hiddenProsseguir" value="#{codLancamentoBean.hiddenProsseguir}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_informacao_cadastramento_tipo_servico}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cod_lancamento}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_seg_linha_extrato}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cosif}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="15" maxlength="5" id="txtCodigo" value="#{codLancamentoBean.dtoIncluir.codLancamento}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCodigo',numeros);"/>  
		</br:brPanelGroup>		
						
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
    		<br:brInputText size="46" maxlength="32" id="txtSegLinhaExtrato" value="#{codLancamentoBean.dtoIncluir.segLinhaExtrato}"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
    		<br:brInputText size="20" maxlength="10" id="txtCosif" value="#{codLancamentoBean.dtoIncluir.cosif}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCosif',numeros);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_razao}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_conta}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_digito}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText id="razao" maxlength="7" size="40" onfocus="loadMasks()" alt="razaocontabil" 
    		onkeypress="return validaTecla('0123456789', event)" value="#{codLancamentoBean.dtoIncluir.razao}" />
		</br:brPanelGroup>
								
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
	    	<br:brInputText size="15" maxlength="10" id="txtConta" value="#{codLancamentoBean.dtoIncluir.conta}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtConta',numeros);"/>  
		</br:brPanelGroup>
		 
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
	    <br:brPanelGroup>	
	    	<br:brInputText size="5" maxlength="1" id="txtDigito" value="#{codLancamentoBean.dtoIncluir.digito}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtDigito',numeros);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_nome_conta}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_item_lei_complementar}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
	    	<br:brInputText size="46" maxlength="40" id="txtNomeConta" value="#{codLancamentoBean.dtoIncluir.nomeConta}" onkeyup="Somaiuscula('Somaiuscula', window.event.keyCode, this);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>	
	    
	    <br:brPanelGroup>
	    	<br:brInputText size="15" maxlength="6" id="txtItem" value="#{codLancamentoBean.dtoIncluir.codItem}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtItem',numeros);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>	
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_limpar_campos_tipo_servico}" action="#{codLancamentoBean.limparDados}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			
			<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco" onclick="	
								if(!confirm('Deseja incluir o registro?')){
									setHiddenProssegue(document.forms[1],false);
								}else{
									setHiddenProssegue(document.forms[1],true);
							    };"
				  value="#{msgs.label_botao_incluir_tipo_servico}" action="#{codLancamentoBean.incluirCodLancamento}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim> <br> </f:verbatim> 

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{codLancamentoBean.mostrarLista}">	
		<t:div  style="overflow-Y:scroll; height:275;display:block">
					
		<t:dataTable id="dataTable" value="#{codLancamentoBean.dtoIncluir.lista}" var="result"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">			
			  <t:column width="100px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cod_lancamento}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codLancamento}"  style="margin-right:5 px; float:right;" escape="false"/>
			  </t:column>
			  <t:column width="200px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_seg_linha_extrato}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.segLinhaExtrato}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="80px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_cosif}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.cosif}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_razao_conta_dig}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.razaoContaDig}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="150px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_nome_conta}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.nomeConta}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			  <t:column width="100px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_item_lei_complementar}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.codItem}" style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
			</t:div>	
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
