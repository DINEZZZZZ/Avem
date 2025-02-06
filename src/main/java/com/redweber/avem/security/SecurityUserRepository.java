package com.redweber.avem.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface SecurityUserRepository extends MongoRepository<SecurityUser, String> {
    Optional<SecurityUser> findByUsername(String username);
}