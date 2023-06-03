package com.spring.circular.constructor;

import org.springframework.stereotype.Component;

/**
 * 构造器注入循环依赖
 *
 * @author lizhifu
 * @since 2023/6/3
 */
@Component
public class ConstructorB {
    public ConstructorB(ConstructorA constructorA) { // 构造器注入A
    }
}
