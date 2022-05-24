package com.bruce.logisticsmanager.module.car.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import com.bruce.logisticsmanager.entity.CarEntity;
import com.bruce.logisticsmanager.module.car.dto.CarDTO;
import com.bruce.logisticsmanager.module.car.dto.convertor.CarDtoConvertor;
import com.bruce.logisticsmanager.module.car.mapper.CarMapper;
import com.bruce.logisticsmanager.module.car.service.ICarService;
import com.bruce.logisticsmanager.module.car.vo.CarVO;
import com.bruce.logisticsmanager.module.car.vo.convertor.CarVoConvertor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:53
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, CarEntity> implements ICarService {

    @Resource
    private CarVoConvertor carVoConvertor;

    @Resource
    private CarDtoConvertor carDtoConvertor;

    @Override
    public CarVO create(CarDTO dto) {
        CarEntity carEntity = carDtoConvertor.dto2Po(dto);
        boolean saveResult = super.save(carEntity);
        if (!saveResult) {
            throw new BizException(ResultEnum.DATA_EXIST);
        }
        return carVoConvertor.po2Vo(carEntity);
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean updateById(CarDTO dto) {
        return false;
    }

    @Override
    public IPage<CarVO> pageByCondition(CarDTO dto) {
        return null;
    }
}
