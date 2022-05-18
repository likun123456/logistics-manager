package com.bruce.logisticsmanager.module.driver.vo.convertor;

import com.bruce.logisticsmanager.common.enums.GenderEnum;
import com.bruce.logisticsmanager.convertor.IVoConvertor;
import com.bruce.logisticsmanager.entity.DriverEntity;
import com.bruce.logisticsmanager.module.driver.vo.DriverVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/18 16:23
 */
@Mapper(componentModel = "spring")
public abstract class DriverVoConvertor implements IVoConvertor<DriverVO, DriverEntity> {

    @Mapping(source = "gender", target = "genderName", qualifiedByName = "getGenderName")
    @Override
    public abstract DriverVO po2Vo(DriverEntity var1);

    @Named("getGenderName")
    public static String getGenderName(Integer gender) {
        return GenderEnum.getEnumByCode(gender).getName();
    }
}
