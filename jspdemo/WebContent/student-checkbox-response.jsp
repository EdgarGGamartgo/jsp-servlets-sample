<html>

<head><title>Student Confirmation Title</title></head>

<body>

	The student is confirmed: ${param.firstName} ${param.lastName} 
	
	The student's favorite programming languages are: <br/><br/>
	
	<ul>
	
		<%
		
			String[] langs = request.getParameterValues("favoriteLanguage");
		
		for(String tempLang: langs) {
			
			out.println("<li>" + tempLang + "</li>");
			
		}
		
		%>
	
	</ul>
	

</body>

</html>