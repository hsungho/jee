<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberBean" %>     
<%@ page import="member.MemberService" %>     
<%@ page import="member.MemberServiceImpl" %>    
<%
String ctx = application.getContextPath();
%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />
</head>
<body>
	<div class="box">
	<% MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = service.findById(request.getParameter("id"));
	String pw = request.getParameter("pw");
	String id = request.getParameter("id");
	String confpw = request.getParameter("confpw");
	response.sendRedirect(ctx+"/index.jsp");
	if(pw.equals(confpw)){
		member.setId(id);
		member.setPw(pw);
		String msg = service.delete(member);
		
		if(msg.equals("삭제성공")){
%>			<h2>탈퇴성공</h2>
			<a href="<%=ctx%>/index.jsp">학생 관리시스템</a>
<%		} else {
%>		    <h2>탈퇴실패</h2>
			<a href="<%=ctx%>/member/service/delete.jsp">탈퇴 다시</a>
      <%} 
	} else {
		%><h2>비밀번호가 틀려서 탈퇴실패</h2>
		<a href="<%=ctx%>/member/service/delete.jsp">탈퇴 다시</a>
	<% }
	%>
     			
	</div>
	
</body>
</html>