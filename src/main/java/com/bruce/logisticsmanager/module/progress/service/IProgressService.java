package com.bruce.logisticsmanager.module.progress.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.logisticsmanager.entity.ProgressEntity;
import com.bruce.logisticsmanager.module.order.dto.OrderDTO;
import com.bruce.logisticsmanager.module.order.vo.OrderVO;
import com.bruce.logisticsmanager.module.progress.dto.ProgressDTO;
import com.bruce.logisticsmanager.module.progress.vo.ProgressVO;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:52
 */
public interface IProgressService extends IService<ProgressEntity> {

    ProgressVO create(ProgressDTO dto);

    boolean deleteById(Long id);

    boolean updateById(ProgressDTO dto);

    IPage<ProgressVO> pageByCondition(ProgressDTO dto);
}
