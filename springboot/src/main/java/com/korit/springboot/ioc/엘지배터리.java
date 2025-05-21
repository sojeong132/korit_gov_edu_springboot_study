package com.korit.springboot.ioc;

import org.springframework.stereotype.Component;

@Component      // 자동으로 클래스를 스프링 시스템에 등록
public class 엘지배터리 implements 배터리{

    @Override
    public void 전류공급() {
        System.out.println("엘지 배터리로 전류를 공급합니다.");
    }

    @Override
    public void 충전() {
        System.out.println("엘지 배터리 충전합니다.");
    }
}
