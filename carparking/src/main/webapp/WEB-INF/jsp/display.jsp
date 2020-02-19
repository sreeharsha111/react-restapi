<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	<style type="text/css">
	.container {
    padding: 150px 100px;
    
}
	</style>
	<script type= "text/javascript">
history.pushState(null,null,location.href);
window.onpopstate=function(){
	history.go(1);
};
</script>
</head>
<body>
	<jsp:include page="templete2.jsp"></jsp:include>
	
	
	<div class="container" align="center">
	<h1>Welcome Admin</h1>
	<br>
	



		<div>
			<button type="button" onclick="javascript:del();">DELETE ALL BOOKED SLOTS</button>
          <form method="post" action="/logout"><br>
           <input type="submit" value="LOGOUT">
           </form>
        
		</div>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script src="js/custom.js"></script>
		<script type="text/javascript">
		
        function del(){
        	
        	$.ajax({        		
        		url: '/slot',
        		type: 'DELETE',
        		success: function(result){
        	     alert("All slots are free now");
        			console.log("DELETED");
        		}
        	});
        	/*return fetch('/slot', {
                 method: 'delete',
                mode: 'cors',
                headers: {
                	 'Access-Control-Allow-Origin': '*',
                     'Access-Control-Allow-Headers': 'GET, PUT , POST, DELETE',
                     'Accept': 'application/json',
                     'Content-Type': 'application/json'
                 },
              })  .then(response => response.json().then(json => {
            	  return json;
              }))*/
              
                
            }
     
    </script>

	</div>
</body>
</html>