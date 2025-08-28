package com.sch.springboot.controller;

import com.sch.springboot.dto.Employee;
import com.sch.springboot.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api") // /api로 들어오는 애들을 무조건 체킹
@CrossOrigin(origins = "http://localhost:3000") // React 개발 서버 주소
public class RestEmployeeController {

    private final EmployeeService employeeService;
    List<Employee> employees = new ArrayList<Employee>();

    public RestEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * 사원 등록
     */
    @PostMapping("/employees/register")
    public int register(@RequestBody Employee employee) {
        // System.out.println(employee.getName());
        // System.out.println(employee.getAddress());
       //employees.add(employee);
        //employeeService.register(employee);
        return employeeService.register(employee);
    }

    /**
     * 사원 리스트 조회
     */
    @GetMapping("/employees")
    public  List<Employee> list() {
        // System.out.println(employees.size());
        return employeeService.findAll();
    }
}

