package com.tim.financialplatform.kafka.producer;


import com.tim.financialplatform.dto.UserBindDTO;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class OnBoardUserProducer {

    //待会儿再改 event
    private final KafkaTemplate<String, UserBindDTO> kafkaTemplate;

    private final String topic;

    public OnBoardUserProducer(KafkaTemplate<String, UserBindDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = "onboard";
    }

    public void send(UserBindDTO message) {
        String key = UUID.randomUUID().toString();
        kafkaTemplate.send(topic, message);
    }
}
