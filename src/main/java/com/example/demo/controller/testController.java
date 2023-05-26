package com.example.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class testController {


    @GetMapping("/hello/{str}")
    public String getHello(@PathVariable(value = "str") String str){
        return str;
    }


    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }

    @GetMapping("/hello1")
    public String getHello1(){
        return "hello1";
    }




}
