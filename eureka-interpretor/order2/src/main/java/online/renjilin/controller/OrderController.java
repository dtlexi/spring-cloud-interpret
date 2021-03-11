package online.renjilin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getOrder()
    {
        return "order2";
    }
}
