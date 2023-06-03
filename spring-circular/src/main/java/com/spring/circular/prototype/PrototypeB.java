package com.spring.circular.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author lizhifu
 * @since 2023/6/3
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeB {
    private PrototypeA prototypeA;
    public PrototypeB(PrototypeA prototypeA) {
        this.prototypeA = prototypeA;
    }
}
