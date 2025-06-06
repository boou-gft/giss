<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="conciliacaoApuracaoForm" name="conciliacaoApuracaoForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
  	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	
	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{msgs.label_competencia_apuracao}"/>
		</br:brPanelGroup>	
		<br:brPanelGroup>
				<br:brInputText styleClass="HtmlInputTextBradesco" onkeyup="proximoCampo(2,'conciliacaoApuracaoForm','conciliacaoApuracaoForm:txtMes','conciliacaoApuracaoForm:txtAno');" value="#{conciliacaoApuracaoBean.mesFiltro}" size="3" maxlength="2" id="txtMes" onkeypress="aplicamascara('conciliacaoApuracaoForm','conciliacaoApuracaoForm:txtMes',numeros);" onblur="validarData('conciliacaoApuracaoForm','conciliacaoApuracaoForm:txtMes', 'mes', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
	    			<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />	
	    			<brArq:commonsValidator type="required" arg="#{msgs.apuracaoMensalDiferenciada_competencia_mes}" server="false" client="true" />		  				      				       
		    	</br:brInputText>	
				<f:verbatim>&nbsp;/&nbsp;</f:verbatim>
				<br:brInputText styleClass="HtmlInputTextBradesco" value="#{conciliacaoApuracaoBean.anoFiltro}" size="6" maxlength="4" id="txtAno" onkeypress="aplicamascara('conciliacaoApuracaoForm','conciliacaoApuracaoForm:txtAno',numeros);" onblur="validarData('conciliacaoApuracaoForm','conciliacaoApuracaoForm:txtAno', 'ano', '#{msgs.label_periodo_dia}', '#{msgs.label_periodo_mes}', '#{msgs.label_periodo_ano}');">
	    			<brArq:commonsValidator type="integer" arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}" server="false" client="true" />			  				      				      
	    			<brArq:commonsValidator type="required" arg="#{msgs.apuracaoMensalDiferenciada_competencia_ano}" server="false" client="true" />
		    	</br:brInputText>
		</br:brPanelGroup>
		
		<br:brPanelGroup rendered="#{conciliacaoApuracaoBean.tela}" >
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px" value="#{msgs.label_valor_ajuste}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup rendered="#{conciliacaoApuracaoBean.tela}">
			<br:brInputText styleClass="HtmlInputTextBradesco" size="25" id="valor"
					binding="#{conciliacaoApuracaoBean.valorAjuste}"
					onkeyup="mascara_num(this);">
					
					<f:convertNumber pattern="#{msgs.padrao_decimal}"/>
			</br:brInputText>
		</br:brPanelGroup>
		
		<br:brPanelGroup rendered="#{conciliacaoApuracaoBean.tela}">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:5px" value="#{msgs.label_justificativa}:"/>
		</br:brPanelGroup>
		<br:brPanelGroup rendered="#{conciliacaoApuracaoBean.tela}">
			<br:brInputText size="100" maxlength="40" value="#{conciliacaoApuracaoBean.justificativa}" />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGroup>
		<f:verbatim><hr class="lin"> </f:verbatim>
	</br:brPanelGroup>
		
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px">
			
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:500px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		<br:brPanelGroup style="text-align:right;width:100%" >
			<br:brPanelGrid columns="1">
				<br:brPanelGroup>
					<br:brCommandButton id="botao_incluir"
						styleClass="HtmlCommandButtonBradesco"
						value="#{msgs.botao_incluir}" action="#{conciliacaoApuracaoBean.incluir}"
						onclick="desbloqTela();" style="margin-left:5px">
						<brArq:submitCheckClient />
					</br:brCommandButton>
				</br:brPanelGroup>
			</br:brPanelGrid>
		</br:brPanelGroup>
	</br:brPanelGrid>
</br:brPanelGrid>		
  
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
