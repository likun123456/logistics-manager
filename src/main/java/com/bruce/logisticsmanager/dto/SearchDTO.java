package com.bruce.logisticsmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 14:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchDTO implements Serializable {

    private Integer nowPage;

    private Integer pageSize;

    private String orderBy;

    private String orderByType;
}
