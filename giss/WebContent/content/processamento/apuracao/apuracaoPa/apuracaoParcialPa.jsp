<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="apuracaoParcialPaForm" name="apuracaoParcialPaForm" >
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
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{msgs.consultarApuracaoParcial_label_periodo}"/>
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="3" width="30%" cellpadding="0" cellspacing="0" >		
			<br:brPanelGroup>
			 	<app:calendar id="calendarioDe" value="#{apuracaoParcialPeriodoBean.dataInicio}"/>
			</br:brPanelGroup>
			
			<f:verbatim>&nbsp; até &nbsp;</f:verbatim>
			
			<br:brPanelGroup>
			 	<app:calendar id="calendarioAte" value="#{apuracaoParcialPeriodoBean.dataFim}"/>
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
			<br:brSelectOneMenu style="width:180px" id="estado" value="#{apuracaoParcialPeriodoBean.estadoFiltro}" >
				<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}" />
				<f:selectItems value="#{apuracaoParcialPeriodoBean.listaEstados}" />
			</br:brSelectOneMenu>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" />
			<br:brInputText id="inputCodigoMunicipio" maxlength="5" size="7" value="#{apuracaoParcialPeriodoBean.buscaMunicipio.codigo}" />
			<br:brCommandButton image="/images/lupa.gif" id="buttonBuscarMun" onclick="submit();" action="#{apuracaoParcialPeriodoBean.buscaMunicipioManter}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
			<br:brInputText id="inputMunicipio" maxlength="60" size="70" value="#{apuracaoParcialPeriodoBean.buscaMunicipio.descricao}" />
		</br:brPanelGrid>
		
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco"  style="margin-right:5px;margin-left:5px" value="#{msgs.label_consolidado}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup >
			<t:selectOneRadio id="tipoPesquisa" value="#{apuracaoParcialPeriodoBean.codigoSimNao}"
			 	styleClass="HtmlSelectOneRadioBradesco">  
				<f:selectItem value="1" itemValue="1" itemLabel="SIM" />
				<f:selectItem value="2" itemValue="2" itemLabel="NÃO" />
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
			<br:brCommandButton id="botao_consultar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.botao_consultar}" action="#{apuracaoParcialPeriodoBean.consultar}"
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
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{apuracaoParcialPeriodoBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>
