<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="detalharCargaMassiva" name="detalharCargaMassiva" >

	<br:brPanelGrid  width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="2" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_remessa}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{cargaMassivaBean.dto.numeroRemessa}" />
			</br:brPanelGroup>	
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_situacao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{cargaMassivaBean.dto.situacaoRemessa.descricao}" />
			</br:brPanelGroup>
			
			<br:brPanelGroup> 
			</br:brPanelGroup>
			
			<br:brPanelGroup> 
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_usuario_carga}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{cargaMassivaBean.dto.usuarioCarga.codigo}" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_data_hora}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{cargaMassivaBean.dto.usuarioCarga.data}" >
					<f:converter converterId="timestampPdcConverter" />
				</br:brOutputText>
			</br:brPanelGroup>
		
			<br:brPanelGroup> 
			</br:brPanelGroup>
			
			<br:brPanelGroup> 
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_usuario_conferencia}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{cargaMassivaBean.dto.usuarioConferencia.codigo}" />
			</br:brPanelGroup>
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_data_hora}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{cargaMassivaBean.dto.usuarioConferencia.data}" >
					<f:converter converterId="timestampPdcConverter" />
				</br:brOutputText>
			</br:brPanelGroup>	
		
			<br:brPanelGroup> 
			</br:brPanelGroup>
			
			<br:brPanelGroup> 
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_usuario_aprovacao}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{cargaMassivaBean.dto.usuarioAprovacao.codigo}" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_data_hora}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{cargaMassivaBean.dto.usuarioAprovacao.data}" >
					<f:converter converterId="timestampPdcConverter" />
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

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{!empty cargaMassivaBean.listaDetalhe}">	
			<br:brPanelGroup >	
				<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
				<t:div  style="overflow-Y:scroll; height:275;display:block">
				    <t:dataTable id="dataTable" value="#{cargaMassivaBean.listaDetalhe}" var="result" rowIndexVar="indexLista"
						cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_centro, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda, alinhamento_direita, alinhamento_direita, alinhamento_direita"
						headerClass="tabela_celula_destaque_acentuado" width="750px">
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_municipio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.codigoMunicipio}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="200px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_descricao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.nomeMunicipio}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="30px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_uf}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.uf}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="200px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_item_servico}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.itemServicoFormatado}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota_atualizar}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.aliquotaAtual}" converter="decimalBrazillianConverter" style="margin-left:6 px;float:right;"/>
						</t:column>
						<t:column width="80px" rendered="#{cargaMassivaBean.exibirDivIssProprio}">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota_iss_proprio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.aliquotaISSProprio}" converter="decimalBrazillianConverter" style="margin-left:6 px;float:right;"/>
						</t:column>
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota_iss_gerencial}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.aliquotaISSGerencial}" converter="decimalBrazillianConverter"  style="margin-left:6 px;float:right;"/>
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
					value="#{msgs.botao_voltar}" action="#{cargaMassivaBean.voltar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnAprovar" styleClass="HtmlCommandButtonBradesco" style="float:right" 
					disabled="#{cargaMassivaBean.desabilitarBotaoAprovar}"
					value="#{msgs.botao_aprovar}" action="#{cargaMassivaBean.aprovar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnConferir" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					disabled="#{cargaMassivaBean.desabilitarBotaoConferir}"
					value="#{msgs.botao_conferir}" action="#{cargaMassivaBean.conferir}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnRejeitar" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					disabled="#{cargaMassivaBean.desabilitarBotaoRejeitar}"
					value="#{msgs.botao_rejeitar}" action="#{cargaMassivaBean.rejeitar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnPlanilhaEletronica" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					value="#{msgs.botao_planilha_eletronica}" actionListener="#{cargaMassivaBean.exportarExcel}" onclick="desbloqTela();">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnTxt" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					value="#{msgs.botao_txt}" actionListener="#{cargaMassivaBean.exportarTxt}" onclick="desbloqTela();">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnDivIssGerencial" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					value="#{msgs.botao_div_iss_gerencial}" action="#{cargaMassivaBean.exibirDivergenciasIssGerencial}" 
					rendered="#{cargaMassivaBean.exibirDivIssProprio}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnDivIssProprio" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					value="#{msgs.botao_div_iss_proprio}" action="#{cargaMassivaBean.exibirDivergenciasIssProprio}" 
					rendered="#{cargaMassivaBean.exibirDivIssProprio}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>	
			</br:brPanelGroup>
		</br:brPanelGrid>
		
	</br:brPanelGrid>
</brArq:form>

<rich:modalPanel id="aliquotaIss" zindex="2000" autosized="true" showWhenRendered="#{cargaMassivaBean.exibirModal}" rendered="#{cargaMassivaBean.exibirModal}" >
	<brArq:form id="formAliquotaIss">
		<br:brPanelGrid columns="1" width="580px" border="0">
			<br:brPanelGroup>
				<f:verbatim> <div id="rolagem" style="width:580px;"></f:verbatim>
				<t:div  style="overflow-Y:scroll; height:275;display:block">
					<t:dataTable var="valor" value="#{cargaMassivaBean.listaModalIss}" align="left" rowIndexVar="index" width="100%" id="gridAliquotaIss"
						rowClasses="tabela_celula_normal, tabela_celula_destaque"
						columnClasses="alinhamento_direita, alinhamento_direita"
						headerClass="tabela_celula_destaque_acentuado" cellspacing="1" cellpadding="0" >
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_municipio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{valor.codigoMunicipio}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="200px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_descricao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{valor.nomeMunicipio}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="30px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_uf}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{valor.uf}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="200px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_item_servico}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{valor.itemServicoFormatado}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="120px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota_atualizar}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{valor.aliquotaAtual}" converter="decimalBrazillianConverter" style="margin-left:6 px;float:right;"/>
						</t:column>
						<t:column width="150px" rendered="#{cargaMassivaBean.exibirInformacaoIssProprio}">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota_iss_proprio}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{valor.aliquotaISSProprio}" converter="decimalBrazillianConverter" style="margin-left:6 px;float:right;"/>
						</t:column>
						<t:column width="150px" rendered="#{cargaMassivaBean.exibirInformacaoIssGerencial}">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota_iss_gerencial}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{valor.aliquotaISSGerencial}" converter="decimalBrazillianConverter" style="margin-left:6 px;float:right;"/>
						</t:column>
					</t:dataTable>
				</t:div>
				<f:verbatim></div></f:verbatim>	
			</br:brPanelGroup>
		</br:brPanelGrid>
		<br:brPanelGrid columns="1" width="100%" style="text-align:center" cellpadding="0" cellspacing="0">
			<f:verbatim><hr class="lin"> </f:verbatim>
			<br:brPanelGroup style="text-align:right">
				<br:brCommandButton id="btnFechar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_fechar}" action="#{cargaMassivaBean.ocultarDivergenciasIss}">
					<brArq:submitCheckClient/>
				</br:brCommandButton>	
			</br:brPanelGroup>
		</br:brPanelGrid>	
	</brArq:form>
</rich:modalPanel>
	