package fengjiya.cai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot-demo2
 * @Package: com.fengjiya.web
 * @ClassName: HelloController
 * @Description: java类作用描述
 * @Author: Fengjiya插件官方下载
 * @CreateDate: 2018/3/6 20:14
 * @UpdateUser: Fengjiya
 * @UpdateDate: 2018/3/6 20:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@RestController
@RequestMapping("hi")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private int age;
//
//    @Value("${desc}")
//    private String desc;

//    @RequestMapping(value = "say")
    @GetMapping("abc")
    public String index()
    {
//        return "Hello World!  罩杯: " + cupSize + " 年龄: " + age;
//        return desc;
        return girlProperties.getCupSize();
    }


}
