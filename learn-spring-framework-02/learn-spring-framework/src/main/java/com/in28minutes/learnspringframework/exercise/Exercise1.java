package com.in28minutes.learnspringframework.exercise;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Exercise1 {
    public Exercise1() {
        System.out.println("Exercise 생성자 호출!!");
    }

    public static void main(String[] args) {
        System.out.println("생성자가 이미 호출됬나요???");
        var context = new AnnotationConfigApplicationContext(Exercise1.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        System.out.println(context.getBean(BusinessCalculationService.class).sendMessage());
    }
}