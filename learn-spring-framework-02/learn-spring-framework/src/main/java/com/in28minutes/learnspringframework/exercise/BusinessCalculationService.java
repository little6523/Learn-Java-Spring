package com.in28minutes.learnspringframework.exercise;

import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {

    private DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
        System.out.println(dataService);
        System.out.println("Business 빈 등록!!!");
    }
    public int findMax() {
        return Arrays.stream(dataService.retrieveData())
                .max().orElse(0);
    }

    public String sendMessage() {
        return dataService.sendMessage();
    }
}
