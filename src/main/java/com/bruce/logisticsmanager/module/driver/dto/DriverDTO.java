package com.bruce.logisticsmanager.module.driver.dto;

import com.bruce.logisticsmanager.dto.SearchDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/18 16:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO extends SearchDTO implements Serializable {

    private Long id;

    private String name;

    private Integer gender;

    private String mobile;
}
