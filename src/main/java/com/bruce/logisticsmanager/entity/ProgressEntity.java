package com.bruce.logisticsmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/17 11:42
 */
@TableName("progress")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ProgressEntity extends BaseEntity{

    @TableField("order_id")
    private Long orderId;

    @TableField("site_id")
    private Long siteId;

    @TableField("last_time")
    private Date lastTime;
}
