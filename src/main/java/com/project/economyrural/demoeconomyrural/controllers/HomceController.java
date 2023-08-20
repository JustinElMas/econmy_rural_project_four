package com.project.economyrural.demoeconomyrural.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomceController {
    
    @GetMapping("")
    public String home() {
        return "index";
    }

}
