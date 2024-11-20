package com.example.vulnerable_app.controller;

import com.example.vulnerable_app.utils.MyClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VulnerableController {
    @GetMapping("/get-time")
    public String getFormattedTime() {
        return MyClass.getFormattedTime();
    }
}
