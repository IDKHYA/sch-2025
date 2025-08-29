package com.sch.springboot.service;


import com.sch.springboot.entity.Member;
import com.sch.springboot.repository.JpaMemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MemberService {
    
    //Jpa Responsitory DI
    private final JpaMemberRepository memberRepository;
    @Autowired
    public MemberService(JpaMemberRepository MemberRepository) {
        this.memberRepository = MemberRepository;
    }
    
    public String save(Member member) {
        //repository 호출
        return memberRepository.insert(member);
    }

    public List<Member> list(){
        return  memberRepository.findAll();
    }
}
