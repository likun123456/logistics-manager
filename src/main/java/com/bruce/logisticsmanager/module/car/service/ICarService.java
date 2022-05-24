package com.bruce.logisticsmanager.module.car.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.logisticsmanager.entity.CarEntity;
import com.bruce.logisticsmanager.module.car.dto.CarDTO;
import com.bruce.logisticsmanager.module.car.vo.CarVO;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:52
 */
public interface ICarService extends IService<CarEntity> {

    CarVO create(CarDTO dto);

    boolean deleteById(Long id);

    boolean updateById(CarDTO dto);

    IPage<CarVO> pageByCondition(CarDTO dto);
}
