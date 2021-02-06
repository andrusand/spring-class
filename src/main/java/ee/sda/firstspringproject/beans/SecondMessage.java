package ee.sda.firstspringproject.beans;

import org.springframework.stereotype.Component;

@Component
public class SecondMessage {

    String message(){
        return "This is the second message";
    }
}
