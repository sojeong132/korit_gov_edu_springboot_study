package com.korit.springboot.controller;

import com.korit.springboot.ioc.스마트폰;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IoCController {

    @Autowired      // 보관해둔 객체를 자동으로 꺼내서 줌
    private 스마트폰 s;

//    private final 스마트폰 s;             // 이걸 대신하는게 ↑ 위의 코드
//    public IoCController(스마트폰 s) {
//        this.s = s;
//    }

    @GetMapping("/ioc")
    public String get() {
        s.전원켜기();
        return null;
    }

    @GetMapping("/ioc2")
    public String get2() {
        s.전원켜기();
        return null;
    }
}
