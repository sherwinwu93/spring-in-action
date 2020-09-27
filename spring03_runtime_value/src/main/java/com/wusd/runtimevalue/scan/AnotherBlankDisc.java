package com.wusd.runtimevalue.scan;

import com.wusd.runtimevalue.CompactDisc;
import org.springframework.beans.factory.annotation.Value;

public class AnotherBlankDisc implements CompactDisc {
    String title;
    String artist;

    public AnotherBlankDisc(@Value("${disc.title}") String title,
                            @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("title:" + title + ",artist:" + artist);
    }
}
