package com.tim.financialplatform.repository;

import com.tim.financialplatform.documents.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
