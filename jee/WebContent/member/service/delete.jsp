<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%String ctx = application.getContextPath(); %>
        <%@ page import="member.MemberBean" %>     
<%@ page import="member.MemberService" %>     
<%@ page import="member.MemberServiceImpl" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />
</head>
<body>
<% MemberService service = MemberServiceImpl.getInstance();
MemberBean member = service.show();
%>
	<div class="box">
		<h1> 탈퇴화면</h1> 
				<form action="<%=ctx %>/member/result/delete_result.jsp" method = "post">
	  	 	   <span class = "meta">비번을 입력하세요</span><input type="password" name ="confpw"/><br />
	  	 	   <input type="hidden" name="id" value=<%=member.getId() %>/>
	 		   <input type="hidden" name="pw" value=<%=member.getPw() %>/>
	 		   <input type="submit" value="탈퇴" />
	           <input type="submit" value="취소" />
	    </form>
	<a href="<%=ctx%>/index.jsp">
		<img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/>
	</a>
	<a href="<%=ctx%>/member/member_controller.jsp">
		<img src="<%=ctx %>/img/Previous.png" alt="member" style="width: 30px"/>
	</a>
	</div>
	
</body>
</html>