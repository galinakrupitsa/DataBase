package com.example.database;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class DataController {

    final UserService userService;

    public DataController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public String saveData(@RequestBody UserDTO userDTO) {
        return userService.myMetod(userDTO);
    }
}
