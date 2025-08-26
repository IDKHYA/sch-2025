package com.sch.springboot.controller;


import com.sch.springboot.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {
    //ResoinseBody 생략 가능 <-- @RestController이기 떄문이다.
    @GetMapping("/spring-api")
    public Member springApi(){
        Member member = new Member();
        member.setName("홍길동");
        member.setAge(30);
        member.setAddress("서울시");
        member.setSubject(("스프링 부트"));
        
        return member;    //클라이언트에게 전송, json 방식
    }
}
