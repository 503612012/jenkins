package com.oven.controller;

import com.oven.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户控制器
 *
 * @author Oven
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    /**
     * 通过用户名查询
     */
    @RequestMapping("/get")
    public Object get(String userName) {
        return super.success(userService.get(userName));
    }

}
