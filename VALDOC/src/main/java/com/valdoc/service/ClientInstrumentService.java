package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.ClientInstrumentDTO;
import com.valdoc.exception.ValdocException;

public interface ClientInstrumentService {

	List<ClientInstrumentDTO> getClientInstrumentDetails() throws ValdocException;

	void addClientInstrument(ClientInstrumentDTO clientInstrumentDTO) throws ValdocException;

	void update(ClientInstrumentDTO clientInstrumentDTO) throws ValdocException;

	void delete(ClientInstrumentDTO clientInstrumentDTO) throws ValdocException;
	
	ClientInstrumentDTO getObject(Integer id) throws ValdocException;

}
