<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

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

		<br:brSelectOneMenu style="width:180px" id="estado" value="#{municipioISSBean.dtoIncluir.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{municipioISSBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{municipioISSBean.dtoIncluir.codMunicipio}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{municipioISSBean.dtoIncluir.descMunicipios}"/>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_banco}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_agencia}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="5" maxlength="3" id="txtBanco" value="#{municipioISSBean.dtoIncluir.banco}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtBanco',numeros);"/>  
		</br:brPanelGroup>		
						
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
    		<br:brInputText size="7" maxlength="5" id="agencia" value="#{municipioISSBean.dtoIncluir.agencia}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:agencia',numeros);"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
    		<br:brInputText size="17" maxlength="13" id="conta" value="#{municipioISSBean.dtoIncluir.conta}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:conta',numeros);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_cnpj}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_origem}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_aliquota_padrao}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="23" maxlength="18" id="cnpj" value="#{municipioISSBean.dtoIncluir.cnpj}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:cnpj',numeros);"/>
		</br:brPanelGroup>
								
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
	    	<br:brInputText size="7" maxlength="4" id="origem" value="#{municipioISSBean.dtoIncluir.origem}" />  
		</br:brPanelGroup>
		 
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
	    <br:brPanelGroup>	
	    	<br:brInputText size="4" maxlength="2" id="aliquota" value="#{municipioISSBean.dtoIncluir.aliquotaPadrao}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:aliquota',numeros);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_dia_recolhimento}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_indicador_dia_util}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_regra_dia_nao_util}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="4" maxlength="2" id="diaRec" value="#{municipioISSBean.dtoIncluir.diaRecolhimento}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:diaRec',numeros);"/>
		</br:brPanelGroup>
								
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
	    	<t:selectOneRadio id="tipoPesquisa" value="#{municipioISSBean.dtoIncluir.indicadorDiaUtil}"
				 	styleClass="HtmlSelectOneRadioBradesco" >  
					<f:selectItem value="1" itemValue="1" itemLabel="Sim" />
					<f:selectItem value="2" itemValue="2" itemLabel="Não" />
			</t:selectOneRadio>
		</br:brPanelGroup>
		 
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
	    <br:brPanelGroup>	
	    	<br:brInputText size="20" maxlength="15" id="regra" value="#{municipioISSBean.dtoIncluir.regrasDiaNaoUtil}"/>  
		</br:brPanelGroup>
	</br:brPanelGrid>
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_limpar_campos_tipo_servico}" action="#{municipioISSBean.limparDados}" style="margin-right:5px">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			
			<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco" onclick="	
								if(!confirm('Deseja incluir o registro?')){
									setHiddenProssegue(document.forms[1],false);
								}else{
									setHiddenProssegue(document.forms[1],true);
							    };"
				  value="#{msgs.label_botao_incluir_tipo_servico}" action="#{municipioISSBean.incluirCodMunicipio}" >
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
