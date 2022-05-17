package com.bruce.logisticsmanager.config;

import com.bruce.logisticsmanager.common.CommonResult;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 14:35
 */
@RestController
@ControllerAdvice
@Slf4j
public class GlobalExceptionConfig {

    @ExceptionHandler(value = BizException.class)
    public CommonResult<?> bizExceptionHandler(HttpServletRequest request, BizException e) {
        log.error("发生业务异常,请求地址：{}", request.getRequestURI());
        log.error("原因是", e);
        return CommonResult.error(e.getErrorCode(), e.getMessage());
    }

    @ExceptionHandler(value = NullPointerException.class)
    public CommonResult<?> exceptionHandler(HttpServletRequest req, NullPointerException e) {
        log.error("发生空指针异常！原因是:", e);
        return CommonResult.error(ResultEnum.BODY_NOT_MATCH);
    }

    @ExceptionHandler(value = Exception.class)
    public CommonResult<?> exceptionHandler(HttpServletRequest req, Exception e) {
        log.error("未知异常！原因是:", e);
        return CommonResult.error(ResultEnum.FAILED);
    }
}
