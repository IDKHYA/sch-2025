package com.sch.springboot.controller;


import com.sch.springboot.dto.User;
import com.sch.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class UserController {

//    UserService userService =  new UserService();   // DI와 관현 코드, 강한 결합임
                                                    // new를 사용함 -> 메모리에 UserService를 올림,
                                                    // 즉, UserService의 주소값을 UserController가 가지게 되고,
                                                    // 이는 강한 결합이 됨, 즉 소유권 기준
    // 이러한 방식은 권장하지 않음.

    UserService userService;
    //생성자를 통해 Loose Coupling을 사용,
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    //생성자를 통해 Loose Coupling을 사용,
    /**@Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }**/
    @ResponseBody
    @PostMapping("/login")
    public Map<String,Object> login(User user){
        return userService.login(user);
    }

    @ResponseBody
    @PostMapping("/signup")
    public Map<String, String> sighup( User user){
        return userService.signUp(user);
    }

}
