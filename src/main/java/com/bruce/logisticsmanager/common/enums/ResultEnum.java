package com.bruce.logisticsmanager.common.enums;

public enum ResultEnum {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    BODY_NOT_MATCH(400, "控制针异常"),
    NO_PERMISSION(501, "权限不足"),
    NO_LOGIN(502, "用户未登录"),
    TOKEN_ERROR(503, "token认证失败"),
    USER_NOT_EXIST(504, "登录用户不存在"),
    DATA_EXIST(505, "数据已存在");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
