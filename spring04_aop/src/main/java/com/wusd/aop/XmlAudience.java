package com.wusd.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 观众
 */
public class XmlAudience {
    //切点
    public void performance() {
    }

    public void silenceCellPhones() {
        System.out.println("silencing cell phones");
    }

    public void takeSeats() {
        System.out.println("taking seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP!!");
    }

    public void demandRefund() {
        System.out.println("Demending a refund");
    }

    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("jp taking seats");
            jp.proceed();
            System.out.println("jp CLAP");
        } catch (Throwable e) {
            System.out.println("jp Demanding a refund");
        }
    }
}
