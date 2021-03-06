package sbexample.SpringBootWithHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan("sbexample.SpringBootWithHibernate")
public class SpringBootWithHibernateApplication {

	public static void main(String[] args) {
		System.out.println("main method started");
		SpringApplication.run(SpringBootWithHibernateApplication.class, args);
		System.out.println("I am in main method");
	}
}
