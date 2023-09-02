package ru.grndev.cthulhuserver.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping()
    public String getStartPage() {
        return "Привет! /login";

    }

}
