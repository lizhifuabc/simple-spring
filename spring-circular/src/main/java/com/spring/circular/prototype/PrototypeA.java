package com.spring.circular.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

/**
 * prototype
 *
 * @author lizhifu
 * @since 2023/6/3
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeA {
    private PrototypeB prototypeB;
    public PrototypeA(PrototypeB prototypeB) {
        this.prototypeB = prototypeB;
    }
}
