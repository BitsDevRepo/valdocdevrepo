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

import com.valdoc.entity.RoomFilter;
import com.valdoc.dto.GrillDTO;
import com.valdoc.entity.Grill;
import com.valdoc.entity.Room;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class RoomFilterDAOImpl implements RoomFilterDAO {

	public static final Logger logger = LoggerFactory.getLogger(RoomFilterDAOImpl.class);

	private EntityManager manager;

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	

	@Override
	public void add(RoomFilter roomFilter) throws DaoException {
		try {
			manager.persist(roomFilter);
		} catch (Exception ex) {
			logger.debug(" Failed To Add From RoomFilter. " + ex);
			throw new DaoException("Exception in RoomFilterDAOImpl " + ex);
		}
		
	}

	@Override
	@Transactional
	public void update(RoomFilter roomFilter) throws DaoException {
		try {
			manager.merge(roomFilter);
		} catch (Exception ex) {
			logger.debug(" Failed To update. " + ex);
			throw new DaoException("Exception in RoomFilterDAOImpl " + ex);
		}

		
	}

	@Override
	@Transactional
	public void delete(Integer id) throws DaoException {
		try {
			RoomFilter roomFilter = getObject(id);
			manager.remove(roomFilter);
		} catch (Exception ex) {
			logger.debug(" Failed To Delete From RoomFilter. " + ex);
			throw new DaoException("Exception in RoomFilterDAOImpl " + ex);
		}
		
	}

	@Override
	public List<RoomFilter> getRoomFilterDetails() throws DaoException {
		try {
			List<RoomFilter> roomFilterEntityList = manager.createQuery("Select rf From RoomFilter rf", RoomFilter.class).getResultList();
			return roomFilterEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!RoomFilterDAOImpl in  getRoomFilterDetails() " + ex);
			throw new DaoException("Exception in RoomFilterDAOImpl in getRoomFilterDetails() " + ex);
		}

	}


	@Override
	public RoomFilter getObject(Integer id) throws DaoException {
		try {
			RoomFilter roomFilter = manager.createNamedQuery("RoomFilter.findById", RoomFilter.class).setParameter("filterId", id).getSingleResult();
			if (roomFilter.getFilterId() == null) {
				return null;
			} else {
				return roomFilter;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObject " + ex);
			throw new DaoException("Exception  for getObject()" + ex);
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
	public List<Room> getRoomDetails() throws DaoException {
		try {
			List<Room> roomEntityList = manager.createQuery("Select r From Room r", Room.class).getResultList();
			return roomEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!RoomDAOImpl in  getRoomDetails() " + ex);
			throw new DaoException("Exception in RoomDAOImpl in getRoomDetails() " + ex);
		}
	}

	//Operations for Grill

	@Override
	public List<Grill> getGrillDetails() throws DaoException {
		try {
			List<Grill> grillList = manager.createQuery("Select gr From Grill gr", Grill.class).getResultList();
			return grillList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!RoomDAOImpl in  getGrillDetails() " + ex);
			throw new DaoException("Exception in RoomDAOImpl in getGrillDetails() " + ex);
		}	
	}


	@Override
	public Grill getGrillObject(Integer id) throws DaoException {
		try {
			Grill grill = manager.createNamedQuery("Grill.findById", Grill.class).setParameter("grillId", id).getSingleResult();
			if (grill.getGrillId() == null) {
				return null;
			} else {
				return grill;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObjectGrill " + ex);
			throw new DaoException("Exception  for getObjectGrill()" + ex);
		}
	}


	@Override
	public void deleteGrill(Grill grillId) throws DaoException {
		try{			
			manager.remove(manager.contains(grillId) ? grillId : manager.merge(grillId));
			}catch(Exception ex)
			{
				logger.debug(" Failed To Delete GrillDetails. " + ex);
				throw new DaoException("Exception in RoomFilterDAOImpl in deleteGrillDetails" + ex);
			}
		
	}


	@Override
	public void saveGrill(Grill grill) throws DaoException {
		try {
			manager.persist(grill);
		} catch (Exception ex) {
			logger.debug(" Failed To Add GrillDetails. " + ex);
			throw new DaoException("Exception in RoomImpl in saveGrillDetails" + ex);
		}		
	}


	@Override
	public void updateGrillDetails(Grill grill) throws DaoException {
		try {
			manager.merge(grill);
		} catch (Exception ex) {
			logger.debug(" Failed To Update GrillDetails. " + ex);
			throw new DaoException("Exception in RoomImpl in updateGrillDetails" + ex);
		}
	}

}
