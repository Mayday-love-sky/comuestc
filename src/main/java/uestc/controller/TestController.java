package uestc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @GetMapping("/test")
    public @ResponseBody String GetTest() {
        return "HELLO WORLD";
    }

}
