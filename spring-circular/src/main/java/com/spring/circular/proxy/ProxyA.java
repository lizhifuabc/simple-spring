package com.spring.circular.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * 代理对象循环依赖
 *
 * @author lizhifu
 * @since 2023/6/3
 */
@Component
public class ProxyA {
    @Autowired
    private ProxyB proxyB;

    @Async
    public CompletableFuture<ProxyB> getProxyB() {
        return CompletableFuture.completedFuture(proxyB);
    }
}
