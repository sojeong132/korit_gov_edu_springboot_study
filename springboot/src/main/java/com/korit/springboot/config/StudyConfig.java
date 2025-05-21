package com.korit.springboot.config;

import com.korit.springboot.ioc.BeanStudy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudyConfig {

    @Bean           // 외부 라이브러리나 내가 직접 만든게 아닐 때 @Component 대신 사용
    public BeanStudy beanStudy() {
        System.out.println("bean 생성");
        return new BeanStudy();
    }

}
