package com.wusd.scopeshoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreService {
    ShoppingCart shoppingCart;
    @Autowired
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void store() {
        System.out.println("storeService.address:" + this.toString());
        shoppingCart.add();
    }
}
