package com.upc.pe.demo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greetings")
public class GreetingController {
    @GetMapping("{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("{surname}")
    public String greeting2(@PathVariable String surname) {
        return "Hello " + surname;
    }

    @GetMapping("{email}")
    public String greeting3(@PathVariable String email) {
        return "Hello " + email;
    }
}
