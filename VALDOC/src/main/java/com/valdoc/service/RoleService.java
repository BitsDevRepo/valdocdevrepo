package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.RoleDTO;
import com.valdoc.exception.ValdocException;

public interface RoleService {

	public List<RoleDTO> getRoleDetails() throws ValdocException;

	public RoleDTO getObject(Integer id) throws ValdocException;

	public void add(RoleDTO dto) throws ValdocException;

	public void update(RoleDTO dto) throws ValdocException;

	public void delete(Integer id) throws ValdocException;
}
