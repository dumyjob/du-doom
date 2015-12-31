package com.du.doom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author shenxf
 * date:2015/12/20.
 * Spring MVC 测试
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(Model model){

        model.addAttribute("messages","Hello the world!");

        return "hello";
    }

}
