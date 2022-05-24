package com.bruce.logisticsmanager.module.order.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 13:51
 */
@Data
@AllArgsConstructor
@NonNull
public class OrderVO implements Serializable {

    private Long id;

    private String orderNum;

    private String orderName;

    private String orderDesc;

    private Long userId;

    private Long addressId;

    private Long sendUserId;
}
