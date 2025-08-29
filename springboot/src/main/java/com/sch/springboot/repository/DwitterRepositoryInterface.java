package com.sch.springboot.repository;

import com.sch.springboot.entity.Dwitter;
import com.sch.springboot.entity.Member;

import java.util.List;

public interface DwitterRepositoryInterface {
    String insert(Dwitter dwitter);
    List<Dwitter> findAll();
    String update(Long id);
}
