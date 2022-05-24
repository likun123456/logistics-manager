package com.bruce.logisticsmanager.module.order.vo.convertor;

import com.bruce.logisticsmanager.convertor.IVoConvertor;
import com.bruce.logisticsmanager.entity.OrderEntity;
import com.bruce.logisticsmanager.module.order.vo.OrderVO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 13:52
 */
@Mapper(componentModel = "spring")
public abstract class OrderVoConvertor implements IVoConvertor<OrderVO, OrderEntity> {
}
