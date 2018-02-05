<%--
  Created by IntelliJ IDEA.
  User: AcidCarrion
  Date: 2018/2/5
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Caipinglan Demo</title>
</head>
<body>
HelloWorld! 欢迎学习JavaWeb知识:</br></br>
<%out.println(new java.util.Date());%></br>
<br/>
<%
    for (int i = 0; i < 5; i++) {
        out.println("<font size='" + i + "'>");
%>
疯狂Java训练营 再次修改(Wild Java Camp)</font><br/>
<%}%>
</body>
</html>
