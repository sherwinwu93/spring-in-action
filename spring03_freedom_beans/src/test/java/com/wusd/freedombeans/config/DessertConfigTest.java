package com.wusd.freedombeans.config;

import com.wusd.freedombeans.Diet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DessertConfig.class})
public class DessertConfigTest {
    @Autowired
    Diet diet;

    @Test
    public void dietEat() {
        diet.eat();
    }

}