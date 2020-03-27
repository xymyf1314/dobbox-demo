package com.fan.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fan.demo.service.UserService;

/**
 * @author Fan
 * @version 1.0
 * @date 2020/3/27 16:10
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "FAN";
    }
}
