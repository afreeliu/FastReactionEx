package com.rem.client.du;

import org.springframework.stereotype.Component;

@Component
public class DuClientHystrix implements DuClient {

    public String getUser(String email) {
        return "-1";
    }
}