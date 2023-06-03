package com.spring.circular.field;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 字段循环依赖
 *
 * @author lizhifu
 * @since 2023/6/3
 */
public class FieldTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.spring.circular.field");
        context.refresh();

        FieldA fieldA = context.getBean(FieldA.class);
        System.out.println(fieldA);
        fieldA.demoA();
        context.close();
        // 本质上是一个递归调用的过程，当调用到一定深度的时候，就会抛出
        // StackOverflowError异常，循环依赖，JVM抛出的栈溢出错误
    }
}
