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

import com.valdoc.entity.Area;
import com.valdoc.entity.Plant;
import com.valdoc.entity.Role;
import com.valdoc.exception.DaoException;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class AreaDAOImpl implements AreaDAO {

	public static final Logger logger = LoggerFactory.getLogger(AreaDAOImpl.class);

	private EntityManager manager;

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	

	@Override
	public void add(Area area) throws DaoException {
		try {
			manager.persist(area);
		} catch (Exception ex) {
			logger.debug(" Failed To Add From Area. " + ex);
			throw new DaoException("Exception in AreaDAOImpl " + ex);
		}
		
	}

	@Override
	@Transactional
	public void update(Area area) throws DaoException {
		try {
			manager.merge(area);
		} catch (Exception ex) {
			logger.debug(" Failed To update. " + ex);
			throw new DaoException("Exception in AreaDAOImpl " + ex);
		}

		
	}

	@Override
	@Transactional
	public void delete(Integer id) throws DaoException {
		try {
			Area area = getObject(id);
			manager.remove(area);
		} catch (Exception ex) {
			logger.debug(" Failed To Delete From Area. " + ex);
			throw new DaoException("Exception in AreaDAOImpl " + ex);
		}
		
	}

	@Override
	public List<Area> getAreaDetails() throws DaoException {
		try {
			List<Area> areaEntityList = manager.createQuery("Select ar From Area ar", Area.class).getResultList();
			return areaEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!AreaDAOImpl in  getUserDetails() " + ex);
			throw new DaoException("Exception in AreaDAOImpl in getUserDetails() " + ex);
		}

	}


	@Override
	public Area getObject(Integer id) throws DaoException {
		try {
			Area area = manager.createNamedQuery("Area.findById", Area.class).setParameter("areaId", id).getSingleResult();
			if (area.getAreaId() == null) {
				return null;
			} else {
				return area;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObject " + ex);
			throw new DaoException("Exception  for getObject()" + ex);
		}
	}


	@Override
	public Plant getRoleObject(Integer id) throws DaoException {
		try {
			Plant plant = manager.createNamedQuery("Plant.findById", Plant.class).setParameter("plantId", id).getSingleResult();
			if (plant.getPlantId() == null) {
				return null; 
			} else {
				return plant;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getRoleObject " + ex);
			throw new DaoException("Exception  for getRoleObject()" + ex);
		}
	}

}
