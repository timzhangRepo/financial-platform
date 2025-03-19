package com.tim.financialplatform.common;


import lombok.ToString;

@ToString
public enum ResponseEnum {

    SUCCESS(0, "success"),
    ERROR(-1, "ERROR");

    ResponseEnum(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    private Integer code;
    private String message;
}
