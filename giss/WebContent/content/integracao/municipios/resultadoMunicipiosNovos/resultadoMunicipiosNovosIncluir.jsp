<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="resultadoMunicipiosNovos" name="resultadoMunicipiosNovos" >
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1"   >
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultado_municipios_novos_incluir_informacoes_municipio}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid> 

		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_codigo}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.codigo}" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_nome}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.nome}" />
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_uf}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.uf}" />
			</br:brPanelGroup>			
		</br:brPanelGrid>
	
		<f:verbatim><hr class="lin"> </f:verbatim> 	

		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1"   >
			<br:brPanelGroup>
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultado_municipios_novos_incluir_informacoes_apuracao}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
	
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>	
	
		<br:brPanelGrid columns="6" cellpadding="0" cellspacing="0" >		
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_vencimento}: " />
			</br:brPanelGroup>	
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 3px;" />
			    <br:brInputText value="#{resultMunicNovoBean.vencimento}" size="3" maxlength="2" id="vencimento" onkeyup="aplicamascara('resultadoMunicipiosNovos', 'resultadoMunicipiosNovos:vencimento',numeros);">  
			    	<brArq:commonsValidator type="integer"  arg="#{msgs.resultado_municipios_novos_incluir_vencimento}" server="false" client="true" /> 
				   	<brArq:commonsValidator type="required" arg="#{msgs.resultado_municipios_novos_incluir_vencimento}" server="false" client="true"/>
				   	<brArq:commonsValidator type="intRange" min="1" max="31" arg="#{msgs.resultado_municipios_novos_incluir_vencimento}" server="false" client="true"/>
			    </br:brInputText>					    	
			</br:brPanelGroup>	
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_pagto_dia_util}?: " />
			</br:brPanelGroup>	
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 3px;" />
				<br:brSelectOneMenu style="60px" id="pagtoDiaUtil" value="#{resultMunicNovoBean.pagtoDiaUtil}">
				<f:selectItem itemValue="" itemLabel="#{msgs.resultado_municipios_novos_incluir_comboSelecione}"/>
					<f:selectItem itemValue="1" itemLabel="#{msgs.resultado_municipios_novos_incluir_sim}"/>
					<f:selectItem itemValue="2" itemLabel="#{msgs.resultado_municipios_novos_incluir_nao}"/>
				   		<brArq:commonsValidator type="required" arg="#{msgs.resultado_municipios_novos_incluir_pagto_dia_util}" server="false" client="true"/>
				</br:brSelectOneMenu>		
			</br:brPanelGroup>	
			<br:brPanelGroup>
			<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_forma_pagamento}: " />
			</br:brPanelGroup>	
		
			<br:brPanelGroup>
				<br:brPanelGroup style="width: 3px;" />
				 <br:brSelectOneMenu style="width:100px" id="formaPagamento" value="#{resultMunicNovoBean.formaPagamento}">	
				 	<f:selectItem itemValue="" itemLabel="#{msgs.resultado_municipios_novos_incluir_comboSelecione}"/>
					<f:selectItem itemValue="1" itemLabel="#{msgs.resultado_municipios_novos_incluir_antecipa}"/>
					<f:selectItem itemValue="2" itemLabel="#{msgs.resultado_municipios_novos_incluir_prorroga}"/>
				    	<brArq:commonsValidator type="required" arg="#{msgs.resultado_municipios_novos_incluir_forma_pagamento}" server="false" client="true"/>
				</br:brSelectOneMenu>	
			</br:brPanelGroup>	
	</br:brPanelGrid>
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1"   >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.resultado_municipios_novos_incluir_parametros_recolhimento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1"   >
		<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_base_calculo}: " />
			
				<br:brPanelGroup style="width: 3px;" />
			   	<br:brInputText value="#{resultMunicNovoBean.baseCalculo}" size="6" maxlength="5" id="baseCalculo">  
			   		<brArq:commonsValidator type="float" arg="#{msgs.resultado_municipios_novos_incluir_base_calculo}" server="false" client="true"/>
					<brArq:commonsValidator type="floatRange" min="1" max="100" arg="#{msgs.resultado_municipios_novos_incluir_base_calculo}" server="false" client="true"/>
			    </br:brInputText>				    				    	
				
				<br:brPanelGroup style="width: 3px;" />
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="%" />

				<br:brPanelGroup style="width: 20px;" />
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_aliquota_padrao}: " />
				
				<br:brPanelGroup style="width: 3px;" />
				<br:brInputText value="#{resultMunicNovoBean.aliquotaPadrao}" size="6" maxlength="5" id="aliquotaPadrao">  
					<brArq:commonsValidator type="float" arg="#{msgs.resultado_municipios_novos_incluir_aliquota_padrao}" server="false" client="true"/>
					<brArq:commonsValidator type="floatRange" min="1" max="100" arg="#{msgs.resultado_municipios_novos_incluir_aliquota_padrao}" server="false" client="true"/>
			   	</br:brInputText>				    				    
				
				<br:brPanelGroup style="width: 3px;" />
		    	<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="%" />
		    	
		    	<br:brPanelGroup style="width: 20px;" />
		    	<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_tipo_incidencia}: " />
		
				<br:brSelectOneMenu id="tipoIncidencia" value="#{resultMunicNovoBean.tipoIncidencia}">
				<f:selectItem itemValue="" itemLabel="#{msgs.resultado_municipios_novos_incluir_comboSelecione}"/>
					<f:selectItems value="#{resultMunicNovoBean.listaTipoIncidencia}"/>
				   		<brArq:commonsValidator type="required" arg="#{msgs.resultado_municipios_novos_incluir_tipo_incidencia}" server="false" client="true"/>
				</br:brSelectOneMenu>
				
				<br:brPanelGroup style="width: 20px;" />				
				
				<br:brPanelGroup>
			    	<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_razao}: " />
					<br:brCommandButton image="/images/lupa.gif" id="btnPesquisarMunicipio2"  styleClass="HtmlCommandButtonBradesco"  value="#{msgs.resultadoDependenciasNovasAgencia_pesquisar}" action="#{resultMunicNovoBean.carregaPesquisaListaContas}">
						<brArq:submitCheckClient/>
					</br:brCommandButton>
				</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px;">
		</br:brPanelGroup>
		
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.path_resultado_municipios_novos_responsavel_recolhimento}: "/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="7" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_empresa}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_dependencia}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		
		<br:brSelectOneMenu id="empresa" value="#{resultMunicNovoBean.indiceComboEmpresaIncorpora}">
			<f:selectItems value="#{resultMunicNovoBean.listaEmpresa}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputDependencia" maxlength="5" size="10" value="#{resultMunicNovoBean.codDepIncorpora}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton image="/images/lupa.gif" id="buttonBuscar" action="#{resultMunicNovoBean.carregarDependenciaIncorporaDepNova}">
			<brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputDepend" size="45" disabled="true" value="#{resultMunicNovoBean.descDepIncorpora}" />
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>		
		<br:brPanelGroup style="text-align:right;width:90px" >
			<br:brCommandButton id="btnLocDep"   styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultadoDependenciasNovasInformacoes_locDependencia}" action="#{resultMunicNovoBean.localizarDependenciaManter}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim> 	
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="align:left" value="#{msgs.resultado_municipios_novos_incluir_btn_voltar}" 
					 action="resultadoMunicipiosNovos" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="margin-left:525px">
		</br:brPanelGroup>		
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultado_municipios_novos_incluir_btn_limpar_campos}" 
						action="#{resultMunicNovoBean.limparCamposIncluir}"  >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnProsseguir" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" 
					value="#{msgs.resultado_municipios_novos_incluir_btn_finalizar}" action="#{resultMunicNovoBean.finalizarAntes}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<brArq:validatorScript functionName="validateForm"/>
	</br:brPanelGrid>
</brArq:form>
