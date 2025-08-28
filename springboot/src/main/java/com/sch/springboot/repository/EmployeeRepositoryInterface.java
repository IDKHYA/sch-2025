package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;

import java.util.List;

/**
 * 인터페이스의 자식을 통해서 생성 ---> 자식은 인터페이스의 모든 메소드를 오버라이딩 해야함 ⭐💫🌟💫💫🌠
 */
public interface EmployeeRepositoryInterface {
    public List<Employee> selectAll();
    public int insert(Employee employee);
}