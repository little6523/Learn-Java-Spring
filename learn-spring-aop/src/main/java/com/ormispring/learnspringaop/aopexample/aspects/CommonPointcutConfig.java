package com.ormispring.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

  @Pointcut("execution(* com.ormispring.learnspringaop.aopexample.*.*.*(..))")
  public void businessAndDataPackageConfig() {}

  @Pointcut("execution(* com.ormispring.learnspringaop.aopexample.business.*.*(..))")
  public void businessPackageConfig() {}

  @Pointcut("execution(* com.ormispring.learnspringaop.aopexample.data.*.*(..))")
  public void dataPackageConfig() {}

  @Pointcut("bean(*Serice*)")
  public void allPackageConfigUsingBean() {}

  @Pointcut("@annotation(com.ormispring.learnspringaop.aopexample.annotations.TrackTime)")
  public void trackTimeAnnotation() {}
}
