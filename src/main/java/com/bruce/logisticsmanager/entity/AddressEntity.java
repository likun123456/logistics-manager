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
 * @date： 2022/5/17 11:33
 */
@TableName("address")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity extends BaseEntity{

    private String province;

    private String city;

    private String street;

    private String detail;

    private String mobile;

    private String  call;

    @TableField("user_id")
    private String userId;
}
