package com.msitpbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class MsitController {
    @RequestMapping(value = "/hello_world", method = RequestMethod.GET)
    public String helloWorld(ModelMap modelMap){

        modelMap.addAttribute("text",
                "Hello World!");

        return "hello_world";
    }
}


