package com.bruce.logisticsmanager.module.site.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import com.bruce.logisticsmanager.entity.ProgressEntity;
import com.bruce.logisticsmanager.entity.SiteEntity;
import com.bruce.logisticsmanager.module.site.dto.SiteDTO;
import com.bruce.logisticsmanager.module.site.dto.convertor.SiteDtoConvertor;
import com.bruce.logisticsmanager.module.site.mapper.SiteMapper;
import com.bruce.logisticsmanager.module.site.service.ISiteService;
import com.bruce.logisticsmanager.module.site.vo.SiteVO;
import com.bruce.logisticsmanager.module.site.vo.convertor.SiteVoConvertor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:53
 */
@Service
public class SiteServiceImpl extends ServiceImpl<SiteMapper, SiteEntity> implements ISiteService {

    @Resource
    private SiteVoConvertor siteVoConvertor;

    @Resource
    private SiteDtoConvertor siteDtoConvertor;

    @Override
    public SiteVO create(SiteDTO dto) {
        SiteEntity entity = siteDtoConvertor.dto2Po(dto);
        boolean saveResult = super.save(entity);
        if (!saveResult) {
            throw new BizException(ResultEnum.DATA_EXIST);
        }
        return siteVoConvertor.po2Vo(entity);
    }

    @Override
    public boolean deleteById(Long id) {
        return super.removeById(id);
    }

    @Override
    public boolean updateById(SiteDTO dto) {
        return super.updateById(siteDtoConvertor.dto2Po(dto));
    }

    @Override
    public IPage<SiteVO> pageByCondition(SiteDTO dto) {
        SiteEntity entity = siteDtoConvertor.dto2Po(dto);
        PageDTO<SiteEntity> pageDTO = new PageDTO<>(dto.getNowPage(), dto.getPageSize());
        LambdaQueryWrapper<SiteEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.orderByDesc(SiteEntity::getCreateTime);
        PageDTO<SiteEntity> page = super.page(pageDTO, lambdaQueryWrapper);
        return page.convert(p -> siteVoConvertor.po2Vo(p));
    }
}
