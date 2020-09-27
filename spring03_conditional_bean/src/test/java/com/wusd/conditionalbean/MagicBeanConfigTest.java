package com.wusd.conditionalbean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("magic")
@ContextConfiguration(classes = {MagicBeanConfig.class})
public class MagicBeanConfigTest {
    @Autowired
    MagicBean magicBean;

    @Test
    public void magicBean() {
        assertNotNull(magicBean);
    }
}