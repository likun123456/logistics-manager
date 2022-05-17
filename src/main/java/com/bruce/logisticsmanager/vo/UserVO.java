package com.bruce.logisticsmanager.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 51
 **/
@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO implements Serializable {
    @ApiModelProperty("主键Id")
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty(value = "性别", notes = "0男，1女")
    private Integer gender;

    @ApiModelProperty("年龄")
    private Integer age;
}
