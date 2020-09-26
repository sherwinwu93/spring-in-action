package com.wusd.javaconfig.impl;

import com.wusd.javaconfig.CompactDisc;
import com.wusd.javaconfig.MediaPlayer;

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
