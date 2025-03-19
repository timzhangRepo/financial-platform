package com.tim.financialplatform.common;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResponseObject {
    private Integer code;
    private String message;
    private Object data;


    private ResponseObject() {}

    public static ResponseObject success() {
        ResponseObject responseObject = new ResponseObject();
        responseObject.setCode(200);
        responseObject.setMessage("success");
        return responseObject;
    }

    public static ResponseObject error() {
        ResponseObject responseObject = new ResponseObject();
        responseObject.setCode(500);
        responseObject.setMessage("error");
        return responseObject;
    }

    public ResponseObject setData (Object object){
        this.data = object;
        return this;
    }

}
