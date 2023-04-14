package com.example.librarymanagement.controller;

import com.example.librarymanagement.model.User;
import com.example.librarymanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    @Autowired
    private UserRepository userRepository;

    // @CrossOrigin(origins = "*")
    @PostMapping("/signup")
    public ResponseEntity<?> signUp() {
        System.out.println("hi");
        // if (userRepository.findByUsername(user.getUsername()) != null) {
        //     return ResponseEntity.badRequest().body("Username already exists");
        // }
        // if (userRepository.findByEmail(user.getEmail()) != null) {
        //     return ResponseEntity.badRequest().body("Email already exists");
        // }
        // user.setPassword(user.getPassword());
        // userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
}
