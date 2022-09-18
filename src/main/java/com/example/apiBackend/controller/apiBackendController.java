package com.example.apiBackend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class apiBackendController {
    @GetMapping("/getMessage")
    public String getMessage(){
        return "Connected";
    }
}
