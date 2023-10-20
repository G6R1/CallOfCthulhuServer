package ru.grndev.cthulhuserver.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.grndev.cthulhuserver.models.users.User;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/auth/users")
public class SecurityController {

    @GetMapping()
    public List<User> getUsers() {
        return List.of();

    }

    @GetMapping("/id")
    public List<User> getUsers(Long id) {
        return List.of();
    }

    @PostMapping()
    //@PreAuthorize("users:write")
    public String createUser() { //UserDTO
        return "Я метод пост-юзер";
    }

    @DeleteMapping()
    public void deleteUserById(Long id) { //UserDTO

    }
}
