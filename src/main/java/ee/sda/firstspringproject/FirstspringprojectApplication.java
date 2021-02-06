package ee.sda.firstspringproject;

import ee.sda.firstspringproject.beans.AutowiredInjectionMessage;
import ee.sda.firstspringproject.beans.FirstMessage;
import ee.sda.firstspringproject.beans.SecondMessage;
import ee.sda.firstspringproject.beans.SetInjectionMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstspringprojectApplication implements CommandLineRunner {

	//Autowired Injection
	@Autowired
	AutowiredInjectionMessage autowiredInjectionMessage;


	public static void main(String[] args) {
		SpringApplication.run(FirstspringprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

    System.out.println(autowiredInjectionMessage.getMessages());
	}
}
