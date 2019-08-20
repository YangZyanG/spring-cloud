package com.example.demo.provider;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Provider {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "i'm provider, hello consumer";
    }
}
