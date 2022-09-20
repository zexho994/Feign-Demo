package com.example.feignclient.api;

import com.example.feignclient.feign.MyFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class MyController {

    private final MyFeignClient feignClient;

    public MyController(MyFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @GetMapping("/serverInfo")
    public String getServerInfo() {
        return feignClient.getInfo("name");
    }

}
