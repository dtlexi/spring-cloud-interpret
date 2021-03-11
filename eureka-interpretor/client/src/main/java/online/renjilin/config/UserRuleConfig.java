package online.renjilin.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
public class UserRuleConfig {
    @Bean
    public IRule getUserRule()
    {
        return new RandomRule();
    }
}
