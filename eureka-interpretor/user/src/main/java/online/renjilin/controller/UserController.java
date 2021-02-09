package online.renjilin.controller;

import online.renjilin.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    public User getUser()
    {
        User user=new User(18,"lexi");
        System.out.println(user);
        return user;
    }
}
