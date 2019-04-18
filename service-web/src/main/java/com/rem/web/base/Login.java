package com.rem.web.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @RequestMapping(value = "login")
    public void doLogin(String useraccount, String password) {
    }

}
