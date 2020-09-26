package com.wusd.multiconfig.config2;

import com.wusd.multiconfig.CompactDisc;
import com.wusd.multiconfig.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
