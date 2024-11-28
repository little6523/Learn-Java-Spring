package com.ormispring.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

  private Logger logger = LoggerFactory.getLogger(getClass());

  //Pointcut - When?
  //execution(* PACKAGE.*.*(..))
  @Before("com.ormispring.learnspringaop.aopexample.aspects.CommonPointcutConfig.allPackageConfigUsingBean()") // When
  public void logMethodCall(JoinPoint joinPoint) {
    logger.info("Before Aspect - {} is called with arguments: {}"
            , joinPoint, joinPoint.getArgs()); //What
  }

  @After("com.ormispring.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()")
  public void logMethodCallAfterExecution(JoinPoint joinPoint) {
    logger.info("After Aspect - {} has executed", joinPoint);
  }

  @AfterThrowing(
          pointcut = "com.ormispring.learnspringaop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()",
          throwing = "exception"
  )
  public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
    logger.info("AfterThrowing Aspect - {} has thrown an exception {}"
            , joinPoint, exception);
  }
  @AfterReturning(
          pointcut = "com.ormispring.learnspringaop.aopexample.aspects.CommonPointcutConfig.dataPackageConfig()",
          returning = "resultValue"
  )
  public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint,
                                                    Object resultValue) {
    logger.info("AfterReturning Aspect - {} has returned {}"
            , joinPoint, resultValue);
  }
}
