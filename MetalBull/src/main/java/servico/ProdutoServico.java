package servico;

import metal.dao.ProdutoDao;
import metal.modelo.Produto;

public class ProdutoServico {

	ProdutoDao produto = new ProdutoDao();
	
	public Produto BuscarProdutoPorId(int id) {
		return produto.BuscarProdutoPorId(id);
	}
	
	public boolean alterar(Produto id) {
		return produto.AlterarProduto(id);
	}
		
		
	
	public boolean excluir(String id ) {
		int idproduto;
		
		idproduto = Integer.parseInt(id);
		
		return produto.ExcluirProduto(idproduto);
	}
}
