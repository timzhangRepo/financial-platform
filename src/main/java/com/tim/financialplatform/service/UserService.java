package com.tim.financialplatform.service;


import com.tim.financialplatform.documents.User;
import com.tim.financialplatform.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UserService {
    private UserRepository userRepository;
    private final ReactiveMongoTemplate mongoTemplate;

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    public UserService(ReactiveMongoTemplate reactiveMongoTemplate, UserRepository userRepository) {
        this.mongoTemplate = reactiveMongoTemplate;
        this.userRepository = userRepository;
        logger.info(mongoTemplate.getMongoDatabase().block().getName());
    }

    public Flux<User> findAllUsers(int page, int size) {
        Query query = new Query()
                .with(PageRequest.of(page, size));
        return mongoTemplate.find(query, User.class);
    }


}
