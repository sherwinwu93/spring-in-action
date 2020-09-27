package com.wusd.envprofile.impl;

import com.wusd.envprofile.CompactDisc;
import com.wusd.envprofile.MediaPlayer;

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
