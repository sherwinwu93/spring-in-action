package com.wusd.runtimevalue;

public class BlankDisc implements CompactDisc {
    String title;
    String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("title:" + title + ",artist:" + artist);
    }
}
