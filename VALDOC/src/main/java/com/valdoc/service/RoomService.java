package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.AhuDTO;
import com.valdoc.dto.ApplicableTestRoomDTO;
import com.valdoc.dto.AreaDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.exception.ValdocException;

public interface RoomService {

	public List<RoomDTO> getRoomDetails() throws ValdocException;

	public RoomDTO getObject(Integer id) throws ValdocException;
	
	public void addRoom(RoomDTO roomDTO) throws ValdocException;

	public void update(RoomDTO roomDTO) throws ValdocException;

	public void delete(Integer id) throws ValdocException;

	public List<AhuDTO> getAhuDetails() throws ValdocException;

	public List<ApplicableTestRoomDTO> getApplicableTestRoomDetails() throws ValdocException;

	public void saveApplicableTestRoomDetails(ApplicableTestRoomDTO applicableTestRoomDTO)throws ValdocException;

	public void updateApplicableTestRoomDetails(ApplicableTestRoomDTO applicableTestRoomDTO) throws ValdocException;

	public void deleteApplicableTestRoomDetails(ApplicableTestRoomDTO applicableTestRoomDTO) throws ValdocException;

	public List<RoomDTO> getRoomId() throws ValdocException;
	
	public ApplicableTestRoomDTO getObjectApplicableTestRoom(Integer id) throws ValdocException;

	public List<AreaDTO> getAreaDetails() throws ValdocException;

}
