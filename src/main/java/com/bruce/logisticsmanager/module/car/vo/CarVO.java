package com.bruce.logisticsmanager.module.car.vo;

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
 * @date： 2022/5/19 13:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarVO implements Serializable {

    private Long id;

    private String carNo;

    private Long driverId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
