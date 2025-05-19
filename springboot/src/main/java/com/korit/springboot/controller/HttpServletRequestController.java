package com.korit.springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
    HttpServletRequest 객체란?
    외부에서 Tomcat 웹 서버로 요청 시 생성되는 요청정보객체이다.
 */

@RestController
public class HttpServletRequestController {

//    @GetMapping("/api/name2")
////    public String getName2(HttpServletRequest request) {        // 리플랙션 개념
//    public String getName2(@RequestParam(required = false, value = "address") String a) {   // value = "address" 안할거면 변수명을 키 값과 맞춰야함 -> String address
////        System.out.println(request.getParameter("address"));
//        System.out.println(a);
//        return "노소정";
//    }

    @GetMapping("/api/name2")
    public String getName2(
            @RequestParam(required = false, value = "address") String a,
            @RequestParam(required = false) int b) {
        System.out.println(a);
        System.out.println(b + 10);
        return "노소정";
    }
}

