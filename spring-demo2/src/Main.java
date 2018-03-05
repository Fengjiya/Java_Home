import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("HelloWorldConfig.class");

        HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");

        helloWorld.sayHello();
    }
}
