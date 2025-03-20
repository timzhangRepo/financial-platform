package com.tim.financialplatform.runners;

import com.tim.financialplatform.common.ResponseEnum;
import com.tim.financialplatform.common.ResponseObject;
import com.tim.financialplatform.controller.UserBindController;
import com.tim.financialplatform.documents.User;
import com.tim.financialplatform.documents.UserBind;
import com.tim.financialplatform.dto.UserBindDTO;
import com.tim.financialplatform.service.UserBindService;
import com.tim.financialplatform.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@Slf4j
public class MyRunner <T> implements CommandLineRunner {


    @Autowired
    UserBindController controller;

    @Override
    public void run(String... args) throws Exception {
        controller.bindUser(UserBindDTO.builder().id("123").name("小金鱼").mobile("12312").build());
    }
}
