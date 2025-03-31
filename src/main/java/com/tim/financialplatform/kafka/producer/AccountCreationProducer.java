package com.tim.financialplatform.kafka.producer;

import com.tim.financialplatform.avro.AccountCreationEventAvro;
import com.tim.financialplatform.avro.UserBindDTOAvro;
import com.tim.financialplatform.dto.UserBindDTO;
import com.tim.financialplatform.event.AccountCreationEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.apache.avro.generic.GenericRecord;

import java.util.UUID;


@Component
@Slf4j
public class AccountCreationProducer {
    private final KafkaTemplate<String, GenericRecord> kafkaTemplate;


    private final String topic;

    public AccountCreationProducer(KafkaTemplate<String, GenericRecord> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = "onboard";
    }


    public void send(UserBindDTO userBindDTO) {
        log.info("Sending account creation event: {}", userBindDTO);
        String key = UUID.randomUUID().toString();

        UserBindDTOAvro record = UserBindDTOAvro.newBuilder()
                .setId(userBindDTO.getId())
                .setMobile(userBindDTO.getMobile())
                .setVersion(userBindDTO.getVersion())
                .setName(userBindDTO.getName())
                .setIdCard(key) // seems like you meant to use UUID here?
                .build();

        log.info("Sending Avro Object: {}", record);

        AccountCreationEventAvro event = AccountCreationEventAvro.newBuilder()
                .setId("123e4567-e89b-12d3-a456-426614174000")
                .setUserType(1)
                .setMobile("1234567890")
                .setPassword("P@ssw0rd123")
                .setNickName("timmy")
                .setName("Tim Yang")
                .setIdCard("ID123456789")
                .setEmail("tim@example.com")
                .build();

//        kafkaTemplate.send(topic, key, event);
        kafkaTemplate.send(topic, key, record);
    }

    @Scheduled(fixedRate = 2000)
    public void send() {
        UserBindDTOAvro record = UserBindDTOAvro.newBuilder()
                .setId(UUID.randomUUID().toString())                    // e.g. "b1c9f4de-9c2a-4d95-8f0d-d7c63d68e79a"
                .setName("小花")                                          // Random Chinese name
                .setIdCard("410611199912345678")                       // Fake ID card
                .setMobile("13912345678")                              // Valid CN mobile number format
                .setVersion(1)                                         // Mock version
                .build();
        String key = UUID.randomUUID().toString();

        log.info("Sending Avro Object: {}", record);
        kafkaTemplate.send(topic, key, record);

    }
}