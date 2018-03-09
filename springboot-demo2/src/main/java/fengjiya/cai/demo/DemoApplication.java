package fengjiya.cai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.run(args);

//		SpringApplication.run(DemoApplication.class, args);
		System.out.println("\n我就做个实验\n");
	}
}

