/*******************************************************************************
 * Function: envoy() Detecta si ya se ha hecho un submit en un formulario
 * Par�metros:no Retorno:messagem alert
 ******************************************************************************/       
var count=0;
function envoy() {                       
	if (count == 0){
		count++;
		return true;
	}else {
		alert("Os dados est�o sendo processados...");
		return false;
	}
}

/************************************************
* function naoEspeciaisApenas
* Retorna apenas caracteres n�o especiais.
* Input: myfield, e 
************************************************/       
function naoEspeciaisApenas(myfield, e)
{
	var key;
	var keychar;

	if (window.event)
		key = window.event.keyCode;
	else if (e)
		key = e.which;
	else
		return true;
	keychar = String.fromCharCode(key);
	// control keys
	if ((key==null) || (key==0) || (key==8) || 
			(key==9) || (key==13) || (key==27) )
		return true;
	// caracteres especiais
	else if ((key==39) || (key==38) || (key==64) || 
			(key==60) || (key==62) || (key==59) || 
			(key==125) || (key==123) || (key==34))
		return false;
	else
		return true;
}

/************************************************
* function : hasValue
* Descri��o : Verifica se a string nao e composta somente de 
* espa�os.
* Input: texto 
************************************************/       
function hasValue(texto) {
	var novoTexto = ""  
		for(iTmp=0;iTmp<texto.length;iTmp++) {
			if(texto.charAt(iTmp) != " ") {
				return true;
			}
		}
	return false;
}

/************************************************
* Function  : max_car
* Descri��o : Valida campo com mais de 255 caracteres
*************************************************/
function max_car(objeto,nome) {
	var desc = new String(objeto.value);
	if (desc.length > 255) {
		alert("Campo " + nome + " excedeu os 255 caracteres permitidos");
		objeto.value=desc.substring(0,255);		
		objeto.focus();			
		return false;
	}
}

/************************************************
* Function: showtip
* Cria um ToolTip
* Input: this, evento, texto
************************************************/

function showtip(current, e, text) {
	current.style.cursor = 'hand';
	if (document.all) {
		thetitle = text.split('<br>');
		if (thetitle.length > 1) {
			thetitles = '';
			for (i = 0; i < thetitle.length; i++)
				thetitles += thetitle[i];
			current.title = thetitles;
		} else 
			current.title = text;
	} else if (document.layers) {
		document.tooltip.document.write('<layer bgColor="white" style="border:1px solid black;font-size:12px;">' + text + '</layer>');
		document.tooltip.document.close();
		document.tooltip.left = e.pageX + 5;
		document.tooltip.top = e.pageY + 5;
		document.tooltip.visibility = "show";
	}
}


/************************************************
* Function: isMember
* Input: texto, texto
************************************************/
function isMember(strValue, strArray) {
	var isMemberResult = false;
	var strArrayLen = strArray.length;
	var iStrArray;

	for (iStrArray=0; iStrArray < strArrayLen; iStrArray++) {
		if (strValue == strArray[iStrArray]) {
			isMemberResult = true;
			break;
		}
	}

	return isMemberResult;
}

/************************************************
* Function: fieldFormat
* Input: inputObj, format, allowed
************************************************/
function fieldFormat(inputObj, format, allowed) {
	var thisValue = inputObj.value;
	var thisLength = thisValue.length;
	var formatLength = format.length;
	var validArray = new Array();

	for (var i=0; i < allowed.length; i++) {
		validArray[i] = allowed.substr(i,1);
	}

	for (var i=0; i < thisLength; i++) {
		if (i < formatLength) {
			if (format.substr(i,1) == '*') {
				if (!isMember(thisValue.substr(i,1), validArray)) {
					thisValue = thisValue.substr(0,i) + thisValue.substr(i+1);
					thisLength = thisValue.length;
					i--;
				}
			} else {
				if (thisValue.substr(i,1) != format.substr(i,1)) {
					thisValue = thisValue.substr(0,i) + format.substr(i,1) + thisValue.substr(i);
					thisLength = thisValue.length;
				}
			}
		} else {
			thisValue = thisValue.substr(0,i);
			thisLength = thisValue.length;
		}
	}

	if (inputObj.value != thisValue) {
		inputObj.value = thisValue;
	}
}

function carregarMunicipiosBalancetes(){
	document.getElementById("gerarBalanceteFiscalizacoesIssForm:btnCarregarMunicipios").click();
}

function carregarCodMunicipio(){
	document.getElementById("gerarBalanceteFiscalizacoesIssForm:btnCarregarCodMunicipio").click();
}

function limparMunicipios(){
	document.getElementById("gerarBalanceteFiscalizacoesIssForm:btnLimparMunicipios").click();
}

function carregarMunicipioBalancetes(){
	document.getElementById("gerarBalanceteFiscalizacoesIssForm:btnCarregarMunicipio").click();
}

function habilitarBotaoProsseguir(valor){
	if(valor == "5"){
		document.getElementById("consultarBalanceteFiscalizacoesIssForm:btnProsseguir").disabled = false;
	}else{
		document.getElementById("consultarBalanceteFiscalizacoesIssForm:btnProsseguir").disabled = true;
	}
}

function carregarMunicipiosBalancetesObrigacoesAcessorias(){
	document.getElementById("gerarBalanceteObrigacoesAcessoriasForm:btnCarregarMunicipios").click();
}

function carregarCodMunicipioObrigacoesAcessorias(){
	document.getElementById("gerarBalanceteObrigacoesAcessoriasForm:btnCarregarCodMunicipio").click();
}

function carregarMunicipioBalancetesObrigacoesAcessorias(){
	document.getElementById("gerarBalanceteObrigacoesAcessoriasForm:btnCarregarMunicipio").click();
}

function habilitarBotaoExcluirObrigacoesAcessorias(){
	document.getElementById("gerarBalanceteObrigacoesAcessoriasForm:btnExcluir").disabled = false;
}

function verificarIncluirObrigacoesAcessorias(mensagem){
	if(confirm(mensagem)){
		document.getElementById("gerarBalanceteObrigacoesAcessoriasForm:hdnCondicaoIncluirExcluir").value = "S";
	}else{
		document.getElementById("gerarBalanceteObrigacoesAcessoriasForm:hdnCondicaoIncluirExcluir").value = "N";
	}
}

function verificarExcluirObrigacoesAcessorias(mensagem){
	if(confirm(mensagem)){
		document.getElementById("gerarBalanceteObrigacoesAcessoriasForm:hdnCondicaoIncluirExcluir").value = "S";
	}else{
		document.getElementById("gerarBalanceteObrigacoesAcessoriasForm:hdnCondicaoIncluirExcluir").value = "N";
	}
}

/************************************************
* Function: habilitarBotoesManterMunicipio
* Input: form, radio
************************************************/
function habilitarBotoesManterMunicipio(form, radio){	
	var hidden =-1;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'manterMunicipio:hiddenRadioMunicipioManter'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}

		if (form.elements[i].id == 'manterMunicipio:btnAlterar'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'manterMunicipio:btnExcluir'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'manterMunicipio:btnConsultar'){		
			form.elements[i].disabled=false;
		}		
	}	
}

/************************************************
* Function: checaCamposObrigatorios
* Input: form, msgcampo, msgnecessario, msgvencimento, 
msgpgto, msgformapagto, msgbasecalculo, msgaliquotapadrao, 
msgtipoincidencia
************************************************/
function checaCamposObrigatorios(form, msgcampo, msgnecessario, msgvencimento, msgpgto, msgformapagto, msgbasecalculo, msgaliquotapadrao, msgtipoincidencia){
	var	campos, hidden;
	campos = '';
	for(i=0; i<form.elements.length; i++){

		if (form.elements[i].id == 'manterMunicipio:hiddenObrigatoriedade'){
			hidden = form.elements[i];
		}

		if (form.elements[i].id == 'manterMunicipio:vencimento'){
			if (form.elements[i].value == ''){
				campos = campos + msgcampo + ' ' + msgvencimento + ' ' + msgnecessario + '\n';
			}
		}

		if (form.elements[i].id == 'manterMunicipio:pagto'){
			if (form.elements[i].value == ''){
				campos = campos + msgcampo + ' ' + msgpgto + ' ' + msgnecessario + '\n';
			}
		}

		if (form.elements[i].id == 'manterMunicipio:formaPagamento'){		
			if (form.elements[i].value == ''){
				campos = campos + msgcampo + ' ' + msgformapagto + ' ' + msgnecessario + '\n';
			}					
		}

		if (form.elements[i].id == 'manterMunicipio:txtBaseCalculo'){		
			if (form.elements[i].value == ''){
				campos = campos + msgcampo + ' ' + msgbasecalculo + ' ' + msgnecessario + '\n';	
			}					
		}


		if (form.elements[i].id == 'manterMunicipio:txtAliquotaPadrao'){				
			if (form.elements[i].value == ''){
				campos = campos + msgcampo + ' ' + msgaliquotapadrao + ' ' + msgnecessario + '\n';
			}					
		}

		if (form.elements[i].id == 'manterMunicipio:tipoIncidencia'){	
			if (form.elements[i].value == ''){
				campos = campos + msgcampo + ' ' + msgtipoincidencia + ' ' + msgnecessario + '\n';	
			}					
		}
	}
	if (campos != ''){
		hidden.value  ='F';
		alert(campos);
		campos = '';
	}else{
		hidden.value  ='T';
	}
}		
/************************************************
* Function: radioGridPesquisaAgencia
* Input: form, radio
************************************************/			

function radioGridPesquisaAgencia(form, radio){	
	var hidden=-1;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'manterMunicipio:btnProsseguir2'){
			form.elements[i].disabled=false;
		}	
		if (form.elements[i].id == 'manterMunicipio:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}			
	}	
}

/************************************************
* Function: checaCamposObrigatoriosManterMenuProsseguirConta
* Input: form, msgcampo, msgnecessario, msgtiposervico
************************************************/		

function checaCamposObrigatoriosManterMenuProsseguirConta(form, msgcampo, msgnecessario, msgtiposervico){
	var	campos, hidden =-1;
	campos = '';
	for(i=0; i<form.elements.length; i++){

		if (form.elements[i].id == 'manterMunicipio:hiddenObrigatoriedadeConta'){
			hidden = form.elements[i];
		}

		if (form.elements[i].id == 'manterMunicipio:tipoServico'){
			if (form.elements[i].value == ''){
				campos = campos + msgcampo + ' ' + msgtiposervico + ' ' + msgnecessario + '\n';
			}
		}				
	}
	if (campos != ''){
		hidden.value  ='F';
		alert(campos);
		campos = '';
	}else{
		hidden.value  ='T';
	}
}	
/************************************************
* Function: radioGridPesquisaConta
* Input: form, radio
************************************************/	

function radioGridPesquisaConta(form, radio){	
	var	campos;
	campos = '';
	var hidden=-1;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'manterMunicipio:btnFinalizar'){
			form.elements[i].disabled=false;
		}	
		if (form.elements[i].id == 'manterMunicipio:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}			
	}	
}	
/************************************************
* Function: habilitarBotoes
* Input: form, radio
************************************************/	
function habilitarBotoes(form, radio){	
	var hidden=-1;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'historicoMunicipioConsultarForm:btnConsultar'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'historicoMunicipioConsultarForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}
	}	
}
/************************************************
* Function: habilitarBotoesHistoricoMunicipioConta
* Input: form, radio
************************************************/
function habilitarBotoesHistoricoMunicipioConta(form, radio){	
	var hidden=-1;	


	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'historicoMunicipioContasForm:btnConsultar'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'historicoMunicipioContasForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}
	}	
}	

function selecionar_todos_checkbox(form,retorno){
	var selecionados = document.getElementById("reprocessamentoMunicipioForm:hndMunicipiosSelecionados");

	alert("selecinados 2" + selecionados.value);	
	if(retorno==true){
		selecionados.value="";
		for(i=0;i<form.elements.length;i++){
			if(form.elements.elements[i].type=="checkbox" && form.elements.elements[i].name!="reprocessamentoMunicipioForm:checkSelecaoPrincipal"){
				if(form.elements.elements[i].checked==false){
					form.elements.elements[i].checked=true;							
				}else{
					form.elements.elements[i].checked=true;							
				}														
				selecionados.value = selecionados.value + form.elements.elements[i].id + ",";		
			}
		}					
		selecionados.value = selecionados.value.slice(0, selecionados.value.lastIndexOf(","));
	} 
	else {
		selecionados.value = "";
		for(i=0;i<form.elements.length;i++){
			if(form.elements.elements[i].type=="checkbox" && form.elements.elements[i].name!="reprocessamentoMunicipioForm:checkSelecaoPrincipal"){
				if(form.elements.elements[i].checked==true){
					form.elements.elements[i].checked=false;
					selecionados.value = "";
				}
			}
		}
	}
}
/************************************************
* Function: habilitarBotoesManterDependenciaMunicipio
* Input: form, radio
************************************************/

function habilitarBotoesManterDependenciaMunicipio(form, radio){	
	var hidden=-1;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'manterDependenciaMunicipio:btnProsseguir1'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'manterDependenciaMunicipio:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}
	}	
}

/************************************************
* Function: habilitarBotoesAliquotaDiferenciada
* Input: form, radio
************************************************/
function habilitarBotoesAliquotaDiferenciada(form, radio){	
	var hidden=-1;	

	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'aliquotaDiferenciadaForm:btnProsseguir'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].id == 'aliquotaDiferenciadaForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}
	}	
}

/************************************************
* Function: habilitaBotaoConsultarSaldosDivergentes
* Input: form, radio
************************************************/

function habilitaBotaoConsultarSaldosDivergentes(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'saldosDivergentesForm:btnConsultar'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].name == 'saldosDivergentesForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}

	}	
}

/************************************************
* Function: habilitaBotaoConsultarApurcaoAposFechamento
* Input: form, radio
************************************************/

function habilitaBotaoConsultarApurcaoAposFechamento(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'consultarApuracaoAposFechamentoForm:btnProsseguir2'){
			form.elements[i].disabled=false;
		}

		if (form.elements[i].name == 'consultarApuracaoAposFechamentoForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}

	}	
}


/************************************************
* Function: habilitaBotaoConsultarApurcaoAposFechamento
* Input: form, radio
************************************************/

function habilitaBotaoDepConsultaApuracaoAposFechamento(form, radio){	
	var hidden;
	for(i=0; i<form.elements.length; i++)
	{
		if (form.elements[i].id == 'depConsultarApuracaoAposFechamentoForm:btnProsseguir'){
			form.elements[i].disabled=false;
		}
		
		if (form.elements[i].id == 'depConsultarApuracaoAposFechamentoForm:btnPlanilhaEletronica'){
			form.elements[i].disabled=false;
		}
		
		if (form.elements[i].name == 'depConsultarApuracaoAposFechamentoForm:hiddenRadio'){		
			hidden = form.elements[i];
			hidden.value = radio.value;	
		}

	}	
}
function guardar_idChkSelecionado(form,selecionado){

	var selecionados = document.getElementById("reprocessamentoMunicipioForm:hndMunicipiosSelecionados");

	if(selecionado.checked == true){
		selecionados.value = selecionados + selecionado.id + ",";
	}else{
		selecionados.value = "";
		for(i=0;i<form.elements.length;i++){
			if(form.elements[i].type=="checkbox" && form.elements[i].name!="reprocessamentoMunicipioForm:checkSelecaoPrincipal"){
				if(form.elements[i].checked==true){
					selecionados.value = selecionados.value + form.elements[i].id + ",";	
				}
			}
		}
	}
	alert("selecinados 2" + selecionados.value);	
}




/*
* Browser-safe get object. Tries all three approaches to get an object
* by its element Id.
*
* Param:               objId - String - id of element to retrieve.
* Param:               formId - String - id of form (optional).
* Returns:             element or null if not found.
*/
function getObj(objId, formId) {
	var fullId = objId;
	if (formId != null && formId.length > 0) {
		fullId = formId + ':' + objId;
	}
	//alert('getting object: ' + fullId);
	var elem = null;
	if (document.getElementById) {
		elem = document.getElementById(fullId);
	} else if (document.all) {
		elem = document.all[fullId];
	} else if (document.layers) {
		elem = document.layers[fullId];
	}
	return elem;
}    


var cmdBtnId = 'cmdbtn';
var formId = 'frm1';                    
var checkBoxArrayId = 'chk';
function onChangeSelect(checkbox) {
	// Render the transfer button if one or more checkboxes are selected
	hideOrShowObject(formId, cmdBtnId, checkBoxArrayHasChecked(checkBoxArrayId));
}


/* 
* Browser-safe. Checks to see if an array of check boxes has any which are 
* checked. Boxes have ids like check[0], check[1], ... , check[n] where 'check' 
* is the base Id that has been assigned to the group.
*
* Param:               arrayId - String - id of element group to change
* Returns:             boolean (true one or more checked) false (else)
*/
function checkBoxArrayHasChecked(arrayId) {
	for (i = 0; ; i++) {
		id = arrayId + '[' + i + ']';
		elem = getObj(id);
		if (elem == null) {
			break;
		} else if (elem.checked) {
			return true;
		}
	}
	return false;
}
/*
* Browser-safe. Sets the visibility of an element using CSS visibility
*
* Param:               objId - String - id of element to change
* Param:               state - boolean - true (show element) false (hide element)
* Returns:             nothing
*/                                                             
function hideOrShowObject(formId, objId, state) {
	var elem = getObj(objId, formId);
	if (elem != null) {
		if (state) {
			elem.style.visibility = 'visible';
		} else {
			elem.style.visibility = 'hidden';
		}               
	}
}



/*
* Browser-safe. Check or uncheck an array of checkboxes. Boxes have ids
* like check[0], check[1], ... , check[n] where 'check' is the base Id that
* has been assigned to the group.
*
* Param:               arrayId - String - id of element group to change
* Param:               state - boolean - true (check all elements) false (uncheck all elements)
* Returns:             nothing
*/
function checkBoxArraySet(arrayId, state) {
	for (i = 0; ; i++) {
		id = arrayId + '[' + i + ']';
		elem = getObj(id);
		if (elem == null) {
			break;
		} else {
			elem.checked = state;
		}
	}   
}

function setAll(state) {
	// Set the checkBox array on or off
	checkBoxArraySet(checkBoxArrayId, state);
	// Render the transfer button if one or more checkboxes are selected
	hideOrShowObject(formId, cmdBtnId, checkBoxArrayHasChecked(checkBoxArrayId));
}  

function proximoCampo(quatindade,form,campoAtual,proximoCampo){

	var sCampoAtual = document.forms [form].elements [campoAtual].value;

	if(sCampoAtual.length == quatindade){
		document.forms [form].elements [proximoCampo].focus(); 
	}

}

function aplicamascara(sform,scampo,sfuncao){
	v_obj= document.forms [sform].elements [scampo];
	v_fun=sfuncao    
	setTimeout("execmascara()",1)
}

function execmascara(){
	v_obj.value=v_fun(v_obj.value)
}

function validarData(sform,scampo,periodo, msgdia, msgmes, msgano ){

	if ((document.forms [sform].elements [scampo] != null) && (document.forms [sform].elements [scampo].value != '')){

		var valor = parseFloat(document.forms [sform].elements [scampo].value);

		if(valor != null){	
			if (periodo == 'dia'){	
				if ((valor == 0) || (valor > 31)){
					document.forms [sform].elements [scampo].value = '';
					document.forms [sform].elements [scampo].focus();
					alert(msgdia);

				}
			} else if (periodo == 'mes'){	
				if ((valor == 0) || (valor > 12)){
					document.forms [sform].elements [scampo].value = '';
					document.forms [sform].elements [scampo].focus();
					alert(msgmes);
				}
			} else{
				if ((valor < 1970) || (valor > 2999)){
					document.forms [sform].elements [scampo].value = '';
					document.forms [sform].elements [scampo].focus();
					alert(msgano);
				}		
			}
		}
	}
}

function numeros(v){
	return v.replace(/\D/g,"");
}



function validaTecla(valores, event) { 
	var BCK=8, 
	ETR=13,  
	DEL=127, 
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
		return true; 
	default: 
		if(valores.indexOf(key)!=-1) { 
			return true; 
		} 
	} 

	return false; 
} 

var BrowserDetect = {
		init: function () {
	this.browser = this.searchString(this.dataBrowser) || "An unknown browser";
	this.version = this.searchVersion(navigator.userAgent)
	|| this.searchVersion(navigator.appVersion)
	|| "an unknown version";
	this.OS = this.searchString(this.dataOS) || "an unknown OS";
},
searchString: function (data) {
	for (var i=0;i<data.length;i++)	{
		var dataString = data[i].string;
		var dataProp = data[i].prop;
		this.versionSearchString = data[i].versionSearch || data[i].identity;
		if (dataString) {
			if (dataString.indexOf(data[i].subString) != -1)
				return data[i].identity;
		}
		else if (dataProp)
			return data[i].identity;
	}
},
searchVersion: function (dataString) {
	var index = dataString.indexOf(this.versionSearchString);
	if (index == -1) return;
	return parseFloat(dataString.substring(index+this.versionSearchString.length+1));
},
dataBrowser: [
              { 	string: navigator.userAgent,
            	  subString: "OmniWeb",
            	  versionSearch: "OmniWeb/",
            	  identity: "OmniWeb"
              },
              {
            	  string: navigator.vendor,
            	  subString: "Apple",
            	  identity: "Safari"
              },
              {
            	  prop: window.opera,
            	  identity: "Opera"
              },
              {
            	  string: navigator.vendor,
            	  subString: "iCab",
            	  identity: "iCab"
              },
              {
            	  string: navigator.vendor,
            	  subString: "KDE",
            	  identity: "Konqueror"
              },
              {
            	  string: navigator.userAgent,
            	  subString: "Firefox",
            	  identity: "Firefox"
              },
              {
            	  string: navigator.vendor,
            	  subString: "Camino",
            	  identity: "Camino"
              },
              {		// for newer Netscapes (6+)
              string: navigator.userAgent,
              subString: "Netscape",
              identity: "Netscape"
              },
              {
            	  string: navigator.userAgent,
            	  subString: "MSIE",
            	  identity: "Explorer",
            	  versionSearch: "MSIE"
              },
              {
            	  string: navigator.userAgent,
            	  subString: "Gecko",
            	  identity: "Mozilla",
            	  versionSearch: "rv"
              },
              { 		// for older Netscapes (4-)
              string: navigator.userAgent,
              subString: "Mozilla",
              identity: "Netscape",
              versionSearch: "Mozilla"
              }
              ],
              dataOS : [
                        {
                        	string: navigator.platform,
                        	subString: "Win",
                        	identity: "Windows"
                        },
                        {
                        	string: navigator.platform,
                        	subString: "Mac",
                        	identity: "Mac"
                        },
                        {
                        	string: navigator.platform,
                        	subString: "Linux",
                        	identity: "Linux"
                        }
                        ]

};
BrowserDetect.init();

function fmtMoeda(valor,decimais){
	var v = valor+"";
	if(!decimais)decimais=2;
	var ret="";
	var neg=v.substring(0,1)=="-";
	v=v.replace(/[^\d\.]/g,"");
	v=v.split(".");
	var pos=v[0].length;
	while(pos>3){
		ret="."+v[0].substring(pos-3,pos)+ret;
		pos-=3;
	}
	ret=v[0].substring(0,pos)+ret+",";
	var dec=v[1]?v[1]:"";
	for(var i=0;i<decimais;i++)dec+="0";
	ret+=dec.substring(0,decimais);
	if(neg)ret="-"+ret;
	return ret;
}
function f(s){
    var conta=0;
    var r=/\(\d+\)/;
    var mult=s.match(r);
    if(mult)
      conta+=parseInt(mult[0].replace(/\D/g,""),10)-1;
    var noves=s.replace(r,"").match(/9/g);
    if(noves)
      conta+=noves.length;
    return conta;
  }
/* Verifica se o valor de um campo bate com o padrão informado no formato */
function vNumero(obj,formato){
  var reDecimal = /^(-?(\d+|\d{1,3}(\.\d{3})+)(\,\d*)?|\,\d+)?$/;
  var reSinal=/^S/;
  var valor=obj.value;
  var ints,decs;
  var aceitaSinal=reSinal.test(formato);
  formato=formato.replace(reSinal,"");
  formato=formato.split("V");
  
  ints=f(formato[0]);
  decs=formato.length>1?f(formato[1]):0;
  var negativo=/^-/.test(valor);
  if(!aceitaSinal && negativo){
    alert("Valor não pode ser negativo: "+valor);
    obj.value="";
    obj.focus();
    return false;
  }
  
  if(! reDecimal.test( valor ) ) {
    alert( "Valor inválido: " + valor );
    obj.value = "";
    obj.focus();
    return false;
  }
  valor=valor.replace(/(^0*)|[^0-9,]/g,"").replace(",",".");
  partes=valor.split(".");
  if(partes[0].length==0){
    valor="0"+valor;
  }
  if(partes[0].length>ints){
    alert("Valor máximo excedido: "+ints+" casas inteiras"  );
    obj.focus();
    obj.value="";
    return false;
  }
  if(partes.length>1){
    if(decs==0){
      alert("O campo não aceita casas decimais");
      obj.focus();
      obj.value="";
      return false;
    }
    if(partes[1].length>decs){
      alert( "Valor inválido\nDigite apenas " + decs + " casas decimais." );
      obj.focus();
      obj.value="";
      return false;
    }
  }
  if(negativo)valor="-"+valor;
  if(decs>0){
    obj.value=fmtMoeda(valor,decs);
  }
  return true;
}


function currencyMask(fld, milSep, decSep, e, maxLength, qtdCasas) {
	var backspace = 8; 
	var del = 46;
	var espaco = 32;
	var enter = 13;
	var sep = 0;
	var chave = '';
	var i = 0;
	var j = 0;
	var len = 0;
	var len2 = 0;
	var strCheck = '0123456789';
	var aux = '';
	var aux2 = '';
	var whichCode = (window.Event) ? e.which : e.keyCode;
	if (whichCode == enter || whichCode == espaco) return false;
	if (whichCode == backspace || whichCode == del) return true;
	if (fld.value.length >= maxLength) return false;
	chave = String.fromCharCode(whichCode);
	if (strCheck.indexOf(chave) == -1) return false;
	len = fld.value.length;
	for(i = 0; i < len; i++)
		if ((fld.value.charAt(i) != '0') && (fld.value.charAt(i) != decSep)) break;
	aux = '';
	for(; i < len; i++)
		if (strCheck.indexOf(fld.value.charAt(i))!=-1) aux += fld.value.charAt(i);
	aux += chave;
	len = aux.length;
	if (len == 0) fld.value = '';
	if (len == 1) fld.value = '0' + decSep + '0' + aux; 
	if (len == 2) fld.value = '0' + decSep + aux; 
	if (len > 2) { 
		aux2 = '';
		for (j = 0, i = len - 3; i >= 0; i--) {
			if (j == 3) {
				aux2 += milSep;
				j = 0;
			}
			aux2 += aux.charAt(i);
			j++;
		}        
		fld.value = '';
		len2 = aux2.length;
		for (i = len2 - 1; i >= 0; i--) 
			fld.value += aux2.charAt(i);
		fld.value += decSep + aux.substr(len - qtdCasas, len);
	}
	return false;
}
/*
* Percorre por todos forms da tela, e retorna o primeiro elemento encontrado com o id fornecido.
* Segue a estrutura do JSF  "formid:elementid"
*/
function gId(s){
	var o=null;
	for(var i=0;!o && i<document.forms.length;i++){
		o=document.getElementById(document.forms[i].id+":"+s);
	}
	return o;
}

/*
*Recebe uma lista de ids, e informa se todos eles estao preenchidos.
*Os ids devem conter apenas o  
* @return
*/
function preenchidos(){
	var ret=true;
	for(var i=0;i<arguments.length;i++){
		o=gId(arguments[i]);
		if(o==null){
			alert("Elemento nao encontrado:"+arguments[i]);
		}
		ret &= o.value!="" && o.value!=0;
	}
	return ret;
}
function desbloqTela(){
	showDiv(false);
	FormSubmit_bloquerTeclado(false);
	 blockScroll(true);
	return true;
}

function mascara_num(obj){
  valida_num(obj)
  if (obj.value.match("-")){
    mod = "-";
  }else{
    mod = "";
  }
  valor = obj.value.replace("-","");
  valor = valor.replace(",","");
  if (valor.length >= 3){
    valor = poe_ponto_num(valor.substring(0,valor.length-2))+","+valor.substring(valor.length-2, valor.length);
  }
  obj.value = mod+valor;
}

function poe_ponto_num(valor){
  valor = valor.replace(/\./g,"");
  if (valor.length > 3){
    valores = "";
    while (valor.length > 3){
      valores = "."+valor.substring(valor.length-3,valor.length)+""+valores;
      valor = valor.substring(0,valor.length-3);
    }
    return valor+""+valores;
  }else{
    return valor;
  }
}

function valida_num(obj){
  numeros = new RegExp("[0-9]");
  while (!obj.value.charAt(obj.value.length-1).match(numeros)){
    if(obj.value.length == 1 && obj.value == "-"){
      return true;
    }
    if(obj.value.length >= 1){
      obj.value = obj.value.substring(0,obj.value.length-1)
    }else{
      return false;
    }
  }
}