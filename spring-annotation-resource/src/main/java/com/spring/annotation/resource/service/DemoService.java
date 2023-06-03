package com.spring.annotation.resource.service;

import com.spring.annotation.resource.dao.DemoDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * DemoService
 *
 * @author lizhifu
 * @since 2023/6/3
 */
@Service
public class DemoService {
    @Resource
    private DemoDao demoDao;
    public void demo() {
        demoDao.demo();
    }
}
