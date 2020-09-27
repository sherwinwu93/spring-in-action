package com.wusd.freedombeans;

import com.wusd.freedombeans.annotation.Creamy;
import com.wusd.freedombeans.annotation.Warm;
import org.springframework.stereotype.Component;

@Component
@Creamy
@Warm
public class Cake implements Dessert {

    @Override
    public String name() {
        return "cake";
    }

    @Override
    public String alias() {
        return name();
    }
}
