<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberBean" %>
            <%String ctx = application.getContextPath();%>
        <!DOCTYPE html>
<html lang= "en">
<head>
<meta charset="UTF-8">
<title>회원가입2</title>
<link rel="stylesheet" href="../../css/member.css" />
<style type="text/css">
span.meta{width: 200px;background-color:yellow;float: left}
div.joinDiv{border:1px dotted gray;width: 80%;margin:10px 50px 10px 50px}	
</style>
</head>
<body>
<div class ="box">
<%
MemberService service = MemberServiceImpl.getInstance();
MemberBean member = new MemberBean();
String name="",id="",pw="",ssn="",email="";
name=request.getParameter("name");
id = request.getParameter("id");
pw = request.getParameter("pw");
ssn = request.getParameter("ssn");
email = request.getParameter("email");
if(name.equals("")||id.equals("")||pw.equals("")||ssn.equals("")){
%>
        <h2>가입실패!!</h2>
        <a href="<%=ctx%>/member/service/regist.jsp"></a>
<%
}else{
	member.setId(id);
	  member.setPw(pw);
	  member.setName(name);
	  member.setSsn(ssn);
	  member.setRegDate(); 
	  member.setEmail(email);
	  String msg = service.regist(member); 
}                     %>
	    		회원가입을 축하드립니다. <%=request.getParameter("name") %> 님
   				
   					<a href="<%=ctx %>index.jsp">
			
			
			<img src="<%=ctx %>/img/home.png" alt="home" style="width: 30px"/>
		</a>
		<a href="../member_controller.jsp">
			<img src="<%=ctx %>/img/Previous.png" alt="member" style="width: 30px"/>
		</a>
			</div>
</body>
</html>