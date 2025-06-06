function validar() {
  return validateForm(document.forms[0]);
}	
	
function getQuery(key) {
   if (window.XMLHttpRequest) {
	 req = new XMLHttpRequest();
   } else if (window.ActiveXObject) {
	 req = new ActiveXObject("Microsoft.XMLHTTP");
   }
 	
	//don't send a request to the server if no value is selected 
	if (key=="") {
		return;
	}
	//if not ready, abort the previous request
	if (req.readyState != 0) {
		req.abort();
	} 

	//servlet url, pass the search key
	var str = location.href;
	var array_url = str.split("/");
	var context = array_url[3];
	var url = "/"+context+"/AjaxServlet?key=" +key;
	//send request to the server
	if (req != null) {
	    req.open("GET", url, true);
	    req.onreadystatechange = processResponse;
	    req.send(null);
	}
}

function processResponse() {
	if (req.readyState == 4){
		//process only if OK
        if (req.status == 200)	{
			if(req.responseText==null) { 
			}
			else {
				parseResponse(req.responseText);
			}
		}
	}
}

function parseResponse(result){
	 document.getElementById('clientValidateRequiredForm:nome_banco').value = result;
}

/*
 *  Utilizado na tela de transfer?ncia. A data de agendamento deve ser igual ou superior a atual.
 *
 *
 */
function fverDataPosterior(nome){

	if (nome.length > 0 && nome != null) {

	var dia = nome.substring(0,2);
	var mes = nome.substring(3,5);
	var ano = nome.substring(6);
	
	var datadigitada= new Date(ano,(mes-1),dia);
	var miliqq = datadigitada.getTime();

    var diaConvertido = datadigitada.getDate();
    var mesConvertido = (datadigitada.getMonth())+1;
    var anoConvertido = datadigitada.getYear();
       
    var mydate= new Date();
    
    var dia1 =  mydate.getDate();
    var mes1 =  (mydate.getMonth())+1;
    var ano1 =  mydate.getYear();
           
    var mili=mydate.getTime();
     
    if((diaConvertido != dia1) || (mesConvertido != mes1) || (anoConvertido != ano1) ) {
      if (miliqq < mili ) {
        alert("Data Digitada deve ser maior que a atual");
        return false;
       }
    }  
    
   }
}
