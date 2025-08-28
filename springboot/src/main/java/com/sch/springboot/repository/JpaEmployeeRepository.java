package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaEmployeeRepository implements EmployeeRepositoryInterface{

    private final EntityManager em;     // Employee에 있는 entity가 붙은 객체를 불러와서 그 객체 안에 있는 필드에 맞게끔 sql에 실행시켜주는 친구

    @Autowired
    public JpaEmployeeRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Employee> selectAll() {
        return em.createQuery("select m from Employee m", Employee.class)
                .getResultList();
    }

    @Override
    public int insert(Employee employee) {
        em.persist(employee);
        return employee.getSno();
    }
}
