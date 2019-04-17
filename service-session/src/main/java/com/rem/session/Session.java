package com.rem.session;

import com.alibaba.fastjson.JSONObject;

public class Session {

    public String sessionid;

    private JSONObject props;

    public class Device {
        static final String DEVICE_IOS = "ios";
        static final String DEVICE_ANDROID = "android";
        static final String DEVICE_WEB_DESKTOP = "web_desktop";
    }
    public Session(String uid) {
        this.setUid(uid);
    }
    public void setUid(String uid) {
        props.put("uid", uid);
    }
    public String getUid() {
        return (String) props.get("uid");
    }

}
