<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="shortcut icon" href="img/Dog.jpg" type="image/x-icon">
<link rel="stylesheet" href="estilo.css">
<body>
	<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-image: url("Image/pit2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	width: 100vw;
	height: 100vh;
}

form {
	background-color: rgba(0, 0, 0, 0.9);
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	padding: 80px;
	border-radius: 15px;
	color: #fff;
}

input {
	padding: 15px;
	border: none;
	outline: none;
	font-size: 15px;
}

button {
	background-color: #a51b0b;
	border: none;
	padding: 15px;
	width: 100%;
	border-radius: 10px;
	color: white;
	font-size: 15px;
}

button:hover {
	background-color: deepskyblue;
	cursor: pointer;
}
</style>
</head>
<body>
 <script>
        function validar(){
            alert(document.entrada.usuario.value);

            if((document.entrada.usuario.value == "admin") && (document.entrada.senha.value == "12345")){
				sessionStorage.setItem('usuario') = "admin";
                return true;
            } else {
                alert('usuario e/ou Senha incorretos');
                return false;
            }
        }
    </script><!--JAVA SCRIPT-->
	
	<form action="cadastrarProduto.jsp">
		<h1>Login</h1>
		<input type="text" placeholder="Nome"> <br>
		<br> <input type="password" placeholder="Senha"> <br>
		<br>
		<button>Enviar</button>
	</form>
</body>


</html>