package com.bruce.logisticsmanager.common.enums;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 10:54
 */
public enum GenderEnum {
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
}
