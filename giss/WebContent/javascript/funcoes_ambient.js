window.onload = startClockCounter;

function startClockCounter()
{
        setInterval("showClock()",60000);
}
    
function showClock()
{
    var tempoRestante = new Number(spanTempoRestante.innerHTML);
    if (tempoRestante > 0)
      if (spanTempoRestante) spanTempoRestante.innerHTML =  tempoRestante - 1;
}        
    
/*function trocaHome(codAmbiente, urlAmbiente, urlHome)
{
	if (urlAmbiente == null || urlAmbiente == '') {
    	document.frmMenuLateral.cdAmbiente.value=''+codAmbiente;
    	document.frmMenuLateral.submit();

    	document.frmAmbiente.cdAmbiente.value=''+codAmbiente;
    	document.frmAmbiente.submit();

		document.frmUrlHome.action=''+urlHome;
		document.frmUrlHome.submit();
	}
	else {
    	document.frmTrocaFrame.url.value = urlAmbiente;
    	document.frmTrocaFrame.encerrasessao.value = '0';
		document.frmTrocaFrame.submit();
	}
}*/
function trocaHome(codAmbiente, urlAmbiente, urlHome, cdAcIntr)
{
	if (cdAcIntr == '1') {
    	document.frmMenuLateral.cdAmbiente.value=''+codAmbiente;
    	document.frmMenuLateral.submit();

    	document.frmAmbiente.cdAmbiente.value=''+codAmbiente;
    	document.frmAmbiente.submit();

		document.frmUrlHome.action=''+urlHome;
		document.frmUrlHome.submit();
	}
	else if (urlAmbiente != null || urlAmbiente != '') {
    	document.frmTrocaFrame.url.value = urlAmbiente;
    	document.frmTrocaFrame.encerrasessao.value = '0';
		document.frmTrocaFrame.submit();
	}

}

function TrocaEmpresa()
{
	var cdEmpresa = document.frmEmpresa.cdEmpresa.value;
	var cdEmpresaAtual = document.frmEmpresa.cdEmpresaAtual.value;
	var ctrl = document.frmEmpresa.CTRL.value;
	var url =  document.frmEmpresa.action;

	if (cdEmpresa && cdEmpresa > 0 && cdEmpresa != cdEmpresaAtual)
	{
		trocaHome(0, url+'?CTRL='+ctrl+'&EmpresaSelecionada='+cdEmpresa);
	}
}

function trocaProcurador(urlTrocaProcurador)
{
   	document.frmTrocaFrame.url.value = urlTrocaProcurador;
   	document.frmTrocaFrame.encerrasessao.value = '1';
	document.frmTrocaFrame.submit();
}

function navegaMapa()
{
	document.frmToggleMenu.submit();
}
