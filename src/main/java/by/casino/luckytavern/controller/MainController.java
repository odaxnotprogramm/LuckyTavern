package by.casino.luckytavern.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/registration")
    public String registration() {
        return "hello";
    }
}