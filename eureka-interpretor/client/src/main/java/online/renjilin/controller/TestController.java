package online.renjilin.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import online.renjilin.client.OrderClient;
import online.renjilin.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    UserClient userClient;

    @Autowired
    OrderClient orderClient;

    @RequestMapping
    @ResponseBody
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String test() throws InterruptedException {
        String str=this.restTemplate.getForObject("http://user-client/user",String.class);
        String orderStr=this.restTemplate.getForObject("http://ORDER-CLIENT/order",String.class);
        return str + "<br />" +orderStr;
    }

    public String fallbackMethod()
    {
        return "服务降级";
    }
}
