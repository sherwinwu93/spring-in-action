package com.wusd.javaconfig.config;

import com.wusd.javaconfig.impl.CDPlayer;
import com.wusd.javaconfig.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig2 {
    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }
    @Bean
    public CDPlayer anotherCDPlayer() {
        //sgtPeppers()与cdPlayer()共用
        return new CDPlayer(sgtPeppers());
    }
    @Bean
    public SgtPeppers sgtPeppers() {
        return new SgtPeppers();
    }

}
