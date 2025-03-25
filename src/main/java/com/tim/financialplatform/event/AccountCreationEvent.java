package com.tim.financialplatform.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountCreationEvent {
    private String id;

    private Integer userType;

    private String mobile;

    private String password;

    private String nickName;

    private String name;

    private String idCard;

    private String email;
}
