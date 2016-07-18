<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberBean" %>
    <%String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<% MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = service.show();%>
		<form action="<%=ctx %>/member/result/logout_result.jsp" method="post">
	 <input type="hidden" name="id" value=<%=member.getId()%> />
	 <input type="hidden" name="pw" value=<%=member.getPw()%>/>
	 <input type="submit" value="로그아웃"/>
		
			
</body>
</html>