package com.demo.controller;

import com.demo.entity.Lost;
import com.demo.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LostUpdateController
 * @Description
 * @Author Hobo
 * @Date 18-11-27 下午7:43
 **/
@RestController
@RequestMapping("/")
public class LostUpdateController {

    @Autowired
    private LostService lostService;

    /*
     * @Author hobo
     * @Description : 添加一条lost信息
     * @Date 下午7:57 18-11-27
     * @Param [lost]
     * @return java.lang.Object
     **/
    @PostMapping("addLost")
    private Map<String, Object> lostAdd(Lost lost) {
        Map<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("添加信息成功", lostService.insertLost(lost));
        return objectMap;
    }

    /*
     * @Author hobo
     * @Description : 修改一条lost信息
     * @Date 下午8:25 18-11-27
     * @Param [lost]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @PostMapping("updatelost")
    private Map<String, Object> lostUpdate(Lost lost) {
        Map<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("修改信息成功", lostService.insertLost(lost));
        return objectMap;
    }


    /*
     * @Author hobo
     * @Description : 删除一条信息
     * @Date 下午8:30 18-11-27
     * @Param [id]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/


    @GetMapping
    private Map<String, Object> lostDelete(Integer id) {
        Map<String, Object> objectMap = new HashMap<String, Object>();
        objectMap.put("删除信息成功", lostService.deleteLost(id));
        return objectMap;
    }
}
