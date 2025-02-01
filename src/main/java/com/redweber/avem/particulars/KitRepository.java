package com.redweber.avem.particulars;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface KitRepository extends MongoRepository<Kit, String> {
    // Custom queries can be added if needed
}
