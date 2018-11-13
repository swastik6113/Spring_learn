package spring_learn.resource_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("/application")
    public String mainpage()
    {
        System.out.println("hello");
        return "index";
    }
}
