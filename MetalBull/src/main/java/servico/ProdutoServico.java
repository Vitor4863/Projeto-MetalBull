package servico;

import metal.dao.ProdutoDao;
import metal.modelo.Produto;

public class ProdutoServico {

	ProdutoDao produto = new ProdutoDao();
	
	public boolean alterar(Produto produto) {
		return false;
		
		
	}
	public boolean excluir(String id ) {
		int idproduto;
		
		idproduto = Integer.parseInt(id);
		
		return produto.ExcluirProduto(idproduto);
	}
}
