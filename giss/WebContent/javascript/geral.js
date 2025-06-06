//Funcao que valida se a data inicial � menor que a data final.
function validarDtIniMenorDtFinal(campoDtIni, campoDtFim, msgErro){ 
					
	var dtIni = document.getElementById(campoDtIni);				
	var vetDtIni;
	if(dtIni == null){
		vetDtIni = campoDtIni.split('/');	
	} else {
		vetDtIni = dtIni.value.split('/');	
	}
	
	var dtFim = document.getElementById(campoDtFim);
	var vetDtFim;
	if(dtFim == null){
		vetDtFim = campoDtFim.split('/');	
	} else {
		vetDtFim = dtFim.value.split('/');
	}	
	
	var somaDtFim = vetDtFim[2] + vetDtFim[1] + vetDtFim[0];			
	var somaDtIni = vetDtIni[2] + vetDtIni[1] + vetDtIni[0];
	
	if(parseInt(somaDtIni) >= parseInt(somaDtFim)){ 
		alert(replaceAscii(msgErro));
		return false;
	}
	return true;
}

//Funcao que valida se a data inicial � menor ou igual que a data final.
function validarDtIniMenorIgualDtFinal(campoDtIni, campoDtFim, msgErro){ 
					
	var dtIni = document.getElementById(campoDtIni);				
	var vetDtIni;
	if(dtIni == null){
		vetDtIni = campoDtIni.split('/');	
	} else {
		vetDtIni = dtIni.value.split('/');	
	}
	
	var dtFim = document.getElementById(campoDtFim);
	var vetDtFim;
	if(dtFim == null){
		vetDtFim = campoDtFim.split('/');	
	} else {
		vetDtFim = dtFim.value.split('/');
	}	
	
	var somaDtFim = vetDtFim[2] + vetDtFim[1] + vetDtFim[0];			
	var somaDtIni = vetDtIni[2] + vetDtIni[1] + vetDtIni[0];
	
	if(parseInt(somaDtIni) > parseInt(somaDtFim)){ 
		alert(replaceAscii(msgErro));
		return false;
	}
	return true;
}

//Fun��o que desabilta os combos passados como parametro.
function desabilitarCombos(formId, arrCombos){
	for(i = 0; i < arrCombos.length; i++){
		var cmbCorrente = document.getElementById(formId + ":" + arrCombos[i]);
		if(cmbCorrente != null && cmbCorrente.options.length > 0){
			cmbCorrente.options[0].text = '';
			cmbCorrente.value = '';	
			cmbCorrente.disabled = true;
		}
	}
}

//M�todo que valida a obrigatoriedade dos campos com comportamentos dinamicos e retorna as mensagens em caso de erro.
function validateRequiredDinamicos(formId, arrCampos, arrMsg) {	
	msg = "";
	for(j = 0; j < arrCampos.length; j++){	
		var campoCorrente = document.getElementById(formId + ":" + arrCampos[j]);
		if(campoCorrente != null && trim(campoCorrente.value) == ''){
			msg += montarMensagemArgs('${msgs['label_campo_obrigatorio']}', 
				new Array(arrMsg[j])) + '\n';
		}		
	}	
	return replaceAscii(msg);
}

function imprimirPagina(){
	window.print();	
}

//Funcao que valida se o campoIni � menor que o campoFim.
function validarCampoInicioMenorCampoFinal(campoIni, campoFim, msgErro){ 

	var inicio = document.getElementById(campoIni).value;
	var fim = document.getElementById(campoFim).value;
		
	if(trim(inicio) == '' || trim(fim) == '') {
		return true;
	} else if (parseInt(inicio) > parseInt(fim)){
		alert(replaceAscii(msgErro));
		return false;
	}
	return true;
}

//Fun��o que configura o bot�o de pesquisar por substrings.
function habilitarBotaoPesquisar(formId, nomeComponente){
	return !trim(document.getElementById(formId + ":" + nomeComponente).value) == '';	
}