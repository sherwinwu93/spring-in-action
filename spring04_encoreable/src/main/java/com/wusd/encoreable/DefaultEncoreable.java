package com.wusd.encoreable;

public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("DefaultEncoreable.performEncore...");
    }
}
