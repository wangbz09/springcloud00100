package com.yjy.it.docker.sc00000020springcloudquickstart;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
 
@Controller
@SpringBootApplication
public class App  {
 
    @ResponseBody
    @RequestMapping(value = "/")
    String home() {   
        return "Hello World!wangbz up";
    }
 
    public static void main(String[] args) throws Exception {
        //SpringApplication.run(App.class, args);
    	SpringApplication.run(App.class, "--server.port=8081");
    }
 
}