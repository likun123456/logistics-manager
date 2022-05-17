package com.bruce.logisticsmanager.common.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
//import com.bruce.carmanager.common.annotation.RequireAdmin;
//import com.bruce.carmanager.common.enums.ResultEnum;
//import com.bruce.carmanager.common.enums.RoleEnum;
//import com.bruce.carmanager.common.exception.BizException;
//import com.bruce.carmanager.vo.LoginUserVO;
//import com.bruce.carmanager.vo.RoleVO;
//import com.bruce.logisticsmanager.common.annotation.RequireAdmin;
//import com.bruce.logisticsmanager.common.enums.ResultEnum;
//import com.bruce.logisticsmanager.common.enums.RoleEnum;
//import com.bruce.logisticsmanager.common.exception.BizException;
//import com.bruce.logisticsmanager.service.IUserService;
//import com.bruce.logisticsmanager.vo.LoginUserVO;
//import com.bruce.logisticsmanager.vo.RoleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Optional;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 14:15
 */
@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    private static final String LOGIN_URL = "login";


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String requestURI = request.getRequestURI();

        // 从 http 请求头中取出 token
//        String token = request.getHeader("token");
//        if (StringUtils.isBlank(token)) {
//            throw new BizException(ResultEnum.NO_LOGIN);
//        }
//
//        HandlerMethod handlerMethod = (HandlerMethod) handler;
//        Method method = handlerMethod.getMethod();
//
//        String username;
//        try {
//            username = JWT.decode(token).getAudience().get(0);
//        } catch (Exception e) {
//            throw new BizException(ResultEnum.TOKEN_ERROR, e);
//        }
//        LoginUserVO loginUserVO = iUserService.findByUsername(username);
//        if (loginUserVO == null) {
//            throw new BizException(ResultEnum.USER_NOT_EXIST);
//        }
//        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(loginUserVO.getPassword())).build();
//        try {
//            jwtVerifier.verify(token);
//        } catch (JWTVerificationException e) {
//            log.error("jwt验证异常:", e);
//            throw new BizException(ResultEnum.TOKEN_ERROR, e);
//        }
//
//        if (method.isAnnotationPresent(RequireAdmin.class)) {
//            Integer userRole = Optional.of(loginUserVO).map(LoginUserVO::getRole).map(RoleVO::getRoleId).orElse(RoleEnum.USER.getRoleId());
//            if (!RoleEnum.ADMIN.getRoleId().equals(userRole)) {
//                throw new BizException(ResultEnum.NO_PERMISSION);
//            }
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
