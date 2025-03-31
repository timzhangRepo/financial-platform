package com.tim.financialplatform.kafka.consumer;

import com.tim.financialplatform.dto.UserBindDTO;
import com.tim.financialplatform.service.UserBindService;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserBindConsumer2 {

    @Autowired
    UserBindService userBindService;

    @KafkaListener(
            topics = "onboard",
            groupId = "financial-platform-2",
            containerFactory = "kafkaListenerContainerFactory" // 👈 add this
    )    public void consume(GenericRecord record) {


        log.info("Received record from consumer 2: {}", record.getSchema().getName());
        log.info("Received record from consumer 2 id : {}", record.get("id"));

//        UserBindDTO userBindDTO = new UserBindDTO(
//                record.get("id").toString(),
//                record.get("name").toString(),
//                record.get("idCard").toString(),
//                record.get("mobile").toString(),
//                record.get("version") != null ? (Integer) record.get("version") : null
//        );
//
//        userBindService.commitUserBind(userBindDTO);
//        log.info("Consumer received: {}", userBindDTO);
    }
}