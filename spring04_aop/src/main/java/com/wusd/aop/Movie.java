package com.wusd.aop;

import com.wusd.aop.Performance;

public class Movie implements Performance {
    @Override
    public void perform() {
        System.out.println("Movie.perform...");
    }
}
