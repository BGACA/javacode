package com.soft.bga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserClientController {
    @GetMapping
    public String test(){
        return "hello ,  i am  provider client";
    }

}
