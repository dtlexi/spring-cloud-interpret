package online.renjilin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("order-client")
@RequestMapping("/order")
public interface OrderClient {

    @RequestMapping(method = RequestMethod.GET)
    public String getOrder();
}
