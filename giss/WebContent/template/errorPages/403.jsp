<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;CHARSET=iso-8859-1" />
	<title>Página de Erro</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/template/css/tiles.css"/>">
	<link rel="stylesheet" type="text/css" href="<c:url value="/template/css/components.css"/>">
	<link rel="stylesheet" type="text/css" media="print" href="<c:url value="/template/css/print.css"/>">
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
							<table border="0" cellspacing="6" width="100%">
								<tbody>
								<tr><td align="center"><h4> PÁGINA DE ERRO</h4></td></tr>
								<tr><td align="center"><h5> Código de Erro 403 : Acesso Negado</h5></td></tr>
								</tbody>
							</table>
							</td></tr>
						</tbody></table></td></tr>
				</tbody></table></td></tr>
		</tbody></table></td></tr>
</tbody></table>
</body>
