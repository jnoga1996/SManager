package com.smanager.controllers;

import com.smanager.dao.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("courses", courseRepository.findAll());

        return "course_index";
    }
}
