package com.ormispring.learnspringaop.aopexample.data;

import org.springframework.stereotype.Component;

@Component
public class DataService1 {

  public int[] retrieveData() {

    try {
      Thread.sleep(30);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return new int[] {11, 22, 33, 44, 55};
  }
}
