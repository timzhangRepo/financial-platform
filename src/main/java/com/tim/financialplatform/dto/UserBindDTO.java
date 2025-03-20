package com.tim.financialplatform.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserBindDTO {
    String id;
    String name;
    String idCard;
    String mobile;
}