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

import com.valdoc.entity.Permission;
import com.valdoc.entity.Role;
import com.valdoc.exception.DaoException;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class RoleDAOImpl implements RoleDAO {

	public static final Logger logger = LoggerFactory.getLogger(RoleDAOImpl.class);

	private EntityManager manager;

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public Role getObject(Integer id) throws DaoException {
		try {
			Role role = manager.createNamedQuery("Role.findById", Role.class).setParameter("id", id).getSingleResult();
			if (role.getId() == null) {
				return null;
			} else {
				return role;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObject " + ex);
			throw new DaoException("Exception  for getObject()" + ex);
		}
	}

	@Override
	public List<Role> getRoleDetails() throws DaoException {
		try {
			List<Role> roleEntityList = manager.createQuery("Select r From Role r", Role.class).getResultList();
			return roleEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!RoleDAOImpl in  getRoleDetails() " + ex);
			throw new DaoException("Exception in RoleDAOImpl in getRoleDetails() " + ex);
		}

	}

	@Override
	@Transactional
	public void update(Role role) throws DaoException {
		try {
			manager.merge(role);
		} catch (Exception ex) {
			logger.debug(" Failed To update. " + ex);
			throw new DaoException("Exception in RoleDAOImpl " + ex);
		}
	}

	@Override
	@Transactional
	public void delete(Integer id) throws DaoException {
		try {
			Role role = getObject(id);
			manager.remove(role);
		} catch (Exception ex) {
			logger.debug(" Failed To Delete From role. " + ex);
			throw new DaoException("Exception in RoleDAOImpl " + ex);
		}
	}

	@Override
	public void add(Role role) throws DaoException {
		try {
			manager.persist(role);
		} catch (Exception ex) {
			logger.debug(" Failed To update . " + ex);
			throw new DaoException("Exception in RoleDAOImpl " + ex);
		}
	}

	@Override
	public Permission getPermissionObject(Integer id) throws DaoException {
		try {
			Permission permission = manager.createNamedQuery("Permission.findById", Permission.class).setParameter("id", id).getSingleResult();
			if (permission == null) {
				return null;
			} else {
				return permission;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getPermissionObject " + ex);
			throw new DaoException("Exception  for getPermissionObject()" + ex);
		}
	}

}
