package com.yyhr.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
 //@RestController=@Controller+@ResponseBody
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("name","Jerry");
        System.out.println("到了");
        return "hello";
    }
}