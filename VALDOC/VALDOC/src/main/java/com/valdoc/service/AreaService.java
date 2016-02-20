package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.AreaDTO;
import com.valdoc.exception.ValdocException;

public interface AreaService {

	public List<AreaDTO> getAreaDetails() throws ValdocException;

	public AreaDTO getObject(Integer id) throws ValdocException;
	
	public void addArea(AreaDTO areaDTO) throws ValdocException;

	public void update(AreaDTO areaDTO) throws ValdocException;

	public void delete(Integer id) throws ValdocException;

}
