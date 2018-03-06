package fengjiya.cai.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot-demo2
 * @Package: fengjiya.cai.demo
 * @ClassName: GirlProperties
 * @Description: java类作用描述
 * @Author: Fengjiya
 * @CreateDate: 2018/3/6 23:06
 * @UpdateUser: Fengjiya
 * @UpdateDate: 2018/3/6 23:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cupSize;
    private int age;
    private String desc;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
