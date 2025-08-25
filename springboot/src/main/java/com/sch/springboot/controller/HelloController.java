package com.sch.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {
    //맵핑 주소 get, post 방식이 있음, 방식에까른 맵핑을 따로 처리해줘야 함


    @GetMapping("/spring-mvc")
    public String springMvc(Model model){
        //msg = "홍길동 친구"
        model.addAttribute("msg","홍길동 친구");
        return "spring-mvc";    //templates > spring-mvc.html

    }
    @GetMapping("/hello")
    public String hello(Model model){
        //hello.html view에게 데이터를 전달 --> ModelAndView --> model
        model.addAttribute("msg","홍길동");
        return "hello"; // view name, 반환시 Dispatcher servlet이 받음, view name : msg ='홍길동'
    }


}
