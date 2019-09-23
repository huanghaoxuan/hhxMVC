package com.hhx.bean;

import com.hhx.core.BeanContainer;
import com.hhx.ioc.Ioc;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/9/23 10:40
 * @Version 1.0
 */

@Slf4j
public class IocTest {
    @Test
    public void doIoc() {
        BeanContainer beanContainer = BeanContainer.getInstance();
        beanContainer.loadBeans("com.hhx");
        new Ioc().doIoc();
        MyController controller = (MyController) beanContainer.getBean(MyController.class);
        controller.hello();
    }
}