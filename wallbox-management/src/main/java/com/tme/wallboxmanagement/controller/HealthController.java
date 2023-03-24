package com.tme.wallboxmanagement.controller;

import com.tme.wallboxmanagement.api.HealthApi;

public class HealthController implements HealthApi {

    @Override
    public String health() {
        return "healthy";
    }

}
