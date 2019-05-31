package com.rem.du.useraccount.controller;

import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private WebApplicationContext context;
    private MockMvc mockMvc;
    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();  //构造MockMvc
    }
    @Test
    public void testSetUser() throws Exception {
        JSONObject params = new JSONObject();
        params.put("nickname", "jacklaiu");
        params.put("email", "jacklaiu@qq.com");
        params.put("phonenum", "13268108673");
        params.put("username", "jacklaiu");
        params.put("password", "queue11235813");
        params.put("regtime", System.currentTimeMillis() + "");
        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.post("/setuser")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.ALL)
                        .content(params.toJSONString().getBytes())).andReturn();
    }

}
