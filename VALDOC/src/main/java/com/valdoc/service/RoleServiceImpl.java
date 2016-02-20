package com.valdoc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdoc.dao.RoleDAO;
import com.valdoc.dto.PermissionDTO;
import com.valdoc.dto.RoleDTO;
import com.valdoc.entity.Permission;
import com.valdoc.entity.Role;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;

@Service
public class RoleServiceImpl implements RoleService {

	public static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Autowired
	public RoleDAO dao;

	@Override
	public RoleDTO getObject(Integer id) throws ValdocException {

		try {
			Role role = dao.getObject(id);
			RoleDTO roleDTO = new RoleDTO();
			PermissionDTO permissionDTO = new PermissionDTO();

			if (null != role) {

				permissionDTO.setId(role.getPermission().getId());
				permissionDTO.setName(role.getPermission().getName());

				roleDTO.setId(role.getId());
				roleDTO.setRoleType(role.getRoleType());
				roleDTO.setUserType(role.getUserType());
				roleDTO.setPermission(permissionDTO);
			}
			return roleDTO;

		} catch (DaoException ex) {
			logger.error("RoleServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoleServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public List<RoleDTO> getRoleDetails() throws ValdocException {
		List<RoleDTO> roleDTOs = new ArrayList<RoleDTO>();
		try {
			List<Role> roles = dao.getRoleDetails();
			if (roles != null && roles.size() > 0) {
				for (Role role : roles) {

					RoleDTO roleDTO = new RoleDTO();
					PermissionDTO permissionDTO = new PermissionDTO();

					roleDTO.setId(role.getId());
					roleDTO.setRoleType(role.getRoleType());
					roleDTO.setUserType(role.getUserType());

					permissionDTO.setId(role.getPermission().getId());
					permissionDTO.setName(role.getPermission().getName());

					roleDTO.setPermission(permissionDTO);

					roleDTOs.add(roleDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("RoleServiceImpl.getRoleDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoleServiceImpl.getRoleDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return roleDTOs;
	}

	@Override
	public void add(RoleDTO dto) throws ValdocException {
		try {

			Role role = new Role();
			Permission permission = dao.getPermissionObject(dto.getPermission().getId());
			role.setRoleType(dto.getRoleType());
			role.setUserType(dto.getUserType());
			role.setPermission(permission);
			dao.add(role);

		} catch (DaoException ex) {
			logger.error("RoleServiceImpl.add() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoleServiceImpl.add() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void update(RoleDTO dto) throws ValdocException {
		try {

			Role role = new Role();			
			role.setId(dto.getId());
			role.setRoleType(dto.getRoleType());
			role.setUserType(dto.getUserType());
			role.setPermission(getPermissionObject(dto.getPermission().getId()));
			dao.update(role);

		} catch (DaoException ex) {
			logger.error("RoleServiceImpl.update() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoleServiceImpl.update() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}
	
	
	public Permission getPermissionObject(Integer id) {
		Permission permission = new Permission();
		try {
			permission = dao.getPermissionObject(id);
		} catch (DaoException e) {
			logger.error("RoleServiceImpl.getPermissionObject() " + e);
			e.printStackTrace();
		}

		return permission;
	}

	@Override
	public void delete(Integer id) throws ValdocException {
		try {
			dao.delete(id);
		} catch (DaoException ex) {
			logger.error("RoleServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoleServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

}
