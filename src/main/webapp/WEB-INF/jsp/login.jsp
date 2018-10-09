<html>
<head>
<title>Welcome to Spring MVC using Spring Boot</title>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<form method="post">
	<table class="container">
	<thead class="table">Welcome to Spring MVC using Spring Boot !!</thead> <br><br>
	
	<h2><font color="red"> ${errorMessage} </font></h2>
	<tr>Username :	<input type="text" name="username"/> </tr><br>
	<tr>Password :  <input type="password" name="password"/></tr><br>
	<tr><input type="submit" value="Submit"/></tr>
	
	</table>
</form>
</body>
</html>