package com.hhx.bean;

import com.hhx.aop.advice.AroundAdvice;
import com.hhx.aop.annotation.Aspect;
import com.hhx.core.annotation.Controller;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/9/23 17:35
 * @Version 1.0
 */
@Slf4j
@Aspect(target = Controller.class)
public class MyAspect implements AroundAdvice {

    @Override
    public void before(Class<?> clz, Method method, Object[] args) throws Throwable {
        log.info("Before  MyAspect ----> class: {}, method: {}", clz.getName(), method.getName());
    }

    @Override
    public void afterReturning(Class<?> clz, Object returnValue, Method method, Object[] args) throws Throwable {
        log.info("After  MyAspect ----> class: {}, method: {}", clz, method.getName());
    }

    @Override
    public void afterThrowing(Class<?> clz, Method method, Object[] args, Throwable e) {
        log.error("Error  MyAspect ----> class: {}, method: {}, exception: {}", clz, method.getName(), e.getMessage());
    }
}