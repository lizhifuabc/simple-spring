package com.spring.annotation.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试
 *
 * @author lizhifu
 * @since 2023/6/4
 */
public class ConfigurationAnnotationTest {
    public static void main(String[] args) {
        demoProxyFalseConfig();
        demoProxyTrueConfig();
    }
    public static void demoProxyFalseConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DemoProxyFalseConfig.class);
        context.refresh();
        DemoBean bean1 = context.getBean(DemoProxyFalseConfig.class).demo();
        DemoBean bean2 = context.getBean(DemoProxyFalseConfig.class).demo();
        System.out.println(bean1 == bean2);
    }

    public static void demoProxyTrueConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DemoProxyTrueConfig.class);
        context.refresh();
        DemoBean bean1 = context.getBean(DemoProxyTrueConfig.class).demo();
        DemoBean bean2 = context.getBean(DemoProxyTrueConfig.class).demo();
        System.out.println(bean1 == bean2);
    }
}
