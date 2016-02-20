package com.valdoc.dao;

import java.util.List;

import com.valdoc.entity.Area;
import com.valdoc.entity.Plant;
import com.valdoc.exception.DaoException;

public interface AreaDAO {

	public List<Area> getAreaDetails() throws DaoException;

	public Area getObject(Integer id) throws DaoException;

	public void add(Area area) throws DaoException;

	public void update(Area area) throws DaoException;

	public void delete(Integer id) throws DaoException;

	public Plant getRoleObject(Integer id) throws DaoException;

}
