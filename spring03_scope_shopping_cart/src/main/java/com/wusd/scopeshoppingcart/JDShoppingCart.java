package com.wusd.scopeshoppingcart;

public class JDShoppingCart implements ShoppingCart {
    @Override
    public void add() {
        System.out.println(this.toString());
        System.out.println("JDShoppingCart.add");
    }
}
