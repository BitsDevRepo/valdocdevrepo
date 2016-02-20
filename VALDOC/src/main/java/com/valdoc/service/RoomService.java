package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.AhuDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.exception.ValdocException;

public interface RoomService {

	public List<RoomDTO> getRoomDetails() throws ValdocException;

	public RoomDTO getObject(Integer id) throws ValdocException;
	
	public void addRoom(RoomDTO roomDTO) throws ValdocException;

	public void update(RoomDTO roomDTO) throws ValdocException;

	public void delete(Integer id) throws ValdocException;

	public List<AhuDTO> getAhuDetails() throws ValdocException;

}
