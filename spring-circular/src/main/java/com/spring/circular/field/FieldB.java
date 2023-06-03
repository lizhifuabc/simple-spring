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
public class FieldB {
    @Autowired
    private FieldA fieldA; // 字段循环依赖A

    public void demoB() {
        fieldA.demoA();
    }
}
