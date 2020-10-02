package com.example.wfc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/recipe")
    public String recipe() {
        return "recipe";
    }

    @RequestMapping("/benefits")
    public String benefits() {
        return "benefits";
    }

    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }
}
