<%@ page import="java.util.HashSet" %><%--
  Created by IntelliJ IDEA.
  User: AcidCarrion
  Date: 2018/2/5
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  errorPage="error.jsp" %>
<html>
<head>
  <title>Caipinglan Demo</title>
</head>
<body>
HelloWorld! 欢迎学习JavaWeb知识:</br></br>
<%out.println(new java.util.Date());%></br>
<br/>
<%
    for (int i = 0; i < 10; i++) {
        out.println("<font size='" + i + "'>");
%>
疯狂Java训练营 (Wild Java Camp)</font><br/>
<%}%>
<%--我是JSP注释部分--%>
<!--我是HTML注释-->
<%!
    public int count = 0;
    public String info()
    {
        return "我是时间: " + new java.util.Date();
    }
%>

<%=count++%>
<%
    out.println( info() );
%>
</body>
</html>
