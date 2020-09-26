package com.wusd.javaconfig;

import com.wusd.javaconfig.config.CDPlayerConfig;
import com.wusd.javaconfig.impl.CDPlayer;
import com.wusd.javaconfig.impl.SgtPeppers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void compactDiscShouldNotBeNull() {
        assertNotNull(compactDisc);
        assertTrue(compactDisc instanceof SgtPeppers);
    }
}
