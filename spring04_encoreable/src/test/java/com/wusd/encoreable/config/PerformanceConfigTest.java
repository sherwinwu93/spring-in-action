package com.wusd.encoreable.config;

import com.wusd.encoreable.Encoreable;
import com.wusd.encoreable.Music;
import com.wusd.encoreable.Performance;
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
    Performance music;

    @Test
    public void music() {
        music.perform();
        System.out.println("强转为encoreable");
        Encoreable encoreable = (Encoreable) music;
        encoreable.performEncore();
    }

}