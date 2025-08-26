package com.sch.springboot.controller;


import com.sch.springboot.dto.Member;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SpringCotroller {

    @GetMapping("/spring")
    public String spring(@RequestParam("name") String name,
                         @RequestParam("age")  int age,
                         Model model){
        System.out.println(name);   //서버 콘솔에 출력
        System.out.println(age);   //서버 콘솔에 출력
        //model 객체에 추가 --> view 전달ㅇ
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "spring";        // view name
    }

}
