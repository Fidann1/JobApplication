package com.example.msevent.controllers;

import com.example.msevent.dao.UserRequest;
import com.example.msevent.entities.UserEntity;
import com.example.msevent.security.JwtUtil;
import com.example.msevent.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final UserService userService;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
        this.userService = userService;
    }

    @PostMapping("/login")
    public JwtResponse AuthenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            return JwtResponse.builder()
                    .accessToken(jwtUtil.generateToken(authRequest.getUsername())).build();
        } else {
            throw new UsernameNotFoundException("Invalid user request !!! ");
        }
    }

    @PostMapping("/register")
    public ResponseEntity<String> registration(@RequestBody @Valid UserRequest userRequest) {
        UserEntity existingUser = userService.findUserEmail(userRequest.getEmail());
        if (existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()) {
            return ResponseEntity.ok("User already exists !!! ");
        } else {
            userService.saveUser(userRequest);
            return ResponseEntity.ok("Successfully registered  !!! ");
        }
    }
}