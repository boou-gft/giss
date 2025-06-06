<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="diferencasContabeisForm" name="diferencasContabeisForm" >

	<br:brPanelGrid  width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_empresa}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{processarContabilidadeMovimentoBean.dto.codigoEmpresa} - #{processarContabilidadeMovimentoBean.dto.nomeEmpresa}" />
			</br:brPanelGroup>	
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_produto}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{processarContabilidadeMovimentoBean.dto.nomeProduto}" />
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_competencia}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{processarContabilidadeMovimentoBean.dto.anoMesCompetenciaExibicao}" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_tipo_movimento_anterior}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{processarContabilidadeMovimentoBean.dto.descricaoFinalidadeArquivo}" />
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_situacao_contabil_movimento_anterior}: " />
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{processarContabilidadeMovimentoBean.dto.descricaoSituacaoContabil}" />
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

		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" rendered="#{!empty processarContabilidadeMovimentoBean.listaDetalhe}">	
			<br:brPanelGroup >	
				<f:verbatim> <div id="rolagem" style="width:750px;"></f:verbatim> 
				<t:div  style="overflow-Y:scroll; height:275;display:block">
				    <t:dataTable id="dataTable" value="#{processarContabilidadeMovimentoBean.listaDetalhe}" var="result" rowIndexVar="indexLista"
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
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_base_calculo_anterior}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.valorBaseCalculoAnterior}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota_anterior}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.percentualAliquotaAnterior}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_valor_iss_anterior}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.valorApuracaoAnterior}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_base_calculo_atual}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.valorBaseCalculoAtual}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_aliquota_atual}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.percentualAliquotaAtual}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_valor_iss_atual}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.valorApuracaoAtual}" style="margin-left:6 px;float:left;"/>
						</t:column>
						<t:column width="80px">
							<f:facet name="header">
						      	<br:brOutputText value="#{msgs.label_valor_oscilacao}" style="margin-left:5 px;float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
						    </f:facet>
						    <br:brOutputText value="#{result.valorOscilacao}" style="margin-left:6 px;float:left;"/>
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
					value="#{msgs.botao_voltar}" action="#{processarContabilidadeMovimentoBean.voltar}" >
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				<br:brCommandButton id="btnPlanilhaEletronica" styleClass="HtmlCommandButtonBradesco" style="margin-right:5px;float:right" 
					value="#{msgs.botao_planilha_eletronica}" actionListener="#{processarContabilidadeMovimentoBean.exportarExcel}" onclick="desbloqTela();">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
	</br:brPanelGrid>
</brArq:form>
