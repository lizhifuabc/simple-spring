package com.spring.circular.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 字段循环依赖
 *
 * @author lizhifu
 * @since 2023/6/3
 */
public class SetterTest {
    public static void main(String[] args) {
        ApplicationContext contextOne = new AnnotationConfigApplicationContext(SetterA.class, SetterB.class);
        SetterA a = contextOne.getBean(SetterA.class);
        SetterB b = contextOne.getBean(SetterB.class);
        System.out.println(a);
        System.out.println(b);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.spring.circular.setter");
        context.refresh();

        SetterA setterA = context.getBean(SetterA.class);

        System.out.println(setterA);
        context.close();
    }
}
