package com.tim.financialplatform.runners;

import com.tim.financialplatform.dto.UserBindDTO;
import com.tim.financialplatform.event.AccountCreationEvent;
import com.tim.financialplatform.kafka.producer.OnBoardUserProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRunner implements CommandLineRunner {

    @Autowired
    private OnBoardUserProducer onBoardUserProducer;

    @Override
    public void run(String... args) throws Exception {
        AccountCreationEvent event = AccountCreationEvent.builder()
                .id("123456")
                .userType(0)
                .mobile("18110272309")
                .password("securePassword123")
                .nickName("小花")
                .name("花花")
                .idCard("4106111999231")
                .email("xiaohua@example.com")
                .build();
        onBoardUserProducer.send(event);
    }
}