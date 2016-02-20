package com.valdoc.dao;

import java.util.List;

import com.valdoc.dto.UserDTO;
import com.valdoc.entity.Role;
import com.valdoc.entity.User;
import com.valdoc.exception.DaoException;

public interface UserDAO {

	public List<User> getUserDetails() throws DaoException;

	public User getObject(Integer id) throws DaoException;

	public Role getRoleObject(Integer id) throws DaoException;

	public void add(User user) throws DaoException;

	public void update(User appUser) throws DaoException;

	public void delete(Integer id) throws DaoException;

	public User validateLogin(UserDTO userDTO) throws DaoException;

}
