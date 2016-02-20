package com.valdoc.dto;

import java.io.Serializable;

public class PermissionDTO implements Serializable {

	private static final long serialVersionUID = -1449934963056217598L;

	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PermissionDTO [id=" + id + ", name=" + name + "]";
	}

}