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
import com.valdoc.entity.ApplicableTestRoom;
import com.valdoc.entity.Area;
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
	public void update(Room room) throws DaoException {
		try {
			manager.merge(room);
		} catch (Exception ex) {
			logger.debug(" Failed To update. " + ex);
			throw new DaoException("Exception in RoomDAOImpl " + ex);
		}
		
	}

	@Override
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

	//Operations for ApplicableTestRoom


	@Override
	public List<ApplicableTestRoom> getApplicableTestRoomDetails() throws DaoException {
		try {
			List<ApplicableTestRoom> roomFilterList = manager.createQuery("Select u From ApplicableTestRoom u", ApplicableTestRoom.class).getResultList();
			return roomFilterList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!RoomDAOImpl in  getApplicableTestRoomDetails() " + ex);
			throw new DaoException("Exception in RoomDAOImpl in getApplicableTestRoomDetails() " + ex);
		}	

	}


	@Override
	public void saveApplicableTestRoomDetails(ApplicableTestRoom applicableTestRoom) throws DaoException {
		try {
			manager.persist(applicableTestRoom);
		} catch (Exception ex) {
			logger.debug(" Failed To Add ApplicableTestRoomDetails. " + ex);
			throw new DaoException("Exception in RoomImpl in saveApplicableTestRoomDetails" + ex);
		}

	}


	@Override
	public Room getRoomObject(Integer roomId) throws DaoException {
		try {
			Room room = manager.createNamedQuery("Room.findById", Room.class).setParameter("roomId", roomId).getSingleResult();
			if (room.getRoomId() == null) {
				return null; 
			} else {
				return room;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getRoomFilterObject " + ex);
			throw new DaoException("Exception  for getRoomFilterObject()" + ex);
		}
	}


	@Override
	public void updateApplicableTestRoomDetails(ApplicableTestRoom applicableTestRoom) throws DaoException {
		try {
			manager.merge(applicableTestRoom);
		} catch (Exception ex) {
			logger.debug(" Failed To Update ApplicableTestRoomDetails. " + ex);
			throw new DaoException("Exception in RoomImpl in updateApplicableTestRoomDetails" + ex);
		}
	}
		


	@Override
	public void deleteApplicableTestRoomDetails(ApplicableTestRoom applicableTestRoom) throws DaoException {
		try{			
			manager.remove(manager.contains(applicableTestRoom) ? applicableTestRoom : manager.merge(applicableTestRoom));
			}catch(Exception ex)
			{
				logger.debug(" Failed To Delete ApplicableTestRoomDetails. " + ex);
				throw new DaoException("Exception in RoomDAOImpl in deleteApplicableTestRoomDetails" + ex);
			}
	
	}


	@Override
	public List<Room> getRoomId() throws DaoException {
		try {
			List<Room> roomEntityList = manager.createQuery("Select r From Room r", Room.class).getResultList();
			return roomEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!RoomDAOImpl in  getRoomDetails() " + ex);
			throw new DaoException("Exception in RoomDAOImpl in getRoomDetails() " + ex);
		}
	}


	@Override
	public ApplicableTestRoom getObjectApplicableTestRoom(Integer id) throws DaoException {
		try {
			ApplicableTestRoom applicableTestRoom = manager.createNamedQuery("ApplicableTestRoom.findById", ApplicableTestRoom.class).setParameter("aplicableTestId", id).getSingleResult();
			if (applicableTestRoom.getAplicableTestId() == null) {
				return null;
			} else {
				return applicableTestRoom;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObjectApplicableTestRoom " + ex);
			throw new DaoException("Exception  for getObjectApplicableTestRoom()" + ex);
		}
	}


	@Override
	public List<Area> getAreaDetails() throws DaoException {
		try {
			List<Area> areaEntityList = manager.createQuery("Select ar From Area ar", Area.class).getResultList();
			return areaEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!RoomDAOImpl in  getAreaDetails() " + ex);
			throw new DaoException("Exception in RoomDAOImpl in getAreaDetails() " + ex);
		}
	}

}
