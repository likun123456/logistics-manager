package com.bruce.logisticsmanager.common.enums;

/**
 * <p>description<p/>
 *
 * @author likun
 * @date： 2022/5/6 14:09
 */
public enum RoleEnum {
    USER(0, "普通用户"),
    SENDER(1, "配送员"),
    ADMIN(2, "管理员");

    private Integer roleId;

    private String roleName;

    RoleEnum(Integer roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
