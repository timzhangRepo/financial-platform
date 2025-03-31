package com.tim.financialplatform.runners;


import com.tim.financialplatform.avro.UserBindDTOAvro;
import com.tim.financialplatform.dto.UserBindDTO;
import com.tim.financialplatform.kafka.producer.AccountCreationProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyRunner <T> implements CommandLineRunner {
    @Autowired
    AccountCreationProducer accountCreationProducer;

    @Override
    public void run(String... args) throws Exception {
        UserBindDTO userBindDTO = new UserBindDTO("小花", "18110272309", "4106111999231", "1231s2321312", 0);
        accountCreationProducer.send(userBindDTO);
    }
}