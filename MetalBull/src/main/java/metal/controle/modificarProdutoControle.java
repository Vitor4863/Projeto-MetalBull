package metal.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class modificarProdutoControle
 */
@WebServlet("/modificarProdutoControle")
public class modificarProdutoControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public modificarProdutoControle() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;chaset-UTF-8");
		
		String apagar = request.getParameter("apagar");
		
		System.out.println(apagar);
	}

}
