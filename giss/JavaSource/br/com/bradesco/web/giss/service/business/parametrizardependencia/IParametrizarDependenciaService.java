package br.com.bradesco.web.giss.service.business.parametrizardependencia;

import br.com.bradesco.web.giss.service.business.parametrizacaodependencia.bean.ParametrizacaoDepDTO;

public interface IParametrizarDependenciaService {
	
	public ParametrizacaoDepDTO inserirParametrizacao(Long codMunicipio, Long codEmpresa, Integer codDependencia, String chavePrivada, String urlMunicipio);
	
	public ParametrizacaoDepDTO consultarParametrizacao(Long codMunicipio, Long codEmpresa, Integer nSeqUnOrg);
	
	public ParametrizacaoDepDTO alterarParametrizacao(Long codMunicipio, Long codEmpresa, Integer nSeqUnOrg, String chavePrivada, String urlMunicipio);
	
	public ParametrizacaoDepDTO excluirParametrizacao(Long codMunicipio, Long codEmpresa, Integer nSeqUnOrg);

}
