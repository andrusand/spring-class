package ee.sda.firstspringproject.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {

    public String helloWorld(){
        return "Hello World";
    }

}
