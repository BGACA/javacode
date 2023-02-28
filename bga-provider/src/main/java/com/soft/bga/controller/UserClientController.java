package com.soft.bga.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class UserClientController {

    @Value(value = "${server.port}")
    int port;

    @GetMapping
    public String test() {
        return "hello ,  i am  provider client";
    }

}
