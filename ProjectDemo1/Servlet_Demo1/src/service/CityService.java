package service;

import DAO.DbHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Servlet_Demo1
 * @Package: service
 * @ClassName: CityService
 * @Description: java类作用描述
 * @Author: Fengjiya
 * @CreateDate: 2018/3/8 23:21
 * @UpdateUser: Fengjiya
 * @UpdateDate: 2018/3/8 23:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class CityService {
    private String name;
    private String countryCode;
    private String district;
    private List<String> cityList;

    public List<String> getCityList() throws SQLException {
        List<String> tmpList = new ArrayList<>();  //此处如果不申明临时变量，在47行会报空指针
        DbHelper dbHelper = new DbHelper();
        Connection connection = dbHelper.getConn();

        String sql = "select * from city limit 5";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next())
        {
            String tmp = resultSet.getString("Name");
//            System.out.println(tmp);
            tmpList.add(tmp);
        }

        connection.close();
        cityList = tmpList;
        return cityList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }


}
