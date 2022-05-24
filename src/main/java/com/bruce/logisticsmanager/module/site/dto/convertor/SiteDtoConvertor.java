package com.bruce.logisticsmanager.module.site.dto.convertor;

import com.bruce.logisticsmanager.convertor.IDtoConvertor;
import com.bruce.logisticsmanager.entity.SiteEntity;
import com.bruce.logisticsmanager.module.site.dto.SiteDTO;
import org.mapstruct.Mapper;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 14:22
 */
@Mapper(componentModel = "spring")
public abstract class SiteDtoConvertor implements IDtoConvertor<SiteDTO, SiteEntity> {
}
