<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%String ctx = application.getContextPath(); %>
<!DOCTYPE html>
<html>
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
	<div class="box">
		<h1>회원정보 변경 (비번)</h1> 
		<form action="<%=ctx %>/member/result/update_result.jsp" method = "post">
	  	  
	  	  <p><span class = "meta"> 현재비번</span> <input type="password" name ="pw"/><br /></p>
	  	  
	      <p><span class = "meta"> 새로운비번</span><input type="password" name ="pw1"/><br /></p>
	      <p><span class = "meta"> 비번확인 </span><input type="password" name ="pw2"/><br /></p>
		  <br /><br />
	
	
		<input type="submit" value="확인" />
		
		<input type="reset" value="취소" />
			</form>
	</div>

</body>
</html>