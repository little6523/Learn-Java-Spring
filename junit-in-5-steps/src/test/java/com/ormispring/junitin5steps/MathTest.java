package com.ormispring.junitin5steps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {

  private MyMath math = new MyMath();

  @Test
  void calculateSum_ThreeMemberArray() {
    assertEquals(6, math.calculateSum(new int[]{1,2,3}));
  }

  @Test
  void cacultateSum_ZeroLengArray() {
    assertEquals(0, math.calculateSum(new int[]{}));
  }
}
