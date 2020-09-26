package com.wusd.xmlconfig.impl;

import com.wusd.xmlconfig.CompactDisc;
import com.wusd.xmlconfig.MediaPlayer;

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
