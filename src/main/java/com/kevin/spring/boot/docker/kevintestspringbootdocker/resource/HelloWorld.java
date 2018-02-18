package com.kevin.spring.boot.docker.kevintestspringbootdocker.resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/rest/kevin/hello")
public class HelloWorld {

    @GetMapping
    public String hello() {
        return "Hello Kevin";
    }

}
