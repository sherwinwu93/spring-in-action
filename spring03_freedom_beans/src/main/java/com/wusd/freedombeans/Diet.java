package com.wusd.freedombeans;

import com.wusd.freedombeans.annotation.Cold;
import com.wusd.freedombeans.annotation.Creamy;
import com.wusd.freedombeans.annotation.Warm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Diet {
    private Dessert dessert;

    @Autowired
    @Creamy
    @Warm
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void eat() {
        System.out.println("eat " + dessert.name());
    }
}
