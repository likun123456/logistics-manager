package com.bruce.logisticsmanager.module.car.vo.convertor;

import com.bruce.logisticsmanager.convertor.IVoConvertor;
import com.bruce.logisticsmanager.entity.CarEntity;
import com.bruce.logisticsmanager.module.car.vo.CarVO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/19 14:09
 */
@Mapper(componentModel = "spring")
public abstract class CarVoConvertor implements IVoConvertor<CarVO, CarEntity> {
}
