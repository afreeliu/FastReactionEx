package com.rem.web.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Page {

    @RequestMapping(value = "/login_d")
    public String login(Model model) {
        return "login_d";
    }
    @RequestMapping(value = "/")
    public String login_d(Model model) {
        return "redirect:/login_d";
    }

}
