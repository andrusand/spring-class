package ee.sda.firstspringproject.beans;

import org.springframework.stereotype.Component;


public class FirstMessage {

    String msg;

    public FirstMessage(String msg){
        this.msg = msg;
    }

    String message(){
        return msg;
    }
}
