package com.bruce.logisticsmanager.module.progress.vo.convertor;

import com.bruce.logisticsmanager.convertor.IVoConvertor;
import com.bruce.logisticsmanager.entity.ProgressEntity;
import com.bruce.logisticsmanager.module.progress.vo.ProgressVO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 14:09
 */
@Mapper(componentModel = "spring")
public abstract class ProgressVoConvertor implements IVoConvertor<ProgressVO, ProgressEntity> {
}
