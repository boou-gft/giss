<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="manterAliquotaManutencaoForm" name="manterAliquotaManutencaoForm" >

	<br:brPanelGrid  width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="3" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_estado}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterAliquotaBean.dto.estado}" />
			</br:brPanelGroup>	
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_codigo_municipio}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterAliquotaBean.dto.codigoMunicipio}" />
			</br:brPanelGroup>
						
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_municipio}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterAliquotaBean.dto.nomeMunicipio}" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_aliquota_padrao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{manterAliquotaBean.dto.aliquotaPadrao}" >
					<f:converter converterId="decimalBrazillianConverter" />
				</br:brOutputText>
			</br:brPanelGroup>
		
			<br:brPanelGroup> 
			</br:brPanelGroup>
			
			<br:brPanelGroup> 
			</br:brPanelGroup>
			
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{!empty manterAliquotaBean.listaDetalhe}">	
			<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{manterAliquotaBean.codigosSelecionadosTabela}" >
				<f:selectItems value="#{manterAliquotaBean.selectItemLei}" />
			</t:selectManyCheckbox>
		
			<br:brPanelGroup >	
				<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
				<t:div  style="overflow-Y:scroll; height:275;display:block">
				    <t:dataTable id="dataTable" value="#{manterAliquotaBean.listaDetalhe}" var="result" rowIndexVar="linha"
						cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_direita"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="25px" >
							<f:facet name="header">
						      <t:selectBooleanCheckbox id="todos" styleClass="HtmlSelectOneRadioBradesco" value="#{manterAliquotaBean.checkTodos}">
									<a4j:support event="onclick" action="#{manterAliquotaBean.atribuirTodos}" reRender="dataTable" />
								</t:selectBooleanCheckbox>
						    </f:facet>		
						  
					    	<t:checkbox index="#{linha}" for=":manterAliquotaManutencaoForm:checkboxRegistro"/>
						  </t:column>	
						<t:column width="625px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_item_servico_lc}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.itemServicoFormatado}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="100px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						   <br:brInputText id="aliquota" maxlength="4" size="8" value="#{result.percentualAliquotaAtualizado}" onblur="vNumero(this,'9(1)V99')"/>   
						</t:column>
					</t:dataTable>	
				</t:div>
				<f:verbatim>  </f:verbatim>	
			</br:brPanelGroup>
		</br:brPanelGrid>		

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
			<f:verbatim><hr class="lin"> </f:verbatim>
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:left" 
					value="#{msgs.botao_voltar}" action="#{manterAliquotaBean.voltar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnIncluirAliquota" styleClass="HtmlCommandButtonBradesco" style="float:right" 
					rendered="#{manterAliquotaBean.exibirBotaoIncluirAliquota}"
					value="#{msgs.botao_incluir_aliquota}" action="#{manterAliquotaBean.incluirAliquota}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnAlterarAliquota" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					rendered="#{manterAliquotaBean.exibirBotaoAlterarAliquota}"
					value="#{msgs.botao_alterar_aliquota}" action="#{manterAliquotaBean.alterarAliquota}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnExcluirAliquota" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					rendered="#{manterAliquotaBean.exibirBotaoExcluirAliquota}"
					value="#{msgs.botao_excluir_aliquota}" action="#{manterAliquotaBean.excluirAliquota}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
	</br:brPanelGrid>
</brArq:form>
	