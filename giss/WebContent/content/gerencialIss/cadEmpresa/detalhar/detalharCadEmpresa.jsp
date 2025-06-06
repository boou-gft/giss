R<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="incluirCodLancamentoForm" name="incluirCodLancamentoForm" >
<h:inputHidden id="hiddenProsseguir" value="#{empresaISSBean.hiddenProsseguir}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_iss_gerencial_informacao_empresa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_codigo_empresa}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.codEmpresa}" />
			</br:brPanelGroup>	
			
			
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_cnpj_empresa}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.cnpjFormatado}" />
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_descricao_empresa}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.descEmpresa}" />
			</br:brPanelGroup>	
		</br:brPanelGrid>
			
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
	    </br:brPanelGrid>
			
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_percentual_rejeicao_arquivo}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.perRejeicaoArquivo}" />
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
				
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="Sistema Contábil: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.descSistemaContabil}" />
		    </br:brPanelGroup>
	
		</br:brPanelGrid>	
			
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
	    </br:brPanelGrid>
	        
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" > 
		 	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_conta_despesa}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.contaDespesa}" />
			</br:brPanelGroup>	
			
		  	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_conta_provisao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.contaProvisao}" />
			</br:brPanelGroup>	
			
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
	    </br:brPanelGrid>
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" > 
		 	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_ident_contribuinte}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.codigoContribuinte}" />
			</br:brPanelGroup>	
			
		  	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_nome_contato}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.nomeResponsavel}" />
			</br:brPanelGroup>	
			
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
	    </br:brPanelGrid>
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" > 
		 	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_telefone}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.telResponsavel}" />
			</br:brPanelGroup>	
			
		  	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_email}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.emailResponsavel}" />
			</br:brPanelGroup>	
			
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
	    </br:brPanelGrid>
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" > 
		 	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_logradouro}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.logradouro}" />
			</br:brPanelGroup>	
			
		  	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_nro_endereco}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.nroEndereco}" />
			</br:brPanelGroup>	
			
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
	    </br:brPanelGrid>
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" > 
		 	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_complemento}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.complEndereco}" />
			</br:brPanelGroup>	
			
		  	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_cep}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.cep}" />
			</br:brPanelGroup>	
			
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
	    </br:brPanelGrid>
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" > 
		 	<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="Bairro: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.bairro}" />
			</br:brPanelGroup>	
			
		  	<br:brPanelGroup>
			</br:brPanelGroup>	
			
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
	    </br:brPanelGrid>
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_label_estado}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.dtoAlterar.descEstado}" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.geral_codigo_municipio_ibge}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.buscaMunicipio.codigo}" />
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.geral_municipio}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{empresaISSBean.buscaMunicipio.descricao}" />
			</br:brPanelGroup>	
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
	    </br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="false" forceIdIndex="false" immediate="false" value="#{empresaISSBean.codigosSelecionadosTabelaContas}" >
			<f:selectItems value="#{empresaISSBean.selectItemContas}" />
		</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll; height:275;display:block">
					
		<t:dataTable id="dataTable" value="#{empresaISSBean.dtoAlterar.contas.listaContas}" var="result"  rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">	
			  <t:column width="60px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_conta_resumo}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.contaResumo}"  style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  
			    <t:column width="100px" >
			    <f:facet name="header">
			      <h:outputText value="COSIF" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.cosifExibicao}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			    
			  <t:column width="340px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="Conta Receita" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descContaReceita}"  style="margin-right:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="225px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_item_servico}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descItemServicoLC} " style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
			</t:div>	
	</br:brPanelGrid>		

	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:550px"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" action="#{empresaISSBean.inicializarManter}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:100px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
				<br:brCommandButton id="btnPlanilha"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.manter_dependencia_municipio_prosseguir_btn_planilha_eletronica}"
					actionListener="#{empresaISSBean.imprimirPlanilha}"
					onclick="desbloqTela();">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		
	</br:brPanelGrid>
	
</br:brPanelGrid>
<br:brCommandButton style="visibility: hidden" id="botaoCombo" action="#{empresaISSBean.atualizaComboItemServicoAlterar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>

<brArq:validatorScript functionName="validateForm"/>
<f:verbatim>
<script>
function clicarBotao(){
	document.getElementById('incluirCodLancamentoForm:botaoCombo').click();
}
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
