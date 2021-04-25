package com.chatting.sayung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    
    @RequestMapping("/chat")
    public ModelAndView chat(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("chat");
        return mav;
    }
}
