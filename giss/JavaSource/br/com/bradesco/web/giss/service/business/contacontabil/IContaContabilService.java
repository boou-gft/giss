package br.com.bradesco.web.giss.service.business.contacontabil;

import java.util.List;

import javax.faces.model.SelectItem;

import br.com.bradesco.web.giss.service.business.contacontabil.bean.ContaContabilDTO;

/**
 * 
 * <p>
 * <b>Título:</b>
 * </p>
 * <p>
 * <b>Descriçao:</b>
 * </p>
 * <p>
 * Interface do adaptador: ContaContabil
 * </p>
 * 
 * @comment CODIGO GERADO AUTOMATICAMENTE DO PLUGIN WDE
 * @author CPM S/A
 * @version 1.0
 */
public interface IContaContabilService {
    
	public void listaGridContasContabeisIncluir(ContaContabilDTO dto, String origem);
	
    public void listaGridContasContabeis(ContaContabilDTO dto, String origem);
    
    public void listaGridContasContabeisHistorico(ContaContabilDTO dto);
    
    public String incluirContaContabil(ContaContabilDTO contaContabil);
    
    public String alterarContaContabil(ContaContabilDTO contaContabil);
    
    public String excluirContaContabil(ContaContabilDTO contaContabil);
  
    public String excluirContaContabilPorConta(ContaContabilDTO contaContabil);

	public List<SelectItem> listarComboTipoServico();
	
}

