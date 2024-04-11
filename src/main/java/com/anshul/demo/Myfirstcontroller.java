package com.anshul.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myfirstcontroller {


    @RequestMapping("m")
    public static String myMethod(){
        return "<h1> anshul coding kr rA HAI  </h1>";
    }
    @GetMapping("process-form")
        // public static String getData(@RequestParam int num1 ,@RequestParam int num2){

        //     int res =num1+num2;
        //     return String.valueOf(res) ;
        // }


        @PostMapping("process-form")
        public static String getData(@RequestParam int num1 ,@RequestParam int num2){

            int res =num1+num2;
            return String.valueOf(res) ;
        }   
    
    
}
