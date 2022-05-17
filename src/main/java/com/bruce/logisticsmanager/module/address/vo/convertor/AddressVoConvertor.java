package com.bruce.logisticsmanager.module.address.vo.convertor;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bruce.logisticsmanager.convertor.IVoConvertor;
import com.bruce.logisticsmanager.entity.AddressEntity;
import com.bruce.logisticsmanager.module.address.dto.AddressDTO;
import com.bruce.logisticsmanager.module.address.vo.AddressVO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 13:57
 */
@Mapper(componentModel = "spring")
public abstract class AddressVoConvertor implements IVoConvertor<AddressVO, AddressEntity> {

}
