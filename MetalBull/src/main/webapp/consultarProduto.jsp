 <%@page import="metal.modelo.Produto"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MetalBull</title>
<link rel="stylesheet" href="estilo.css">
<link rel="shortcut icon" href="img/Dog.jpg" type="image/x-icon">
</head>
<body>

	<nav class="PitBull">
		<ul>
			<li><span style="color: #ce1507">MetalBull</span></li>
			<li><img src="Image/Dog.jpg" height="60px" width="80"></li>
			<li><a href="cadastrarProduto.jsp" style="color: white;">Cadastrar
					Produto</a></li>
			<li><a href="consultarProduto.jsp" style="color: white;">Consultar
					Produto</a></li>
		</ul>
	</nav>
	<main class="PitMain">
	
		<form action="buscarProdutosControle" method="post" class="PitForm">
			<div>
				<label><strong>Busca pela Descri��o:</strong></label>
				<input type="text" name="descricao" id="descricao">
			</div>
			<br>
			<div>
				<input id="PitButton" type="submit" name="salvar"
					value="Consultar Produto">
			</div>
			
			
			<%
			if(request.getAttribute("produtos") != null){
				
			List<?> produtos = (List<?>) request.getAttribute("produtos");
			for (int contador = 0; contador<=(produtos.size()-1);contador++){
				Produto produto = (Produto) produtos.get(contador);
			
			%>
			
			<table>
				<tr>
				  <th>ID</th>
				  <th>Descri��o</th>
				  <th>Quantidade</th>
				  <th>pre�o</th>
				  <th>online</th>
				  <th></th>
				</tr>
				<tr>
				  <td><%out.print(produto.getIdProduto()); %></td>
				  <td><%out.print(produto.getDescricao()); %></td>
				  <td><%out.print(produto.getQuantidade()); %></td>
				  <td><%out.print(produto.getPreco()); %></td>
				  <td><%out.print(produto.isOnLine()); %></td>
				  
					<td><a href="excluirProduto?id=<%=produto.getIdProduto()%>"><img src="Image/lixo.jpg" width="30px"/></a></td>
				</tr>
				
			  </table>
			  
			  
          <%
          }}
		   %>
		</form>
		
		
	</main>
	<footer>
		<h3>Todos os Direitos Reservados</h3>
	</footer>
	
	
</body>
</html>