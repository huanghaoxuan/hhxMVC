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
 * 异常通知接口
 */
public interface ThrowsAdvice extends Advice {
    /**
     * 异常方法
     */
    void afterThrowing(Class<?> clz, Method method, Object[] args, Throwable e);
}