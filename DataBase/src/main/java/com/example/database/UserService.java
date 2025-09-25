package com.example.database;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id);

        return new UserDTO(user.getId(), user.getName(), user.getLastName());
    }

    public Integer saveUser(UserDTO userDto) {
        User user = new User(-1L, userDto.getName(), userDto.getLastName());

        return userRepository.save(user);
    }
}
