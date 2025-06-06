R<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<brArq:form id="incluirCodLancamentoForm" name="incluirCodLancamentoForm" >
<h:inputHidden id="hiddenProsseguir" value="#{empresaISSBean.hiddenProsseguir}"/>
<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
	<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup> 
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_iss_gerencial_informacao_empresa}:"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_codigo_empresa}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_cnpj_empresa}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_descricao_empresa}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="32" maxlength="5" id="txtCodigo" disabled="true" value="#{empresaISSBean.dtoAlterar.codEmpresa}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCodigo',numeros);"/>  
		</br:brPanelGroup>		
						
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brInputText id="cnpj"  disabled="true" maxlength="18" size="25" onfocus="loadMasks()" alt="cnpj" 
    	onkeypress="return validaTecla('0123456789', event)" value="#{empresaISSBean.dtoAlterar.cnpjFormatado}" />  
    	<br:brPanelGroup style="width:5px;" >
		</br:brPanelGroup>	
			<br:brCommandButton  disabled="true" image="/images/lupa.gif" id="buttonBuscarNomeEmpresa" onclick="submit();" action="#{empresaISSBean.buscarDescCnpj}">
				<a4j:support reRender="txtCodigo,cnpj,txtDescEmpresa" event="onclick"></a4j:support>
				 <brArq:submitCheckClient />
			</br:brCommandButton>
	</br:brPanelGrid>
	<br:brPanelGroup style="width:20px; margin-bottom:5px" >
	</br:brPanelGroup>
		
	<br:brPanelGroup>
    	<br:brInputText size="60" maxlength="40" disabled="true" id="txtDescEmpresa" value="#{empresaISSBean.dtoAlterar.descEmpresa}"/>  
	</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_sistema_contabil}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_percentual_rejeicao_arquivo}:"/>
		</br:brPanelGroup>
		
	
		<br:brPanelGroup>
			<br:brSelectOneMenu style="width:270px" disabled="true" id="sistemaContabil" value="#{empresaISSBean.dtoAlterar.combos.codSistemaContabil}">
				<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
				<f:selectItems value="#{empresaISSBean.selectItemSistContabil}"/>
				<a4j:support reRender="incluirCodLancamentoForm" event="onchange" action="#{empresaISSBean.carregarCombosContaCorrente}"/>
			</br:brSelectOneMenu>
		</br:brPanelGroup>
								
			
		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
	    	<br:brInputText id="percentualIss" maxlength="5" size="50" value="#{empresaISSBean.dtoAlterar.perRejeicaoArquivo}" onblur="vNumero(this,'9(2)V99')"/>    
		</br:brPanelGroup>
		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta_despesa}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
			
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta_provisao}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
	    	<br:brInputText size="50" maxlength="18" id="txtContaDespesa" value="#{empresaISSBean.dtoAlterar.contaDespesa}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtContaDespesa',numeros);"/>  
		</br:brPanelGroup>

		<br:brPanelGroup style="width:20px" >
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
    		<br:brInputText size="50" maxlength="18" id="txtContaProvisao" value="#{empresaISSBean.dtoAlterar.contaProvisao}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtContaProvisao',numeros);"/>  
		</br:brPanelGroup>
		
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_ident_contribuinte}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_nome_contato}:"/>
		</br:brPanelGroup>

		<br:brPanelGroup>
    		<br:brInputText size="50" maxlength="4" onfocus="loadMasks()" id="txtIdentContribuinte" value="#{empresaISSBean.dtoAlterar.codigoContribuinte}" onkeypress="return validaTecla('0123456789', event)" /> 
		</br:brPanelGroup>
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>				
		<br:brPanelGroup>
			<br:brInputText size="50" maxlength="255" onfocus="loadMasks()" id="txtNomeContato" value="#{empresaISSBean.dtoAlterar.nomeResponsavel}" />
	    </br:brPanelGroup>
	
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_telefone}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_email}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="50" maxlength="14" onfocus="loadMasks()" id="txtTelefone" value="#{empresaISSBean.dtoAlterar.telResponsavel}" onkeypress="return validaTecla('0123456789', event)"/>  
		</br:brPanelGroup>	
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>			
		<br:brPanelGroup>
			<br:brInputText size="50" maxlength="50" id="txtEmail" value="#{empresaISSBean.dtoAlterar.emailResponsavel}"/>
	    </br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
	    <br:brPanelGroup >
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_logradouro}:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_nro_endereco}:"/>
		</br:brPanelGroup>

		<br:brPanelGroup>
    		<br:brInputText size="93" maxlength="90" onfocus="loadMasks()" id="txtLogradouro" value="#{empresaISSBean.dtoAlterar.logradouro}"/>  
		</br:brPanelGroup>		
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>	
		<br:brPanelGroup>
			<br:brInputText size="7" maxlength="5" id="txtNroEndereco" value="#{empresaISSBean.dtoAlterar.nroEndereco}"/>
	    </br:brPanelGroup>
	 </br:brPanelGrid>
	 
	<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" >
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_complemento}" />	
		</br:brPanelGroup>	
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_cep}"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="50" maxlength="22" onfocus="loadMasks()" id="txtCompl" value="#{empresaISSBean.dtoAlterar.complEndereco}"/>  
		</br:brPanelGroup>	
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>			
		<br:brPanelGroup>
			<br:brInputText size="50" maxlength="9" onfocus="loadMasks()" id="txtCep" value="#{empresaISSBean.dtoAlterar.cep}" onfocus="loadMasks()" alt="cep" 
    			onkeypress="return validaTecla('0123456789', event)" />
	    </br:brPanelGroup>
	    
	    <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Bairro:" />	
		</br:brPanelGroup>	
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>		
		<br:brPanelGroup>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="50" maxlength="40" onfocus="loadMasks()" id="txtBairro" value="#{empresaISSBean.dtoAlterar.bairro}" />  
		</br:brPanelGroup>	
		<br:brPanelGroup style="width:20px; margin-bottom:5px" >
		</br:brPanelGroup>			
		<br:brPanelGroup>
	    </br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid style="width:20px; margin-bottom:5px" >
	</br:brPanelGrid>		

	
	<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText style="font-style: bold" styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.manter_dependencia_label_estado}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_codigo_municipio_ibge}:" />
		</br:brPanelGroup>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" style="width:19px;" />
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.geral_municipio}:"/>
		</br:brPanelGroup>		

		<br:brSelectOneMenu style="width:180px; margin-left: 2px;" id="estado" value="#{empresaISSBean.dtoAlterar.estado}">
			<f:selectItem itemValue="" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{empresaISSBean.listaEstados}"/>
		</br:brSelectOneMenu>
		<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco"/>
		<br:brInputText id="inputCodigoMunicipio" maxlength="10" size="25" value="#{empresaISSBean.buscaMunicipio.codigo}" onkeypress="return validaTecla('0123456789', event);"/>
		<br:brCommandButton style="margin-left: 5px;" image="/images/lupa.gif" id="buttonBuscarMunicipio" onclick="submit();" action="#{empresaISSBean.pesquisarMunicipioAlterar}">
			 <brArq:submitCheckClient />
		</br:brCommandButton>
		<br:brInputText id="inputMunicipio" maxlength="30" size="60" value="#{empresaISSBean.buscaMunicipio.descricao}"/>
	</br:brPanelGrid>

	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid styleClass="mainPanel" cellpadding="0" cellspacing="0" columns="1" width="100%"  >
		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_iss_gerencial_informacao_conta_empresa}"/>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<br:brPanelGrid columns="1" style="margin-top:11px" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
		</br:brPanelGroup>
	</br:brPanelGrid>
		
    <br:brPanelGrid columns="9" cellpadding="0" cellspacing="0"  rendered="#{empresaISSBean.dtoAlterar.combos.codSistemaContabil != 1}">
    
        <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta_resumo}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_cosif}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta_receita}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="Descrição Conta Receita:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_item_servico}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="7" maxlength="5" id="txtCosif" value="#{empresaISSBean.dtoAlterar.contas.contaResumo}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCosif',numeros);"/>  
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>
	
		<br:brPanelGroup>
    		<br:brInputText size="12" maxlength="8" id="txtContaResumo" value="#{empresaISSBean.dtoAlterar.contas.cosif}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtContaResumo',numeros);"/>  
		</br:brPanelGroup>
						
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>			
		
		<br:brPanelGroup>
    		<br:brInputText size="25" maxlength="14" id="ContaReceita" value="#{empresaISSBean.dtoAlterar.contas.contaReceita}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:ContaReceita',numeros);"/>  
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>	
		
		<br:brPanelGroup>
    		<br:brInputText size="50" maxlength="40" id="txtDescContaReceita" value="#{empresaISSBean.dtoAlterar.contas.descContaReceita}"/>  
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>		
		
		<br:brSelectOneMenu style="width:180px" id="descItemServico" value="#{empresaISSBean.dtoAlterar.contas.codItemServicoLC}">
				<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
				<f:selectItems value="#{empresaISSBean.selectItemServico}"/>
			</br:brSelectOneMenu>
		

	</br:brPanelGrid>
	
	
	<br:brPanelGrid columns="7" cellpadding="0" cellspacing="0" rendered="#{empresaISSBean.dtoAlterar.combos.codSistemaContabil == 1}">
    
        <br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta_resumo}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>	

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_cosif}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_conta_receita}:" />
		</br:brPanelGroup>	
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>

		<br:brPanelGroup>
			<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
			<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_iss_gerencial_item_servico}:"/>
		</br:brPanelGroup>
		
		<br:brPanelGroup>
    		<br:brInputText size="7" maxlength="5" id="txtCosif2" value="#{empresaISSBean.dtoAlterar.contas.contaResumo}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCodigo',numeros);"/>  
		</br:brPanelGroup>		
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>
		
		<br:brSelectOneMenu style="width:120px" id="comboCosif" value="#{empresaISSBean.dtoAlterar.contas.cosif}" rendered="#{empresaISSBean.dtoAlterar.combos.codSistemaContabil == 1}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{empresaISSBean.selectItemCosif}"/>
			<a4j:support reRender="incluirCodLancamentoForm" event="onchange" action="#{empresaISSBean.carregarComboContaReceitaAlterar}"/>
		</br:brSelectOneMenu>
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>			
		
		<br:brSelectOneMenu style="width:220px" id="comboContaReceita" value="#{empresaISSBean.dtoAlterar.contas.contaReceita}"  rendered="#{empresaISSBean.dtoAlterar.combos.codSistemaContabil == 1}">
			<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
			<f:selectItems value="#{empresaISSBean.selectItemContaReceita}"/>
		</br:brSelectOneMenu>
		
		<br:brPanelGroup style="width:2px" >
		</br:brPanelGroup>		
		
		<br:brSelectOneMenu style="width:180px" id="descItemServico2" value="#{empresaISSBean.dtoAlterar.contas.codItemServicoLC}">
				<f:selectItem itemValue="0" itemLabel="#{msgs.manter_dependencia_label_selecione}"/>
				<f:selectItems value="#{empresaISSBean.selectItemServico}"/>
			</br:brSelectOneMenu>
		

	</br:brPanelGrid>
	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			
			<br:brCommandButton id="btnIncluirConta" styleClass="HtmlCommandButtonBradesco" 
				  value="Incluir Conta" action="#{empresaISSBean.incluirContaAlterar}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>

	<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" >	
		<t:selectManyCheckbox id="checkboxRegistro" layout="spread" forceId="true" forceIdIndex="true" immediate="true" value="#{empresaISSBean.codigosSelecionadosTabelaContas}" >
			<f:selectItems value="#{empresaISSBean.selectItemContas}" />
		</t:selectManyCheckbox>
		<t:div  style="overflow-Y:scroll; height:275;display:block">
					
		<t:dataTable id="dataTable" value="#{empresaISSBean.dtoAlterar.contas.listaContas}" var="result"  rowIndexVar="indexLista"
			cellspacing="1" cellpadding="0" rowClasses="tabela_celula_normal, tabela_celula_destaque"
			columnClasses="alinhamento_centro, alinhamento_direita, alinhamento_direita, alinhamento_esquerda, alinhamento_esquerda, alinhamento_esquerda"
			headerClass="tabela_celula_destaque_acentuado" width="750px">	
			   <t:column width="25px" >
				<f:facet name="header">
			    </f:facet>		
			  
		    	<t:checkbox index="#{indexLista}" for=":incluirCodLancamentoForm:checkboxRegistro">
		    		<a4j:support event="onclick" rendered="incluirCodLancamentoForm" />
		    	</t:checkbox>
			  </t:column>		  
			  <t:column width="60px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_conta_resumo}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.contaResumo}"  style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			  
			    <t:column width="100px" >
			    <f:facet name="header">
			      <h:outputText value="COSIF" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;"escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.cosifExibicao}" style="margin-left:5 px; float:left;" escape="false"/>
			  </t:column>
			    
			  <t:column width="340px" style="height:23px;">
			    <f:facet name="header">
			      <br:brOutputText value="Conta Receita" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descContaReceita}"  style="margin-right:5 px; float:left;" escape="false"/>
			  </t:column>
			  <t:column width="225px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_iss_gerencial_item_servico}" style="margin-left:5 px; float:left;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>
			    <br:brOutputText value="#{result.descItemServicoLC} " style="margin-left:5 px;float:left;" escape="false"/>
			  </t:column>
			</t:dataTable>	
			</t:div>	
	</br:brPanelGrid>		
 	<br:brPanelGrid columns="1" width="100%"  style="text-align:right" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup>
			<br:brCommandButton id="btnExcluirConta" styleClass="HtmlCommandButtonBradesco" value="Excluir Conta" onclick="	
								if(!confirm('Deseja excluir a Conta?')){
									setHiddenProssegue(document.forms[1],false);
								}else{
									setHiddenProssegue(document.forms[1],true);
							    };" action="#{empresaISSBean.excluirContas}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
	<f:verbatim><hr class="lin"> </f:verbatim>
	
	<br:brPanelGrid columns="3" width="100%" cellpadding="0" cellspacing="0" >	
		<br:brPanelGroup style="text-align:left;width:150px"  >
			<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.botao_voltar}" action="#{empresaISSBean.inicializarManter}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>	
		<br:brPanelGrid columns="1" style="width:400px" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup> 
			</br:brPanelGroup>
		</br:brPanelGrid>	
		
		<br:brPanelGroup style="text-align:right;width:200px" >
			<br:brCommandButton id="btnIncluir" styleClass="HtmlCommandButtonBradesco" onclick="	
								if(!confirm('Deseja Alterar o Cadastro da Empresa?')){
									setHiddenProssegue(document.forms[1],false);
								}else{
									setHiddenProssegue(document.forms[1],true);
							    };"
				  value="Alterar Empresa" action="#{empresaISSBean.confirmarAlteracao}" >
				<brArq:submitCheckClient/>
			</br:brCommandButton>
		</br:brPanelGroup>
	</br:brPanelGrid>
	
</br:brPanelGrid>
<br:brCommandButton style="visibility: hidden" id="botaoCombo" action="#{empresaISSBean.atualizaComboItemServicoAlterar}">
				<brArq:submitCheckClient/>
			</br:brCommandButton>

<brArq:validatorScript functionName="validateForm"/>
<f:verbatim>
<script>
function clicarBotao(){
	document.getElementById('incluirCodLancamentoForm:botaoCombo').click();
}
function setHiddenProssegue(form, flag){	
	var hidden;	
	
	for(i=0; i<form.elements.length; i++)
	{
			
		if (form.elements[i].id == 'incluirCodLancamentoForm:hiddenProsseguir'){		
			hidden = form.elements[i];
			hidden.value = flag;				
		}		
	}	
}
function Somaiuscula(formato, keypress, objeto){
	campo = eval(objeto);
	caracteres = 'abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQSTUVWXYZ01234567890-./: ';
	if (caracteres.search(String.fromCharCode(keypress))!=1){
		campo.value = campo.value.toUpperCase();
	}
}

function validaTecla(valores, event) { 

    var BCK=8, //backspace 

    ETR=13, //return 

    DEL=127, //delete 

    //MIN=45, //'-' 

    //LEFT=37, 

    //RIGHT=39, 

    //UP=38, 

    //DOWN=40, 

    key,tecla; 

    if(BrowserDetect.browser == 'Firefox' && event.which) { 
	tecla=event.which; 
    } else if(BrowserDetect.browser == 'Explorer' && event.keyCode) { 
	tecla=event.keyCode; 
    } else { 
	return true; 
    }
 
    key=String.fromCharCode(tecla); 

    switch(tecla) { 

        case ETR: 

        case BCK: 

        case DEL: 

        //case MIN: 

        //case LEFT: 

        //case RIGHT: 

        //case UP: 

        //case DOWN: 

            return true; 

        default: 

            if(valores.indexOf(key)!=-1) { 
	        return true; 
            } 
     } 
    
    return false; 
} 

</script>
 </f:verbatim>
</brArq:form>
<t:aliasBeansScope>
	<t:aliasBean  alias="#{BuscaMunicipioBean}" value="#{empresaISSBean.buscaMunicipio}" />
	<%@include file="/content/filtro/includeBuscaMunicipio.jsp" %>
</t:aliasBeansScope>