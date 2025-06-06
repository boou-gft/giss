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
			<br:brInputText styleClass="HtmlInputTextBradesco" size="25"
						id="valor"
						binding="#{conciliacaoApuracaoBean.valorAjuste}"
						onkeypress="return currencyMask(this, '.', ',', event, 15, 2)">
						<brArq:commonsValidator type="currencyMask" server="false"
							client="true" />
						<f:convertNumber pattern="#{msgs.padrao_decimal}"/>
				</br:brInputText>
				
			
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
		
			<br:brPanelGroup rendered="#{!conciliacaoApuracaoBean.tela}">
				<br:brCommandButton id="botao_pesquisar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.botao_pesquisar}" action="#{conciliacaoApuracaoBean.pesquisar}"
					onclick="desbloqTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
			
		</br:brPanelGrid>
		</br:brPanelGroup>
	</br:brPanelGrid>
	<br:brPanelGroup rendered="#{conciliacaoApuracaoBean.exibirResumo}">	
		<f:verbatim><hr class="lin"> </f:verbatim>		
	</br:brPanelGroup>
		<br:brPanelGroup rendered="#{conciliacaoApuracaoBean.exibirResumo}">
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.planilhaApuracao_resultado_label_resultado_pesquisa}:"/>
		</br:brPanelGroup>

			<br:brPanelGrid columns="1" width="100%" style="margin-top:5px;" rendered="#{conciliacaoApuracaoBean.exibirResumo}"
				cellpadding="0" cellspacing="0">
			<t:div  style="overflow-Y:scroll;overflow-X:scroll; height:275;width:885">
				<br:brPanelGroup>
						<t:dataTable id="dataTable"
							value="#{conciliacaoApuracaoBean.saida.lista}" var="result"
							cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_direita,alinhamento_direita,alinhamento_direita,alinhamento_esquerda,alinhamento_direita,alinhamento_direita,alinhamento_direita,alinhamento_direita,alinhamento_direita,alinhamento_direita,alinhamento_direita"
							headerClass="tabela_celula_destaque_acentuado" width="2000px">
							
							<t:column width="180px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Cosif" />
								</f:facet>
								<br:brOutputText value="#{result.cosif}" />
							</t:column>
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Raz o" />
								</f:facet>
								<br:brOutputText value="#{result.grupoRazaoFormatado}" />
							</t:column>
							<t:column width="140px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Conta" />
								</f:facet>
								<br:brOutputText value="#{result.contaFormatada}" />
							</t:column>
							<t:column width="500px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Nome Conta" />
								</f:facet>
								<br:brOutputText value="#{result.descContaRazao}" />
							</t:column>
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Saldo Anterior CCRS" />
								</f:facet>
								<br:brOutputText value="#{result.valorSaldoAnteriorCCRS}" />
							</t:column>
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="D bito CCRS" />
								</f:facet>
								<br:brOutputText value="#{result.valorDebitoCCRS}" />
							</t:column>
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Cr dito CCRS" />
								</f:facet>
								<br:brOutputText value="#{result.valorCreditoCCRS}" />
							</t:column>
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Saldo Atual CCRS" />
								</f:facet>
								<br:brOutputText value="#{result.valorSaldoAtualCCRS}" />
							</t:column>
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Receita Balancete" />
								</f:facet>
								<br:brOutputText value="#{result.valorReceitaBalancete}" />
							</t:column>
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Receita GISS" />
								</f:facet>
								<br:brOutputText value="#{result.valorReceitaGISS}" />
							</t:column>
							<t:column width="300px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Dif. GISS X Balancete" />
								</f:facet>
								<br:brOutputText value="#{result.valorDifReceitaBalancete}" />
							</t:column>
						</t:dataTable>
				</br:brPanelGroup>
			</t:div>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" rendered="#{conciliacaoApuracaoBean.exibirResumo}">
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputTextBold value="Receita CCRS:" />
		</br:brPanelGroup>
		<br:brPanelGrid style="text-align:right;width:100%">
			<br:brOutputText value="#{conciliacaoApuracaoBean.saida.valorReceitaTotalCCRS}" />
		</br:brPanelGrid>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" style="margin-left:40px"/>
			<br:brOutputTextBold value="Valor ISS:" />
		</br:brPanelGroup>
		<br:brPanelGrid style="text-align:right;width:100%">
			<br:brOutputText value="#{conciliacaoApuracaoBean.saida.valorIssTotal}" />
		</br:brPanelGrid>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputTextBold value="Receita GISS:" />
		</br:brPanelGroup>
		<br:brPanelGrid style="text-align:right;width:100%">
			<br:brOutputText  value="#{conciliacaoApuracaoBean.saida.valorReceitaTotalGISS}" />
		</br:brPanelGrid>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputTextBold value="Aliquota Zerada:" />
		</br:brPanelGroup>
		<br:brPanelGrid style="text-align:right;width:100%">
			<br:brOutputText value="#{conciliacaoApuracaoBean.saida.valorAliquotaZeradaTotal}" />
		</br:brPanelGrid>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputTextBold value="Oscila  o Negativa:" />
		</br:brPanelGroup>
		<br:brPanelGrid style="text-align:right;width:100%">
			<br:brOutputText value="#{conciliacaoApuracaoBean.saida.valorOscilacaoNegativaTotal}" />
		</br:brPanelGrid>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
			<br:brOutputTextBold value="Valor de Ajuste:" />
		</br:brPanelGroup>
		<br:brPanelGrid style="text-align:right;width:100%">
			<br:brOutputText  value="#{conciliacaoApuracaoBean.saida.valorAjusteTotal}" />
		</br:brPanelGrid>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brOutputTextBold value=" " />
			<br:brOutputText value=" " />
		</br:brPanelGroup>
	</br:brPanelGrid>
	
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value=""/>
		</br:brPanelGroup>

		<br:brPanelGroup rendered="#{conciliacaoApuracaoBean.exibirResumo}">
			<f:verbatim><hr class="lin"> </f:verbatim>
		</br:brPanelGroup>

		<br:brPanelGrid columns="1" width="100%" style="text-align:right;width:100%;"
			cellpadding="0" cellspacing="0" rendered="#{conciliacaoApuracaoBean.exibirResumo}">
			
			<br:brPanelGroup rendered="#{!conciliacaoApuracaoBean.tela}">
				<br:brCommandButton id="botao_consultar"
					styleClass="HtmlCommandButtonBradesco"
					value="#{msgs.botao_detalhar_justificativa}" action="#{conciliacaoApuracaoBean.detalharJustificativa}"
					onclick="desbloqTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>

		</br:brPanelGrid>


		<br:brPanelGrid columns="2" width="100%" style="margin-top:5px;"
			cellpadding="0" cellspacing="0" rendered="#{conciliacaoApuracaoBean.exibirJustificativa}">
				
			<t:div styleClass="barraDeRolagem">
				<br:brPanelGroup>
						<t:dataTable id="dataTable2"
							value="#{conciliacaoApuracaoBean.detalharJustificativaApuracaoVO.lista}" var="result"
							cellspacing="1" cellpadding="0"
							rowClasses="tabela_celula_normal, tabela_celula_destaque"
							columnClasses="alinhamento_esquerda,alinhamento_esquerda,alinhamento_esquerda,alinhamento_esquerda"
							headerClass="tabela_celula_destaque_acentuado" width="885px">
							
							<t:column width="200px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Data Atualiza  o" />
								</f:facet>
								<br:brOutputText value="#{result.dataAtualizacao}" />
							</t:column>
							<t:column width="190px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Valor de Ajuste" />
								</f:facet>
								<br:brOutputText value="#{result.sinalJustificativa}"/>
								<br:brOutputText value="#{result.valorJustificativa}"/>
							</t:column>
							<t:column width="600px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Justificativa" />
								</f:facet>
								<br:brOutputText value="#{result.descJustificativa}"/>
							</t:column>
							<t:column width="250px"
								style="padding-right:5px; padding-left:5px">
								<f:facet name="header">
									<br:brOutputText
										value="Usu rio" />
								</f:facet>
								<br:brOutputText value="#{result.codUsuarioManut}"/>
							</t:column>
							
						</t:dataTable>
				</br:brPanelGroup>
			</t:div>
			</br:brPanelGrid>
			<br:brPanelGroup rendered="#{conciliacaoApuracaoBean.exibirResumo}">
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
		<br:brPanelGrid columns="1" rendered="#{conciliacaoApuracaoBean.exibirResumo}">
		
			<br:brPanelGroup >
				<br:brCommandButton id="plan"
					styleClass="HtmlCommandButtonBradesco"
					value="Planilha Eletr nica"
					actionListener="#{conciliacaoApuracaoBean.imprimirPlanilha}"
					onclick="desbloqTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
				<br:brCommandButton id="txt"
					styleClass="HtmlCommandButtonBradesco"
					value="TXT"
					action="#{conciliacaoApuracaoBean.consultarTXT}"
					onclick="desbloquearTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
				<br:brCommandButton id="pdf"
					styleClass="HtmlCommandButtonBradesco"
					value="PDF"
					action="#{conciliacaoApuracaoBean.consultarPDF}"
					onclick="desbloquearTela();" style="margin-left:5px">
					<brArq:submitCheckClient />
				</br:brCommandButton>
			</br:brPanelGroup>
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
