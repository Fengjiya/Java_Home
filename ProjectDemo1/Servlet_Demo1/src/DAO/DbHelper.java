package DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ProjectName: Servlet_Demo1
 * @Package: DAO
 * @ClassName: DbHelper
 * @Description: java类作用描述
 * @Author: Fengjiya
 * @CreateDate: 2018/3/8 22:15
 * @UpdateUser: Fengjiya
 * @UpdateDate: 2018/3/8 22:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DbHelper {
    private String driver;
    private String host;
    private String username;
    private String password;
    private Connection conn;

    public DbHelper() {
        Properties properties = new Properties();

        try {
            properties.load(DbHelper.class.getResourceAsStream("/jdbc.properties"));
            System.out.println("从jdbc.properties获取JDBC配置成功！");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("从jdbc.properties获取JDBC配置失败！");
        }
        this.driver = properties.getProperty("driver").trim();
        this.host = properties.getProperty("host").trim();
        this.username = properties.getProperty("username").trim();
        this.password = properties.getProperty("password").trim();

        try {
            Class.forName(driver);
            System.out.println("获取驱动driver成功！");
            try {
                Connection connection = DriverManager.getConnection(host, username, password);
                System.out.println("获取数据库链接成功！");
                this.conn = connection;
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("获取数控链接失败！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("获取驱动driver失败！");
        }
    }

    public Connection getConn() {
        return this.conn;
    }
}

