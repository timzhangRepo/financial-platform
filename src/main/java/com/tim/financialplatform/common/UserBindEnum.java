package com.tim.financialplatform.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
@AllArgsConstructor
public enum UserBindEnum {
    NO_BIND(0, "未绑定"),
    BINDED(1, "已绑定"),
    UNBINDED(-1, "要绑定"),;

    private Integer code;
    private String desc;
}
