package org.drill.module.po;

import java.io.Serializable;

/**
 * Created by gygesM on 2016/12/1.
 */
public class Role_permission implements Serializable{

    private String id;
    private String roleId;
    private Integer permissionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}
