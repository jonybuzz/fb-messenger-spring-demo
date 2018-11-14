package com.example.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/messages")
    public void messages(@RequestBody Map<String, String> body) {
        System.out.println("Body: ");
        System.out.println(body);
    }
    
    @GetMapping("/webhook")
    public String webhook(@RequestParam(name = "hub.challenge") String challenge) {
        return challenge;
    }
}
