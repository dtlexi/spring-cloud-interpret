package online.renjilin.config;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class OrderRuleConfig {
    @Bean
    public IRule getOrderConfig()
    {
        return new RoundRobinRule();
    }

    @Bean
    public IPing getOrderPing(){
        return new PingUrl();
    }
}
