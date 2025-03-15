package com.example.keykloacklab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class MyController {

    @GetMapping("/user")
    public String helloUser() {
        return " <h1>hello user<h1>";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "hello admin";
    }

    @GetMapping("/unknown")
    public String helloUnknown() {
        return "hello unknown";
    }

}