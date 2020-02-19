<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type= "text/javascript">
history.pushState(null,null,location.href);
window.onpopstate=function(){
	history.go(1);
};
</script>
</head>
<body>
	<%

      session.invalidate();

        %>

	<h1>
		<font color="Red">You are Sucessfully logged out...</font>
	</h1>

	<a href="welcome">Go-Back To Home Page</a>

</body>
</html>