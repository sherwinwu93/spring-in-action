package com.wusd.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    private CompactDisc cd;

    //构造注入
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    //方法注入,可以为null.
    @Autowired(required = false)
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
