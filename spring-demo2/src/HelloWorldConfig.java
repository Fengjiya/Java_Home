import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: spring-demo2
 * @Package: PACKAGE_NAME
 * @ClassName: HelloWorldConfig
 * @Description: java类作用描述
 * @Author: Fengjiya
 * @CreateDate: 2018/3/5 19:04
 * @UpdateUser: Fengjiya
 * @UpdateDate: 2018/3/5 19:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@ComponentScan
@Configuration
public class HelloWorldConfig {

    @Bean(name = "helloWorld")
    public HelloWorld helloWorld()
    {
        HelloWorld hw = new HelloWorld("蔡平兰");
        return hw;
    }
}
