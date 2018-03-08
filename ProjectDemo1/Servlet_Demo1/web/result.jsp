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
    System.out.println("开始在结果页面输出...");
    List<String> listt = (List<String>) request.getAttribute("list");
    String st = "";
    for (int i = 0; i < listt.size(); i++) {
        st = st + listt.get(i) + ", ";
    }
    out.println("城市列表：" + st);

%>
</body>
</html>
