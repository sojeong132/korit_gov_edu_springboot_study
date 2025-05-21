package com.korit.springboot.ioc;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    Component의 종류
    1. @Component       -> 특정 기능이 정해져있지 않은 객체(나머지 객체) filter, converter, exception
    2. @Controller      -> HTTP 요청 및 응답을 처리하는 객체
    3. @Service         -> 비즈니스 로직 또는 메인로직을 정의하고 처리하는 객체
    4. @Repository      -> Database와 관련된 로직을 정의하고 처리하는 객체
    5. @Configuration   -> 설정 로직을 정의하고 처리하는 객체 또한 직접생성 후 IoC 등록을 필요로 하는 Bean 설정
 */
@Component
@AllArgsConstructor             // 24번 라인에 이어 같이 추가
public class 스마트폰 {

    @Autowired          // 26번 라인 -> 그렇기에 보통 생성자를 만들지 않고 autowired 추가
    @Qualifier(value = "삼성배터리")     // 어떤 배터리가 들어갈 지 정함
//    private 배터리 b;

    private 삼성배터리 b;            // 21번 라인 -> 그러나 귀찮을 수 있음. 그럴 때 이렇게도 사용

//    public 스마트폰(배터리 b) {          // 삼성 배터리와 엘지 배터리 두 개이므로 오류 발생
//        this.b = b;
//    }

    public void 전원켜기() {
        b.전류공급();
        System.out.println("배터리로부터 전류를 공급받아 전원을 켭니다.");
    }
}
