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
 * Servlet implementation class modificarProdutoControle
 */
@WebServlet("/modificarProdutoControle")
public class modificarProdutoControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modificarProdutoControle() {
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
		
		
		 String alterar = request.getParameter("alterar");
		 String id = request.getParameter("id");
		
		 if(alterar != null && id != null) {
			 Produto produto = new Produto().buscarProdutoPorId(Integer.valueOf(id));
			 System.out.println(produto.getDescricao());
			 RequestDispatcher dispatcher = request.getRequestDispatcher("AlterarProduto.jsp");
			 response.sendRedirect("alterarProduto.jsp");
			 request.setAttribute("produto", produto);
			 dispatcher.forward(request, response);
		 }
	}

}
