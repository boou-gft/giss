<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="incluirItemLeiComplForm" name="incluirItemLeiComplForm" >
<h:inputHidden id="hiddenProsseguir" value="#{itemServicoLcISSBean.hiddenProsseguir}"/>
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
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
    					
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_item_servico}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_descricao_item_lei_complementar}:"/>
		</br:brPanelGroup>
		
		
	    <br:brPanelGroup>
	    	<br:brInputText size="15" maxlength="6" id="txtItem" disabled="true"  value="#{itemServicoLcISSBean.dtoAlterar.codItemLcFormatado}"  onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtItem',numeros);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>	
		
			<br:brPanelGroup>
    		<br:brInputText size="60" maxlength="40" id="txtDescricaoItem" value="#{itemServicoLcISSBean.dtoAlterar.descItemLc}"/>  
		</br:brPanelGroup>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" action="manterItemLeiCompl" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup style="text-align:right;width:200px" >
			<br:brCommandButton id="btnAlterar" styleClass="HtmlCommandButtonBradesco" onclick="
							
								if(!confirm('Deseja alterar o registro?')){
									setHiddenProssegue(document.forms[1],false);
								}else{
									setHiddenProssegue(document.forms[1],true);
								};"
											
				value="#{msgs.label_botao_alterar_tipo_servico}" action="#{itemServicoLcISSBean.confirmarAlterar}" style="margin-right:5px">
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
			
		if (form.elements[i].id == 'incluirItemLeiComplForm:hiddenProsseguir'){		
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
