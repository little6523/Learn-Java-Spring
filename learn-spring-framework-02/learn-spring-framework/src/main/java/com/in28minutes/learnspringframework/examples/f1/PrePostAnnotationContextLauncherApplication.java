package com.in28minutes.learnspringframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependency are ready!");
    }

    // 의존성을 연결하는 대로 초기화 논리를 실행할 경우: ex) 데이터베이스에서 데이터를 가져올 때
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDependency");
    }

    // 컨테이너에서 Bean이 삭제되기 전에, 애플리케이션 컨텍스트에서 삭제되기 전에 cleanup을 수행하려는 경우
    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (PrePostAnnotationContextLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        }
    }
}
