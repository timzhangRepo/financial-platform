package com.tim.financialplatform.runners;

import com.tim.financialplatform.common.ResponseEnum;
import com.tim.financialplatform.common.ResponseObject;
import com.tim.financialplatform.documents.User;
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


    @Override
    public void run(String... args) throws Exception {
        AtomicInteger counter = new AtomicInteger(0);
        int pageSize = 2;

        ResponseEnum responseEnum = ResponseEnum.SUCCESS;
        log.info(responseEnum.toString());



        ResponseObject object = ResponseObject.success().setData(new String("Yes"));
        log.info("object {}",object.toString());

        Collection<?> records = new ArrayList<>();

//        Flux<User> flux = userService.findAllUsers(0, 4);
//        flux.sort(Comparator.comparing(User::getAge)
//                .thenComparing(User::getId))
//                .blockLast();
//        records = flux.collectList().block();

        System.out.println(records.toString());

    }
}
