package com.bruce.logisticsmanager.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 15:18
 */
@SuppressWarnings("all")
public class JwtTokenUtil {

    public static String getToken(JSONObject jsonObject) {
        return JWT.create().withAudience(jsonObject.getString("username"))
                .sign(Algorithm.HMAC256(jsonObject.getString("password")));
    }

    public static String md5(String str) {
        return DigestUtils.md5DigestAsHex(str.getBytes(StandardCharsets.UTF_8));
    }
}
