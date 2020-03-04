<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>log out</title>
<!--   <script type= "text/javascript">
 
history.pushState(null,null,location.href);
window.onbeforeunload = function() { return "Your work will be lost."; };

window.onpopstate=function(){
	history.go(1);
};
</script>-->
</head>
<body>
	<%

      session.invalidate();

        %>
        <jsp:include page="temp1.jsp"></jsp:include>
        	<div class="main-banner" id="top">
        <img id="bg-video"
             src="https://mms.businesswire.com/media/20190829005587/en/729412/23/SAG_Corporate_Logo_Mar19_tcm389-177647.jpg">
        </img>

        <div class="video-overlay header-text">
            <div class="caption"><br><br><br>
          <div class="container" align="center">

	<h1>
		You have Successfully logged out...
	</h1>

</div>
                </div>
                </div>
                   </div>
    </div>

</body>
</html>