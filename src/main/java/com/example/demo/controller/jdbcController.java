package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;
import java.util.List;
@RestController
public class jdbcController {
    final
    JdbcTemplate jdbcTemplate;

    public jdbcController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //写一个list请求，查询数据库信息
    @GetMapping("list")
    public List<Map<String,Object>> list(){

        String sql="select * from accountinfo";
        List<Map<String,Object>> list_map=jdbcTemplate.queryForList(sql);
        return list_map;

    }

}

