package com.brainfotech.school2go.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by thameema on 4/24/14.
 */
@Controller
public class HelloController {

    protected static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String welcomePage() {

        return "login";

    }

    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public String loginPage() {

        System.out.println("This is login page");
        return "login";

    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");

        return model;

    }

}
