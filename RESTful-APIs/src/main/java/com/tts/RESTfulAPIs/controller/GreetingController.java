package com.tts.RESTfulAPIs.controller;


import com.tts.RESTfulAPIs.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @RequestMapping("/greeting")
    public Message greeting(
            @RequestParam(value = "name", defaultValue = "Yusuf") String name) {

        String greeting = "Hello!";

        Message m = new Message(4,greeting,name);


        return m ;


    }


}
