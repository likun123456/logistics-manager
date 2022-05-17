package com.bruce.logisticsmanager.vo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 16:03
 */
@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleVO implements Serializable {

    private Long id;

    private String roleId;

    private String roleName;
}
