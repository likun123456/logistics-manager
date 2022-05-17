package com.bruce.logisticsmanager.module.user.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import com.bruce.logisticsmanager.common.utils.JwtTokenUtil;
import com.bruce.logisticsmanager.entity.UserEntity;
import com.bruce.logisticsmanager.module.user.mapper.UserMapper;
import com.bruce.logisticsmanager.module.user.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:53
 */
@Service("userServiceImpl")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

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
                .eq(UserEntity::getPassword, passwordMD5));
        if (count == 0) {
            throw new BizException(ResultEnum.USER_NOT_EXIST);
        }
        return JwtTokenUtil.getToken(jsonObject);
    }
}
