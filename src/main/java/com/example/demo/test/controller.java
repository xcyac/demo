package com.example.demo.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {


    @GetMapping(value = "/test")
    public String test(@RequestParam(value = "param") String param){
        if (param.contains("11")){
            return param;
        }else if (param.contains("22")){
            return param;
        }else {
            return param;
        }
    }
}
