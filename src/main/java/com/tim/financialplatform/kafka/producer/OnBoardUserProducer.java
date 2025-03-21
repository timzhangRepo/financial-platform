package com.tim.financialplatform.kafka.producer;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class OnBoardUserProducer {

    //待会儿再改 event
    private final KafkaTemplate<String, Object> kafkaTemplate;

    private final String topic;

    public OnBoardUserProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = "onboard";
    }

    public void send(String message) {
        String key = UUID.randomUUID().toString();
        kafkaTemplate.send(topic, message);
    }
}
