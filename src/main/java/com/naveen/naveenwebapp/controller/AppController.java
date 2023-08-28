package com.naveen.naveenwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("get")
    public String getContent()
    {
        return "<h1>hii iam naveen</h1>";
    }
}
