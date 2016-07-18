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
<title>회원정보수정</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />

<style type="text/css">
span.meta{width: 200px;background-color:yellow;float: left}
div.joinDiv{border:1px dotted gray;width: 80%;margin:10px 50px 10px 50px}	
</style>
</head>
<body>
<div class="box">
<% 
	MemberService service = MemberServiceImpl.getInstance();
	MemberBean member = service.show();
	if(member.getId().equals("")){
%> 		<h2>내정보보기(detail) 실패</h2>
<%		response.sendRedirect(ctx+"/member/service/login.jsp");		
	} 
%>
		<h1>내정보수정</h1>
	   <form action="<%=ctx %>/member/result/update_result.jsp" method="post">
		<table id="member_detail">
		
		<tr>
			<td rowspan="3" style="width:60%">
				<img src="<%=ctx %>/img/<%=member.getId()%>.jpg" alt="W3Schools.com" width="400" height="350">
			</td>
			<td class="font_bold bg_color" style="width:20%">ID</td>
			<td style="width:40%"><%=member.getId()%></td>
		</tr>
		<tr>
			<td class="font_bold bg_color">비밀번호</td>
			<td>
			<input type="text" name="pw" value="<%=member.getPw()%>" />
			</td>
		</tr>
		<tr>
			<td class="font_bold bg_color">이 름</td>
			<td><%=member.getName()%></td>
		</tr>
		<tr>
			<td class="font_bold bg_color">성 별</td>
			<td colspan="2"><%=member.getGender()%></td>
		</tr>
		<tr>
			<td class="font_bold bg_color">email</td>
			<td colspan="2">
			<input type="text" name="email" value="<%=member.getEmail()%>" />
			</td>
		</tr>
		<tr>
			<td class="font_bold bg_color">생년월일</td>
			<td colspan="2"><%=member.getSsn().substring(0,6)%></td>
		</tr>
		<tr>
			<td class="font_bold bg_color">등록일</td>
			<td colspan="2"><%=member.getRegDate()%></td>
		</tr>
	</table>
	<input type="hidden" name="id" value="<%=service.show().getId() %>"/>
	<input type="submit" value="수정"/>
	<input type="reset" value="취소"/>
	</form>
		<a href="<%=ctx %>/member/member_controller.jsp">
			<img src="<%=ctx %>/img/home.png" alt="회원관리 홈 으로" width="30" height="30">
		</a>
		<a href="<%=ctx %>/index.jsp">
			<img src="<%=ctx %>/img/Previous.png" alt="메인 홈 으로" width="30" height="30">
		</a>
	</div>
</body>
</html>