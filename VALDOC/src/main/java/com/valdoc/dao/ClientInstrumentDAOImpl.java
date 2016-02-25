package com.valdoc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valdoc.entity.ClientInstrument;
import com.valdoc.exception.DaoException;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class ClientInstrumentDAOImpl implements ClientInstrumentDAO {

	public static final Logger logger = LoggerFactory.getLogger(ClientInstrumentDAOImpl.class);

	private EntityManager manager;

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	

	@Override
	public void add(ClientInstrument clientInstrument) throws DaoException {
		try {
			manager.persist(clientInstrument);
		} catch (Exception ex) {
			logger.debug(" Failed To Add From ClientInstrument. " + ex);
			throw new DaoException("Exception in ClientInstrumentDAOImpl " + ex);
		}
		
	}

	@Override
	@Transactional
	public void update(ClientInstrument clientInstrument) throws DaoException {
		try {
			manager.merge(clientInstrument);
		} catch (Exception ex) {
			logger.debug(" Failed To update. " + ex);
			throw new DaoException("Exception in ClientInstrumentDAOImpl " + ex);
		}

		
	}

	/*@Override
	@Transactional
	public void delete(Integer id) throws DaoException {
		try {
			ClientInstrument clientInstrument = getObject(id);
			manager.remove(clientInstrument);
		} catch (Exception ex) {
			logger.debug(" Failed To Delete From ClientInstrument. " + ex);
			throw new DaoException("Exception in ClientInstrumentDAOImpl " + ex);
		}
		
	}*/

	@Override
	public List<ClientInstrument> getClientInstrumentDetails() throws DaoException {
		try {
			List<ClientInstrument> clientInstrumentEntityList = manager.createQuery("Select ci From ClientInstrument ci", ClientInstrument.class).getResultList();
			return clientInstrumentEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!ClientInstrumentDAOImpl in  getClientInstrumentDetails() " + ex);
			throw new DaoException("Exception in ClientInstrumentDAOImpl in getClientInstrumentDetails() " + ex);
		}

	}


	@Override
	public ClientInstrument getObject(Integer id) throws DaoException {
		try {
			ClientInstrument clientInstrument = manager.createNamedQuery("ClientInstrument.findById", ClientInstrument.class).setParameter("cInstrumentId", id).getSingleResult();
			if (clientInstrument.getcInstrumentId() == null) {
				return null;
			} else {
				return clientInstrument;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObject " + ex);
			throw new DaoException("Exception  for getObject()" + ex);
		}
	}


	@Override
	public void delete(ClientInstrument clientInstrument) throws DaoException {
		try{			
			manager.remove(manager.contains(clientInstrument) ? clientInstrument : manager.merge(clientInstrument));
			}catch(Exception ex)
			{
				logger.debug(" Failed To Delete ApplicableTestRoomDetails. " + ex);
				throw new DaoException("Exception in RoomDAOImpl in deleteApplicableTestRoomDetails" + ex);
			}
	}
}
