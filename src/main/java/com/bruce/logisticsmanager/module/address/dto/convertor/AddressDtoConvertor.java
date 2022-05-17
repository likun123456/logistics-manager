package com.bruce.logisticsmanager.module.address.dto.convertor;

import com.bruce.logisticsmanager.convertor.IDtoConvertor;
import com.bruce.logisticsmanager.entity.AddressEntity;
import com.bruce.logisticsmanager.module.address.dto.AddressDTO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 13:57
 */
@Mapper(componentModel = "spring")
public abstract class AddressDtoConvertor implements IDtoConvertor<AddressDTO, AddressEntity> {
}
