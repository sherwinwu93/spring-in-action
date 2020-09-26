package com.wusd.multiconfig.config;

import com.wusd.multiconfig.CompactDisc;
import com.wusd.multiconfig.impl.CDPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
