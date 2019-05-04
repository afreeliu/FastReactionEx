package com.rem.du.useraccount.controller;

import com.alibaba.fastjson.JSONObject;
import com.rem.du.useraccount.model.UItem;
import com.rem.du.useraccount.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/getuser")
    public JSONObject getUser(@RequestParam(required = true) String email) {
        JSONObject ret = new JSONObject();
        ret.put("retcode", 200);
        UItem user = userRepository.findUserByEmail(email);
        ret.put("user", user);
        return ret;
    }

    @RequestMapping(value = "/setuser")
    public JSONObject setUser(String nickname, String email, String phonenum, String username, String password, String regtime) {
        JSONObject ret = new JSONObject();
        ret.put("retcode", 200);
        UItem user = new UItem();
        user.nickname = nickname;
        user.email = email;
        user.phonenum = phonenum;
        user.username = username;
        user.password = password;
        user.regtime = regtime;
        Object result = userRepository.saveAndFlush(user);
        return ret;
    }

}
