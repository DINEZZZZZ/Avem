package com.redweber.avem.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")

public class SecurityUserController {

    @Autowired
    private SecurityUserService securityUserService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody SecurityUser loginRequest) {
        if (securityUserService.authenticate(loginRequest.getUsername(), loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }
}


