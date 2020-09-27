package com.wusd.envprofile.impl;

import com.wusd.envprofile.CompactDisc;

/**
 * 白专辑
 */
public class WhiteAlbum implements CompactDisc {
    @Override
    public void play() {
        System.out.println("WhiteAlbum.player...");
    }
}
