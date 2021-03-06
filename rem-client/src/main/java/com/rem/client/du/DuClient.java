package com.rem.client.du;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-du", fallback = DuClientHystrix.class)
public interface DuClient {

    @RequestMapping(method = RequestMethod.GET, value = "/getuser")
    String getUser(@RequestParam(value = "email") String email);

}