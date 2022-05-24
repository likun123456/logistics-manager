package com.bruce.logisticsmanager.module.site.vo.convertor;

import com.bruce.logisticsmanager.convertor.IVoConvertor;
import com.bruce.logisticsmanager.entity.SiteEntity;
import com.bruce.logisticsmanager.module.site.vo.SiteVO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 14:23
 */
@Mapper(componentModel = "spring")
public abstract class SiteVoConvertor implements IVoConvertor<SiteVO, SiteEntity> {
}
