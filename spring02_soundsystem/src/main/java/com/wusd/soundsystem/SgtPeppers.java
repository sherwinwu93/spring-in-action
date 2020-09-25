package com.wusd.soundsystem;

import org.springframework.stereotype.Component;

/**
 * 口水专辑
 */
//组件注解,默认不启用
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
