package com.example.database;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class DataController {

    final UserService userService;

    public DataController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public Integer createUser(@RequestBody UserDTO user) {
        return userService.saveUser(user);
    }
}
