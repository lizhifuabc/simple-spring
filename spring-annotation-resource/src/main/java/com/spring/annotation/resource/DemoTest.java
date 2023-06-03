package com.spring.annotation.resource;

import com.spring.annotation.resource.config.AppConfig;
import com.spring.annotation.resource.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * DemoTest
 *
 * @author lizhifu
 * @since 2023/6/3
 */
public class DemoTest {
    public static void main(String[] args) {
//        way1();
        way2();
    }
    public static void way1() {
        System.out.println("Hello World!");
        // 创建 AnnotationConfigApplicationContext 实例
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册配置类
        context.register(AppConfig.class);
        // 扫描包
        context.scan("com.spring.annotation.resource");
        // 启动 Spring 容器
        context.refresh();
        // 从IOC容器中获取Bean实例
        DemoService demoService = context.getBean("demoService", DemoService.class);
        demoService.demo();
    }

    public static void way2() {
        System.out.println("Hello World!");
        // 创建 AnnotationConfigApplicationContext 实例
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.annotation.resource");
        // 从IOC容器中获取Bean实例
        DemoService demoService = context.getBean("demoService", DemoService.class);
        demoService.demo();
    }
}
