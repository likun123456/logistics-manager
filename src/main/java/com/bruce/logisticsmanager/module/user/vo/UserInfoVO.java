package com.bruce.logisticsmanager.module.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/18 10:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVO implements Serializable {

    private Long id;

    private String name;

    private int[] roles;

}
