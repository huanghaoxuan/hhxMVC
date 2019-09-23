package com.hhx.bean;

import com.hhx.core.annotation.Controller;
import com.hhx.ioc.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/9/23 10:34
 * @Version 1.0
 */
@com.hhx.core.annotation.Controller
@Slf4j
public class MyController {
    @Autowired
    private MyService myService;

    public void hello() {
        log.info(myService.helloWorld());
    }
}
