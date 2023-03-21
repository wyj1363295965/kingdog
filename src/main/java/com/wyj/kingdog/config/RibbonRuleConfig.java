package com.wyj.kingdog.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRuleConfig {
    @Bean
    @LoadBalanced
    public IRule myRule() {
        return new RandomRule();
    }
}
