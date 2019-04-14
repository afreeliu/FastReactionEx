package com.rem.web;

import com.rem.clients.DuClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    DuClient duClient;

    @RequestMapping(value = "/getuserinfo", method = RequestMethod.GET)
    public String getUserInfo(@RequestParam String uid) {
        return duClient.getUserInfo(uid);
    }

}