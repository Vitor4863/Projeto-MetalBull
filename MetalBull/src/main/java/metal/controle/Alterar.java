package metal.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metal.modelo.Produto;
import servico.ProdutoServico;

/**
 * Servlet implementation class Alterar
 */
@WebServlet("/Alterar")
public class Alterar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Alterar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto produto = new Produto();
		ProdutoServico servico = new ProdutoServico();
		
		produto.setIdProduto(Integer.parseInt(request.getParameter("id")));
		produto.setDescricao(request.getParameter("descricao"));
		produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
		produto.setPreco(Integer.parseInt(request.getParameter("preco")));
		produto.setOnLine(false);
		if(servico.alterar(produto)) {
			response.sendRedirect("cosultarProduto.jsp");
		
		}
	}
}


