package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(Model model){
        model.addAttribute("myvar", "Say hello to the people.");
        model.addAttribute("var1", "Hello my name is Ruth");
        model.addAttribute("var2", "Using Variables");
        return "hometemplate";
    }

}
