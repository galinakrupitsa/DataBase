package com.example.database;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String myMetod(UserDTO userDTO) {
        return userDTO.getName() + " " + userDTO.getLastName();
    }

}
