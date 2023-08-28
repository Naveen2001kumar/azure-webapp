package com.naveen.naveenwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @RequestMapping("get")
    public String getContent()
    {
        return "<h1>hii iam naveen</h1>";
    }
}
