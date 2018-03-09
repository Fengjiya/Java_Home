<%--
  Created by IntelliJ IDEA.
  User: AcidCarrion
  Date: 2018/3/7
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" %>
<html>
  <head>
    <title>Servlet Learning</title>
  </head>

  <body>
  <h1>第一个Servlet小例子</h1>
  <hr>
  <a href="servlet/helloServlet">Get方式请求HelloServlet</a><br><br>

  <form action="servlet/helloServlet" method="post" >
      <br><br>

    <table style="width: 400px; border-color: blueviolet", border="1">
      <tr>
        <td >名称</td>
        <td >洲际</td>
        <td >人口数量</td>
      </tr>
        <tr>
            <td>城市选择</td>
            <td>
                <select name="aaa" style="width: 100%">
                    <option value="one">北京</option>
                    <option value="two">上海</option>
                    <option value="three">深圳</option>

                </select>
            </td>
            <td><input type="submit" value="确定" ></td>
        </tr>

    </table>
  </form>
  <br>我叫XXX，正在学习Servlet<br>
  <%--<jsp:include page="result.jsp"/>--%>

  </body>
</html>
