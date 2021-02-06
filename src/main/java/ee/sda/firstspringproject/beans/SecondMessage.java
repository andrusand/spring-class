package ee.sda.firstspringproject.beans;

import org.springframework.stereotype.Component;

public class SecondMessage {

    String msg;

    public SecondMessage(String msg) {
        this.msg = msg;
    }

    String message(){
        return msg;
    }
}
