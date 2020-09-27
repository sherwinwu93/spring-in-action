package com.wusd.envprofile;

import com.wusd.envprofile.methodconfig.MethodConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("pro")
@ContextConfiguration(classes = {MethodConfig.class})
public class XmlConfig2Test {
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cd() {
        compactDisc.play();
    }
}
