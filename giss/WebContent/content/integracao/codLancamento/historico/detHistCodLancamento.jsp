<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="detHistoricoCodLancamentoForm" name="detHistoricoTipoServicoForm">
	<br:brPanelGrid columns="1" width="750" cellpadding="0" cellspacing="0">
		<br:brPanelGrid columns="1" style="margin-top:9px" cellpadding="0" cellspacing="0">
			<br:brPanelGroup>
			</br:brPanelGroup>
		</br:brPanelGrid>

		<br:brPanelGrid>
			<br:brOutputText styleClass="HtmlOutputFormatTitleBradesco" value="#{msgs.label_registro_selecionado}" />
		</br:brPanelGrid>	
			
		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cod_lancamento}:" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_seg_linha_extrato}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cosif}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup>
		    	<br:brInputText disabled="true" size="15" maxlength="5" id="txtCodigoDe" value="#{codLancamentoBean.detalheHistoricoDto.cdLancamento}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCodigo',numeros);"/>  
			</br:brPanelGroup>		
							
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
		    	<br:brInputText disabled="true" size="46" maxlength="32" id="txtSegLinhaExtratoDe" value="#{codLancamentoBean.detalheHistoricoDto.dsComplementar}"/>  
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
		    	<br:brInputText disabled="true" size="20" maxlength="10" id="txtCosifDe" value="#{codLancamentoBean.detalheHistoricoDto.contaContabilTributo}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCosif',numeros);"/>  
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_razao}:" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_conta}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_digito}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup>
		    	<br:brInputText disabled="true" id="razaoDe" maxlength="7" size="40" onfocus="loadMasks()" alt="razaocontabil" 
		    	onkeypress="return validaTecla('0123456789', event)" value="#{codLancamentoBean.detalheHistoricoDto.razao}" />
			</br:brPanelGroup>
									
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
			   	<br:brInputText disabled="true" size="15" maxlength="10" id="txtContaDe" value="#{codLancamentoBean.detalheHistoricoDto.contaContabil}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtConta',numeros);"/>  
			</br:brPanelGroup>
			 
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>			
			
			<br:brPanelGroup>	
			  	<br:brInputText disabled="true" size="5" maxlength="1" id="txtDigitoDe" value="#{codLancamentoBean.detalheHistoricoDto.digitoContaContabil}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtDigito',numeros);"/>  
			</br:brPanelGroup>
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_nome_conta}:" />
			</br:brPanelGroup>	
				
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_item_lei_complementar}:"/>
			</br:brPanelGroup>
				
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>
				
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>
				
			<br:brPanelGroup>
			   	<br:brInputText disabled="true" size="46" maxlength="40" id="txtNomeContaDe" value="#{codLancamentoBean.detalheHistoricoDto.dsLancamentoAplicadoContabil}" onkeyup="Somaiuscula('Somaiuscula', window.event.keyCode, this);"/>  
			</br:brPanelGroup>
				
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>	
			    
			<br:brPanelGroup>
			   	<br:brInputText disabled="true" size="15" maxlength="6" id="txtItemDe" value="#{codLancamentoBean.detalheHistoricoDto.cdItem}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtItem',numeros);"/>  
			</br:brPanelGroup>
				
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>	
				
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>	
		</br:brPanelGrid>

		<f:verbatim><hr class="lin"> </f:verbatim>	
		<br:brPanelGrid>
			<br:brOutputText styleClass="HtmlOutputFormatTitleBradesco" value="#{msgs.label_registro_anterior_ao_selecionado}" />
		</br:brPanelGrid>
			
		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cod_lancamento}:" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_seg_linha_extrato}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cosif}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup>
		    	<br:brInputText disabled="true" size="15" maxlength="5" id="txtCodigoAnterior" value="#{codLancamentoBean.detalheHistoricoDto.cdLancamentoAnterior}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCodigo',numeros);"/>  
			</br:brPanelGroup>		
							
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
		    	<br:brInputText disabled="true" size="46" maxlength="32" id="txtSegLinhaExtratoAnterior" value="#{codLancamentoBean.detalheHistoricoDto.dsComplementarAnterior}"/>  
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
		    	<br:brInputText disabled="true" size="20" maxlength="10" id="txtCosifAnterior" value="#{codLancamentoBean.detalheHistoricoDto.contaContabilTributoAnterior}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtCosif',numeros);"/>  
			</br:brPanelGroup>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_razao}:" />
			</br:brPanelGroup>	
			
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_conta}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_digito}:"/>
			</br:brPanelGroup>
			
			<br:brPanelGroup>
		    	<br:brInputText disabled="true" id="razaoAnterior" maxlength="7" size="40" onfocus="loadMasks()" alt="razaocontabil" 
		    	onkeypress="return validaTecla('0123456789', event)" value="#{codLancamentoBean.detalheHistoricoDto.razaoAnterior}" />
			</br:brPanelGroup>
									
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>			
			
			<br:brPanelGroup>
			   	<br:brInputText disabled="true" size="15" maxlength="10" id="txtContaAnterior" value="#{codLancamentoBean.detalheHistoricoDto.contaContabilAnterior}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtConta',numeros);"/>  
			</br:brPanelGroup>
			 
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>			
			
			<br:brPanelGroup>	
			  	<br:brInputText disabled="true" size="5" maxlength="1" id="txtDigitoAnterior" value="#{codLancamentoBean.detalheHistoricoDto.digitoContaContabilAnterior}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtDigito',numeros);"/>  
			</br:brPanelGroup>
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_nome_conta}:" />
			</br:brPanelGroup>	
				
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>		
				
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_item_lei_complementar}:"/>
			</br:brPanelGroup>
				
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>
				
			<br:brPanelGroup style="width:20px; margin-bottom:5px" >
			</br:brPanelGroup>
				
			<br:brPanelGroup>
			   	<br:brInputText disabled="true" size="46" maxlength="40" id="txtNomeContaAnterior" value="#{codLancamentoBean.detalheHistoricoDto.dsLancamentoAplicadoContabilAnterior}" onkeyup="Somaiuscula('Somaiuscula', window.event.keyCode, this);"/>  
			</br:brPanelGroup>
				
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>	
			    
			<br:brPanelGroup>
			   	<br:brInputText disabled="true" size="15" maxlength="6" id="txtItemAnterior" value="#{codLancamentoBean.detalheHistoricoDto.cdItemAnterior}" onkeyup="aplicamascara('incluirCodLancamentoForm', 'incluirCodLancamentoForm:txtItem',numeros);"/>  
			</br:brPanelGroup>
				
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>	
				
			<br:brPanelGroup style="width:20px" >
			</br:brPanelGroup>		
		</br:brPanelGrid>
		
		<f:verbatim><hr class="lin"> </f:verbatim>	
		
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0">
			<br:brCommandButton id="btnVoltar"
				styleClass="HtmlCommandButtonBradesco"
				value="#{msgs.btn_voltar}"
				action="#{codLancamentoBean.voltarConHistorico}">
				<brArq:submitCheckClient />
			</br:brCommandButton>
		</br:brPanelGrid>
	</br:brPanelGrid>
	<brArq:validatorScript functionName="validateForm" />
</brArq:form>