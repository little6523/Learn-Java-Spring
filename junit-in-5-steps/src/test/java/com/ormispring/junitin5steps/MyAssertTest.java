package com.ormispring.junitin5steps;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {

  List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

  @Test
  void testAsserts() {
    boolean test = todos.contains("AWS"); //Result
    boolean test2 = todos.contains("GCP"); //Result

//    assertEquals(true, test);
    assertEquals(3, todos.size());
    assertTrue(test);
    assertFalse(test2);
    assertArrayEquals(new int[] {1, 2}, new int[] {2, 1});

    assertEquals(3, todos.size());
  }
}
