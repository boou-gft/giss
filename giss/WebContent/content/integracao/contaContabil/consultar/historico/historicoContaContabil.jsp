<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="historicoContaContabilForm"
	name="historicoContaContabilForm">
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0"
			cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					value="#{msgs.historico_conta_contabil_periodo}:" />
			</br:brPanelGroup>

			<br:brPanelGroup style="width: 400px">
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					style="margin-right:5px"
					value="#{msgs.historico_conta_contabil_label_de}" />
				<app:calendar id="calendarioDe"
					value="#{contaContabilBean.dto.dataInicial}">
					<brArq:commonsValidator type="required"
						message="#{msgs.error_data_inicio_message}"
						arg="#{msgs.error_data_inicio_message}" server="false"
						client="true" />
				</app:calendar>
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco"
					style="margin-right:5px;margin-left:5px"
					value="#{msgs.historico_conta_contabil_label_ate}" />
				<app:calendar id="calendarioAte"
					value="#{contaContabilBean.dto.dataFinal}">
					<brArq:commonsValidator type="required"
						message="#{msgs.error_data_fim_message}"
						arg="#{msgs.error_data_fim_message}" server="false"
						client="true" />
				</app:calendar>
			</br:brPanelGroup>

		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
		
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
		
		
		<br:brPanelGroup>
			<br:brSelectOneMenu style="width:150px;cursor:hand;" id="listaCosif" value="#{contaContabilBean.dto.cosif}">
				<f:selectItem itemValue="" itemLabel="#{msgs.mantercontacontabil_selecione}"/>
				<f:selectItems value="#{contaContabilBean.selectItemCosif}"/>
				<a4j:support reRender="listaRazao" event="onchange" action="#{contaContabilBean.carregarComboRazao}" oncomplete="desbloquearTela()"/>
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
		
	</br:brPanelGrid>


		<f:verbatim>
			<hr class="lin">
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" style="text-align:right"
			cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brCommandButton id="btnLimparDados"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.historico_conta_contabil_limpar}"
					action="#{contaContabilBean.limparDadosHistorico}"
					style="margin-right:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
				<br:brCommandButton id="btnProsseguir"
					onclick="validacao.validarPreenchimentoCampos(this);"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.historico_conta_contabil_prosseguir}"
					actionListener="#{contaContabilBean.carregaListaContasContabeisHistorico}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<f:verbatim>
			<br>
		</f:verbatim>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0"
			cellspacing="0" rendered="#{contaContabilBean.carregaContas}">
			<br:brPanelGroup style="width:750px">
					<t:dataTable id="dataTable"
						value="#{contaContabilBean.dto.listaContasContabeis}" var="result"
						rows="50" cellspacing="1" cellpadding="0"
						rowClasses="tabela_celula_normal, tabela_celula_destaque"
						headerClass="tabela_celula_destaque_acentuado">
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
						<t:column width="100px" style="padding-right:5px; padding-left:8px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.historico_conta_contabil_grid_servico}" />
							</f:facet>
							<br:brOutputText value="#{result.tipoServico}" />
						</t:column>
						<t:column width="100px" style="padding-right:5px; padding-left:8px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.historico_conta_contabil_grid_item}" />
							</f:facet>
							<br:brOutputText value="#{result.item}" />
						</t:column>
						<t:column width="100px" style="padding-right:5px; padding-left:8px">
							<f:facet name="header">
								<br:brOutputText style="padding-left:10px"
									value="#{msgs.historico_conta_contabil_grid_atualizacao}" />
							</f:facet>
							<br:brOutputText value="#{result.atualizacao}" />
						</t:column>
						<t:column width="100px" style="padding-right:5px; padding-left:8px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.historico_conta_contabil_grid_horaAlteracao}" />
							</f:facet>
							<br:brOutputText value="#{result.horaAtualizacao}" />
						</t:column>
						<t:column width="100px" style="padding-right:5px; padding-left:8px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.historico_conta_contabil_grid_exclusao}" />
							</f:facet>
							<br:brOutputText value="#{result.exclusao}" />
						</t:column>
						<t:column width="100px" style="padding-right:5px; padding-left:8px">
							<f:facet name="header">
								<br:brOutputText
									value="#{msgs.label_cod_funcional}" />
							</f:facet>
							<br:brOutputText value="#{result.codigoFuncional}" />
						</t:column>
					</t:dataTable>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" style="text-align:center"
			cellpadding="0" cellspacing="0"
			rendered="#{contaContabilBean.carregaContas}">
			<br:brPanelGroup>
				<brArq:pdcDataScroller id="dataScroller" for="dataTable"
					actionListener="#{contaContabilBean.paginarPesquisaHistorico}"
					rendered="#{contaContabilBean.dto.listaContasContabeis != null && contaContabilBean.mostraBotoes}">
					<f:facet name="previous">
						<brArq:pdcCommandButton id="anterior"
							styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
							value="#{msgs.label_anterior}" title="#{msgs.label_anterior}" />
					</f:facet>
					<f:facet name="next">
						<brArq:pdcCommandButton id="proxima"
							styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
							value="#{msgs.label_proxima}" title="#{msgs.label_proxima}" />
					</f:facet>
				</brArq:pdcDataScroller>
			</br:brPanelGroup>
			<f:verbatim>
				<hr class="lin">
			</f:verbatim>
		</br:brPanelGrid>

		<br:brPanelGrid columns="2" width="200px;" cellpadding="0" cellspacing="0" rendered="#{contaContabilBean.carregaContas}">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.historico_conta_contabil_voltar}"
					action="#{contaContabilBean.inicializaHistorico}">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

			<br:brPanelGroup>
				<br:brCommandButton id="btnExportarExcel"
					  styleClass="HtmlCommandButtonBradesco"
					  value="#{msgs.btn_exportar_planilha_eletronica}"
					  action="#{contaContabilBean.imprimirPlanilhaEletronicaHistorico}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>

	</br:brPanelGrid>
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>
<a4j:status id="statusAguarde" onstart="bloquearTela()" onstop="desbloquearTela()" />
<f:verbatim>
	<script language="javascript">


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
	
	var validacao = {
			validarPreenchimentoCampos:function(btn){
				var form = document.getElementById('historicoContaContabilForm');
			
				if(!validateRequired(form)){
					enableCommand(btn);
					return false;
				} else if (validacao.validarDatas()) {
					enableCommand(btn);
					return false;
				}
			},
			validarDatas : function() {
				
				var diaValidadeDe = document.getElementById("historicoContaContabilForm:calendarioDe.day").value;
				var mesValidadeDe = document.getElementById("historicoContaContabilForm:calendarioDe.month").value;
				var anoValidadeDe = document.getElementById("historicoContaContabilForm:calendarioDe.year").value;

				var diaValidadeAte = document.getElementById("historicoContaContabilForm:calendarioAte.day").value;
				var mesValidadeAte = document.getElementById("historicoContaContabilForm:calendarioAte.month").value;
				var anoValidadeAte = document.getElementById("historicoContaContabilForm:calendarioAte.year").value;
				
				var dataInicioFormatada = document.getElementById("historicoContaContabilForm:calendarioDe").innerHTML;
				
				var diaInicio = dataInicioFormatada.split("/")[0];
				var mesInicio = dataInicioFormatada.split("/")[1];
				var anoInicio = dataInicioFormatada.split("/")[2];
				
				var dataInicio = new Date(anoInicio + "/" + mesInicio + "/" + diaInicio);
				var dataValidade = new Date(anoValidadeDe + "/" + mesValidadeDe + "/" + diaValidadeDe);

				if(diaValidadeDe == '' || mesValidadeDe == '' || anoValidadeDe == ''){
					alert(replaceAscii("A data de Validade deve ser informada completa!"));
					return true;
				}
				if(diaValidadeAte == '' || mesValidadeAte == '' || anoValidadeAte == ''){
					alert(replaceAscii("A data de Validade deve ser informada completa!"));
					return true;
				}
				return false;
			}
		};	
		
		
		 
   
</script>
</f:verbatim>