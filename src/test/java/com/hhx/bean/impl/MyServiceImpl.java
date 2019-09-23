package com.hhx.bean.impl;

import com.hhx.bean.MyService;
import com.hhx.core.annotation.Service;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/9/23 10:37
 * @Version 1.0
 */

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String helloWorld() {
        return "hello world";
    }
}
