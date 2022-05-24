package com.bruce.logisticsmanager.module.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.logisticsmanager.entity.OrderEntity;
import com.bruce.logisticsmanager.module.address.dto.AddressDTO;
import com.bruce.logisticsmanager.module.address.vo.AddressVO;
import com.bruce.logisticsmanager.module.order.dto.OrderDTO;
import com.bruce.logisticsmanager.module.order.vo.OrderVO;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:52
 */
public interface IOrderService extends IService<OrderEntity> {

    OrderVO create(OrderDTO dto);

    boolean deleteById(Long id);

    boolean updateById(OrderDTO dto);

    IPage<OrderVO> pageByCondition(OrderDTO dto);
}
