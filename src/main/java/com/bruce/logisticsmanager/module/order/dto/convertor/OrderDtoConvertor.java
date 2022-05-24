package com.bruce.logisticsmanager.module.order.dto.convertor;

import com.bruce.logisticsmanager.convertor.IDtoConvertor;
import com.bruce.logisticsmanager.entity.OrderEntity;
import com.bruce.logisticsmanager.module.order.dto.OrderDTO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 13:53
 */
@Mapper(componentModel = "spring")
public abstract class OrderDtoConvertor implements IDtoConvertor<OrderDTO, OrderEntity> {
}
