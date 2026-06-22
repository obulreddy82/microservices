package com.rajtechnologies.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CircuiteBreakerService {

    private final RestTemplate restTemplate;

    public CircuiteBreakerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @CircuitBreaker(name = "spring-1", fallbackMethod = "service1Fallback")
    public String callService1(){

        return restTemplate.getForObject("http://localhost:8081/service-1", String.class);
    }

    public String service1Fallback(Exception ex) {
        return "Fallback from Service 1"+ ex.getMessage();
    }
}
