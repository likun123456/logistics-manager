package com.bruce.logisticsmanager.module.driver.vo;

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
 * @date： 2022/5/18 16:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverVO implements Serializable {

    private Long id;

    private String name;

    private Integer gender;

    private String genderName;

    private String mobile;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
