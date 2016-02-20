package com.valdoc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdoc.dao.UserDAO;
import com.valdoc.dto.PermissionDTO;
import com.valdoc.dto.RoleDTO;
import com.valdoc.dto.UserDTO;
import com.valdoc.entity.Role;
import com.valdoc.entity.User;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;
import com.valdoc.util.UtilityService;

@Service
public class UserServiceImpl implements UserService {

	public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	public UserDAO dao;

	@Override
	public UserDTO getObject(Integer id) throws ValdocException {

		try {
			User user = dao.getObject(id);
			UserDTO userDTO = new UserDTO();
			RoleDTO roleDTO = new RoleDTO();
			PermissionDTO permissionDTO = new PermissionDTO();

			if (null != user) {
				userDTO.setId(user.getId());
				userDTO.setName(user.getName());
				userDTO.setEmail(user.getEmail());
				userDTO.setPassword(user.getPassword());

				permissionDTO.setId(user.getRole().getPermission().getId());
				permissionDTO.setName(user.getRole().getPermission().getName());

				roleDTO.setId(user.getRole().getId());
				roleDTO.setRoleType(user.getRole().getRoleType());
				roleDTO.setUserType(user.getRole().getUserType());
				roleDTO.setPermission(permissionDTO);

				userDTO.setUserRole(roleDTO);
				userDTO.setLastUpdated(UtilityService.dateToString(user.getLastUpdated()));
				userDTO.setCreatedDate(UtilityService.dateToString(user.getCreatedDate()));
				userDTO.setActive(user.isActive());
				userDTO.setDeleted(user.isDeleted());
			}
			return userDTO;

		} catch (DaoException ex) {
			logger.error("UserServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("UserServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public List<UserDTO> getUserDetails() throws ValdocException {
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		try {
			List<User> users = dao.getUserDetails();
			if (users != null && users.size() > 0) {				
				for (User user : users) {
					UserDTO userDTO = new UserDTO();
					RoleDTO roleDTO = new RoleDTO();
					PermissionDTO permissionDTO = new PermissionDTO();
					userDTO.setId(user.getId());
					userDTO.setName(user.getName());
					userDTO.setEmail(user.getEmail());
					userDTO.setPassword(user.getPassword());
					userDTO.setLastUpdated(UtilityService.dateToString(user.getLastUpdated()));
					userDTO.setCreatedDate(UtilityService.dateToString(user.getCreatedDate()));
					userDTO.setActive(user.isActive());
					userDTO.setDeleted(user.isDeleted());					

					roleDTO.setId(user.getRole().getId());
					roleDTO.setRoleType(user.getRole().getRoleType());
					roleDTO.setUserType(user.getRole().getUserType());
					
					permissionDTO.setId(user.getRole().getPermission().getId());
					permissionDTO.setName(user.getRole().getPermission().getName());
					
					roleDTO.setPermission(permissionDTO);
					userDTO.setUserRole(roleDTO);					
					userDTOs.add(userDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("UserServiceImpl.getUserDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("UserServiceImpl.getUserDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return userDTOs;
	}

	@Override
	public void addAppUser(UserDTO userDTO) throws ValdocException {
		try {

			User user = new User();
			user.setName(userDTO.getName());
			user.setEmail(userDTO.getEmail());
			user.setActive(true);
			user.setDeleted(false);
			String encodedPassword = UtilityService.encode(userDTO.getPassword());
			user.setPassword(encodedPassword);
			user.setRole(getRoleObjById(userDTO.getUserRole().getId()));
			dao.add(user);

		} catch (DaoException ex) {
			logger.error("UserServiceImpl.add() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("UserServiceImpl.add() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void update(UserDTO userDTO) throws ValdocException {
		try {

			User user = new User();
			user.setId(userDTO.getId());
			user.setName(userDTO.getName());
			user.setEmail(userDTO.getEmail());
			user.setActive(userDTO.isActive());
			user.setDeleted(userDTO.isDeleted());
			String encodedPassword = UtilityService.encode(userDTO.getPassword());
			user.setPassword(encodedPassword);
			user.setRole(getRoleObjById(userDTO.getUserRole().getId()));
			dao.update(user);

		} catch (DaoException ex) {
			logger.error("UserServiceImpl.update() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("UserServiceImpl.update() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public void delete(Integer id) throws ValdocException {
		try {
			dao.delete(id);
		} catch (DaoException ex) {
			logger.error("UserServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("UserServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	public Role getRoleObjById(Integer id) {
		Role role = new Role();
		try {
			role = dao.getRoleObject(id);
		} catch (DaoException e) {
			logger.error("UserServiceImpl.getRoleObjById() " + e);
			e.printStackTrace();
		}

		return role;
	}

	@Override
	public UserDTO validateLogin(UserDTO dto)throws ValdocException  {
		try {
			User user = dao.validateLogin(dto);
			UserDTO userDTO = new UserDTO();
			RoleDTO roleDTO = new RoleDTO();
			PermissionDTO permissionDTO = new PermissionDTO();

			if (null != user) {
				userDTO.setId(user.getId());
				userDTO.setName(user.getName());
				userDTO.setEmail(user.getEmail());
				userDTO.setPassword(user.getPassword());

				permissionDTO.setId(user.getRole().getPermission().getId());
				permissionDTO.setName(user.getRole().getPermission().getName());

				roleDTO.setId(user.getRole().getId());
				roleDTO.setRoleType(user.getRole().getRoleType());
				roleDTO.setUserType(user.getRole().getUserType());
				roleDTO.setPermission(permissionDTO);

				userDTO.setUserRole(roleDTO);
				userDTO.setLastUpdated(UtilityService.dateToString(user.getLastUpdated()));
				userDTO.setCreatedDate(UtilityService.dateToString(user.getCreatedDate()));
				userDTO.setActive(user.isActive());
				userDTO.setDeleted(user.isDeleted());
			}
			return userDTO;

		} catch (DaoException ex) {
			logger.error("UserServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("UserServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

}
