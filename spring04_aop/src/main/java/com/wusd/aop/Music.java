package com.wusd.aop;

public class Music implements Performance {
    @Override
    public void perform() {
        System.out.println("Music.perform...");
        System.out.println(1/0);
    }
}
