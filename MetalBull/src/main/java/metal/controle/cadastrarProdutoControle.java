package metal.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 System.out.println("Recebi A Requisi��o get !");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;chaset-UTF-8");
		
		String descricao = request.getParameter("descricao");
		int quantidade= Integer.parseInt(request.getParameter("quantidade")) ;
		double  preco = Double.parseDouble(request.getParameter("preco"));
		boolean online = false;
		if(request.getParameter("online")!=null && request.getParameter("online").equals("on"))
		online = true;
		System.out.println("[MetalBull]:" + descricao);
		System.out.println("[MetalBull]:" + quantidade);
		System.out.println("[MetalBull]:" + preco);
		System.out.println("[MetalBull :" + online);
	}

}