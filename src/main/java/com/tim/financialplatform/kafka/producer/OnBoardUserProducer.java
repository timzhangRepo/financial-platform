package com.tim.financialplatform.kafka.producer;


import com.tim.financialplatform.dto.UserBindDTO;

import com.tim.financialplatform.event.AccountCreationEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class OnBoardUserProducer {

    //待会儿再改 event
    private final KafkaTemplate<String, AccountCreationEvent> kafkaTemplate;

    private final String topic;

    public OnBoardUserProducer(KafkaTemplate<String, AccountCreationEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = "AccountCreation";
    }

    public void send(AccountCreationEvent message) {
        String key = UUID.randomUUID().toString();
        kafkaTemplate.send(topic, message);
    }
}
