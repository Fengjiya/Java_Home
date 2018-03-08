package servlet;

import service.CityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 * @ProjectName: Servlet_Demo1
 * @Package: ${PACKAGE_NAME}
 * @ClassName: ${NAME}
 * @Description: java类作用描述
 * @Author: Fengjiya
 * @CreateDate: 2018/3/7 23:40
 * @UpdateUser: Fengjiya
 * @UpdateDate: 2018/3/7 23:40
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@WebServlet(name = "helloServlet", urlPatterns = "/servlet/helloServlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("处理Get请求...");
//        super.doGet(request, response);
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=utf-8");
        out.println("Helle Serdavlet!<br>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("处理Post请求...");
//        super.doPost(request, response);
//        PrintWriter out = response.getWriter();
//        response.setContentType("text/html; charset=utf-8");
//        out.println("Helle Servalet!<br>");

//        response.sendRedirect("result.jsp");
//        request.getRequestDisatcher("result.jsp");
        List<String> list = null;
        try {
            list = (new CityService()).getCityList();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("开始输出前五个城市名称："+ list);
        request.setAttribute("list", list);
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}

