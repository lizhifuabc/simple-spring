package com.spring.circular.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 字段循环依赖
 *
 * @author lizhifu
 * @since 2023/6/3
 */
@Component
public class FieldA {
    @Autowired
    private FieldB fieldB; // 字段循环依赖B

    public void demoA() {
        fieldB.demoB();
    }
}
