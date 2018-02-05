<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: AcidCarrion
  Date: 2018/2/6
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*" %>
<html>
<head>
    <title>Application 测试</title>
</head>
<body>
    获取数据库链接：
<%
    String driver = application.getInitParameter("driver");
    String url = application.getInitParameter("url");
    String user = application.getInitParameter("user");
    String password = application.getInitParameter("password");

    out.println(driver);

    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, user, password);
    Statement stmt = conn.createStatement();

    ResultSet rs = stmt.executeQuery("select * from city limit 10");
    out.println("链接数据库成功...");
%>
<%--查看结果集--%>
<%
    while (rs.next())
    {
        out.println(rs.getString(2));
    }
%>
</body>
</html>
