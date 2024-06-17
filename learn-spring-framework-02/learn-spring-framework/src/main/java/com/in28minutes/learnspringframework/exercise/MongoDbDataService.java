package com.in28minutes.learnspringframework.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService{

    public MongoDbDataService() {
        System.out.println("Mongo 빈 등록!!!");
    }
    public int[] retrieveData() {
        return new int[] {11, 22, 33, 44, 55};
    }

    public String sendMessage() {
        return "HelloWorld~!!!";
    }
}
