package com.spring.circular.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 构造器注入循环依赖
 *
 * @author lizhifu
 * @since 2023/6/3
 */
public class ConstructorTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.spring.circular.constructor");
        context.refresh();

        ConstructorA constructorA = context.getBean(ConstructorA.class);
        System.out.println(constructorA);
        context.close();
    }
}
