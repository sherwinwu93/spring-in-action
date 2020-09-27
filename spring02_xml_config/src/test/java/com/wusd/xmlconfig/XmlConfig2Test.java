package com.wusd.envprofile;

import com.wusd.envprofile.impl.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans2.xml")
public class XmlConfig2Test {
    @Autowired
    private CDPlayer cdPlayer;
    @Autowired
    @Qualifier("blankDisc")
    private CompactDisc blankDisc;

    @Test
    public void blankDisc() {
        blankDisc.play();
    }

    @Test
    public void cdPlayerShouldNotBeNull() {
        assertNotNull(cdPlayer);
    }
}
