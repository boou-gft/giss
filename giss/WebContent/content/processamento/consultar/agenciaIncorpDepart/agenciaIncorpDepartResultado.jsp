<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="agenciaIncorpDepartResultadoForm" name="agenciaIncorpDepartResultadoForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
	  <br:brPanelGroup> 
		</br:brPanelGroup>
  	</br:brPanelGrid>	 
  	
  	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.agencia_incorpora_departamento_resultado_path_subtitulo_informacao} :"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>

	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.agencia_incorpora_departamento_resultado_path_subtitulo_competencia}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{agIncorpDeptoBean.mostraDataResultado}" /> 
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.agencia_incorpora_departamento_resultado_path_subtitulo_dependencia}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{agIncorpDeptoBean.dependencia}" /> 
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.agencia_incorpora_departamento_resultado_path_subtitulo_descricao}:" />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{agIncorpDeptoBean.descricao}" /> 
		</br:brPanelGroup>
		
					
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">	
		 <br:brPanelGroup> 
	  		<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
	  		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.agencia_incorpora_departamento_resultado_path_resultado}" />
		</br:brPanelGroup>
		<br:brPanelGroup style="width:750px">				
			<t:dataTable id="dataTable" value="#{agIncorpDeptoBean.consultaAgenciaIncorporaDepartamento.listaAgIncorpDepartAvancarDTO}" var="result" 
				rows="50" cellspacing="1" cellpadding="0" 
				rowClasses="tabela_celula_normal, tabela_celula_destaque" 
				columnClasses="alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, 
				alinhamento_direita" 
				headerClass="tabela_celula_destaque_acentuado" width="750px">
				  <t:column width="140px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.agencia_incorpora_departamento_resultado_path_tabela_dependencia}" />
				    </f:facet>
				    <br:brOutputText value="#{result.dependencia}" style="float:left;"/>
				  </t:column>
				  <t:column width="300px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.agencia_incorpora_departamento_resultado_path_tabela_descricao}"  />
				    </f:facet>
				    <br:brOutputText value="#{result.descricao}" style="float:left;"/>
				  </t:column>
				  <t:column width="140px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.agencia_incorpora_departamento_resultado_path_tabela_resultado}"/>
				    </f:facet>
				    <br:brOutputText value="#{result.saldo}" converter="decimalBrazillianConverter" style="float:right;"/>
				  </t:column>
				  <t:column width="140px" style="padding-right:5px; padding-left:5px">
				    <f:facet name="header">
				      <br:brOutputText value="#{msgs.agencia_incorpora_departamento_resultado_path_tabela_issrecolher}" /> 
				    </f:facet>
				    <br:brOutputText value="#{result.issRecolher}" converter="decimalBrazillianConverter" style="float:right;"/>
				  </t:column>				 
				</t:dataTable>	
				 
		</br:brPanelGroup>
		
			<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" style="width:750px; height:20px">	 
				<br:brPanelGroup style="width:140px;"  >			
					<br:brOutputText  styleClass="HtmlOutputTextRespostaBradesco" style="margin-left:10px;" value="#{msgs.agencia_incorpora_departamento_resultado_path_tabela_total}" />
				</br:brPanelGroup>
				
				<br:brPanelGroup style="width:300px; text-align:left">		
				</br:brPanelGroup>	
				
				
					
				<br:brPanelGroup style="width:140px; text-align:right">		
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:0px;" value="#{agIncorpDeptoBean.totalSaldo}" converter="decimalBrazillianConverter"/>
				</br:brPanelGroup>	
				
				<br:brPanelGroup style="width:140px; text-align:right">		
					<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" style="margin-right:0px;" value="#{agIncorpDeptoBean.totalIss}" converter="decimalBrazillianConverter"/>	
				</br:brPanelGroup>		
			</br:brPanelGrid>		
		</br:brPanelGrid> 
		
		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup >		
			<brArq:pdcDataScroller id="dataScroller" for="dataTable" actionListener="#{agIncorpDeptoBean.paginarListaAvancar}" rendered="#{agIncorpDeptoBean.consultaAgenciaIncorporaDepartamento.listaAgIncorpDepartAvancarDTO != null && agIncorpDeptoBean.mostraPaginacaoAvancar}" >
				<f:facet name="previous">
				    <brArq:pdcCommandButton id="anterior"
				      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
				      value="#{msgs.label_anterior}" title="#{msgs.label_anterior}"/>
				</f:facet>
				<f:facet name="next">
					<brArq:pdcCommandButton id="proxima"
				      styleClass="HtmlCommandButtonBradesco" style="margin-left: 3px;"
				      value="#{msgs.label_proxima}" title="#{msgs.label_proxima}"/>
				</f:facet>
			</brArq:pdcDataScroller>			  
		</br:brPanelGroup>
	</br:brPanelGrid>	
	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	 
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.agencia_incorpora_departamento_resultado_path_botao_voltar}" action="#{agIncorpDeptoBean.voltarConsulta}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
	</br:brPanelGrid> 
</br:brPanelGrid> 
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
