<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%String ctx = application.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />
</head>
<body>
<div class ="box">
        <h1>로그인</h1><br />
  		<form action="<%=ctx %>/member/result/login_result.jsp" method = "post">
	  	   <span class = "meta">ID</span> <input type="text" name ="id"/><br />
	       <span class = "meta">비번</span><input type="password" name ="pw"/><br />
	   
	
	           <input type="submit" value="로그인" />
	           <input type="submit" value="취소" />
	           
	
	   
	 	</form>
		</div>
	</body>
</html>