package br.com.bradesco.web.giss.service.business.percentualTransicao;

import java.util.List;

import br.com.bradesco.web.giss.service.business.percentualTransicao.bean.PercentualTransicaoDTO;

public interface IPercentualTransicaoService {

	List<PercentualTransicaoDTO> listar();

	String incluir(PercentualTransicaoDTO dto);

	String alterar(PercentualTransicaoDTO dto);

	String excluir(PercentualTransicaoDTO dto);

}
