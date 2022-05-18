package com.bruce.logisticsmanager.module.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.bruce.logisticsmanager.common.CommonResult;
import com.bruce.logisticsmanager.common.utils.JwtTokenUtil;
import com.bruce.logisticsmanager.module.user.service.IUserService;
import com.bruce.logisticsmanager.module.user.vo.UserInfoVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:51
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private IUserService iUserService;

    @PostMapping("/login")
    @ApiOperation("登录")
    public CommonResult<String> login(@RequestBody JSONObject jsonObject) {
        String token = iUserService.login(jsonObject);
        return CommonResult.success(token);
    }

    @GetMapping("/info")
    public CommonResult<UserInfoVO> getUserInfo(@RequestParam("token") String token) {
        UserInfoVO userInfo = iUserService.getUserInfo(token);
        return CommonResult.success(userInfo);
    }

    public static void main(String[] args) {
        System.out.println(JwtTokenUtil.md5("admin"));
    }
}
