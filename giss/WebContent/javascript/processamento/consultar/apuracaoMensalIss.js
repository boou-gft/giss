function habilitarBotaoProsseguirConsulta(form) {
	var objRdoConsulta = document.getElementsByName('sor');

	if (objRdoConsulta == null) return;

	var rdoConsultaSelecionado = false;
	for (var i = 0; i < objRdoConsulta.length; i++) {
		if (objRdoConsulta[i].checked) {
			rdoConsultaSelecionado = true;
			break;
		}
	}

	var objBtnProsseguir = document.getElementById(form.name + ':btnProsseguir');
	if (objBtnProsseguir == null) return;

	if (rdoConsultaSelecionado) {
		objBtnProsseguir.disabled = false;
	} else {
		objBtnProsseguir.disabled = true;
	}
}

function habilitarBotaoConsultar(form, radio) {
	
	var objHiddenRadio = document.getElementById(form.name + ':hiddenRadio');
	var rdoConsultaSelecionado = false;
	if (!radio) {
		var objRdoConsulta = document.getElementsByName('sor');
		for (var i = 0; i < objRdoConsulta.length; i++) {
			if (objRdoConsulta[i].checked) {
				objHiddenRadio.value = objRdoConsulta[i].value;
				rdoConsultaSelecionado = true;
				break;
			}
		}
	} else {
		objHiddenRadio.value = radio.value;
		rdoConsultaSelecionado = radio.checked;
	}

	var objBtnConsultar = document.getElementById(form.name + ':btnConsultar');
	var objBtnPDF = document.getElementById(form.name + ':btnPDF');
	var objBtnPlanilha = document.getElementById(form.name + ':btnPlanilha');
	if (rdoConsultaSelecionado) {
		objBtnConsultar.disabled = false;
		objBtnPDF.disabled = false;
		objBtnPlanilha.disabled = false;
	} else {
		objBtnConsultar.disabled = true;
		objBtnPDF.disabled = true;
		objBtnPlanilha.disabled = true;
	}
}