package com.cg.user.controller;

import com.cg.user.VO.ResponseTemplateVO;
import com.cg.user.entity.User;
import com.cg.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User userEntity){
       log.info("Inside saveUser method of UserService");
       return userService.saveUser(userEntity);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment method of UserService");
        return userService.getUserWithDepartment(userId);
    }
}
