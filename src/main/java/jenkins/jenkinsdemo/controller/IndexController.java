package jenkins.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By WeiBin on 2020/10/16 16:34
 * @author WB
 */
@Controller
public class IndexController {

    @RequestMapping("home")
    public String  toIndex()
    {
        System.out.println("这是首页");
        return "index";
    }
}
