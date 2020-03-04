<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>Welcome</title>
<!--  
 <script type= "text/javascript">
 
history.pushState(null,null,location.href);

window.onpopstate=function(){
history.go(1);
};
window.onbeforeunload = function() { return "Your work will be lost."; };

</script>-->
</head>
<body>
	<jsp:include page="temp.jsp"></jsp:include>
	<div class="main-banner" id="top">
        <img id="bg-video"
           		   src="https://mms.businesswire.com/media/20190829005587/en/729412/23/SAG_Corporate_Logo_Mar19_tcm389-177647.jpg">
        </img>

        <div class="video-overlay header-text">
            <div class="caption">
            <div class="container" align="center">
	<h1>Welcome Admin</h1>
	<br>
	

                            <li class="main-button"><a href="javascript:del();">DELETE ALL BOOKED SLOTS</a></li>


		<!--  <div>
			<button type="button" onclick="javascript:del();">DELETE ALL BOOKED SLOTS</button>
	<!--  	<button type="button" onclick="javascript:setup();">GET ALL BOOKED SLOTS</button>
		<a href="/sam">sam</a><br><br>
	-->
	<!-- form id= 'hh'>
	<table cellspacing='15' align='center'>
				<tr>
					<td><font color='darkblue' size='+3'>Add User's Gmail Id 
				</tr>
				</td>
			</table>
				<table cellspacing='30' align='center'>
			
				<tr>
					<td>Gmail Id:
					<td COLSPAN='2'>&nbsp&nbsp&nbsp<input type="email" name="emailid">
						<br>
					<br>
				<tr>
				<tr>
					<td><input type='Submit' value='Submit' />
				<tr>
			</table>
	</form-->	
         <!--   <form method="post" action="/logout"><br>
           <input type="submit" value="LOGOUT">
           </form>
        
		</div>-->
		
	

	</div>
              
                </div>
                </div>
            </div>
        </div>
    </div>
	
	
		
		<div id="result" style="color:red"></div>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
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
     <script type="text/javascript">
     $(document).ready(function(){
      
   $('#hh').submit(function(e) {
	   
	   $.ajax({        		
   		url: '/slot',
   		type: 'POST',
   		data: $(this).find("input[name = 'emailid']").val(),
   		success: function(result){
   	     alert("Successfully added");
   			console.log("ADDED");
   		}
   	});
	   
   })
     })
    </script>

    <!--  <script type="text/javascript">
    $
    
    </script>   -->

	</div>
</body>


</html>