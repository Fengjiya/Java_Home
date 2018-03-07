<%--
  Created by IntelliJ IDEA.
  User: AcidCarrion
  Date: 2018/3/7
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Servlet Learning</title>
  </head>
  <body>
  <h1>第一个Servlet小例子</h1>
  <hr>
  <a href="servlet/HelloServlet">Get方式请求HelloServlet</a><br>

  <form action="servlet/HelloServlet" method="post">
      <input type="submit" value="POST方式请求">
  </form>
  <br>我叫XXX，正在学习Servlet
  </body>
</html>
