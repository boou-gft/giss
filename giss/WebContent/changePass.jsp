<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://bradesco.com.br/html_custom_components" prefix="brHtml"%>
<%@ taglib uri="http://bradesco.com.br/app_components" prefix="brApp"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;CHARSET=iso-8859-1" />
	<title>Alteração de Senha</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/template/css/tiles.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/template/css/components.css"/>">
	<link rel="stylesheet" type="text/css" media="print" href="<c:url value="/template/css/print.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/componentsExamples.css"/>">
</head>			
	
<body>

<table id="mainLayout" border="0" cellpadding="0" cellspacing="0" class="tmainpage">
<%-- HEADER --%>
<thead>
	<tr><th class="theaderPanelGrid" scope="colgroup" colspan="1" >
		<table border="0" cellpadding="0" cellspacing="0" height="57px" width="100px">
			<tbody>
				<tr><td><img src="<c:url value="/template/images/logo_marca.png"/>" class="img_logo" alt="Bradesco Dia e Noite" style="border:0" /></td></tr>
			</tbody>
		</table>
		</th>
	</tr>
</thead>
<%-- FOOTER --%>
<tfoot>
	<tr><td class="tfooterPanelGrid" colspan="1">
		<table border="0" cellpadding="0" cellspacing="0" width="745" width="745" class="tfooterPanelGrid">
		<tbody>
		<tr>
		<td class="tfooterColumnLeft"><img src="<c:url value="/template/images/canto_rodape.gif"/>"/></td>
		<td class="tfooterColumnAuto"><img src="<c:url value="/images/pixel_invisivel.gif"/>"/></td>
		<td class="footerText"><c:out value="Direitos reservados 2007 | Banco Bradesco S.A."></c:out></td>
		</tr>
		</tbody>
		</table>
	</td></tr>
</tfoot>

<tbody>
	<tr><td class="ccontext">
	<table id="content:innerLayout" border="0" cellpadding="0" cellspacing="0" class="tmainpage">
		<thead><tr><th class="tsubHeaderPanel" scope="colgroup" colspan="1"></th></tr></thead>
		<tfoot><tr><td class="thelpPanel" colspan="1"></td></tr></tfoot>
		<tbody>
			<tr><td class="ccontext">
			<table id="content:contentLayout" border="0" cellpadding="0" cellspacing="0" class="tmainpage">
				<thead><tr><th class="tmainMenuPanel" scope="colgroup" colspan="1"></th></tr></thead>
				<tbody><tr><td class="ccontext">
					   <table id="content:pageContentLayout" border="0" cellpadding="0" cellspacing="0" class="tmainpage">
						<thead><tr><th class="pathContext" scope="colgroup" colspan="1"></th></tr></thead>
						<tbody>
							<tr><td class="cbodyContext">
								<f:view locale="#{localeBean.locale}">
									<f:loadBundle basename="#{facesContext.application.messageBundle}" var="msgs" />	
									<h:form id="authenticationForm">
										<brApp:modalMessages  
											mainDivClass="uiModalMessagesMainDivIntranet"
											headerDivClass="uiModalMessagesHeaderDivIntranet"
											bodyDivClass="uiModalMessagesBodyDivIntranet"
											buttonClass="uiModalMessagesOkButtonIntranet"
											footerDivClass="uiModalMessagesFooterDivIntranet"
											textClass="uiModalMessagesTextIntranet"
											buttonLabelForError="Ok"
											buttonLabelForInfo="Ok"
											closeImage="/images/close.gif"
											id="button"/>
										
										<brHtml:brPanelGrid columns="3" cellspacing="5" border="0" columnClasses="colunm_center" styleClass="table">
											<brHtml:brOutputLabel id="label_usuario" for="usuario" value="#{msgs.login_usuario}" />
											<brHtml:brInputText id="usuario" size="8" maxlength="7" required="true" value="#{changePasswordBean.usuario}"/>
											<brHtml:brMessageColor for="usuario" />

											<brHtml:brOutputLabel id="label_senha" for="senha" value="#{msgs.login_senha}" />
											<brHtml:brInputSecret id="senha" size="8" maxlength="10" required="true" value="#{changePasswordBean.senha}" />
											<brHtml:brMessageColor for="senha" />

											<brHtml:brOutputLabel id="label_novaSenha" for="novaSenha" value="#{msgs.login_nova_senha}" />
											<brHtml:brInputSecret id="novaSenha" size="8" maxlength="10" required="true" value="#{changePasswordBean.novaSenha}" />
											<brHtml:brMessageColor for="novaSenha" />

											<brHtml:brOutputLabel id="label_novaSenhaConf" for="novaSenhaConf" value="#{msgs.login_nova_senha_conf}" />
											<brHtml:brInputSecret id="novaSenhaConf" size="8" maxlength="10" required="true" value="#{changePasswordBean.novaSenhaConf}" />
											<brHtml:brMessageColor for="novaSenhaConf" />
											
											
											<f:verbatim />
											<brHtml:brCommandButton value="#{msgs.botao_confirmar}" alt="#{msgs.botao_confirmar}"
													actionListener="#{changePasswordBean.changePass}" />
											<f:verbatim />
										</brHtml:brPanelGrid>
										
									</h:form>
									<brHtml:brPanelGroup>
												<brHtml:brCommandLink value="#{msgs.login_fail_back}" action="nav_index"/>
									</brHtml:brPanelGroup>
								</f:view>
							</td></tr>
						</tbody></table></td></tr>
				</tbody></table></td></tr>
		</tbody></table></td></tr>
</tbody></table>
</body>
</html>
