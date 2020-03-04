<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Login Page</title>
</head>
<body>
	<style>
	/*body{
    margin: 0;
    padding: 0;
    background: url(image.jpg);
    background-size: cover;
    background-position: center;
    font-family: sans-serif;
}*/
.login-box{
    width: 320px;
    height: 420px;
    background: rgba(0, 0, 0, 0.5);
    color: #fff;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 70px 30px;
}

h1{
    margin: 0;
    padding: 0 0 20px;
    text-align: center;
    font-size: 22px;
}
.login-box p{
    margin: 0;
    padding: 0;
    font-weight: bold;
}
.login-box input{
    width: 100%;
    margin-bottom: 20px;
}
.login-box input[type="text"], input[type="password"]
{
    border: none;
    border-bottom: 1px solid #fff;
    background: transparent;
    outline: none;
    height: 40px;
    color: #fff;
    font-size: 16px;
}
.login-box input[type="submit"]
{
    border: none;
    outline: none;
    height: 40px;
    background: #1c8adb;
    color: #fff;
    font-size: 18px;
    border-radius: 20px;
}
.login-box input[type="submit"]:hover
{
    cursor: pointer;
    background:  #ed563b;
    color: #000;
}

.login-box a{
    text-decoration: none;
    font-size: 14px;
    color: #fff;
}
.login-box a:hover
{
    color: #39dc79;
}


@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
}
</style>
	<jsp:include page="temp1.jsp"></jsp:include>

	<div class="main-banner" id="top">
        <img id="bg-video"
             src="https://mms.businesswire.com/media/20190829005587/en/729412/23/SAG_Corporate_Logo_Mar19_tcm389-177647.jpg">
        </img>

        <div class="video-overlay header-text">
        <div id = "whitecontainer">
            <div class="caption">
            <div class="login-box">
        <h1>Login</h1>
            <form action='/redirect' method='Post'>
            <!--  <p>Username</p> -->
            <input type="text" name="uid" placeholder="Enter Username"><br>
            <!-- <p>Password</p> -->
            <input type="password" name="pwd" placeholder="Enter Password">
            <input type="submit" name="submit" value="Login">
            </form>
        
        
        </div>
     
                </div>
                </div>
            </div>
        </div>
    </div>
	
	
</body>
</html>

