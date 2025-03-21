package com.tim.financialplatform.kafka.consumer;


import com.tim.financialplatform.dto.UserBindDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserBindConsumer {
    @KafkaListener(topics = "onboard", groupId = "financial-platform")
    public void consume(ConsumerRecord<String, Object> record) {
        log.info("UserBindConsumer consumed {}", record);

        log.info("Classname {}", record.value());
        if(record.value() instanceof UserBindDTO userBindDTO){
            log.info("Deserialize {}", userBindDTO);
        }
    }
}
