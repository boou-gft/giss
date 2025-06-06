<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="cus"%>
<%@ taglib uri="http://bradesco.com.br/arq_components" prefix="arq"%>
<%@ taglib uri="http://bradesco.com.br/presentation_core" prefix="pres"%>
<f:view>
<h:form id="frameForm">
	<pres:addResource resource="/javascript/jquery.js" />
	<pres:addResource resource="/javascript/funcoesTelaExterna.js" />
	<f:verbatim>
			<style>
				.label {
					text-align: right;
					height: 20px;
				}
				.field {
					text-align: left;
				}
			</style>
		</f:verbatim>
		<f:verbatim>
			<script type="text/javascript">
				var  $TC = jQuery.noConflict();
				$TC(document).ready(function() {$TC("#frameLocation").html("<b>Frame URL:</b> " + window.location.href.split("?")[0] + "&nbsp;&nbsp;" + "<b>Frame params:</b> " + window.location.href.split("?")[1]);});
			</script>
			<a style="top: 0; left: 0; display: block; font-family: Arial, Helvetica, sans-serif; font-size: 11px;" id="frameLocation"></a>
		</f:verbatim>
	<h:panelGrid columnClasses="label, field, label, field, label, field, label, field, label, field, label, field" columns="4" style="padding-top: 35px; padding-left: 15px; font-family: Arial, Helvetica, sans-serif; font-size: 11px; width: 100%;">
		<h:column>
			<cus:brOutputText value="Nome: " />
		</h:column>
		<h:column>
			<cus:brInputText value="#{appFrameBean.cliente.nome}" />
		</h:column>
		<h:column>
			<cus:brOutputText value="Sexo: " />
		</h:column>
		<h:column>
			<cus:brSelectOneMenu value="#{appFrameBean.cliente.sexo}">
				<f:selectItem itemLabel="Feminino" itemValue="f"/>
				<f:selectItem itemLabel="Masculino" itemValue="m"/>
			</cus:brSelectOneMenu>
		</h:column>
		<h:column>
			<cus:brOutputText value="RG: " />
		</h:column>
		<h:column>
			<cus:brInputText value="#{appFrameBean.cliente.rg}" />
		</h:column>
		<h:column>
			<cus:brOutputText value="CPF: " />
		</h:column>
		<h:column>
			<cus:brInputText value="#{appFrameBean.cliente.cpf}" />
		</h:column>
		<h:column>
			<cus:brOutputText value="Est civil: " />
		</h:column>
		<h:column>
			<cus:brSelectOneMenu value="#{appFrameBean.cliente.estadoCivil}">
				<f:selectItem itemLabel="Solteiro" itemValue="so"/>
				<f:selectItem itemLabel="Casado" itemValue="ca"/>
				<f:selectItem itemLabel="Separado" itemValue="se"/>
				<f:selectItem itemLabel="Divorciado" itemValue="di"/>
				<f:selectItem itemLabel="Viúvo" itemValue="vi"/>
			</cus:brSelectOneMenu>
		</h:column>
		<h:column>
			<cus:brOutputText value="Filhos: " />
		</h:column>
		<h:column>
			<cus:brInputText value="#{appFrameBean.cliente.filhos}" />
		</h:column>
		<h:column>
			<cus:brCommandButton onclick="exportData('appFrameHiddenID');" action="#{appFrameBean.sampleAction}" value="Ação de amostra" style="margin-left:-50px; position:absolute; left:50%; bottom: 30px; width: 100px; font-family: Arial,Helvetica,sans-serif; font-size: 11px;" />
		</h:column>
	</h:panelGrid>
</h:form>
</f:view>