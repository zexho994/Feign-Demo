package com.example.feignclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "feign-server")
public interface MyFeignClient {

    @GetMapping("/server/info/{str}")
    String getInfo(@PathVariable String str);

}
