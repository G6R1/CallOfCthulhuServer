package ru.grndev.cthulhuserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.grndev.cthulhuserver.models.users.User;
import ru.grndev.cthulhuserver.services.UserService;

@RestController
public class AdminController {

    private final UserService userService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getStartPage() {

        return "Привет админ! /";
        //return userService.createCreator();
    }

    @GetMapping("/news")
    public String getNews() {
        return "Привет админ! /news";

    }
}
