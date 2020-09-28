package com.wusd.encoreable.config;

import com.wusd.encoreable.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class PerformanceConfig {

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }
    @Bean
    public Encoreable defaultEncoreable() {
        return new DefaultEncoreable();
    }
    @Bean
    public Performance music() {
        return new Music();
    }
    @Bean
    public Performance movie() {
        return new Movie();
    }
}
