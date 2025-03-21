package com.tim.financialplatform.kafka.producer;


import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class OnBoardUserProducer {

    //待会儿再改 event
    private final KafkaTemplate<String, String> kafkaTemplate;

    private final String topic;

    public OnBoardUserProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = "onboard";
    }

    public void send(String message) {
        kafkaTemplate.send(topic, message);
    }
}
