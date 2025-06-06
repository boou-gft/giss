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

<brArq:form id="incluirPercentualTransicaoForm" name="incluirPercentualTransicaoForm" >
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"/>
	
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
	  
	  	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" width="100%">
		    <br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_data_inicio_vigencia}:" />	
			</br:brPanelGroup>	
			<br:brPanelGroup>
				<app:calendar id="txtDataVigenciaInicio" value="#{parametrizarPercentualTransicaoBean.dto.dataInicioVigencia}" >
					<brArq:commonsValidator type="required" arg="#{msgs.label_data_inicio_vigencia}" server="false" client="true"/>
				</app:calendar> 	
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_data_fim_vigencia}:" />	
			</br:brPanelGroup>	
			<br:brPanelGroup>
				<app:calendar id="txtDataVigenciaFim" value="#{parametrizarPercentualTransicaoBean.dto.dataFimVigencia}" >
					<brArq:commonsValidator type="required" arg="#{msgs.label_data_fim_vigencia}" server="false" client="true"/>
				</app:calendar> 	
			</br:brPanelGroup>
	
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_percentual_municipio_prestador}:" />	
			</br:brPanelGroup>	
			<br:brPanelGroup>
				<br:brInputText size="20" maxlength="6" id="txtPercentualMunicipioPrestador" value="#{parametrizarPercentualTransicaoBean.dto.percentualMunicipioPrestador}" onblur="vNumero(this,'9(3)V99')">
					<brArq:commonsValidator type="required" arg="#{msgs.label_percentual_municipio_prestador}" server="false" client="true"/>
				</br:brInputText> 	
			</br:brPanelGroup>	
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_percentual_municipio_tomador}:" />	
			</br:brPanelGroup>	
			<br:brPanelGroup>
				<br:brInputText size="20" maxlength="6" id="txtPercentualMunicipioTomador" value="#{parametrizarPercentualTransicaoBean.dto.percentualMunicipioTomador}" onblur="vNumero(this,'9(3)V99')">
					<brArq:commonsValidator type="required" arg="#{msgs.label_percentual_municipio_tomador}" server="false" client="true"/>
				</br:brInputText>	
			</br:brPanelGroup>	
		</br:brPanelGrid>
		
		<f:verbatim><hr class="lin"> </f:verbatim>
	  
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" style="float:left" action="#{parametrizarPercentualTransicaoBean.voltar}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_incluir}" action="#{parametrizarPercentualTransicaoBean.incluir}" style="float:right"
									onclick="validacao.validarCampos(this);" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
	  
	</br:brPanelGrid>
	<brArq:validatorScript functionName="validateForm"/>
	
	<f:verbatim>
		<script>
			var validacao = {
					validarCampos:function(btn){
				
					if(!validateForm(document.forms[1])){
						enableCommand(btn);
						return false;
					} else if (validacao.validarCamposNegocio()) {
						enableCommand(btn);
						return false;
					}
				},
				validarCamposNegocio : function() {
					var txtDataVigenciaInicio = document.getElementById("incluirPercentualTransicaoForm:txtDataVigenciaInicio");
					var txtDataVigenciaFim = document.getElementById("incluirPercentualTransicaoForm:txtDataVigenciaFim");
					var txtPercentualMunicipioPrestador = document.getElementById("incluirPercentualTransicaoForm:txtPercentualMunicipioPrestador");
					var txtPercentualMunicipioTomador = document.getElementById("incluirPercentualTransicaoForm:txtPercentualMunicipioTomador");
		
					var dataInicial = parseInt(txtDataVigenciaInicio.value.replace(/[^0-9]/g, ''));
					var dataFinal = parseInt(txtDataVigenciaFim.value.replace(/[^0-9]/g, ''));
					
					var percentualPrestador = parseFloat(txtPercentualMunicipioPrestador.value.replace(",", "."));
					var percentualTomador = parseFloat(txtPercentualMunicipioTomador.value.replace(",", "."));
					
					// validar data inicial maior data final
					if (dataInicial > dataFinal) {
						alert("${msgs.msg_erro_data_final_maior_data_inicial}");
						return true;
					}
					
					// validar soma percentual > 100%
					if ((parseFloat(percentualPrestador + percentualTomador)) != parseFloat(100.00)) {
						alert("${msgs.msg_erro_soma_percentuais_maior_cem}");
						return true;
					}
					
					return false;
				}
			};
		</script>
	</f:verbatim>
</brArq:form>
