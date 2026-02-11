package com.safecircle.chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public-api")
public class PublicMessageController {

    @GetMapping("getPublicMessage")
    public String getPublicMessage() {
        return "Namah Shivaya";
    }
}
