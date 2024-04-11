package com.anshul.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myfirstcontroller {


    @RequestMapping("m")
    public static String myMethod(){
        return "anshul coding kr rA HAI";
    }
    
}
