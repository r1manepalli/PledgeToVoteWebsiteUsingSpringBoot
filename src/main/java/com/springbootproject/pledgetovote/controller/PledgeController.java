package com.springbootproject.pledgetovote.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PledgeController {
    @GetMapping("/hello")
    public String getHelloMessage() {
        return "Hello Spring";
    }
}

