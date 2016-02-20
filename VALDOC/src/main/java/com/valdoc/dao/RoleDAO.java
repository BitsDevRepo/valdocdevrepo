package com.valdoc.dao;

import java.util.List;

import com.valdoc.entity.Permission;
import com.valdoc.entity.Role;
import com.valdoc.exception.DaoException;

public interface RoleDAO {

	public List<Role> getRoleDetails() throws DaoException;

	public Role getObject(Integer id) throws DaoException;

	public void add(Role role) throws DaoException;

	public void update(Role role) throws DaoException;

	public void delete(Integer id) throws DaoException;
	
	public Permission getPermissionObject(Integer id) throws DaoException;

}
