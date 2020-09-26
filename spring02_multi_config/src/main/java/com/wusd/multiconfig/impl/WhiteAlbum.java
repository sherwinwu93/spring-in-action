package com.wusd.multiconfig.impl;

import com.wusd.multiconfig.CompactDisc;

/**
 * 白专辑
 */
public class WhiteAlbum implements CompactDisc {
    @Override
    public void play() {
        System.out.println("WhiteAlbum.player...");
    }
}
