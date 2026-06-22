package com.rajtechnologies.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import com.rajtechnologies.service.CircuiteBreakerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuiteBreakerController {

    private final CircuiteBreakerService circuiteBreakerService;

    public CircuiteBreakerController(CircuiteBreakerService service) {
        this.circuiteBreakerService = service;
    }

    @GetMapping("/hello")
    public String hello(){
        String s = circuiteBreakerService.callService1();
        System.out.println("Service 1 called" +s);
        return "Service 1 called" +s;
    }
}
