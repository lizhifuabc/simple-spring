package com.spring.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DemoConfig
 *
 * @author lizhifu
 * @since 2023/6/4
 */
@Configuration(proxyBeanMethods = false)
public class DemoProxyFalseConfig {
    @Bean
    public DemoBean demo() {
        return new DemoBean();
    }
}
