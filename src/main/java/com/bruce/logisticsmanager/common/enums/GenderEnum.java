package com.bruce.logisticsmanager.common.enums;

import java.util.Arrays;
import java.util.Objects;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 10:54
 */
public enum GenderEnum {
    NO(-1, "未知"),
    MAN(0, "男"),
    WOMAN(1, "女");

    private Integer code;

    private String name;

    GenderEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static GenderEnum getEnumByCode(Integer integer) {
        return Arrays.stream(GenderEnum.values()).filter(e -> Objects.equals(e.code, integer)).findFirst().orElse(GenderEnum.NO);
    }
}

