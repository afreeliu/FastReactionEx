package com.rem.auth.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rem.client.du.DuClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthUserController {

    @Autowired
    private DuClient duClient;

    @RequestMapping(value = "/authuser_db")
    public JSONObject authuser_db(String email, String password) {
        JSONObject ret = new JSONObject();
        ret.put("retcode", "200");
        if(!StringUtils.isNotEmpty(email)) {
            ret.put("retcode", "1");
            ret.put("retdesc", "输入的邮箱账号为空");
            return ret;
        }
        JSONObject result = JSON.parseObject(duClient.getUser(email));
        String userStr = result.getString("user");
        if(!StringUtils.isNotEmpty(userStr)) {
            ret.put("retcode", "1");
            ret.put("retdesc", "用户不存在");
            return ret;
        }
        JSONObject user = JSON.parseObject(userStr);
        String password_fromdb = user.getString("password");
        if(!StringUtils.isNotEmpty(password)) {
            ret.put("retcode", "1");
            ret.put("retdesc", "输入的密码为空");
            return ret;
        }
        if(StringUtils.isNotEmpty(password_fromdb) && password.equals(password_fromdb)) {
            return ret;
        }else {
            ret.put("retcode", "1");
            ret.put("retdesc", "登陆密码错误");
            return ret;
        }
    }

}
