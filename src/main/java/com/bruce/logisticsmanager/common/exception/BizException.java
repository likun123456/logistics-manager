package com.bruce.logisticsmanager.common.exception;

import com.bruce.logisticsmanager.common.enums.ResultEnum;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 14:43
 */
public class BizException extends RuntimeException {

    private Integer errorCode;

    private String errorMsg;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public BizException() {
        super();
    }

    public BizException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.errorCode = resultEnum.getCode();
        this.errorMsg = resultEnum.getMessage();
    }

    public BizException(ResultEnum resultEnum, Throwable e) {
        super(resultEnum.getMessage(), e);
        this.errorCode = resultEnum.getCode();
        this.errorMsg = resultEnum.getMessage();
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
