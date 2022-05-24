package com.bruce.logisticsmanager.module.car.dto.convertor;

import com.bruce.logisticsmanager.convertor.IDtoConvertor;
import com.bruce.logisticsmanager.entity.CarEntity;
import com.bruce.logisticsmanager.module.car.dto.CarDTO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/19 14:12
 */
@Mapper(componentModel = "spring")
public abstract class CarDtoConvertor implements IDtoConvertor<CarDTO, CarEntity> {
}
