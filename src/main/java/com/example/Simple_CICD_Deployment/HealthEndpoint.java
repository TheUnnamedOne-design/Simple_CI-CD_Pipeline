package com.example.Simple_CICD_Deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthEndpoint {

    @GetMapping("/health")
    public String healthCheck() {
        return "Application is healthy!";
    }
}
