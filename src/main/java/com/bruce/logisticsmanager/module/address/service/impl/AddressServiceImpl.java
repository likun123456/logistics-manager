package com.bruce.logisticsmanager.module.address.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import com.bruce.logisticsmanager.entity.AddressEntity;
import com.bruce.logisticsmanager.module.address.dto.AddressDTO;
import com.bruce.logisticsmanager.module.address.dto.convertor.AddressDtoConvertor;
import com.bruce.logisticsmanager.module.address.mapper.AddressMapper;
import com.bruce.logisticsmanager.module.address.service.IAddressService;
import com.bruce.logisticsmanager.module.address.vo.AddressVO;
import com.bruce.logisticsmanager.module.address.vo.convertor.AddressVoConvertor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:53
 */
@Service("addressServiceImpl")
public class AddressServiceImpl extends ServiceImpl<AddressMapper, AddressEntity> implements IAddressService {

    @Resource
    private AddressDtoConvertor addressDtoConvertor;

    @Resource
    private AddressVoConvertor addressVoConvertor;

    @Override
    public AddressVO create(AddressDTO dto) {
        AddressEntity addressEntity = addressDtoConvertor.dto2Po(dto);
        boolean saveResult = super.save(addressEntity);
        if (!saveResult) {
            throw new BizException(ResultEnum.DATA_EXIST);
        }
        return addressVoConvertor.po2Vo(addressEntity);
    }

    @Override
    public boolean deleteById(Long id) {
        return super.removeById(id);
    }

    @Override
    public boolean updateById(AddressDTO dto) {
        AddressEntity addressEntity = addressDtoConvertor.dto2Po(dto);
        return super.updateById(addressEntity);
    }

    @Override
    public IPage<AddressVO> pageByCondition(AddressDTO dto) {
        AddressEntity addressEntity = addressDtoConvertor.dto2Po(dto);
        PageDTO<AddressEntity> pageDTO = new PageDTO<>(dto.getNowPage(), dto.getPageSize());
        LambdaQueryWrapper<AddressEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.orderByDesc(AddressEntity::getCreateTime);
        lambdaQueryWrapper.eq(AddressEntity::getUserId, dto.getUserId());
        PageDTO<AddressEntity> page = super.page(pageDTO, lambdaQueryWrapper);
        return page.convert(p -> addressVoConvertor.po2Vo(p));
    }
}
