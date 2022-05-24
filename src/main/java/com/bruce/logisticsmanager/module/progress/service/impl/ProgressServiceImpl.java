package com.bruce.logisticsmanager.module.progress.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDTO;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.logisticsmanager.common.enums.ResultEnum;
import com.bruce.logisticsmanager.common.exception.BizException;
import com.bruce.logisticsmanager.entity.AddressEntity;
import com.bruce.logisticsmanager.entity.OrderEntity;
import com.bruce.logisticsmanager.entity.ProgressEntity;
import com.bruce.logisticsmanager.module.progress.dto.ProgressDTO;
import com.bruce.logisticsmanager.module.progress.dto.convertor.ProgressDtoConvertor;
import com.bruce.logisticsmanager.module.progress.mapper.ProgressMapper;
import com.bruce.logisticsmanager.module.progress.service.IProgressService;
import com.bruce.logisticsmanager.module.progress.vo.ProgressVO;
import com.bruce.logisticsmanager.module.progress.vo.convertor.ProgressVoConvertor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:53
 */
@Service
public class ProgressServiceImpl extends ServiceImpl<ProgressMapper, ProgressEntity> implements IProgressService {

    @Resource
    private ProgressVoConvertor progressVoConvertor;

    @Resource
    private ProgressDtoConvertor progressDtoConvertor;

    @Override
    public ProgressVO create(ProgressDTO dto) {
        ProgressEntity entity = progressDtoConvertor.dto2Po(dto);
        boolean saveResult = super.save(entity);
        if (!saveResult) {
            throw new BizException(ResultEnum.DATA_EXIST);
        }
        return progressVoConvertor.po2Vo(entity);
    }

    @Override
    public boolean deleteById(Long id) {
        return super.removeById(id);
    }

    @Override
    public boolean updateById(ProgressDTO dto) {
        return super.updateById(progressDtoConvertor.dto2Po(dto));
    }

    @Override
    public IPage<ProgressVO> pageByCondition(ProgressDTO dto) {
        ProgressEntity entity = progressDtoConvertor.dto2Po(dto);
        PageDTO<ProgressEntity> pageDTO = new PageDTO<>(dto.getNowPage(), dto.getPageSize());
        LambdaQueryWrapper<ProgressEntity> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.orderByDesc(ProgressEntity::getCreateTime);
        PageDTO<ProgressEntity> page = super.page(pageDTO, lambdaQueryWrapper);
        return page.convert(p -> progressVoConvertor.po2Vo(p));
    }
}
