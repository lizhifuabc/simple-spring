package com.spring.circular.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * prototype
 *
 * @author lizhifu
 * @since 2023/6/3
 */
public class PrototypeTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.spring.circular.prototype");
        context.refresh();

        PrototypeA prototypeA = context.getBean(PrototypeA.class);
    }
}
