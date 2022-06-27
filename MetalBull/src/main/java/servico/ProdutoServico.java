package servico;



import metal.dao.ProdutoDao;
import metal.modelo.Produto;

public class ProdutoServico {

	ProdutoDao produto = new ProdutoDao();
	
	public Produto buscarPorId(int idProduto) {
		return produto.buscarPorId(idProduto);
	}
	
	
	public boolean alterar(Produto pdr) {
		return produto.alterarUsuario(pdr);
	}
		
	public boolean excluir(String id ) {
		int idproduto;
		
		idproduto = Integer.parseInt(id);
		
		return produto.ExcluirProduto(idproduto);
	}
}
