package com.wusd.aop.config;

import com.wusd.aop.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans1.xml"})
public class XmlTest {
    @Autowired
    Performance music;

    @Test
    public void music() {
        music.perform();
    }
}
