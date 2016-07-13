<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%String ctx = application.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx%>/css/member2.css" />
</head>
<body>
	<div class="box">
		<h1>수정</h1> 
		<a href="<%=ctx%>/index.jsp">
			<img src="<%=ctx%>/img/home.png" alt="home" style="width: 30px"/>
		</a>
		<a href="<%=ctx %>/member/member_controller.jsp">
			<img src="<%=ctx%>/img/member.jpg" alt="member" style="width: 30px"/>
		</a>
	</div>
</body>
</html>