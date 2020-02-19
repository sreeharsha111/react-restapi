<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Login Page</title>
</head>
<body>
	<style>
input[type=text], input[type=password] {
	width: 80%;
	height: 50%;
	padding: 12px 20px;
	margin: 4px 0;
	display: inline-block;
	border: 0.5px solid #ccc;
	box-sizing: border-box;
}

@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
}
</style>
	<jsp:include page="templete2.jsp"></jsp:include>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<td valign="top" align="center">
		<form action='/redirect' method='Post'>
			<table cellspacing='15' align='center'>
				<tr>
					<td><font color='darkblue' size='+4'>Login 
				</tr>
				</td>
			</table>
			<table cellspacing='30' align='center'>
				<tr>
					<td>User Id:
					<td COLSPAN='2'>&nbsp&nbsp&nbsp<input type="text" name="uid">
						<br>
					<br>
				<tr>
					<td>Password:
					<td COLSPAN='2' bordercolor='white'>&nbsp&nbsp&nbsp<input
						type="password" name="pwd" /> <br>
					<br>
				<tr>
					<td><input type='Submit' value='Submit' />
			</table>
		</form>
</body>
</html>

