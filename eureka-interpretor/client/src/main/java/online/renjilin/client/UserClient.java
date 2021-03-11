package online.renjilin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-client")
@RequestMapping("/user")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET)
    public String getUser();
}
