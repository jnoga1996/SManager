package com.smanager.controllers;

import com.smanager.dao.repositories.AssignmentSolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AssignmentSolutionController {

    @Autowired
    private AssignmentSolutionRepository assignmentSolutionRepository;

    @RequestMapping("/AssignmentSolution/Index")
    public String index(Model model) {
        model.addAttribute("assignmentSolutions", assignmentSolutionRepository.findAll());
        return "assignmentSolution_index";
    }
}
