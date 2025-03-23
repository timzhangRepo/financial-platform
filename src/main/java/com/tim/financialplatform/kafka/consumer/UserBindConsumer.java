package com.tim.financialplatform.kafka.consumer;

import com.tim.financialplatform.dto.UserBindDTO;
import com.tim.financialplatform.service.UserBindService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserBindConsumer {

    @Autowired
    UserBindService userBindService;

    @KafkaListener(topics = "onboard", groupId = "financial-platform", containerFactory = "kafkaListenerContainerFactory")
    public void consume(UserBindDTO userBindDTO) {
        userBindService.commitUserBind(userBindDTO);
        log.info("Consumer received: {}", userBindDTO);
    }
}