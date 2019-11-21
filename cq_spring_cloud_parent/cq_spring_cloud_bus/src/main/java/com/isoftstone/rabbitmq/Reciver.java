package com.isoftstone.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Reciver {

    @RabbitHandler
    public void process(String message){
        System.out.println(message);
    }

}
