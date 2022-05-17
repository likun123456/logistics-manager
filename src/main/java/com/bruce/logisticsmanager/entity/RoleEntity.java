package com.bruce.logisticsmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 15:44
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("role")
public class RoleEntity extends BaseEntity{

    @TableField("role_id")
    private String roleId;

    @TableField("role_name")
    private String roleName;
}
