package com.wusd.multiconfig.impl;

import com.wusd.multiconfig.CompactDisc;
import com.wusd.multiconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        System.out.println("cd的内存地址:" + cd);
        cd.play();
    }
}
