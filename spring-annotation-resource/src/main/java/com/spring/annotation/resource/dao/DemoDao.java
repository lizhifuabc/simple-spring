package com.spring.annotation.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author lizhifu
 * @since 2023/6/3
 */
@Repository("resourceDao2")
public class DemoDao {
    public void demo() {
        System.out.println("DemoDao");
    }
}
