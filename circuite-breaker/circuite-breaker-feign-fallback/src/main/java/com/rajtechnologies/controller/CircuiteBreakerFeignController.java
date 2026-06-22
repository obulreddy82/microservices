package com.rajtechnologies.controller;

import com.rajtechnologies.service.CircuiteBreakerFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuiteBreakerFeignController {

    private final CircuiteBreakerFeignService circuiteBreakerFeignService;

    public CircuiteBreakerFeignController(CircuiteBreakerFeignService circuiteBreakerFeignService) {
        this.circuiteBreakerFeignService = circuiteBreakerFeignService;
    }
@GetMapping("/circuit-breaker-feign")
    public String getCircuitBreakerFeign() {
        String service1 = circuiteBreakerFeignService.getService1();
        return "Circuit Breaker Feign Called"+service1;
    }
}
