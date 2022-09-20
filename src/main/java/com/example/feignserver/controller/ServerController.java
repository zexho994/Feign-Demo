package com.example.feignserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("server")
public class ServerController {

    @GetMapping("/info/{str}")
    public String getInfo(@PathVariable String str) {
        if (str.equals("name")) {
            return "feign-server";
        } else {
            return "other";
        }
    }

}
