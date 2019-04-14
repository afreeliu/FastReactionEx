package com.rem.clients;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class DuClientHystrix implements DuClient {

    @Override
    public String getUserInfo(String uid) {
        return "-1";
    }
}