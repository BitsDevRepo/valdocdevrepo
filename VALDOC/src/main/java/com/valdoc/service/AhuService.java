package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.AhuDTO;
import com.valdoc.exception.ValdocException;

public interface AhuService {

	public List<AhuDTO> getAhuDetails() throws ValdocException;

	public AhuDTO getObject(Integer id) throws ValdocException;
	
	public void addAppAhu(AhuDTO ahuDTO) throws ValdocException;

	public void update(AhuDTO ahuDTO) throws ValdocException;

	public void delete(Integer id) throws ValdocException;

}
