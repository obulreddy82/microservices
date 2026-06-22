package com.rajtechnologies.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface ServiceBController {
    @GetMapping("/service-b")
    String getServiceB();
}
