package com.wusd.freedombeans;

import com.wusd.freedombeans.annotation.Cold;
import com.wusd.freedombeans.annotation.Creamy;
import org.springframework.stereotype.Component;

@Component
@Creamy
@Cold
public class IceCream implements Dessert {
    @Override
    public String name() {
        return "iceCream";
    }

    @Override
    public String alias() {
        return name();
    }
}
