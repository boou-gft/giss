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
	
	<br:brPanelGrid columns="7" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio_ibge}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>
				
        <br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>

        <br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>

		<br:brInputText id="descEstado" maxlength="5" size="25" value="#{municipioISSBean.dtoAlterar.estado}" onkeypress="return validaTecla('0123456789', event);"  disabled="true"/>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
	
		<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="15" value="#{municipioISSBean.dtoAlterar.codMunicipio}" onkeypress="return validaTecla('0123456789', event);"  disabled="true"/>

		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brInputText id="inputMunicipio" maxlength="70" size="40" value="#{municipioISSBean.dtoAlterar.descMunicipios}" disabled="true"/>
		
	    <br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
	
	    <br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_banco}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_agencia}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_cnpj}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="5" maxlength="3" id="txtBanco" value="#{municipioISSBean.dtoAlterar.banco}" disabled="true" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtBanco',numeros);"/>  
		</br:brPanelGroup>		
								
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="7" maxlength="5" id="agencia" value="#{municipioISSBean.dtoAlterar.agencia}" disabled="true" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:agencia',numeros);"/>
		</br:brPanelGroup>
				
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="17" maxlength="13" id="conta" value="#{municipioISSBean.dtoAlterar.conta}" disabled="true" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:conta',numeros);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="23" maxlength="18" id="cnpj" value="#{municipioISSBean.dtoAlterar.cnpjFormatado}" disabled="true" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:cnpj',numeros);"/>
		</br:brPanelGroup>
								
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_aliquota_padrao}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_dia_recolhimento}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_indicador_dia_util}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
				
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_regra_dia_nao_util}:"/>
		</br:brPanelGroup>
		
		
		<br:brPanelGroup>
			<br:brInputText id="aliquota" maxlength="4" size="8" value="#{municipioISSBean.dtoAlterar.aliquotaPadrao}" onblur="vNumero(this,'9(1)V99')"/> 
		</br:brPanelGroup>		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>	
	    	<br:brInputText size="4" maxlength="2" id="diaRec" value="#{municipioISSBean.dtoAlterar.diaRecolhimento}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:diaRec',numeros);"/>  
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>
	    	<t:selectOneRadio id="tipoPesquisa" value="#{municipioISSBean.dtoAlterar.indicadorDiaUtil}"
				 	styleClass="HtmlSelectOneRadioBradesco" >  
					<f:selectItem value="S" itemValue="S" itemLabel="Sim" />
					<f:selectItem value="N" itemValue="N" itemLabel="Não" />
			</t:selectOneRadio>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:10px; margin-bottom:5px" >
		</br:brPanelGroup>
		
		<br:brPanelGroup>	
	    	<t:selectOneRadio id="regraDiaNaoUtil" value="#{municipioISSBean.dtoAlterar.regrasDiaNaoUtil}"
				 	styleClass="HtmlSelectOneRadioBradesco" >  
					<f:selectItem value="A" itemValue="A" itemLabel="Antecipar" />
					<f:selectItem value="P" itemValue="P" itemLabel="Postergar" />
			</t:selectOneRadio>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Elegível para Pagamento?:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>	
	    	<t:selectOneRadio id="elegivelPagamento" value="#{municipioISSBean.dtoAlterar.elegivelPagamento}"
				 	styleClass="HtmlSelectOneRadioBradesco" >  
					<f:selectItem value="S" itemValue="S" itemLabel="Sim" />
					<f:selectItem value="N" itemValue="N" itemLabel="Não" />
			</t:selectOneRadio>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" action="manterMunicipio" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup style="text-align:right;width:200px" >
			<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco" onclick="	
								if(!confirm('Deseja Alterar o Municipio?')){
									setHiddenProssegue(document.forms[1],false);
								}else{
									setHiddenProssegue(document.forms[1],true);
							    };"
				  value="#{msgs.label_botao_alterar_tipo_servico}" action="#{municipioISSBean.alterar}" >
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
