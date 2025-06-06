
function loadMasks() {
	includeJavaScript('/giss/javascript/jquery-1.3.2.min.js', loadLibMasks);
}

function loadLibMasks() {
	includeJavaScript('/giss/javascript/jquery.meio.mask.js', loadMasksJQuery);
}

function loadMasksJQuery() {
	jQuery.mask.masks = jQuery.extend(jQuery.mask.masks,{
	 decimalBr:{ mask : '99,999.999.999.999.999', type : 'reverse' },
     decimalBrDefault:{ mask : '99,999.999.999.999.999', type : 'reverse', defaultValue: '000' },
     indice:{ mask : '99999999,999999999', type : 'reverse', defaultValue: '000000000'},
     inteiro17:{ mask : '99999999999999999', type : 'reverse'},
     contacontabil:{ mask : '9.9.99.99.99.99-9', type : 'reverse'},
     razaocontabil:{ mask : '999-999'},
     cep:{ mask : '99999-999'},
     itemleicompl:{ mask : '99.99.99.99'},
     cnpj:{ mask : '99.999.999/9999-99'},
     percentualIss:{ mask : '99,99', type : 'reverse' },
     percentual:{ mask : '99,999', type : 'reverse' },
     percentualAliquota:{ mask : '99,999', type : 'reverse' },
     diaVencimento:{ mask : '99'},
     contaContabil:{ mask : '9999999999'},
     valores:{ mask : '9.999.999.999.999.999,99'}
  });

  	setMasks();
}

function setMasks() {
	(function(jQuery){jQuery(function(){jQuery('input:text').setMask();});})(jQuery);
}

function includeJavaScript(jsFile, loadFunction) {
	var domScript = document.createElement("script");
	domScript.type = "text/javascript";
	domScript.src = jsFile;
	document.body.appendChild(domScript);

	domScript.onreadystatechange = function () {
		if (domScript.readyState == 'loaded' || domScript.readyState == 'complete') {
        	loadFunction();
        }
    }
}

function desbloquearTela() {
	showDiv(false);
	FormSubmit_bloquerTeclado(false);
}

function bloquearTela() {
	showDiv(true);
	FormSubmit_bloquerTeclado(true);
}

function esconderCombosModal() {
	var objModal = document.getElementById('uiModalMessagesBodyDetailsDiv');
	if (objModal != null && objModal.style.display == 'block') {
		$('select').css({visibility:"hidden"});
	}
}

/**
* Funcao responsavel por restringir qualquer caracter que não seja
* um numero
*
* Parameters
*
**/
function onlyNum() {
	if (document.all) {// Internet Explorer
		var tecla = event.keyCode;
	} else if(document.layers) {// Nestcape
		var tecla = event.which;
	}
	if (tecla > 47 && tecla < 58) {// numeros de 0 a 9
		return true;
	}	else {
		event.keyCode = 0;
		return false;
	}
}

function cleanClipboard() {
	clipboardData.clearData();
}

function trim(entrada) {
 	if(entrada == null) return '';
	var expressao = /(^\s*)|(\s*$)/g
	return entrada.replace (expressao, "");
}

function isEmpty(entrada) {
 	return (entrada == null || trim(entrada) == '');
}

function validaAliquota(campo, nome) {
	var aliquota = trim(campo.value);

	if (isEmpty(aliquota)) { 
		alert('O campo ' + nome + ' deve ser preenchido.'); 
		campo.focus(); 
		return false;
	}
	
	var aliquotaInt = parseInt(aliquota.replace(",", ""), 10);
	
	if (aliquotaInt < 0 || aliquotaInt > 10000) {
		alert('O campo ' + nome + ' est\u00E1 fora do intervalo 0-100.'); 
		campo.focus(); 
		return false;
	}
	
	return true;
}
function onlyNumAndComma() {
	if (document.all) {// Internet Explorer
		var tecla = event.keyCode;
	} else if(document.layers) {// Nestcape
		var tecla = event.which;
	}
	if ((tecla > 47 && tecla < 58) || tecla === 44) {// numeros de 0 a 9
		return true;
	}	else {
		event.keyCode = 0;
		return false;
	}
}

