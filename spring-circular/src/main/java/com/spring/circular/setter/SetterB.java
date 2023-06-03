package com.spring.circular.setter;

import com.spring.circular.field.FieldB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Setter 循环依赖
 *
 * @author lizhifu
 * @since 2023/6/3
 */
@Component
public class SetterB {
    private SetterA setterA;

    public void setSetterA(SetterA setterA) { // Setter 注入A
        this.setterA = setterA;
    }

    @Override
    public String toString() {
        return "SetterB{" +
                "setterA=" + setterA +
                '}';
    }
}
