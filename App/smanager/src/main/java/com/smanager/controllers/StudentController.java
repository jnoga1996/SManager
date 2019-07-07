package com.smanager.controllers;

import com.smanager.dao.models.*;
import com.smanager.dao.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private AssignmentSolutionRepository assignmentSolutionRepository;

    @Autowired
    private SolutionRepository solutionRepository;

    @Autowired
    private AssignmentRepository assignmentRepository;

    @RequestMapping("/Student/Index")
    public String index(Model model) {
        List<Student> students = studentRepository.findAll();
        List<Teacher> teachers = teacherRepository.findAll();
        List<Solution> solutions = solutionRepository.findAll();
        List<Assignment> assignments = assignmentRepository.findAll();
        List<AssignmentSolution> assignmentSolutions = assignmentSolutionRepository.findAllAssignmentSolutions();

        model.addAttribute("students", students);
        return "StudentIndex";
    }
}
