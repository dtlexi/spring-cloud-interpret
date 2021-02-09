package online.renjilin.controller;

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

    @RequestMapping
    @ResponseBody
    public String test()
    {
        String str=this.restTemplate.getForObject("http://user-client/user",String.class);
        return str;
    }
}
