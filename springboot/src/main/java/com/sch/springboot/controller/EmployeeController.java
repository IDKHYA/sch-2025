package com.sch.springboot.controller;


import com.sch.springboot.dto.Employee;
import com.sch.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    public String register(@ModelAttribute Employee employee) {
        return employeeService.register(employee);
    }

}
