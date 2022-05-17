package com.bruce.logisticsmanager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * @program: car-manager
 * @description:
 * @author: likun
 * @create: 2022-05-05 23: 06
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("user")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends BaseEntity {

    private String username;

    private String password;

    private String nickname;

    private Integer gender;

    private Integer age;

    private Integer role;

}
