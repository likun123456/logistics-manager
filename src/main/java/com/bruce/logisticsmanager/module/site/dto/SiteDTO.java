package com.bruce.logisticsmanager.module.site.dto;

import com.bruce.logisticsmanager.dto.SearchDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 14:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SiteDTO extends SearchDTO implements Serializable {

    private Long id;

    private String name;

    private String province;

    private String city;

    private String street;

    private String detail;
}
