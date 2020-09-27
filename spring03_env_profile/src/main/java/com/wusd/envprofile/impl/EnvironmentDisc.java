package com.wusd.envprofile.impl;

import com.wusd.envprofile.CompactDisc;

public class EnvironmentDisc implements CompactDisc {
    private String profile;

    public EnvironmentDisc(String profile) {
        this.profile = profile;
    }

    @Override
    public void play() {
        System.out.println("profile:" + profile);
    }
}
