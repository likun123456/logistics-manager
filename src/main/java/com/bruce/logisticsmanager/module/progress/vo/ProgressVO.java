package com.bruce.logisticsmanager.module.progress.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/24 14:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgressVO implements Serializable {

    private Long id;

    private Long orderId;

    private Long siteId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastTime;
}
