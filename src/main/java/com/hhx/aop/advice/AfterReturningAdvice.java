package com.hhx.aop.advice;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/9/23 17:06
 * @Version 1.0
 */

import java.lang.reflect.Method;

/**
 * 返回通知接口
 */
public interface AfterReturningAdvice extends Advice {
    /**
     * 返回后方法
     */
    void afterReturning(Class<?> clz, Object returnValue, Method method, Object[] args) throws Throwable;
}