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

import com.valdoc.entity.ApplicableTestEquipment;
import com.valdoc.entity.Equipment;
import com.valdoc.entity.EquipmentFilter;
import com.valdoc.exception.DaoException;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class EquipmentDAOImpl implements EquipmentDAO {

	public static final Logger logger = LoggerFactory.getLogger(EquipmentDAOImpl.class);

	private EntityManager manager;

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public Equipment getObject(Integer id) throws DaoException {
		try {
			Equipment equip = manager.createNamedQuery("Equipment.findById", Equipment.class).setParameter("equipmentId", id).getSingleResult();
			if (equip.getEquipmentId() == null) {
				return null;
			} else {
				return equip;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObject " + ex);
			throw new DaoException("Exception  for getObject()" + ex);
		}
	}

	@Override
	public List<Equipment> getEquipmentDetails() throws DaoException {
		try {
			List<Equipment> equipEntityList = manager.createQuery("Select u From Equipment u", Equipment.class).getResultList();
			return equipEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!EquipmentDAOImpl in  getUserDetails() " + ex);
			throw new DaoException("Exception in EquipmentDAOImpl in getEquipmentDetails() " + ex);
		}

	}


	@Override
	public void saveEquipment(Equipment equipment) throws DaoException {
		try {
			manager.persist(equipment);
		} catch (Exception ex) {
			logger.debug(" Failed To Add Equipment. " + ex);
			throw new DaoException("Exception in EquipmentImpl in saveEquipment" + ex);
		}		
	}

	@Override
	public void updateEquipment(Equipment equipment) throws DaoException {
		try {
			manager.merge(equipment);
		} catch (Exception ex) {
			logger.debug(" Failed To Update Equipment. " + ex);
			throw new DaoException("Exception in EquipmentImpl in updateEquipment" + ex);
		}
		
	}

	@Override
	public void deleteEquipment(Equipment equipment) throws DaoException {
		try{
		
		manager.remove(manager.contains(equipment) ? equipment : manager.merge(equipment));
		}catch(Exception ex)
		{
			logger.debug(" Failed To Delete Equipment. " + ex);
			throw new DaoException("Exception in EquipmentImpl in deleteEquipment" + ex);
		}
		
	}

	//Operations for Equipment Filter
	
	@Override
	public EquipmentFilter getObjectEquipmentFilter(Integer id) throws DaoException {
		try {
			EquipmentFilter equipmentFilter = manager.createNamedQuery("EquipmentFilter.findById", EquipmentFilter.class).setParameter("filterId", id).getSingleResult();
			if (equipmentFilter.getFilterId() == null) {
				return null;
			} else {
				return equipmentFilter;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObjectEquipmentFilter " + ex);
			throw new DaoException("Exception  for getObjectEquipmentFilter()" + ex);
		}
		
	}

	@Override
	public List<EquipmentFilter> getEquipmentFilterDetails() throws DaoException {
		try {
			List<EquipmentFilter> equipmentFilterList = manager.createQuery("Select u From EquipmentFilter u", EquipmentFilter.class).getResultList();
			return equipmentFilterList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!EquipmentDAOImpl in  getEquipmentDetails() " + ex);
			throw new DaoException("Exception in EquipmentDAOImpl in getEquipmentDetails() " + ex);
		}	
	}	

	@Override
	public void saveEquipmentFilterDetails(EquipmentFilter equipmentFilter) throws DaoException {
		try {
			manager.persist(equipmentFilter);
		} catch (Exception ex) {
			logger.debug(" Failed To Add EquipmentFilter. " + ex);
			throw new DaoException("Exception in EquipmentImpl in saveEquipmentFilterDetails" + ex);
		}		
	}

	@Override
	public void updateEquipmentFilterDetails(EquipmentFilter equipmentFilter) throws DaoException {
		try {
			manager.merge(equipmentFilter);
		} catch (Exception ex) {
			logger.debug(" Failed To Update Equipment. " + ex);
			throw new DaoException("Exception in EquipmentImpl in updateEquipmentFilterDetails" + ex);
		}
		
	}

	@Override
	public void deleteEquipmentFilterDetails(EquipmentFilter equipmentFilter) throws DaoException {
		try{
			
			manager.remove(manager.contains(equipmentFilter) ? equipmentFilter : manager.merge(equipmentFilter));
			}catch(Exception ex)
			{
				logger.debug(" Failed To Delete Equipment. " + ex);
				throw new DaoException("Exception in EquipmentImpl in deleteEquipment" + ex);
			}
		
	}	

	//Operations for ApplicableTestEquipment
	
	
	@Override
	public ApplicableTestEquipment getObjectApplicableTestEquipment(Integer id) throws DaoException {
		try {
			ApplicableTestEquipment applicableTestEquipment = manager.createNamedQuery("ApplicableTestEquipment.findById", ApplicableTestEquipment.class).setParameter("aplicable_testId", id).getSingleResult();
			if (applicableTestEquipment.getAplicableTestId() == null) {
				return null;
			} else {
				return applicableTestEquipment;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObjectApplicableTestEquipment " + ex);
			throw new DaoException("Exception  for getObjectApplicableTestEquipment()" + ex);
		}
	}

	@Override
	public List<ApplicableTestEquipment> getApplicableTestEquipmentDetails() throws DaoException {
		try {
			List<ApplicableTestEquipment> equipmentFilterList = manager.createQuery("Select u From ApplicableTestEquipment u", ApplicableTestEquipment.class).getResultList();
			return equipmentFilterList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!EquipmentDAOImpl in  getApplicableTestEquipmentDetails() " + ex);
			throw new DaoException("Exception in EquipmentDAOImpl in getApplicableTestEquipmentDetails() " + ex);
		}	
	}

	@Override
	public void saveApplicableTestEquipmentDetails(ApplicableTestEquipment applicableTestEquipment)
			throws DaoException {
		try {
			manager.persist(applicableTestEquipment);
		} catch (Exception ex) {
			logger.debug(" Failed To Add ApplicableTestEquipmentDetails. " + ex);
			throw new DaoException("Exception in EquipmentImpl in saveApplicableTestEquipmentDetails" + ex);
		}
		
	}

	@Override
	public void updateApplicableTestEquipmentDetails(ApplicableTestEquipment applicableTestEquipment)
			throws DaoException {
		try {
			manager.merge(applicableTestEquipment);
		} catch (Exception ex) {
			logger.debug(" Failed To Update ApplicableTestEquipmentDetails. " + ex);
			throw new DaoException("Exception in EquipmentImpl in updateApplicableTestEquipmentDetails" + ex);
		}
		
	}

	@Override
	public void deleteApplicableTestEquipmentDetails(ApplicableTestEquipment applicableTestEquipment)
			throws DaoException {
		try{			
			manager.remove(manager.contains(applicableTestEquipment) ? applicableTestEquipment : manager.merge(applicableTestEquipment));
			}catch(Exception ex)
			{
				logger.debug(" Failed To Delete ApplicableTestEquipmentDetails. " + ex);
				throw new DaoException("Exception in EquipmentDAOImpl in deleteApplicableTestEquipmentDetails" + ex);
			}
		
	}
	
	
	
}