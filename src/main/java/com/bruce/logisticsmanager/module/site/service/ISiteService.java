package com.bruce.logisticsmanager.module.site.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bruce.logisticsmanager.entity.SiteEntity;
import com.bruce.logisticsmanager.module.site.dto.SiteDTO;
import com.bruce.logisticsmanager.module.site.vo.SiteVO;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:52
 */
public interface ISiteService extends IService<SiteEntity> {

    SiteVO create(SiteDTO dto);

    boolean deleteById(Long id);

    boolean updateById(SiteDTO dto);

    IPage<SiteVO> pageByCondition(SiteDTO dto);
}
