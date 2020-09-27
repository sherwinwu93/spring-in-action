package com.wusd.envprofile.methodconfig;

import com.wusd.envprofile.CompactDisc;
import com.wusd.envprofile.impl.EnvironmentDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MethodConfig {
    @Bean
    @Profile("dev")
    public CompactDisc devCompactDisc() {
        return new EnvironmentDisc("dev");
    }

    @Bean
    @Profile("pro")
    public CompactDisc proCompactDisc() {
        return new EnvironmentDisc("pro");
    }
}
