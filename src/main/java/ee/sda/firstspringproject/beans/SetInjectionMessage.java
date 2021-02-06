package ee.sda.firstspringproject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetInjectionMessage {

    FirstMessage firstMessage;
    SecondMessage secondMessage;

    @Autowired
    public void setFirstMessage(FirstMessage firstMessage) {
        this.firstMessage = firstMessage;
    }

    @Autowired
    public void setSecondMessage(SecondMessage secondMessage) {
        this.secondMessage = secondMessage;
    }

    public String getMessages(){
        return firstMessage.message() + " " + secondMessage.message();
    }
}
