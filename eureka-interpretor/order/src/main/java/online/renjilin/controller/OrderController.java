package online.renjilin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getOrder(HttpServletRequest request) throws Exception {
        ValueOperations strOps = redisTemplate.opsForValue();
        strOps.set("name", "Lexi");
        System.out.println("字符串结果name："+strOps.get("name"));

        //Thread.sleep(300);
//        System.out.println(request.getHeader("name"));
        return "order1";
    }
}
