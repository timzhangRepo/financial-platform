package com.tim.financialplatform.kafka.consumer;

import com.tim.financialplatform.dto.UserBindDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserBindConsumer {
    @KafkaListener(topics = "onboard", groupId = "financial-platform")
    public void consume(Object object) {
        log.info("Consumer received: {}", object);
    }
}