package com.wusd.aop.config;

import com.wusd.aop.Performance;
import com.wusd.aop.TalkShow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PerformanceConfig.class})
public class PerformanceConfigTest {
    @Autowired
    Performance movie;
    @Autowired
    Performance music;
    @Autowired
    Performance talkShow;

    @Test
    public void talkShow() {
        talkShow.perform();
    }

    @Test
    public void movie() {
        movie.perform();
    }

    @Test
    public void music() {
        music.perform();
    }
}