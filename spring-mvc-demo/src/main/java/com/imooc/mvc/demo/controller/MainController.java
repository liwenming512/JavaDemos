package com.imooc.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/abc")
public class MainController {
	 
	@RequestMapping("/log")  
    public ModelAndView test(){  
        System.out.println("Hello,spring MVC");            
        return new ModelAndView("/login");  
    }  
}
