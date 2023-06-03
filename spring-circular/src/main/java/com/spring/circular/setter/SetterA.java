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
public class SetterA {
    private SetterB setterB;

    public void setSetterB(SetterB setterB) { // Setter 注入B
        this.setterB = setterB;
    }

    @Override
    public String toString() {
        return "SetterA{" +
                "setterB=" + setterB +
                '}';
    }
}
