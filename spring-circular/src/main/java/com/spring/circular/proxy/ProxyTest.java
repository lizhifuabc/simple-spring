package com.spring.circular.proxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.AsyncAnnotationBeanPostProcessor;

import java.util.concurrent.ExecutionException;

/**
 * 代理对象循环依赖
 *
 * @author lizhifu
 * @since 2023/6/3
 */
public class ProxyTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(AsyncAnnotationBeanPostProcessor.class);
        context.register(ProxyConfig.class);
        context.scan("com.spring.circular.proxy");
        context.refresh();

        ProxyA proxyA = context.getBean(ProxyA.class);
        System.out.println(proxyA.getProxyB().get());
    }
}
