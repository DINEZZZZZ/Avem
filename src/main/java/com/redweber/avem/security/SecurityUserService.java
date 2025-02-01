package com.redweber.avem.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class SecurityUserService {
    @Autowired
    private SecurityUserRepository securityUserRepository;

    public boolean authenticate(String username, String password) {
        Optional<SecurityUser> user = securityUserRepository.findByUsername(username);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}

