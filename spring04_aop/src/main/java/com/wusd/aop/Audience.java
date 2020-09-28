package com.wusd.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 观众
 */
@Aspect
public class Audience {
    //切点
    //bean('')无效,版本问题?
//    @Pointcut("execution(* com.wusd.aop.Performance.perform()) " +
//            "&& !bean('talkShow')")
    @Pointcut("execution(* com.wusd.aop.Performance.perform(..))")
    public void performance() {
    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("silencing cell phones");
    }

    @Before("performance()")
    public void takSeats() {
        System.out.println("taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demending a refund");
    }
}
