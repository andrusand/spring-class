package ee.sda.firstspringproject.config;

import ee.sda.firstspringproject.beans.FirstMessage;
import ee.sda.firstspringproject.beans.SecondMessage;
import ee.sda.firstspringproject.beans.ThirdMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    SecondMessage secondMessage(){
        return new SecondMessage("This is the second message");
    }

    @Bean
    FirstMessage firstMessage(){
        return new FirstMessage("This is our first message");
    }

    @Bean
    ThirdMessage thirdMessage(){
        return new ThirdMessage();
    }
}
