package br.com.bradesco.web.giss.service.business.movnaotrib;

import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribContaTotalDTO;
import br.com.bradesco.web.giss.service.business.movnaotrib.bean.MovNaoTribProsseguirTotalDTO;

public interface IMovNaoTribService {
	
	public MovNaoTribProsseguirTotalDTO listarDependencias(String codMunicipio, String dataCompetencia, Long codPessoaJurid, Integer codDependencia);
	
	public MovNaoTribContaTotalDTO listarContas(String codMunicipio, int dataCompetencia,long codPessoaJuridica,int nSeqUnidOrganizacional);

}

