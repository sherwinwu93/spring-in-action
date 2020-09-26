package com.wusd.javaconfig.config;

import com.wusd.javaconfig.CompactDisc;
import com.wusd.javaconfig.impl.CDPlayer;
import com.wusd.javaconfig.impl.SgtPeppers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class})
public class CDPlayerConfigTest {
    @Autowired
    private CompactDisc sgtPeppers;
    @Autowired
    private CompactDisc randomBeatlesCD;

    @Test
    public void sgtPeppers() {
        assertTrue(sgtPeppers instanceof SgtPeppers);
    }

    @Test
    public void randomBeatlesCD() {
        System.out.println(randomBeatlesCD.getClass().getSimpleName());
    }
}