package com.tim.financialplatform.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // <- 加上这个
@AllArgsConstructor
public class UserBindDTO {
    String id;
    String name;
    String idCard;
    String mobile;
    Integer version;
}