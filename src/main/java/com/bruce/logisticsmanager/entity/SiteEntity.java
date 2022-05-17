package com.bruce.logisticsmanager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:46
 */
@TableName("site")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class SiteEntity extends BaseEntity{

    private String name;

    private String province;

    private String  city;

    private String street;

    private String detail;
}
