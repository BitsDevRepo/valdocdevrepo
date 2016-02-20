package com.valdoc.dto;

import java.io.Serializable;

public class RoleDTO implements Serializable {

	private static final long serialVersionUID = -1449934963056217598L;

	private Integer id;

	private String userType;

	private String roleType;

	private PermissionDTO permission;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public PermissionDTO getPermission() {
		return permission;
	}

	public void setPermission(PermissionDTO permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		return "RoleDTO [id=" + id + ", userType=" + userType + ", roleType=" + roleType + ", permission=" + permission
				+ "]";
	}

	
}