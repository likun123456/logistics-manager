package com.bruce.logisticsmanager.module.user.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.logisticsmanager.entity.UserEntity;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:52
 */
public interface IUserService extends IService<UserEntity> {

    String login(JSONObject jsonObject);
}
