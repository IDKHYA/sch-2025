package com.sch.springboot.controller;


import com.sch.springboot.dto.Employee;
import com.sch.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    //생성자를 이용한 loose 커플링 DI
    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//    @ResponseBody
    @PostMapping("/register")
    public int register(@ModelAttribute Employee employee) {
        return employeeService.register(employee);
    }

    @GetMapping("/List")
    public String list(Model model) {
        List<Employee> List =  employeeService.findAll();
        model.addAttribute("list", List);
        return "employeelist";
    }

}
