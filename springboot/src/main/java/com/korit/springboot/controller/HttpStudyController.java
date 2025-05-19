package com.korit.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController                 // 원랜 Controller -> ResponseBody / RestController 작성 시 ResponseBody 안 써도 됨
@RequestMapping("/api")
public class HttpStudyController {

    @GetMapping("/http")
    @ResponseBody           // 없으면 springboot mvc 과정 중 하나인 viewresolver 실행
    public String get() {
        return "";
    }

    @GetMapping("/name")
    @ResponseBody
    public String getName() {
        return "노소정";
    }


}
