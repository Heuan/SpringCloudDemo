package com.biz.demo.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class BizDemoController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
