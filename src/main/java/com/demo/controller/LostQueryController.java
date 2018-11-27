package com.demo.controller;


import com.demo.entity.Lost;
import com.demo.service.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author hobo
 * @Description : 登录成功后展示list
 * @Date 下午7:08 18-11-27
 **/

@RestController
@RequestMapping("/")
public class LostQueryController {

    @Autowired
    private LostService lostService;

    /*
     * @Author hobo
     * @Description : 展示lost列表
     * @Date 下午7:11 18-11-27
     * @Param []
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @GetMapping("/list")
    private Map<String, Object> queryLost() {
        Map<String, Object> modelmap = new HashMap<String, Object>();
        List<Lost> lostList = lostService.queryLost();
        modelmap.put("lostList", lostList);
        return modelmap;
    }

    /*
     * @Author hobo
     * @Description : 单个查询列表 通过id查询
     * @Date 下午7:11 18-11-27
     * @Param [id]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @GetMapping("/query")
    private Map<String, Object> quertByLostId(Integer id) {
        Map<String, Object> modelmap = new HashMap<>();
        Lost lost = lostService.queryByLostId(id);
        modelmap.put("Lost", lost);
        return modelmap;
    }

    /*
     * @Author hobo
     * @Description :通过类目查询
     * @Date 下午7:30 18-11-27
     * @Param [category]
     * @return java.util.Map<java.lang.String,java.lang.Object>
     **/
    @GetMapping("/queryBycategory")
    private Map<String, Object> queryBycategory(Integer category) {
        Map<String, Object> modelmap = new HashMap<>();
        List<Lost> losts = lostService.queryBycategory(category);
        modelmap.put("Lost", losts);
        return modelmap;
    }

}
