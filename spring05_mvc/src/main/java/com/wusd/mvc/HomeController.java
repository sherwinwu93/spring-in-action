package com.wusd.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//声明为控制器
@Controller
@RequestMapping("/")
public class HomeController {
    //处理对/的请求
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        //视图名为home
        return "home";
    }
}
