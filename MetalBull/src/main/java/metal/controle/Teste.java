package metal.controle;

import java.util.ArrayList;

import metal.dao.ProdutoDao;
import metal.modelo.Produto;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ProdutoDao().BuscarProdutosPorDescricao("a");
		System.out.println("-----> " + produtos.size());
	}
}
