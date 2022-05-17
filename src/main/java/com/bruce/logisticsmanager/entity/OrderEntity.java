package com.bruce.logisticsmanager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:40
 */
@TableName("order")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity extends BaseEntity{

    private String orderNum;

    private String orderName;

    private String orderDesc;

    private Long userId;

    private Long addressId;

    private Long sendUserId;
}
