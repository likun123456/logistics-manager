package com.bruce.logisticsmanager.module.driver.dto.convertor;

import com.bruce.logisticsmanager.convertor.IDtoConvertor;
import com.bruce.logisticsmanager.entity.DriverEntity;
import com.bruce.logisticsmanager.module.driver.dto.DriverDTO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/18 16:20
 */
@Mapper(componentModel = "spring")
public abstract class DriverDtoConvertor implements IDtoConvertor<DriverDTO, DriverEntity> {
}
