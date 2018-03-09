<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: AcidCarrion
  Date: 2018/3/8
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>我是查询结果</title>
</head>
<body>
我是查询结果<br>
<%
    System.out.println("在结果页面开始输出.....");
//    List<String> st = (List<String>) request.getAttribute("list");
    out.println("城市列表：" + (String)request.getAttribute("list"));  //此处不可以使用System.out.println

%>
</body>
</html>
