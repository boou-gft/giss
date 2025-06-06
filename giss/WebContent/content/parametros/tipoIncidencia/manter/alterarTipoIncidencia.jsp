<%@ taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@taglib  uri="http://richfaces.org/rich" prefix="rich" %>

<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="br"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="app"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="brArq"%>

<brArq:form id="alterarTipoIncidenciaForm" name="alterarTipoIncidenciaForm" >
	<br:brPanelGrid columns="1" width="750px" cellpadding="0" cellspacing="0">
		
		<br:brPanelGroup style="height:2px;" />
		
		<br:brPanelGrid columns="1" width="100%" cellpadding="0" cellspacing="0" styleClass="mainPanel"  >
				<br:brPanelGroup>
					<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
					<br:brOutputText styleClass="HtmlOutputTextTitleBradesco" value="#{msgs.label_title_informacao_alterar_tipo_incidencia}:"/>
				</br:brPanelGroup>
		</br:brPanelGrid>
		
		<br:brPanelGroup style="height:10px;" >
		</br:brPanelGroup>	
	
		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_codigo_alterar_tipo_incidencia}:" />
			</br:brPanelGroup>
			
			<br:brPanelGroup style="width:20px;"/>

			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>	
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_descricao_alterar_tipo_incidencia}:"/>
			</br:brPanelGroup>	
			
			<br:brPanelGroup style="width:245px;"/>
			
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet"/>
				<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_vigencia_alterar_tipo_incidencia}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
			
		
		<br:brPanelGrid columns="5" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
					<br:brPanelGroup>
					</br:brPanelGroup>
				<h:outputText value="#{tipoIncidenciaBean.codigo}" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
					
			</br:brPanelGroup>

			<br:brPanelGroup style="width:105px;"/>
			
			<br:brPanelGroup>
				<br:brInputText value="#{tipoIncidenciaBean.descricao}" size="50" maxlength="30" id="txtDescricao" onkeyup="Somaiuscula('Somaiuscula', window.event.keyCode, this);">  
	    			<brArq:commonsValidator type="required" arg="" server="false" client="true"/>
	    		</br:brInputText>	
			</br:brPanelGroup>		
			
			<br:brPanelGroup style="width:70px;"/>
			
			<br:brPanelGroup>												
					<app:calendar id="calendarioDe1" value="#{tipoIncidenciaBean.datainiciovigencia}" >
					</app:calendar>
							<br:brPanelGroup style="width:15px; margin-bottom:1px" >
							</br:brPanelGroup>
							<br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_a_tipo_incidencia}"/>
					<app:calendar id="calendarioAte1" value="#{tipoIncidenciaBean.datafinalvigencia}" >	
					</app:calendar>					
				</br:brPanelGroup>	
		</br:brPanelGrid>
		
		<br:brPanelGroup style="height:1px;" >
		</br:brPanelGroup>
					
		<f:verbatim><hr class="lin" > </f:verbatim>
		<f:verbatim><br /> </f:verbatim>
		
		<!-- "Segunda parte" -->
		<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >
			<br:brPanelGroup>
				<br:brGraphicImage url="/images/bullet.jpg" styleClass="HtmlBullet" />	
				<br:brOutputText styleClass="" value="#{msgs.label_faixaValores_alterar_tipo_incidencia}:"/>
			</br:brPanelGroup>
		</br:brPanelGrid>
		
		
		<f:verbatim><br /> </f:verbatim>
						
		<br:brPanelGrid columns="1" width="100%"  style="text-align:left" cellpadding="0" cellspacing="0" >
		<br:brPanelGroup>
						
			<t:dataTable id="dataTable" value="#{tipoIncidenciaBean.listaFaixasTipoIncidencia}" var="result" rows="50" 
				cellspacing="1" cellpadding="0" border="0" width="750px">
			
			 <t:column width="210px" >
				<f:facet name="header">
			      <br:brOutputText value="#{msgs.label_valorInicial_tipo_incidencia}" style="float:center;font-weight: bold;font-family: verdana;font-size: 10 px;" escape="false" />
			    </f:facet>		
			    <br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cifrao_alterar_tipo_incidencia}"/>
				<br:brInputText id="valorInicial" value="#{result.valorinicial}" size="26" maxlength="22" alt="decimalBr" />
			</t:column>
			    
			  <t:column width="210px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_valorFinal_tipo_incidencia}" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cifrao_alterar_tipo_incidencia}"/>
			    <br:brInputText id="valorFinal" value="#{result.valorfinal}" size="26" maxlength="22" alt="decimalBr"/>
			  </t:column>				
			  
			  <t:column width="90px" >
			    <f:facet name="header">
			      <h:outputText value="#{msgs.label_aliquota_tipo_incidencia}"style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brInputText  id="valorAliquota" value="#{result.valoraliquota}" size="6" maxlength="6" alt="percentual"/>
			    <br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_porcentagem_alterar_tipo_incidencia}" />
			  </t:column>
			  
			  <t:column width="210px">
			    <f:facet name="header">
			      <br:brOutputText value="#{msgs.label_redutor_tipo_incidencia}" style="margin-left:5 px;float:center;font-weight: bold;font-family: verdana;font-size: 10 px;"  escape="false" />
			    </f:facet>
			    <br:brOutputText styleClass="HtmlOutputTextRespostaBradesco" value="#{msgs.label_cifrao_alterar_tipo_incidencia}"/>
			    <br:brInputText id="valorRedutor"  value="#{result.valorRedutor}" size="26" maxlength="22" alt="decimalBr"/>
			  </t:column>
			</t:dataTable>	
				
		</br:brPanelGroup>
	</br:brPanelGrid>	
						
		<f:verbatim><hr class="lin" > </f:verbatim>
		
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" style="text-align:center">
			<br:brPanelGroup style="width:485px;" >
			</br:brPanelGroup>
			<br:brPanelGroup>
					<br:brCommandButton id="btnRemoverFaixa" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_removerFaixa_alterar_tipo_incidencia}" actionListener="#{tipoIncidenciaBean.removeLinhaFaixa}" style="margin-right:5px">
						<brArq:submitCheckClient/>
					</br:brCommandButton>
			</br:brPanelGroup>
			<br:brPanelGroup>
					<br:brCommandButton id="btnAdicionaFaixa" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_adicionarFaixa_alterar_tipo_incidencia}" actionListener="#{tipoIncidenciaBean.adicionaLinhaFaixa}" style="margin-right:5px">
						<brArq:submitCheckClient/>
					</br:brCommandButton>
			</br:brPanelGroup>			
		</br:brPanelGrid>
		
		<f:verbatim><hr class="lin" > </f:verbatim>
		
		<br:brPanelGrid columns="3" cellpadding="0" cellspacing="0" style="text-align:left">
			<br:brPanelGroup>
				<br:brCommandButton id="btnVoltar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_voltar_alterar_tipo_incidencia}" action="voltar_mantertipoincidencia" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
			</br:brPanelGroup>
				
				
			<br:brPanelGroup style="width:623px;" >
			</br:brPanelGroup>
				
				
			<br:brPanelGroup>
				<br:brCommandButton id="btnFinalizar" styleClass="HtmlCommandButtonBradesco" value="#{msgs.label_botao_finalizar_alterar_tipo_incidencia}" actionListener="#{tipoIncidenciaBean.alterarTipoIncidencia}" style="margin-right:5px">
					<brArq:submitCheckClient/>
				</br:brCommandButton>
				</br:brPanelGroup>
		</br:brPanelGrid>
	</br:brPanelGrid>
	
	<f:verbatim>
<script>
function validaCampo(form){
 
    nomecampo = new Array("valorInicial","valorFinal","valorAliquota","valorRedutor"); 

 	for(i=0;i<=99;i++){ 
 		for(j=0;j<4;j++){
 			var scampo = document.getElementById(form+':dataTable_'+i+':'+nomecampo[j]); 	
			if(scampo){
				var result = document.getElementById(form+':dataTable_'+i+':'+nomecampo[j]).value;				
				document.getElementById(form+':dataTable_'+i+':'+nomecampo[j]).value = MaskMonetario(result);
			}else{
				return false;
			}
 		} 		
 	}
}

function MaskMonetario(v){
	v=v.replace(/\D/g,""); //Remove tudo o que não é dígito
	v=v.replace(/(\d{2})$/,",$1"); //Coloca a virgula
	v=v.replace(/(\d+)(\d{3},\d{2})$/g,"$1.$2"); //Coloca o primeiro ponto
	var qtdLoop = (v.length-3)/3;
	var count = 0;
	
	while (qtdLoop > count)
	{
		count++;
		v=v.replace(/(\d+)(\d{3}.*)/,"$1.$2"); //Coloca o resto dos pontos
	}
	
	v=v.replace(/^(0)(\d)/g,"$2"); //Coloca hífen entre o quarto e o quinto dígitos
	
	if(v.substring(0,1)== ",") v= "0"+v;	//correção para 2 algarismos
	
	return v;
}

function Somaiuscula(formato, keypress, objeto){
	campo = eval(objeto);
	caracteres = 'abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQSTUVWXYZ01234567890-./: ';
	if (caracteres.search(String.fromCharCode(keypress))!=1){
		campo.value = campo.value.toUpperCase();
	}
}

</script>

 </f:verbatim>
	
</brArq:form>