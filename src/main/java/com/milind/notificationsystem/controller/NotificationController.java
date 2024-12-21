package com.milind.notificationsystem.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Random;

@Controller
public class NotificationController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessages(String stockName){
        double value = new Random().nextDouble(1500.0);
        return "trading stock  :"+stockName + " at value : "+ value;
    }
}
