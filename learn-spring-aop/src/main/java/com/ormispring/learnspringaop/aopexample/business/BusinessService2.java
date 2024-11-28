package com.ormispring.learnspringaop.aopexample.business;

import com.ormispring.learnspringaop.aopexample.data.DataService1;
import com.ormispring.learnspringaop.aopexample.data.DataService2;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessService2 {

  private DataService2 dataService2;

  public BusinessService2(DataService2 dataService2) {
    this.dataService2 = dataService2;
  }

  public int calculateMin() {
    int[] data = dataService2.retrieveData();

    try {
      Thread.sleep(30);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
//    throw new RuntimeException("Something Went Wrong!");
    return Arrays.stream(data).min().orElse(0);
  }

  //Business Logic
  //Data
}
