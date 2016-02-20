package com.valdoc.dao;

import java.util.List;

import com.valdoc.entity.AHU;
import com.valdoc.exception.DaoException;

public interface AhuDAO {

	public List<AHU> getAhuDetails() throws DaoException;

	public AHU getObject(Integer id) throws DaoException;

	public void add(AHU ahu) throws DaoException;

	public void update(AHU ahu) throws DaoException;

	public void delete(Integer id) throws DaoException;

}
