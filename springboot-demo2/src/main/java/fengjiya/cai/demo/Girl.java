package fengjiya.cai.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ProjectName: springboot-demo2
 * @Package: fengjiya.cai.demo
 * @ClassName: Girl
 * @Description: java类作用描述
 * @Author: Fengjiya
 * @CreateDate: 2018/3/7 21:17
 * @UpdateUser: Fengjiya
 * @UpdateDate: 2018/3/7 21:17
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private int id;
    private String cupSize;
    private int age;

    public Girl()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }
}
