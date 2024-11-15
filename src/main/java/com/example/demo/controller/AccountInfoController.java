package com.example.demo.controller;

import com.example.demo.entity.AccountInfo;
import com.example.demo.repository.AccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountInfoController {

    @Autowired
    private AccountInfoRepository accountInfoRepository;

    // GET 请求，查询所有用户信息
    @GetMapping("/accounts")
    public List<AccountInfo> getAllAccounts() {
        return accountInfoRepository.findAll();
    }
}
