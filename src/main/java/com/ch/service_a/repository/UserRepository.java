package com.ch.service_a.repository;

import com.ch.service_a.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
