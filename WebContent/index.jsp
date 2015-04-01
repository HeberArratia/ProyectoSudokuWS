<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8"> 
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
	<script type="text/javascript" src="js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="js/codigo.js"></script>
	<!--<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>-->
	<title>Sudoku</title>
</head>
<body>
	<header class=" text-center">
	<h1>Sudoku</h1>
	<p id="mensajes">Bienvenido</p>
	</header>
	<section id="sudoku" class="container text-center ">
	<form class="" action="ClaseControlador" method="get">	
		<!-- Fila a,b y c -->
		<div class="col-lg-2 col-lg-offset-3 col-xs-4 cuadrado">
			<input type="text" id="a00" class="" name="a00" required></imput>
			<input type="text" id="a01" class="" name="a01" required></imput>
			<input type="text" id="a02" class="" name="a02" required></imput>
			<br>
			<input type="text" id="a10" class="" name="a10" required></imput>
			<input type="text" id="a11" class="" name="a11" required></imput>
			<input type="text" id="a12" class="" name="a12" required></imput>
			<br>
			<input type="text" id="a20" class="" name="a20" required></imput>
			<input type="text" id="a21" class="" name="a21" required></imput>
			<input type="text" id="a22" class="" name="a22" required></imput>
			<br>
		</div>	
		<div class="col-lg-2 cuadrado col-xs-4">	
			<input type="text" id="b00" class="" name="b00"  required></imput>
			<input type="text" id="b01" class="" name="b01"  required></imput>
			<input type="text" id="b02" class="" name="b02"  required></imput>
			<br>
			<input type="text" id="b10" class="" name="b10"  required></imput>
			<input type="text" id="b11" class="" name="b11"  required></imput>
			<input type="text" id="b12" class="" name="b12"  required></imput>
			<br>			
			<input type="text" id="b20" class="" name="b20"  required></imput>
			<input type="text" id="b21" class="" name="b21"  required></imput>
			<input type="text" id="b22" class="" name="b22"  required></imput>
			<br>
		</div>
		<div class="col-lg-2 cuadrado col-xs-4">
			<input type="text" id="c00" class="" name="c00" required></imput>
			<input type="text" id="c01" class="" name="c01" required></imput>
			<input type="text" id="c02" class="" name="c02" required></imput>
			<br>
			<input type="text" id="c10" class="" name="c10" required></imput>
			<input type="text" id="c11" class="" name="c11" required></imput>
			<input type="text" id="c12" class="" name="c12" required></imput>
			<br>			
			<input type="text" id="c20" class="" name="c20" required></imput>
			<input type="text" id="c21" class="" name="c21" required></imput>
			<input type="text" id="c22" class="" name="c22" required></imput>
			<br>	
		</div>
		<div class="col-lg-3 hidden-sm"></div>
		
		<!-- Fila d,e y f -->
		<div class="col-lg-2 col-lg-offset-3 col-xs-4 cuadrado">
			<input type="text" id="d00" class="" name="d00" required></imput>
			<input type="text" id="d01" class="" name="d01" required></imput>
			<input type="text" id="d02" class="" name="d02" required></imput>
			<br>
			<input type="text" id="d10" class="" name="d10" required></imput>
			<input type="text" id="d11" class="" name="d11" required></imput>
			<input type="text" id="d12" class="" name="d12" required></imput>
			<br>
			<input type="text" id="d20" class="" name="d20" required></imput>
			<input type="text" id="d21" class="" name="d21" required></imput>
			<input type="text" id="d22" class="" name="d22" required></imput>
			<br>
		</div>	
		<div class="col-lg-2 cuadrado col-xs-4">
			<input type="text" id="e00" class="" name="e00" required></imput>
			<input type="text" id="e01" class="" name="e01" required></imput>
			<input type="text" id="e02" class="" name="e02" required></imput>
			<br>
			<input type="text" id="e10" class="" name="e10" required></imput>
			<input type="text" id="e11" class="" name="e11" required></imput>
			<input type="text" id="e12" class="" name="e12" required></imput>
			<br>			
			<input type="text" id="e20" class="" name="e20" required></imput>
			<input type="text" id="e21" class="" name="e21" required></imput>
			<input type="text" id="e22" class="" name="e22" required></imput>
			<br>
		</div>
		<div class="col-lg-2 cuadrado col-xs-4">
			<input type="text" id="f00" class="" name="f00" required></imput>
			<input type="text" id="f01" class="" name="f01" required></imput>
			<input type="text" id="f02" class="" name="f02" required></imput>
			<br>
			<input type="text" id="f10" class="" name="f10" required></imput>
			<input type="text" id="f11" class="" name="f11" required></imput>
			<input type="text" id="f12" class="" name="f12" required></imput>
			<br>			
			<input type="text" id="f20" class="" name="f20" required></imput>
			<input type="text" id="f21" class="" name="f21" required></imput>
			<input type="text" id="f22" class="" name="f22" required></imput>
			<br>	
		</div>
		<div class="col-lg-3 hidden-sm"></div>
		<!-- Fila g,h y i -->
		<div class="col-lg-2 col-lg-offset-3 col-xs-4 cuadrado">
			<input type="text" id="g00" class="" name="g00"  required></imput>
			<input type="text" id="g01" class="" name="g01"  required></imput>
			<input type="text" id="g02" class="" name="g02"  required></imput>
			<br>
			<input type="text" id="g10" class="" name="g10"  required></imput>
			<input type="text" id="g11" class="" name="g11"  required></imput>
			<input type="text" id="g12" class="" name="g12"  required></imput>
			<br>
			<input type="text" id="g20" class="" name="g20"  required></imput>
			<input type="text" id="g21" class="" name="g21"  required></imput>
			<input type="text" id="g22" class="" name="g22"  required></imput>
			<br>
		</div>	
		<div class="col-lg-2 cuadrado col-xs-4">
			<input type="text" id="h00" class="" name="h00"  required></imput>
			<input type="text" id="h01" class="" name="h01"  required></imput>
			<input type="text" id="h02" class="" name="h02"  required></imput>
			<br>
			<input type="text" id="h10" class="" name="h10"  required></imput>
			<input type="text" id="h11" class="" name="h11"  required></imput>
			<input type="text" id="h12" class="" name="h12"  required></imput>
			<br>			
			<input type="text" id="h20" class="" name="h20"  required></imput>
			<input type="text" id="h21" class="" name="h21"  required></imput>
			<input type="text" id="h22" class="" name="h22"  required></imput>
			<br>
		</div>
		<div class="col-lg-2 cuadrado col-xs-4">
			<input type="text" id="i00" class="" name="i00"  required></imput>
			<input type="text" id="i01" class="" name="i01"  required></imput>
			<input type="text" id="i02" class="" name="i02"  required></imput>
			<br>
			<input type="text" id="i10" class="" name="i10"  required></imput>
			<input type="text" id="i11" class="" name="i11"  required></imput>
			<input type="text" id="i12" class="" name="i12"  required></imput>
			<br>			
			<input type="text" id="i20" class="" name="i20"  required></imput>
			<input type="text" id="i21" class="" name="i21"  required></imput>
			<input type="text" id="i22" class="" name="i22"  required></imput>
			<br>	
		</div>
		<div class="col-lg-3 hidden-sm"></div>
		<!-- boton -->
		<div class="col-xs-12">
			<button id="botoncomp" type="submit" value="Comprobar" class="btn btn-info boton">Comprobar</button>
		</div>
	</form>	
	<div class="col-xs-12">
	${mensaje} 
	</div>
	</section>
</body>
</html>