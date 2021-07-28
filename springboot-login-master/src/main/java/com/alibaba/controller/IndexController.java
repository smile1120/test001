package com.alibaba.controller;

import com.alibaba.bean.Result;
import com.alibaba.bean.User;
import com.alibaba.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {



    @GetMapping(value = "/")
    public String index(User user){
        return "index.html";
    }

}

