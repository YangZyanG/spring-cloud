package com.example.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class Consumer {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    @ResponseBody
    public String consumer(){
        String url = "http://provider/hello";

        return restTemplate.getForObject(url, String.class);
    }
}
