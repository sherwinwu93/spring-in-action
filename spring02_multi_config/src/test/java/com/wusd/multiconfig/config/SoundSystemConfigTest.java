package com.wusd.multiconfig.config;

import com.wusd.multiconfig.impl.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SoundSystemConfig.class})
public class SoundSystemConfigTest {
    @Autowired
    private CDPlayer cdPlayer;
    @Test
    public void configIsSuccess() {
        assertNotNull(cdPlayer);
    }

}