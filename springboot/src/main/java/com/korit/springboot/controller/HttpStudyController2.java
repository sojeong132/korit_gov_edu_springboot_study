package com.korit.springboot.controller;

// 요청 URL : /api/age 응답 데이터 : { name: 김준일, age: 32 }
// 요청 URL : /api/names 응답 데이터 : ["김일", "김이", "김삼"]
// 요청 URL : /api/students 응답 데이터 : [{name: 김준일, age: 32}, {name: 김준이, age: 33}]
// 요청 URL : /api/students2 응답 데이터 :
/*
    [
        {
            name: 김준일,
            age: 32,
            hobby: [축구, 농구]
        },
        {
            name: 김준이,
            age: 33,
            hobby: [골프, 낚시]
        }
    ]
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class HttpStudyController2 {

    @GetMapping("/age")
    public Map<String, Object> age() {
//        Map<String, Object> ageMap = new HashMap<>();         // 값을 추가해야 하는 경우 이 방법 사용
//
//        ageMap.put("name", "김준일");
//        ageMap.put("age", 32);
//
//        return ageMap;
        return Map.of("name", "김준일", "age", 32);            // 상수 취급. 추가, 삭제 불가능
    }

    @GetMapping("/names")
    public List<String> name() {
//        List<String> nameList = new ArrayList<>();
//
//        nameList.add("김일");
//        nameList.add("김이");
//        nameList.add("김삼");
//
//        return nameList;
        return List.of("김일", "김이", "김삼");

//        String[] names = {"김일", "김이", "김삼"};
//        return names;
    }

    @GetMapping("/students")
    public List<Map<String, Object>> student() {
        Map<String, Object> studentMap1 = new HashMap<>();
        Map<String, Object> studentMap2 = new HashMap<>();
        List<Map<String, Object>> studentList = new ArrayList<>();

        studentMap1.put("name", "김준일");
        studentMap1.put("age", 32);
        studentMap2.put("name", "김준이");
        studentMap2.put("age", 33);

        studentList.add(studentMap1);
        studentList.add(studentMap2);

        return studentList;
//        return List.of(
//                Map.of("name", "김준일", "age", 32),
//                Map.of("name", "김준이", "age", 33)
//        );
    }

    @GetMapping("/students2")
    public List<Map<String, Object>> student2() {
        Map<String, Object> studentMap1 = new HashMap<>();
        Map<String, Object> studentMap2 = new HashMap<>();
        List<Map<String, Object>> studentList = new ArrayList<>();

        List<String> hList = new ArrayList<>(Arrays.asList("축구", "농구"));
        String[] h2 = {"골프", "낚시"};

        studentMap1.put("name", "김준일");
        studentMap1.put("age", 32);
        studentMap1.put("hobby", hList);
        studentMap2.put("name", "김준이");
        studentMap2.put("age", 33);
        studentMap2.put("hobby", h2);

        studentList.add(studentMap1);
        studentList.add(studentMap2);

        return studentList;
    }
}
