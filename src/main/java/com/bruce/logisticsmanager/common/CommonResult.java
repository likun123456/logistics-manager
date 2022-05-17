package com.bruce.logisticsmanager.common;


import com.bruce.logisticsmanager.common.enums.ResultEnum;

/**
 * @description:
 * @create: 2022-05-05 23: 43
 **/
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult() {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(ResultEnum.SUCCESS.getCode());
        commonResult.setMessage(ResultEnum.SUCCESS.getMessage());
        commonResult.setData(data);
        return commonResult;
    }

    public static <T> CommonResult<T> error(String message) {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(ResultEnum.FAILED.getCode());
        commonResult.setMessage(message);
        return commonResult;
    }

    public static <T> CommonResult<T> error(ResultEnum resultEnum) {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(resultEnum.getCode());
        commonResult.setMessage(resultEnum.getMessage());
        return commonResult;
    }

    public static <T> CommonResult<T> error(Integer code, String message) {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(code);
        commonResult.setMessage(message);
        return commonResult;
    }

    public static <T> CommonResult<T> error() {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.setCode(ResultEnum.FAILED.getCode());
        commonResult.setMessage(ResultEnum.FAILED.getMessage());
        return commonResult;
    }
}
