package com.wusd.scopeshoppingcart.config;

import com.wusd.scopeshoppingcart.StoreService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ShoppingCartConfig.class})
public class ShoppingCartConfigTest {
    @Autowired
    private StoreService storeService;

    @Test
    public void store() {
        storeService.store();
        storeService.store();
    }

}