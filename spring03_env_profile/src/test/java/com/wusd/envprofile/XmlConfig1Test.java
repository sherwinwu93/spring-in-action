package com.wusd.envprofile;

import com.wusd.envprofile.config.DevProfileConfig;
import com.wusd.envprofile.config.ProProfileConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans1.xml")
@ActiveProfiles("pro")
public class XmlConfig1Test {
//    @Autowired
//    DevProfileConfig devProfileConfig;
    @Autowired
    ProProfileConfig proProfileConfig;
//    @Autowired
//    CompactDisc compactDisc;

    @Test
    public void testEnvConfig() {
//        assertNotNull(devProfileConfig);
        assertNotNull(proProfileConfig);
    }

    @Test
    public void testEnv() {
//        compactDisc.play();
    }
}
