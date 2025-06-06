	<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
	<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
	<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
	<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
	<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
	<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
	<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
	<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
	
	<brArq:form id="tarifasCobradasForm" name="tarifasCobradasForm" >
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	 
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		  <br:brPanelGroup> 
			</br:brPanelGroup>
	  	</br:brPanelGrid>	 
	  	
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio}:" />
			</br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:" />
			</br:brPanelGroup>
			<br:brSelectOneMenu style="width:180px" id="estado" value="#{tarifasCobradasBean.estadoFiltro}" >
				<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{tarifasCobradasBean.listaEstados}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" 
				onkeypress="return validaTecla('0123456789', event)" value="#{tarifasCobradasBean.buscaMunicipio.codigo}" />
			<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{tarifasCobradasBean.buscaMunicipio}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{tarifasCobradasBean.buscaMunicipio.descricao}" />
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0" >		
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
				<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px" value="#{msgs.label_juncao_agencia_relacionamento}:"/>
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:35px"/>
				<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px" value="#{msgs.label_codigo_pa}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGrid columns="1" style="margin-top:5px" cellpadding="0" cellspacing="0" >		 
				<br:brPanelGroup>
				<br:brInputText maxlength="6" size="20" onfocus="loadMasks()" id="txtAgencia"
					onkeypress="return validaTecla('0123456789', event)" value="#{tarifasCobradasBean.juncaoAgencia}" />
				</br:brPanelGroup>
			</br:brPanelGrid>
			<br:brPanelGrid columns="1" id="txtPa" style="margin-top:5px;margin-left:35px" cellpadding="0" cellspacing="0" >		 
				<br:brPanelGroup>
				<br:brInputText maxlength="6" size="20" onfocus="loadMasks()" 
					onkeypress="return validaTecla('0123456789', event)" value="#{tarifasCobradasBean.codigoPa}" />
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
			
		<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >		
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Período:"/>
			</br:brPanelGroup>
			<br:brPanelGroup>
			 		<app:calendar  id="calendarioDe" value="#{tarifasCobradasBean.calendarioDe}" >	
				 		<brArq:commonsValidator type="required" message="#{msgs.error_data_inicio_message}"  arg="#{msgs.error_data_inicio_message}" server="false" client="true"/>
			 		</app:calendar>
				<br:brOutputText  styleClass="HtmlOutputTextRotuloBradesco" style="margin-right:5px;margin-left:5px" value="#{msgs.dependencias_encerradas_referencia_ate}"/>
					<app:calendar  id="calendarioAte"  value="#{tarifasCobradasBean.calendarioAte}">
						<brArq:commonsValidator type="required" message="#{msgs.error_data_fim_message}"  arg="#{msgs.error_data_fim_message}" server="false" client="true"/>
				 	</app:calendar>
			</br:brPanelGroup>		
	
			<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
				 
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
				<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco"  style="margin-right:5px;margin-left:5px" value="#{msgs.label_apresenta_dados_cliente}:"/>
			</br:brPanelGroup>
			<br:brPanelGroup >
				<t:selectOneRadio id="radioNomeCliente" value="#{tarifasCobradasBean.codigoSelecionado}"
				 	styleClass="HtmlSelectOneRadioBradesco">  
				 	<f:selectItem value="0" itemValue="0" itemLabel="NÃO" />
					<f:selectItem value="1" itemValue="1" itemLabel="SIM" />
				</t:selectOneRadio>
			</br:brPanelGroup>
			
			<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>
		
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
				<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco"  style="margin-right:5px;margin-left:5px" value="#{msgs.label_consolidado}:"/>
				<t:selectBooleanCheckbox id="consolidado" style="margin-left:30px" value="#{tarifasCobradasBean.consolidado}" styleClass="HtmlSelectBooleanCheckboxBradesco" />
			</br:brPanelGroup>
			<br:brPanelGroup >
				
			</br:brPanelGroup>
			
						<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0"
				cellspacing="0">
				<br:brPanelGroup>
				</br:brPanelGroup>
			</br:brPanelGrid>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"
					style="margin-right:5px;margin-left:5px"
					value="#{msgs.label_tipo_relatorio}:" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<t:selectOneRadio id="radioTipoRelatorio"
					value="#{tarifasCobradasBean.codigoTipoRelatorio}"
					styleClass="HtmlSelectOneRadioBradesco">
					<f:selectItem value="0" itemValue="0" itemLabel="Analítico" />
					<f:selectItem value="1" itemValue="1" itemLabel="Sintético" />
				</t:selectOneRadio>
			</br:brPanelGroup>			
			
		</br:brPanelGrid>	
		
		<br:brPanelGroup>
				<f:verbatim><hr class="lin"> </f:verbatim>
			</br:brPanelGroup>
			
		<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
				<br:brPanelGroup style="text-align:left;width:150px">
					<br:brCommandButton id="botao_voltar"
							styleClass="HtmlCommandButtonBradesco"
							value="#{msgs.botao_voltar}" action="nav_index"
							onclick="desbloqTela();" style="margin-left:5px">
							<brArq:submitCheckClient />
						</br:brCommandButton>
				</br:brPanelGroup>	
				
				<br:brPanelGrid columns="1" style="width:500px" cellpadding="0" cellspacing="0" >
					<br:brPanelGroup> 
					</br:brPanelGroup>
				</br:brPanelGrid>
					
				<br:brPanelGroup style="text-align:right;width:100%" >
					<br:brPanelGrid columns="1">
						<br:brCommandButton id="gerarRelatorioEos"
						styleClass="HtmlCommandButtonBradesco" action="#{tarifasCobradasBean.gerarRelarorioEos}"
						value="#{msgs.manter_dependencia_municipio_prosseguir_btn_relatorio_eos}"
						onclick="desbloqTela();" style="margin-left:5px">
						<brArq:submitCheckClient />
					</br:brCommandButton>
						
					</br:brPanelGrid>
				</br:brPanelGroup>
			</br:brPanelGrid>	
			
	</br:brPanelGrid>		
	  
	 <f:verbatim> 
		
	<script language="javascript">
		
	
	</script> 
	</f:verbatim> 
	  
	<brArq:validatorScript functionName="validateForm"/>
	</brArq:form>
	
	<t:aliasBeansScope>
		<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{tarifasCobradasBean.buscaMunicipio}" />
		<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
	</t:aliasBeansScope>
