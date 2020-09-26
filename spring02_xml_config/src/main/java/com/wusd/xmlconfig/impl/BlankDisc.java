package com.wusd.xmlconfig.impl;

import com.wusd.xmlconfig.CompactDisc;

import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println(
                String.format("BlankDisc.play...title->%s,artist->%s,tracks->%s", title, artist, tracks));
    }
}
