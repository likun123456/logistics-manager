package com.bruce.logisticsmanager.module.address.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.logisticsmanager.entity.AddressEntity;
import com.bruce.logisticsmanager.module.address.dto.AddressDTO;
import com.bruce.logisticsmanager.module.address.vo.AddressVO;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:52
 */
public interface IAddressService extends IService<AddressEntity> {

    AddressVO create(AddressDTO dto);

    boolean deleteById(Long id);

    boolean updateById(AddressDTO dto);

    IPage<AddressVO> pageByCondition(AddressDTO dto);

}
