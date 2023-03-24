package com.tme.wallboxmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tme.wallboxmanagement.api.HealthApi;

@RestController
@RequestMapping("/health/")
public class HealthController implements HealthApi {

    @GetMapping("")
    @Override
    public String health() {
        return "healthy";
    }

}
