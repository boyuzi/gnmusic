package com.gnmusic.controller;

import com.github.pagehelper.PageHelper;
import com.gnmusic.model.UserDomain;
import com.gnmusic.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenjinbo
 * @create 2018-05-16 16:21
 */
@Controller
@RequestMapping(value = "/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
        @RequestParam(name = "pageNum", required = false, defaultValue = "1")
            int pageNum,
        @RequestParam(name = "pageSize", required = false, defaultValue = "10")
            int pageSize){
        //开始分页
        PageHelper.startPage(pageNum,pageSize);
        return userService.findAllUser(pageNum,pageSize);
    }
}
