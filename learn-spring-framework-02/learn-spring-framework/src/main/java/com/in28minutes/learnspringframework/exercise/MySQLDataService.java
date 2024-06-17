package com.in28minutes.learnspringframework.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataService implements DataService{

    public MySQLDataService() {
        System.out.println("MySQL 빈 등록!!!");
    }

    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5};
    }

    public String sendMessage() {
        return "HelloWorld~!!!";
    }
}
