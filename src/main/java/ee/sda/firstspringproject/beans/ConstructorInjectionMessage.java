package ee.sda.firstspringproject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionMessage {

    FirstMessage firstMessage;
    SecondMessage secondMessage;

    //Constructor Injection
    ConstructorInjectionMessage(FirstMessage firstMessage, SecondMessage secondMessage){
        this.firstMessage = firstMessage;
        this.secondMessage = secondMessage;
    }


    public String getMessages(){
        return firstMessage.message() + " " + secondMessage.message();
    }
}
