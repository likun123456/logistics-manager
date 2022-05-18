package com.bruce.logisticsmanager.module.user.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import com.bruce.logisticsmanager.common.utils.JwtTokenUtil;
import com.bruce.logisticsmanager.entity.UserEntity;
import com.bruce.logisticsmanager.module.user.mapper.UserMapper;
import com.bruce.logisticsmanager.module.user.service.IUserService;
import com.bruce.logisticsmanager.module.user.vo.UserInfoVO;
import com.bruce.logisticsmanager.module.user.vo.convertor.UserInfoVoConvertor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:53
 */
@Service("userServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

    @Resource
    private UserInfoVoConvertor userInfoVoConvertor;

    @Override
    public String login(JSONObject jsonObject) {
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        Integer role = jsonObject.getInteger("role");
        if (StringUtils.isAnyBlank(username, password) || role == null) {
            throw new BizException(ResultEnum.USER_NOT_EXIST);
        }
        String passwordMD5 = JwtTokenUtil.md5(password);
        long count = super.count(new LambdaQueryWrapper<UserEntity>()
                .eq(UserEntity::getUsername, username)
                .eq(UserEntity::getPassword, passwordMD5)
                .eq(UserEntity::getRole, role));
        if (count == 0) {
            throw new BizException(ResultEnum.USER_NOT_EXIST);
        }
        return JwtTokenUtil.getToken(jsonObject);
    }

    @Override
    public UserInfoVO getUserInfo(String token) {
        String username;
        try {
            username = JWT.decode(token).getAudience().get(0);
        } catch (Exception e) {
            throw new BizException(ResultEnum.TOKEN_ERROR, e);
        }
        UserEntity userEntity = super.getOne(new LambdaQueryWrapper<UserEntity>()
                .eq(UserEntity::getUsername, username));
        return userInfoVoConvertor.po2Vo(userEntity);
    }
}
