package com.bruce.logisticsmanager.module.driver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import com.bruce.logisticsmanager.entity.DriverEntity;
import com.bruce.logisticsmanager.module.driver.dto.DriverDTO;
import com.bruce.logisticsmanager.module.driver.dto.convertor.DriverDtoConvertor;
import com.bruce.logisticsmanager.module.driver.mapper.DriverMapper;
import com.bruce.logisticsmanager.module.driver.service.IDriverService;
import com.bruce.logisticsmanager.module.driver.vo.DriverVO;
import com.bruce.logisticsmanager.module.driver.vo.convertor.DriverVoConvertor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:53
 */
@Service
public class DriverServiceImpl extends ServiceImpl<DriverMapper, DriverEntity> implements IDriverService {

    @Resource
    private DriverDtoConvertor driverDtoConvertor;

    @Resource
    private DriverVoConvertor driverVoConvertor;

    @Override
    public DriverVO create(DriverDTO dto) {
        DriverEntity driverEntity = driverDtoConvertor.dto2Po(dto);
        boolean save = super.save(driverEntity);
        if (!save) {
            throw new BizException(ResultEnum.DATA_EXIST);
        }
        return driverVoConvertor.po2Vo(driverEntity);
    }

    @Override
    public boolean updateById(DriverDTO dto) {
        return super.updateById(driverDtoConvertor.dto2Po(dto));
    }

    @Override
    public boolean deleteById(Long id) {
        return super.removeById(id);
    }

    @Override
    public IPage<DriverVO> pageByCondition(DriverDTO dto) {
        PageDTO<DriverEntity> pageDTO = new PageDTO<>(dto.getNowPage(), dto.getPageSize());
        LambdaQueryWrapper<DriverEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();

        lambdaQueryWrapper.orderByDesc(DriverEntity::getCreateTime);
        PageDTO<DriverEntity> page = super.page(pageDTO, lambdaQueryWrapper);
        return page.convert(p -> driverVoConvertor.po2Vo(p));
    }
}
