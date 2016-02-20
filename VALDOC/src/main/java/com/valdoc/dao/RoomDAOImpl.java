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

import com.valdoc.entity.AHU;
import com.valdoc.entity.Area;
import com.valdoc.entity.Plant;
import com.valdoc.entity.Room;
import com.valdoc.exception.DaoException;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class RoomDAOImpl implements RoomDAO {

	public static final Logger logger = LoggerFactory.getLogger(RoomDAOImpl.class);

	private EntityManager manager;

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	

	@Override
	public void add(Room room) throws DaoException {
		try {
			manager.persist(room);
		} catch (Exception ex) {
			logger.debug(" Failed To Add From Room. " + ex);
			throw new DaoException("Exception in RoomDAOImpl " + ex);
		}
		
	}

	@Override
	@Transactional
	public void update(Room room) throws DaoException {
		try {
			manager.merge(room);
		} catch (Exception ex) {
			logger.debug(" Failed To update. " + ex);
			throw new DaoException("Exception in RoomDAOImpl " + ex);
		}

		
	}

	@Override
	@Transactional
	public void delete(Integer id) throws DaoException {
		try {
			Room room = getObject(id);
			manager.remove(room);
		} catch (Exception ex) {
			logger.debug(" Failed To Delete From Room. " + ex);
			throw new DaoException("Exception in RoomDAOImpl " + ex);
		}
		
	}

	@Override
	public List<Room> getRoomDetails() throws DaoException {
		try {
			List<Room> roomEntityList = manager.createQuery("Select r From Room r", Room.class).getResultList();
			return roomEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!RoomDAOImpl in  getRoomDetails() " + ex);
			throw new DaoException("Exception in RoomDAOImpl in getRoomDetails() " + ex);
		}

	}


	@Override
	public Room getObject(Integer id) throws DaoException {
		try {
			Room room = manager.createNamedQuery("Room.findById", Room.class).setParameter("roomId", id).getSingleResult();
			if (room.getRoomId() == null) {
				return null;
			} else {
				return room;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObject " + ex);
			throw new DaoException("Exception  for getObject()" + ex);
		}
	}


	@Override
	public AHU getAhuObject(Integer ahuId) throws DaoException {
		try {
			AHU ahu = manager.createNamedQuery("AHU.findById", AHU.class).setParameter("ahuId", ahuId).getSingleResult();
			if (ahu.getAhuId() == null) {
				return null; 
			} else {
				return ahu;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getRoomObject " + ex);
			throw new DaoException("Exception  for getRoomObject()" + ex);
		}
	}


	@Override
	public Area getAreaObject(Integer areaId) throws DaoException {
		try {
			Area area = manager.createNamedQuery("Area.findById", Area.class).setParameter("areaId", areaId).getSingleResult();
			if (area.getAreaId() == null) {
				return null; 
			} else {
				return area;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getRoomObject " + ex);
			throw new DaoException("Exception  for getRoomObject()" + ex);
		}
	}


	@Override
	public List<AHU> getAhuDetails() throws DaoException {
		try {
			List<AHU> ahuEntityList = manager.createQuery("Select ah From AHU ah", AHU.class).getResultList();
			return ahuEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!AhuDAOImpl in  getUserDetails() " + ex);
			throw new DaoException("Exception in AhuDAOImpl in getUserDetails() " + ex);
		}
	}

}
