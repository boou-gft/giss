<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="consultaPaForm" name="consultaPaForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
  	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" style="margin-top:5px" cellpadding="0" cellspacing="0" >		 

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px" value="#{msgs.label_codigo_pa}:"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco"  style="margin-right:5px;margin-left:5px" value="#{msgs.label_nome_pa}:"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px;margin-left:5px" value="#{msgs.label_municipio_pa}:"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px;margin-left:5px" value="#{msgs.label_uf_pa}:"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brInputText style="margin-right:5px;margin-left:5px" size="10" value="#{consultarPaBean.codigoPa}" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brInputText style="margin-right:5px;margin-left:5px" size="60" value="#{consultarPaBean.nomePa}" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brInputText style="margin-right:5px;margin-left:5px" size="30" value="#{consultarPaBean.municipioPa}" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brInputText style="margin-right:5px;margin-left:5px" size="10" value="#{consultarPaBean.ufPa}" />
		</br:brPanelGroup>
		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" style="margin-top:5px" cellpadding="0" cellspacing="0" >		 

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px" value="#{msgs.label_juncao_agencia_relacionamento}:"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco"  style="margin-right:5px;margin-left:5px" value="#{msgs.label_nome_agencia_relacionamento}:"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brInputText style="margin-right:5px;margin-left:5px" size="30" value="#{consultarPaBean.juncao}" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brInputText style="margin-right:5px;margin-left:5px" size="50" value="#{consultarPaBean.nome}" />
		</br:brPanelGroup>
		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="2" style="margin-top:5px" cellpadding="0" cellspacing="0" >		 

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px" value="#{msgs.label_municipio_agencia_relacionamento}:"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco"  style="margin-right:5px;margin-left:5px" value="#{msgs.label_uf_agencia_relacionamento}:"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brInputText style="margin-right:5px;margin-left:5px" size="30" value="#{consultarPaBean.municipio}" />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brInputText style="margin-right:5px;margin-left:5px" size="10" value="#{consultarPaBean.uf}" />
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
					<br:brCommandButton id="btnPesquisar"
					styleClass="HtmlCommandButtonBradesco" action="#{consultarPaBean.consultar}"
					value="#{msgs.resultado_municipios_novos_recolhimento_btn_pesquisar}"
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
