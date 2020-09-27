package com.wusd.scopeshoppingcart.config;

import com.wusd.scopeshoppingcart.JDShoppingCart;
import com.wusd.scopeshoppingcart.ShoppingCart;
import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;

@Configuration
@ComponentScan("com.wusd.scopeshoppingcart")
public class ShoppingCartConfig {
    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
    public ShoppingCart cart() {
        return new JDShoppingCart();
    }
}
