package metal.controle;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metal.modelo.Produto;

/**
 * Servlet implementation class buscarProdutosControle
 */
@WebServlet("/buscarProdutosControle")
public class buscarProdutosControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buscarProdutosControle() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;chaset-UTF-8");
		String descricao= request.getParameter("descricao");
		ArrayList<Produto> produtos = new Produto().BuscarProdutoPorDescricao(descricao);
		for(Produto produto : produtos)
			System.out.println("[camisa] " + produto.getDescricao());
	}

}
