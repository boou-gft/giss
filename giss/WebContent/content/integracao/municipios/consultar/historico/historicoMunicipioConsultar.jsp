<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="dependenciasEncerradasConsultarForm" name="dependenciasEncerradasConsultarForm" >
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">

	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_informacoes_municipio}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_codigo}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.codigo}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_nome}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.descricao}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_estado}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.estado}"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_aliquota}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.percentualAliquotaMunicipio}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	 <br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_informacao_apuracao}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_vencimento}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.diaVencimento}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_pagamento_setimo_dia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.pagamentoDiaUtil}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_forma_pagamento}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.formaPagamento}"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_numeroLei}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.descLei}"/>
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_informacao_complementar}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.inforComplementar}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
   <br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_parametro_reco}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_base_calculo}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.percentBaseCalculo}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_aliquota_padrao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.percentAliquotaPadrao}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_tipo_incidencia}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.nomeIncidencia}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultado_municipios_novos_razao}: " />
			<br:brCommandButton image="/images/lupa.gif" id="btnPesquisarContas"  styleClass="HtmlCommandButtonBradesco"  value="#{msgs.resultadoDependenciasNovasAgencia_pesquisar}" action="#{historicoMunicipioBean.consultarContas}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.path_manter_dependencia_alterar_responsavel_recolhimento }:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_estado_reco}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.estadoCentralizador}"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 20px" />	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_prosseguir_label_municipio}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.codigoMunicipioCentralizador}" />
		</br:brPanelGroup>				
		
		<br:brPanelGroup style="width: 20px" />			
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.descricaoMunicipioCentralizador}" />
		</br:brPanelGroup>		
				
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_dependencia_central}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.dependenciaCentralizadora}"/>
		</br:brPanelGroup>						
	</br:brPanelGrid>			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
	 <br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_informacao_apuracao_ant}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_vencimento}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.diaVencimentoAnt}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_pagamento_setimo_dia}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.pagamentoDiaUtilAnt}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_forma_pagamento}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.formaPagamentoAnt}"/>
		</br:brPanelGroup>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_numeroLei}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.descLeiAnt}"/>
		</br:brPanelGroup>
	      <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manterMunicipio_label_informacao_complementar}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.inforComplementarAnt}"/>
		</br:brPanelGroup>		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>	
	
   <br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.historico_consultar_municipios_title_parametro_reco_ant}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="4" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_base_calculo}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.percentBaseCalculoAnt}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_aliquota_padrao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.percentAliquotaPadraoAnt}"/>
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_tipo_incidencia}: " />
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.nomeIncidenciaAnt}"/>
		</br:brPanelGroup>	
		
		<br:brPanelGroup></br:brPanelGroup>
		
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.path_manter_dependencia_alterar_responsavel_recolhimento_ant }:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0">
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_estado_reco}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.estadoCentralizadorAnt}"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width: 20px" />	
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.manter_dependencia_prosseguir_label_municipio}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.codigoMunicipioCentralizadorAnt}" />
		</br:brPanelGroup>				
		
		<br:brPanelGroup style="width: 20px" />			
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.resultadoDependenciasNovasAgencia_descricao}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{historicoMunicipioBean.descricaoMunicipioCentralizadorAnt}" />
		</br:brPanelGroup>		
				
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="1" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRotuloBradesco" value="#{msgs.historico_consultar_municipios_label_dependencia_central}: "/>
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"  value="#{historicoMunicipioBean.dependenciaCentralizadoraAnt}"/>
		</br:brPanelGroup>						
	</br:brPanelGrid>	
	
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="2" width="100%" cellpadding="0" cellspacing="0" >	 
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.historico_consultar_municipios_btn_voltar}" action="VOLTAR_PESQUISAR" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		
		<br:brPanelGrid columns="1" style="width:490px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
	</br:brPanelGrid>	

</br:brPanelGrid>
<brArq:validatorScript functionName="validateForm"/>
</brArq:form>
