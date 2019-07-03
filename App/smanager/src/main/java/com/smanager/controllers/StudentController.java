package com.smanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/Student/Index")
    public String index() {
        return "StudentIndex";
    }
}
