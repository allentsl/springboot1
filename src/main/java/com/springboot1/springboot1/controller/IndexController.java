package com.springboot1.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String say(HttpServletRequest request){
        request.setAttribute("msg","hello world");
        return "index";
    }
}
