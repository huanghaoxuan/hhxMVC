package com.hhx.aop;

import com.hhx.bean.MyController;
import com.hhx.core.BeanContainer;
import com.hhx.ioc.Ioc;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/9/23 17:36
 * @Version 1.0
 */
@Slf4j
public class AopTest {
    @Test
    public void doAop() {
        BeanContainer beanContainer = BeanContainer.getInstance();
        beanContainer.loadBeans("com.hhx");
        new Aop().doAop();
        new Ioc().doIoc();
        MyController controller = (MyController) beanContainer.getBean(MyController.class);
        controller.hello();
    }
}
