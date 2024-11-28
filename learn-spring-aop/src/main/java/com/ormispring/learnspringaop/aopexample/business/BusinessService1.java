package com.ormispring.learnspringaop.aopexample.business;

import com.ormispring.learnspringaop.aopexample.annotations.TrackTime;
import com.ormispring.learnspringaop.aopexample.data.DataService1;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessService1 {

  private DataService1 dataService1;

  public BusinessService1(DataService1 dataService1) {
    this.dataService1 = dataService1;
  }

  @TrackTime
  public int calculateMax() {
    int[] data = dataService1.retrieveData();

    try {
      Thread.sleep(30);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
//    throw new RuntimeException("Something Went Wrong!");
    return Arrays.stream(data).max().orElse(0);
  }

  //Business Logic
  //Data
}
