package com.davidportfolio.myportfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

 @Controller
public class portfolioController {
   
    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView mov = new ModelAndView("home");
        return mov;
    }
    @GetMapping("projects")
    public ModelAndView projects(){
        ModelAndView mov = new ModelAndView("projects");
        return mov;
    }
    

}
