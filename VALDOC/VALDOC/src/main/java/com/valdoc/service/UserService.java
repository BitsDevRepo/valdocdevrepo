package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.UserDTO;
import com.valdoc.exception.ValdocException;

public interface UserService {

	public List<UserDTO> getUserDetails() throws ValdocException;

	public UserDTO getObject(Integer id) throws ValdocException;
	
	public void addAppUser(UserDTO userDTO) throws ValdocException;

	public void update(UserDTO userDTO) throws ValdocException;

	public void delete(Integer id) throws ValdocException;

	public UserDTO validateLogin(UserDTO userDTO)throws ValdocException;

}
