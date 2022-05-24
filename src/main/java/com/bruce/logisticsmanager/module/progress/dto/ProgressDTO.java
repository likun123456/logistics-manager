package com.bruce.logisticsmanager.module.progress.dto;

import com.bruce.logisticsmanager.dto.SearchDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 14:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProgressDTO extends SearchDTO implements Serializable {

    private Long id;

    private Long orderId;

    private Long siteId;

    private Date lastTime;
}
