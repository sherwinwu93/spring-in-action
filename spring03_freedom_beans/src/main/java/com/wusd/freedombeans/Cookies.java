package com.wusd.freedombeans;

import com.wusd.freedombeans.annotation.Creamy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cookies")
public class Cookies implements Dessert {
    @Override
    public String name() {
        return "cookies";
    }

    @Override
    public String alias() {
        return name();
    }
}
