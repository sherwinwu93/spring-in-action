package com.wusd.javaconfig.config;

import com.wusd.javaconfig.CompactDisc;
import com.wusd.javaconfig.impl.HardDaysNight;
import com.wusd.javaconfig.impl.Revolver;
import com.wusd.javaconfig.impl.SgtPeppers;
import com.wusd.javaconfig.impl.WhiteAlbum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolver();
        }
    }
}
