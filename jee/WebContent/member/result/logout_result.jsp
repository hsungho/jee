<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberBean" %>     
<%@ page import="member.MemberService" %>     
<%@ page import="member.MemberServiceImpl" %>    
<%
String ctx = application.getContextPath();
%>    
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<div class="box">
	<% MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = service.show();
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	application.log("넘어온ID"+id);
	application.log("넘어온PW"+pw);
	member.setId(id);
	member.setPw(pw);
	service.logout(member);
	response.sendRedirect(ctx+"/index.jsp");
		%>	
	

			
</form>
</div>
</body>
</html>