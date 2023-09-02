package edu.miu.assignment7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
    public String showHomePage() {
        return "home/index";
    }
}
