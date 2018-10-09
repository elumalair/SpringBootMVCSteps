<html>
<head>
<title>Welcome to Spring MVC using Spring Boot</title>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<form class="container">  
<br>
	Here are the list of your todos:
	${todos} 
	<BR/>
	Your Name is : ${username}  && {password}
	 <br>
</form>
</body>
</html>