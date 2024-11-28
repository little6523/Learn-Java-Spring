package com.ormispring.learnspringaop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {

  private Logger logger = LoggerFactory.getLogger(getClass());

//  @Around("com.ormispring.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
  @Around("com.ormispring.learnspringaop.aopexample.aspects.CommonPointcutConfig.trackTimeAnnotation()")
  public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    //Start a timer
    long startTimeMills = System.currentTimeMillis();

    //Execute the method
    Object returnValue = proceedingJoinPoint.proceed();

    //Stop the timer
    long stopTimeMills = System.currentTimeMillis();

    long executionDuration = stopTimeMills - startTimeMills;

    logger.info("@Around Aspect - {} Method executed in {} ms"
            ,proceedingJoinPoint ,executionDuration);

    return returnValue;
  }
}
