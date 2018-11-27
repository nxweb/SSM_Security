package com.demo.controller;


import com.demo.entity.SysUser;
import com.demo.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Object add(SysUser sysUser){
        if (userService.findByName(sysUser.getUsername())!=null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message","用户名被使用");
            return jsonObject;
        }
        return userService.add(sysUser);
    }

}
