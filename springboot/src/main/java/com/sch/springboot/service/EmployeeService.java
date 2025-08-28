package com.sch.springboot.service;


import com.sch.springboot.dto.Employee;
import com.sch.springboot.repository.EmployeeRepository;
import com.sch.springboot.repository.JdbcTemplateEmployeeRepository;
import com.sch.springboot.repository.JpaEmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class EmployeeService {
    //생성자를 이용하여 EmployeeRepository를 loose -> ID
//    private final JdbcTemplateEmployeeRepository employeeRepository;
//
//    @Autowired
//    public EmployeeService(JdbcTemplateEmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
    private JpaEmployeeRepository employeeRepository;


    @Autowired
    public EmployeeService(JpaEmployeeRepository jpaEmployeeRepository) {
        this.employeeRepository = jpaEmployeeRepository;
    }


    //사원 등록
    public int register(Employee employee) {
        return employeeRepository.insert(employee);
    }
    //사원 리스트
    public List<Employee> findAll(){
        return employeeRepository.selectAll();
    }
}
