package com.tim.financialplatform.service;


import com.tim.financialplatform.common.UserBindEnum;
import com.tim.financialplatform.documents.UserBind;
import com.tim.financialplatform.dto.UserBindDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserBindService {

    @Autowired
    ReactiveMongoTemplate mongoTemplate;

    public void commitUserBind(UserBindDTO userBindDTO) {

        UserBind userBind = UserBind.builder()
                .name(userBindDTO.getName())
                .status(UserBindEnum.BINDED)
                .idCard(userBindDTO.getIdCard())
                .mobile(userBindDTO.getMobile()).build();

        mongoTemplate.save(userBind).block();
    }
}

