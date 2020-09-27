package com.wusd.envprofile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DevProfileConfig.class, ProProfileConfig.class})
public class SetProfileConfig {
}
