package com.bruce.logisticsmanager.module.address.dto;

import com.bruce.logisticsmanager.dto.SearchDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 13:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO extends SearchDTO implements Serializable {

    private Long id;

    private String province;

    private String city;

    private String street;

    private String detail;

    private String mobile;

    private String call;

    private String userId;
}
