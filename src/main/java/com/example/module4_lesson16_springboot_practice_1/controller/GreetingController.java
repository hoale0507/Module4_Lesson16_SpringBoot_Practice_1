package com.example.module4_lesson16_springboot_practice_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public ModelAndView showGreeting(){
        return new ModelAndView("/greeting");
    }
}