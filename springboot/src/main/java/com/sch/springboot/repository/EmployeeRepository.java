package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;
import com.sch.springboot.service.EmployeeService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    //사원 객체를 저장하는 List<Employee>
    private List<Employee> List = new ArrayList<Employee>();

    public List<Employee> selectAll() {
        return List;
    }


    public String insert(Employee employee) {
        String result = "";
        if(List.add(employee)) {
            //성공
            result = "success";
        }else{
            //실패
            result = "fail";
        }
        return result;
    }
}
