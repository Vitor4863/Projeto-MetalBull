package metal.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servico.ProdutoServico;


@WebServlet("/excluirProduto")
public class excluirProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public excluirProduto() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String id = request.getParameter("id");
		 ProdutoServico servico = new ProdutoServico();
		 
		 if(servico.excluir(id)) {
			 response.sendRedirect("consultarProduto.jsp");
		 }
		RequestDispatcher dispatcher = request.getRequestDispatcher("consultarProduto.jsp");
		dispatcher.forward(request, response);
	}

}
