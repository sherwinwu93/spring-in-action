package com.wusd.aop;

public class TalkShow implements Performance {
    @Override
    public void perform() {
        System.out.println("TalkShow.perform...");
    }
}
