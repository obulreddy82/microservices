package com.rajtechnologies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service1Controller {
    private final RestTemplate restTemplate;

    public Service1Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/service-1")
    public String getService1() {
        String forObject = restTemplate.getForObject("http://spring-2/service-2", String.class);
        System.out.println("Service 2: " + forObject);
        return "Service 1 Called";
    }
}
