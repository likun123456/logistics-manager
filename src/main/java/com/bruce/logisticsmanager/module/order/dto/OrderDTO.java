package com.bruce.logisticsmanager.module.order.dto;

import com.bruce.logisticsmanager.dto.SearchDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 13:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OrderDTO extends SearchDTO implements Serializable {

    private Long id;

    private String orderNum;

    private String orderName;

    private String orderDesc;

    private Long userId;

    private Long addressId;

    private Long sendUserId;
}
