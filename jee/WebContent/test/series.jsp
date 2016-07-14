<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<% 
		for(int i=1;i<=9;i++){
			for(int j=2;j<5;j++){%>
	  <%=j%>*<%=i %>=<%=j* i %>
	  <%
	  }
	  }%>

</body>
</html>