package com.fan.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fan.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Fan
 * @version 1.0
 * @date 2020/3/27 19:24
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName() {
        return userService.getName();
    }
}
