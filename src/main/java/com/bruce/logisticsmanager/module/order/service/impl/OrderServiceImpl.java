package com.bruce.logisticsmanager.module.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import com.bruce.logisticsmanager.entity.OrderEntity;
import com.bruce.logisticsmanager.module.order.dto.OrderDTO;
import com.bruce.logisticsmanager.module.order.dto.convertor.OrderDtoConvertor;
import com.bruce.logisticsmanager.module.order.mapper.OrderMapper;
import com.bruce.logisticsmanager.module.order.service.IOrderService;
import com.bruce.logisticsmanager.module.order.vo.OrderVO;
import com.bruce.logisticsmanager.module.order.vo.convertor.OrderVoConvertor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:53
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderEntity> implements IOrderService {

    @Resource
    private OrderVoConvertor orderVoConvertor;

    @Resource
    private OrderDtoConvertor orderDtoConvertor;

    @Override
    public OrderVO create(OrderDTO dto) {
        OrderEntity entity = orderDtoConvertor.dto2Po(dto);
        boolean saveResult = super.save(entity);
        if (!saveResult) {
            throw new BizException(ResultEnum.DATA_EXIST);
        }
        return orderVoConvertor.po2Vo(entity);
    }

    @Override
    public boolean deleteById(Long id) {
        return super.removeById(id);
    }

    @Override
    public boolean updateById(OrderDTO dto) {
        return super.updateById(orderDtoConvertor.dto2Po(dto));
    }

    @Override
    public IPage<OrderVO> pageByCondition(OrderDTO dto) {
        OrderEntity entity = orderDtoConvertor.dto2Po(dto);
        PageDTO<OrderEntity> pageDTO = new PageDTO<>(dto.getNowPage(), dto.getPageSize());
        LambdaQueryWrapper<OrderEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.orderByDesc(OrderEntity::getCreateTime);
        lambdaQueryWrapper.eq(OrderEntity::getUserId, dto.getUserId());
        PageDTO<OrderEntity> page = super.page(pageDTO, lambdaQueryWrapper);
        return page.convert(p -> orderVoConvertor.po2Vo(p));
    }
}
