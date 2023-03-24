package com.tme.wallboxmanagement.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This interface will provide the basic functionalities for the health services
 *
 * @author c.filocamo
 * @author f.locatelli
 * @author w.forcignano
 *
 */
@RestController
@RequestMapping("health")
public interface HealthApi {

    @GetMapping("/")
    public String health();

}
