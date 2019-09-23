package com.hhx.aop.advice;

/**
 * @Author: HuangHaoXuan
 * @Email: huanghaoxuan1998@outlook.com
 * @github https://github.com/huanghaoxuan
 * @Date: 2019/9/23 17:07
 * @Version 1.0
 */

/**
 * 环绕通知接口
 */
public interface AroundAdvice extends MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {
}