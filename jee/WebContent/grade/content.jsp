<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<%String ctx = application.getContextPath(); %>
<link rel="stylesheet" href="../css/global.css" />
    <jsp:include page="../../global/top.jsp"/>
    <jsp:include page="../../global/header.jsp"/>
   <body>
  <div id="box" class="memberClass box">
  <h1>성적관리</h1><br/>
            <div style="width:300px;margin:0 auto;text-align: left;">
			<ol>
				<li><a href="service/regist.jsp">등록</a></li>
				<li><a href="service/update.jsp">수정</a></li>
				<li><a href="service/delete.jsp">삭제</a></li>
				<li><a href="result/list.jsp">목록</a></li>
				<li><a href="service/count.jsp">카운트</a></li>
				<li><a href="service/search.jsp">검색</a></li>
			
			
			</ol>	
			</div>	
    <a href="<%=ctx %>/index.jsp">
    <img alt="home" src="<%=ctx %>/img/home.png"style="width:10%">
    </a>
</div>
</body>
</html>