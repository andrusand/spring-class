package ee.sda.firstspringproject.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredInjectionMessage {

    @Autowired
    FirstMessage firstMessage;

    @Autowired
    SecondMessage secondMessage;

    @Autowired
    ThirdMessage thirdMessage;

    public String getMessages(){
        return firstMessage.message() + " " + secondMessage.message() + " " + thirdMessage.message();
    }

}
