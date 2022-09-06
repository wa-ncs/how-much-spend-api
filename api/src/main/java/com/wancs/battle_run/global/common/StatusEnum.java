package com.wancs.battle_run.global.common;

public enum StatusEnum {
    OK(200, "OK"),
    BAD_REQUEST(400, "BAD_REQUEST"),
    NOT_FOUND(404, "NOT_FOUND"),
    INTERNAL_SERER_ERROR(500, "INTERNAL_SERER_ERROR");

    Integer statusCode;
    String code;

    StatusEnum(Integer statusCode, String code){
        this.statusCode = statusCode;
        this.code = code;
    }
}