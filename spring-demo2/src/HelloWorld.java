import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String name;

    public HelloWorld()
    {
        System.out.println("This is class constructor");
    }

    public HelloWorld(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("This is name setter");

    }

    public void sayHello()
    {
        System.out.println("This is functon: say");
        System.out.println("Hello" + name);

    }
}
