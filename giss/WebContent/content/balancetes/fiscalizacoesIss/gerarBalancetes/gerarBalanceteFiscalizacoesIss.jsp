<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="gerarBalanceteFiscalizacoesIssForm" name="gerarBalanceteFiscalizacoesIssForm">

<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<t:selectOneRadio id="fechadoSimulado" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.fechadoSimulado}"
	 	styleClass="HtmlSelectOneRadioBradesco" layout="spread" forceId="true" forceIdIndex="false">  
		<f:selectItem itemValue="1" itemLabel="" />
		<f:selectItem itemValue="2" itemLabel="" />
	</t:selectOneRadio>

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"></f:verbatim>	
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_informacoes_processamento}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:20px" cellpadding="0" cellspacing="0">
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_empresa}:" />
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brSelectOneMenu id="empresa" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.empresa}">
				<f:selectItem itemValue="" itemLabel="#{msgs.gerar_balancete_fiscalizacoes_iss_label_selecione}"/>
				<f:selectItems value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.listarEmpresasBalancetes}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
		<br:brPanelGroup style="width:200px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_estado}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_codigo_municipio}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_municipio}:" />
		</br:brPanelGroup>

		<br:brPanelGroup style="width:200px">
			<br:brSelectOneMenu id="estado" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.estado}" onchange="carregarMunicipiosBalancetes();"> 
				<f:selectItem itemValue="" itemLabel="#{msgs.gerar_balancete_fiscalizacoes_iss_label_selecione}"/>
				<f:selectItems value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.listarEstadosBalancetes}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:200px">
			<br:brInputText id="codMunicipio" maxlength="10" size="12" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.codMunicipio}" onkeypress="return validaTecla('0123456789', event);" onchange="carregarMunicipioBalancetes();" disabled="#{gerarBalanceteFiscalizacoesIssBean.habilitarCodMunicipio}"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brSelectOneMenu id="municipio" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.municipio}" onchange="carregarCodMunicipio();" disabled="#{gerarBalanceteFiscalizacoesIssBean.habilitarCodMunicipio}">
				<f:selectItem itemValue="" itemLabel="#{msgs.gerar_balancete_fiscalizacoes_iss_label_selecione}"/>
				<f:selectItems value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.listarMunicipiosBalancetes}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0">
		<br:brPanelGroup style="width:295px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:180px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_dependencia}:" />
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:180px">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_fechado}:" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_simulado}:" />
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_consolidado}:" />
		</br:brPanelGroup>

		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0">
			<br:brPanelGroup style="width:95px">
				<br:brInputText styleClass="HtmlInputTextBradesco" style="margin-right:5px"
			    	onkeyup="proximoCampo(2,'gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:mesInicial','gerarBalanceteFiscalizacoesIssForm:anoInicial');" 
			    	value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.periodoMesInicial}" size="3" maxlength="2" id="mesInicial" onkeypress="aplicamascara('gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:mesInicial',numeros);" onblur="validarData('gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:mesInicial', 'mes', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_dia}', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_mes}', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_ano}');">	
		    	</br:brInputText>

		    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.periodoAnoInicial}" 
			    	size="6" maxlength="4" id="anoInicial" onkeypress="aplicamascara('gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:anoInicial',numeros);" onblur="validarData('gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:anoInicial', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
		    	</br:brInputText>
		    </br:brPanelGroup>
		    
		    <br:brPanelGroup>
		    	<br:brOutputText style="font-style: bold;margin-left:5px;margin-right:7px" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_ate}:" />
		    </br:brPanelGroup>
		    
		    <br:brPanelGroup style="width:165px">	
		    	<br:brInputText styleClass="HtmlInputTextBradesco" style="margin-right:5px"
			    	onkeyup="proximoCampo(2,'gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:mesFinal','gerarBalanceteFiscalizacoesIssForm:anoFinal');" 
			    	value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.periodoMesFinal}" size="3" maxlength="2" id="mesFinal" onkeypress="aplicamascara('gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:mesFinal',numeros);" onblur="validarData('gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:mesFinal', 'mes', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_dia}', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_mes}', '#{msgs.gerar_balancete_fiscalizacoes_iss_label_periodo_ano}');">	
		    	</br:brInputText>

		    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.periodoAnoFinal}" 
			    	size="6" maxlength="4" id="anoFinal" onkeypress="aplicamascara('gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:anoFinal',numeros);" onblur="validarData('gerarBalanceteFiscalizacoesIssForm','gerarBalanceteFiscalizacoesIssForm:anoFinal', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">			  				      				      
		    	</br:brInputText>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGroup style="width:180px">
			<br:brInputText id="dependencia" maxlength="5" size="6" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.dependencia}" onkeypress="return validaTecla('0123456789', event);" onchange="limparMunicipios();"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:220px">
			<br:brPanelGroup style="margin-left:25px;margin-right:55px" id="fechado">
				<t:radio for=":gerarBalanceteFiscalizacoesIssForm:fechadoSimulado" index="0" />
			</br:brPanelGroup>

			<br:brPanelGroup id="simulado">
				<t:radio for=":gerarBalanceteFiscalizacoesIssForm:fechadoSimulado" index="1" />
			</br:brPanelGroup>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
	       <t:selectBooleanCheckbox id="consolidado" style="margin-left:30px" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.consolidado}" styleClass="HtmlSelectBooleanCheckboxBradesco" disabled="#{gerarBalanceteFiscalizacoesIssBean.habilitarConsolidado}" />
	   </br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_nivel_contas}:" />
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brSelectOneMenu id="nivelConta" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.nivelConta}">
				<f:selectItem itemValue="" itemLabel="#{msgs.gerar_balancete_fiscalizacoes_iss_label_selecione}"/>
				<f:selectItems value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.listarNivelContas}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_grupo_contas}:" />
		</br:brPanelGroup>
	
		<br:brPanelGrid columns="2" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
				<br:brOutputText style="font-style: bold;margin-right:5px" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_de}:" />
		    	<br:brInputText styleClass="HtmlInputTextBradesco" style="margin-right:5px" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.grupoContaInicial}" size="2" maxlength="1" id="grupoContaInicial" onkeypress="return validaTecla('0123456789', event);" />	
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brOutputText style="font-style: bold;margin-right:5px" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_label_ate}:" />
		    	<br:brInputText styleClass="HtmlInputTextBradesco" value="#{gerarBalanceteFiscalizacoesIssBean.gerarBalanceteFiscalizacoesIssDTO.grupoContaFinal}" size="2" maxlength="1" id="grupoContaFinal" onkeypress="return validaTecla('0123456789', event);" />	
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<f:verbatim><hr class="lin"></f:verbatim>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brCommandButton id="btnCarregarMunicipios" style="display:none;" action="#{gerarBalanceteFiscalizacoesIssBean.carregarMunicipios}">
		<brArq:submitCheckClient/>
	</br:brCommandButton>
	
	<br:brCommandButton id="btnCarregarCodMunicipio" style="display:none;" action="#{gerarBalanceteFiscalizacoesIssBean.carregarCodMunicipio}">
		<brArq:submitCheckClient/>
	</br:brCommandButton>
	
	<br:brCommandButton id="btnLimparMunicipios" style="display:none;" action="#{gerarBalanceteFiscalizacoesIssBean.limparMunicipios}">
		<brArq:submitCheckClient/>
	</br:brCommandButton>
	
	<br:brCommandButton id="btnCarregarMunicipio" style="display:none;" action="#{gerarBalanceteFiscalizacoesIssBean.carregarMunicipio}">
		<brArq:submitCheckClient/>
	</br:brCommandButton>

	<br:brPanelGrid columns="1" width="100%" style="text-align:right" cellpadding="0" cellspacing="0">
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimpar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_limpar}" action="#{gerarBalanceteFiscalizacoesIssBean.limpar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
			<br:brCommandButton id="btnExecutar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.gerar_balancete_fiscalizacoes_iss_botao_executar}" action="#{gerarBalanceteFiscalizacoesIssBean.executar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>			
		</br:brPanelGroup>				
	</br:brPanelGrid>
</br:brPanelGrid>

</brArq:form>