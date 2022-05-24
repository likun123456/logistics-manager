package com.bruce.logisticsmanager.module.progress.dto.convertor;

import com.bruce.logisticsmanager.convertor.IDtoConvertor;
import com.bruce.logisticsmanager.entity.ProgressEntity;
import com.bruce.logisticsmanager.module.progress.dto.ProgressDTO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 14:08
 */
@Mapper(componentModel = "spring")
public abstract class ProgressDtoConvertor implements IDtoConvertor<ProgressDTO, ProgressEntity> {
}
