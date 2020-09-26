package com.wusd.javaconfig.config;

import com.wusd.javaconfig.impl.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig2.class})
public class CDPlayerConfig2Test {
    @Autowired
    @Qualifier("cdPlayer")
    CDPlayer cdPlayer;
    @Autowired
    @Qualifier("anotherCDPlayer")
    CDPlayer anotherPlayer;

    @Test
    public void twoCDIsSame() {
        assertNotEquals(cdPlayer, anotherPlayer);
        cdPlayer.play();
        anotherPlayer.play();
//        assertEquals(cdPlayer.getCd(), anotherPlayer.getCd());
    }


}