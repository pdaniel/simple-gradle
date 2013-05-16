package com.gopivotal.soleng.examples.simple.gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    private final GreetingService service;

    @Autowired
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @RequestMapping(value="/hello/{greeting}", produces={"application/json"})
    public ResponseEntity<Greeting> hello(@PathVariable("greeting") String greeting) {
        Greeting instance = service.createGreeting(greeting);
        return new ResponseEntity<Greeting>(instance, HttpStatus.OK);
    }

}
