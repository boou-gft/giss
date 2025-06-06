<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="authz" %>

<brArq:form id="detalharMunicipioHistorico" name="detalharMunicipioHistorico" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
</br:brPanelGrid>
	
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		
		<br:brPanelGrid cellpadding="0" cellspacing="0" columns="1" width="100%"  >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_informacao_cadastramento_tipo_servico}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="1" style="margin-top:22px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_label_estado}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.estado}" />
		</br:brPanelGroup>	
		
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.geral_codigo_municipio_ibge}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.codMunicipio}" />
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.geral_municipio}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.descMunicipios}" />
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
	    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
	    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		</br:brPanelGrid>
		
		<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_municipio_campos_atuais}:"/>
		</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>	
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_banco}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.banco}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_agencia}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.agencia}" />
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_conta}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.conta}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_cnpj}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.cnpjFormatado}" />
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
	    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_aliquota_padrao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.aliquotaPadrao}" />
		</br:brPanelGroup>	
		
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_dia_recolhimento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.diaRecolhimento}" />
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_indicador_dia_util}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.indicadorDiaUtilExibicao}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_regra_dia_nao_util}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.regrasDiaNaoUtilExibicao}" />
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
	    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >

		<br:brPanelGroup>
			<br:brPanelGroup  />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_elegivel_para_pgto} " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value=" #{municipioISSBean.dtoHistoricoDet.descElegivelPagamento} " />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brPanelGroup  />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_status}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.descStatus}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup></br:brPanelGroup>
		<br:brPanelGroup></br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
	    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<br:brPanelGroup>
			<br:brPanelGroup  />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_data_hora_atualizacao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.dataHoraAtualizacaoFormatado} " />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brPanelGroup  />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_funcresp_atualizacao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.funcionario}" />
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
				
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_municipio_campos_anteriores}:"/>
		</br:brPanelGroup>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>	
<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >

		

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_banco}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.bancoAnterior}" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_agencia}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.agenciaAnterior}" />
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_conta}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.contaAnterior}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_cnpj}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.cnpjFormatadoAnterior}" />
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
	    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_aliquota_padrao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.aliquotaPadraoAnterior}" />
		</br:brPanelGroup>	
		
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_dia_recolhimento}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.diaRecolhimentoAnterior}" />
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_indicador_dia_util}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.indicadorDiaUtilExibicaoAnterior}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brPanelGroup style="width: 5px;" />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_regra_dia_nao_util}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.regrasDiaNaoUtilExibicaoAnterior}" />
		</br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
	    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >

		<br:brPanelGroup>
			<br:brPanelGroup  />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_elegivel_para_pgto}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.descElegivelPagamentoAnterior}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brPanelGroup  />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_iss_gerencial_status}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.descStatusAnterior}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup></br:brPanelGroup>
		<br:brPanelGroup></br:brPanelGroup>
		
		<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
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
	    <br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGroup>
			<br:brPanelGroup  />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_municipios_label_atualizazao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.dataHoraAtualizacaoAnteriorFormatado}" />
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brPanelGroup  />
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.label_funcresp_atualizacao}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{municipioISSBean.dtoHistoricoDet.funcionarioAnterior}" />
		</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<f:verbatim><hr class="lin"> </f:verbatim>
		
		<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >	
			<br:brPanelGroup>
				<br:brCommandButton id="btPesquisar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" action="#{municipioISSBean.voltar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
</brArq:form>