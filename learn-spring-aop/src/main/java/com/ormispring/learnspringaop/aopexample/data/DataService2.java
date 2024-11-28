package com.ormispring.learnspringaop.aopexample.data;

import com.ormispring.learnspringaop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Component;

@Component
public class DataService2 {

  @TrackTime
  public int[] retrieveData() {

    try {
      Thread.sleep(30);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return new int[] {111, 222, 333, 444, 555};
  }
}
