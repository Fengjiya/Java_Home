package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/index")
    @RequestBody
    String home()
    {
        return "HelloWorld!";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(SampleControll
                er.class, args);
    }
}
