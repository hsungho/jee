<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%String ctx = application.getContextPath(); %>
<!DOCTYPE html>
<html lang= "en">
<head>
<meta charset="UTF-8">
<title>회원가입2</title>
<link rel="stylesheet" href="<%=ctx%>/css/member.css" />

<style type="text/css">
span.meta{width: 200px;background-color:yellow;float: left}
div.joinDiv{border:1px dotted gray;width: 80%;margin:10px 50px 10px 50px}	
</style>
</head>
<body>
<div class ="box">
	  <form action="<%=ctx %>/member/result/regist_result.jsp" method = "post">
	  <span class = "meta">이름</span><input type="text" name ="name"/><br />
	  <span class = "meta">ID</span> <input type="text" name ="id"/><br />
	  <span class = "meta">비밀번호</span><input type="text" name ="pw"/><br />
	  <span class = "meta">SSN</span><input type="text" name ="ssn"/><br />
	  
		
		<input type="submit" value="회원가입" />
		<input type="reset" value="취소" />
	</form>

	</div>
</body>
</html>