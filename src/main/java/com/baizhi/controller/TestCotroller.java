package com.baizhi.controller;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test1")
public class TestCotroller {
    @Resource
    DruidDataSource druidDataSource;

    @RequestMapping("testDruid")
    public String testDruid(){
        System.out.println("你好未来");
        System.out.println("静夜思");
        return "index";
    }
}
