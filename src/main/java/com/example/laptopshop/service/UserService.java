package com.example.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.laptopshop.domain.User;
import com.example.laptopshop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findOneByEmail(email);
    }

    public User getUsersById(long id) {
        return this.userRepository.findById(id);
    }

    public User deleteUserById(long id) {
        return this.userRepository.deleteById(id);
    }

    public User handleSaveUser(User user) {
        return this.userRepository.save(user);
    }
}
