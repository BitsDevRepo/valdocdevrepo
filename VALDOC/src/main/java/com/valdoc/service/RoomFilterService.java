package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.RoomFilterDTO;
import com.valdoc.dto.GrillDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.exception.ValdocException;

public interface RoomFilterService {

	public List<RoomFilterDTO> getRoomFilterDetails() throws ValdocException;

	public List<RoomDTO> getRoomDetails() throws ValdocException;

	public void addRoomFilter(RoomFilterDTO roomFilterDTO) throws ValdocException;

	public void update(RoomFilterDTO roomFilterDTO) throws ValdocException;

	public void delete(Integer roomFilterId) throws ValdocException;

	RoomFilterDTO getObject(Integer id) throws ValdocException;

	public List<GrillDTO> getGrillDetails() throws ValdocException;

	public void saveGrillDetails(GrillDTO grillDTO) throws ValdocException;

	public void updateGrillDetails(GrillDTO grillDTO) throws ValdocException;

	public void deleteGrillDetails(GrillDTO grillDTO) throws ValdocException;

	GrillDTO getGrillObject(Integer id) throws ValdocException;

}
