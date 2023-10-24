package ru.grndev.cthulhuserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.grndev.cthulhuserver.models.users.User;
import ru.grndev.cthulhuserver.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/auth/users")
public class SecurityController {

    private final UserService userService;

    @Autowired
    public SecurityController(UserService userService) {
        this.userService = userService;
    }









    @GetMapping()
    public List<User> getUsers() {
        return null;

    }
    @GetMapping("/id")
    public User getUserById(Long id) {
        return null;
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
