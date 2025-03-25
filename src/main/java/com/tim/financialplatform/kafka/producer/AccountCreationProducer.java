package com.tim.financialplatform.kafka.producer;

import com.tim.financialplatform.dto.UserBindDTO;
import com.tim.financialplatform.event.AccountCreationEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@Slf4j
public class AccountCreationProducer {
    private final KafkaTemplate<String, AccountCreationEvent> kafkaTemplate;


    @Value("accountCreation")
    private final String topic;

    public AccountCreationProducer(KafkaTemplate<String, AccountCreationEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = "onboard";
    }

    public void send(AccountCreationEvent message) {
        log.info("Sending account creation event: {}", message);
        String key = UUID.randomUUID().toString();
        kafkaTemplate.send(topic, message);
    }
}