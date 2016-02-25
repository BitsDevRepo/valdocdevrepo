package com.valdoc.dao;

import java.util.List;

import com.valdoc.entity.ClientInstrument;
import com.valdoc.exception.DaoException;

public interface ClientInstrumentDAO {

	List<ClientInstrument> getClientInstrumentDetails() throws DaoException;

	ClientInstrument getObject(Integer id) throws DaoException;

	void add(ClientInstrument clientInstrument) throws DaoException;

	void update(ClientInstrument clientInstrument) throws DaoException;

	void delete(ClientInstrument clientInstrument) throws DaoException;

}
