package com.bruce.logisticsmanager.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 15:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserVO implements Serializable {

    private Long id;

    private String username;

    private String password;

    private RoleVO role;
}
