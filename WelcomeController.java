package com.example.welcomecontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(path = "/hey",method = RequestMethod.GET)
    public String Message1(){
        return "hey from spring";
    }
    @RequestMapping(path = "/bye",method = RequestMethod.GET)
    public String Message2(){
        return "Bye";
    }
    @RequestMapping(path = "/hey/check/status",method = RequestMethod.GET)
    public String Message3(){
        return "Everything OK";
    }
    @RequestMapping(path = "/health",method = RequestMethod.GET)
    public String Message4(){
        return "Server health is up and running";
    }
}

