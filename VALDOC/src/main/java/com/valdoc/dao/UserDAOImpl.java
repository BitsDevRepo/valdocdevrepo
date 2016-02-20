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

import com.valdoc.dto.UserDTO;
import com.valdoc.entity.Role;
import com.valdoc.entity.User;
import com.valdoc.exception.DaoException;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class UserDAOImpl implements UserDAO {

	public static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	private EntityManager manager;

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public User getObject(Integer id) throws DaoException {
		try {
			User user = manager.createNamedQuery("User.findById", User.class).setParameter("id", id).getSingleResult();
			if (user.getId() == null) {
				return null;
			} else {
				return user;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getObject " + ex);
			throw new DaoException("Exception  for getObject()" + ex);
		}
	}

	@Override
	public List<User> getUserDetails() throws DaoException {
		try {
			List<User> userEntityList = manager.createQuery("Select u From User u", User.class).getResultList();
			return userEntityList;
		} catch (Exception ex) {
			logger.debug(" Failed SQL!UserDAOImpl in  getUserDetails() " + ex);
			throw new DaoException("Exception in UserDAOImpl in getUserDetails() " + ex);
		}

	}

	@Override
	@Transactional
	public void update(User appUser) throws DaoException {
		try {
			manager.merge(appUser);
		} catch (Exception ex) {
			logger.debug(" Failed To update. " + ex);
			throw new DaoException("Exception in UserDAOImpl " + ex);
		}
	}

	@Override
	@Transactional
	public void delete(Integer id) throws DaoException {
		try {
			User appuser = getObject(id);
			manager.remove(appuser);
		} catch (Exception ex) {
			logger.debug(" Failed To Delete From AppUser. " + ex);
			throw new DaoException("Exception in AppUserDAOImpl " + ex);
		}
	}

	@Override
	public void add(User user) throws DaoException {
		try {
			manager.persist(user);
		} catch (Exception ex) {
			logger.debug(" Failed To update From AppUser. " + ex);
			throw new DaoException("Exception in AppUserDAOImpl " + ex);
		}
	}

	@Override
	public Role getRoleObject(Integer id) throws DaoException {
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
			logger.debug(" Failed SQL! getRoleObject " + ex);
			throw new DaoException("Exception  for getRoleObject()" + ex);
		}
	}

	@Override
	public User validateLogin(UserDTO userDTO) throws DaoException {

		try {
			User user = manager.createNamedQuery("User.findByEmail", User.class).setParameter("email", userDTO.getEmail()).getSingleResult();
			if (user.getId() != null) {
				return user;
			} else {
				return null;
			}
		} catch (NoResultException e) {
			return null;
		} catch (Exception ex) {
			logger.debug(" Failed SQL! getRoleObject " + ex);
			throw new DaoException("Exception  for validateLogin()" + ex);
		}
	}

}
