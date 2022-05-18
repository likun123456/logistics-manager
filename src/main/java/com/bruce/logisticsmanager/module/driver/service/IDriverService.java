package com.bruce.logisticsmanager.module.driver.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.logisticsmanager.entity.DriverEntity;
import com.bruce.logisticsmanager.module.driver.dto.DriverDTO;
import com.bruce.logisticsmanager.module.driver.vo.DriverVO;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:52
 */
public interface IDriverService extends IService<DriverEntity> {

    DriverVO create(DriverDTO dto);

    boolean updateById(DriverDTO dto);

    boolean deleteById(Long id);

    IPage<DriverVO> pageByCondition(DriverDTO dto);

}
