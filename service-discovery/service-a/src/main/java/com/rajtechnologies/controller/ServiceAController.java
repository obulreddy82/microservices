package com.rajtechnologies.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface ServiceAController {
    @GetMapping("/service-a")
    String getServiceA();
}
