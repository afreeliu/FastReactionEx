package com.rem.useraccount;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserInfo {

    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/getuserinfo" ,method = RequestMethod.GET)
    public String getuserinfo(@RequestParam String uid) {
        return "uid: " + uid;
    }

}
