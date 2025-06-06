<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="resultadoMunicipiosFinalizar" name="resultadoMunicipiosFinalizar" >

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
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >	
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
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 20px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_aliquota}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.aliquotaPadrao}" />
		</br:brPanelGroup>						
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim> 
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1"   >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.path_resultado_municipios_novos_informacoesConta}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 	
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_contas_tipo_servico}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.tipoServicoFinal}" />
			
			<br:brPanelGroup style="width:20px;" />
			
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_conta}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.conta}"/>
			
			<br:brPanelGroup style="width:20px;" />
			
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_razao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.razao}"/>
		
			<br:brPanelGroup style="width:20px;" />
		
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_codigoTributo}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{resultMunicNovoBean.codigoTributoTela}" />
		</br:brPanelGroup>	
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim> 

	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1"   >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.path_resultado_municipios_novos_informacoesAliquota}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid> 
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_incluir_aliquota}: " />
	
			<br:brPanelGroup style="width:3px;" />
			<br:brInputText value="#{resultMunicNovoBean.aliquota}" size="6" maxlength="5" id="aliquota2" >  
			   	<brArq:commonsValidator type="float" arg="#{msgs.resultado_municipios_novos_incluir_aliquota}" server="false" client="true"/>
				<brArq:commonsValidator type="floatRange" min="1" max="100" arg="#{msgs.resultado_municipios_novos_incluir_aliquota}" server="false" client="true"/>
		    </br:brInputText>
	
		<br:brPanelGroup style="width:30px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_codigoTributo}: " />
			<br:brPanelGroup style="width:3px;" />
			<br:brInputText  value="#{resultMunicNovoBean.codigoTributo}" size="6" maxlength="6" id="codigoTributo" >  
			  	<brArq:commonsValidator type="integer"  arg="#{msgs.resultado_municipios_novos_incluir_vencimento}" server="false" client="true" />
			</br:brInputText>
			
		</br:brPanelGroup>	
	</br:brPanelGrid>


	<f:verbatim><hr class="lin"> </f:verbatim> 	
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="align:left" value="#{msgs.resultado_municipios_novos_incluir_btn_voltar}" 
					action="#{resultMunicNovoBean.retornarContasMunicipio}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="margin-left:500px">
		</br:brPanelGroup>		
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnLimparCampos" styleClass="HtmlCommandButtonBradesco" value="#{msgs.resultado_municipios_novos_incluir_btn_limpar_campos}" action="#{resultMunicNovoBean.limparCamposInform}"  >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brCommandButton id="btnFinalizar" styleClass="HtmlCommandButtonBradesco" style="margin-left:5px" 
					value="#{msgs.resultado_municipios_novos_contas_btn_finalizar}" action="#{resultMunicNovoBean.confirmaInclusao}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid>

</br:brPanelGrid>

<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
