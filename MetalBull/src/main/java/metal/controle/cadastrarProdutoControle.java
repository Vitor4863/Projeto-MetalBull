package metal.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metal.modelo.Produto;

/**
 * Servlet implementation class cadastrarProdutoControle
 */
@WebServlet("/cadastrarProdutoControle")
public class cadastrarProdutoControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cadastrarProdutoControle() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;chaset-UTF-8");

		String descricao = request.getParameter("descricao");
		String mensagem;

		RequestDispatcher dispatcher = request.getRequestDispatcher("cadastrarProduto.jsp");
		if (descricao != null && !descricao.isEmpty() && request.getParameter("quantidade") != null
				&& !request.getParameter("quantidade").isEmpty() && request.getParameter("preco") != null
				&& !request.getParameter("preco").isEmpty()) {
			
			int quantidade;
			double preco;
			
			quantidade = Integer.parseInt(request.getParameter("quantidade"));
			preco = Double.parseDouble(request.getParameter("preco"));
			boolean online = false;
			if (request.getParameter("online") != null && request.getParameter("online").equals("on"))
				online = true;
			Produto produto = new Produto(descricao, quantidade, preco, online);
			produto.salvar();
			mensagem = "Produto Cadastrado com sucesso! ";
		} else
			mensagem = "Os campos precisam ser prenchidos!";
		request.setAttribute("mensagem", mensagem);
		dispatcher.forward(request, response);
	}

}
