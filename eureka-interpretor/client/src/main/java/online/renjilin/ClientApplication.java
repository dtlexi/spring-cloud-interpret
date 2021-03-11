package online.renjilin;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import online.renjilin.client.OrderClient;
import online.renjilin.client.UserClient;
import online.renjilin.config.OrderRuleConfig;
import online.renjilin.config.UserRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RibbonClients(
        {
                @RibbonClient(value = "user-client",configuration = UserRuleConfig.class),
                @RibbonClient(value = "order-client",configuration = OrderRuleConfig.class)
        }
)
@EnableFeignClients
@EnableHystrix
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate createRestTemplate()
    {
        return new RestTemplate();
    }
}
