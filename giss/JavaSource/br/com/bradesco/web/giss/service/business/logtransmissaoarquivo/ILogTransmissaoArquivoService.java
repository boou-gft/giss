package br.com.bradesco.web.giss.service.business.logtransmissaoarquivo;

import java.util.List;

import br.com.bradesco.web.giss.service.business.consultalogarquivos.bean.ControleLogsDTO;
import br.com.bradesco.web.giss.service.business.consultalogarquivos.bean.TransmissaoArquivoLogDTO;

public interface ILogTransmissaoArquivoService {
	
	public ControleLogsDTO incluirLogTransmissaoArquivo(TransmissaoArquivoLogDTO transmissaoArquivoLogDTO);
	
	public List<ControleLogsDTO> listarLogTransmissaoArquivo(String dataInicio, String dataFim);

}
