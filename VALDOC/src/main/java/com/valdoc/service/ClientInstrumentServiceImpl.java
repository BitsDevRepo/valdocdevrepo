package com.valdoc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdoc.dao.ClientInstrumentDAO;
import com.valdoc.dto.ClientInstrumentDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.entity.ApplicableTestRoom;
import com.valdoc.entity.ClientInstrument;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;
import com.valdoc.util.UtilityService;

@Service
public class ClientInstrumentServiceImpl implements ClientInstrumentService {

	public static final Logger logger = LoggerFactory.getLogger(ClientInstrumentServiceImpl.class);

	@Autowired
	public ClientInstrumentDAO dao;
	
	@Override
	public List<ClientInstrumentDTO> getClientInstrumentDetails() throws ValdocException {
			
		List<ClientInstrumentDTO> clientInstrumentDTOs = new ArrayList<ClientInstrumentDTO>();
		try {
			List<ClientInstrument> clientInstruments = dao.getClientInstrumentDetails();
			if (clientInstruments != null && clientInstruments.size() > 0) {

				for (ClientInstrument clientInstrument : clientInstruments) {
					ClientInstrumentDTO clientInstrumentDTO = new ClientInstrumentDTO();
					
					clientInstrumentDTO.setcInstrumentId(clientInstrument.getcInstrumentId());
					clientInstrumentDTO.setInstrumentId(clientInstrument.getInstrumentId());
					clientInstrumentDTO.setMake(clientInstrument.getMake());
					clientInstrumentDTO.setSerialNo(clientInstrument.getSerialNo());
					clientInstrumentDTO.setcInstrumentName(clientInstrument.getcInstrumentName());
					clientInstrumentDTO.setModel(clientInstrument.getModel());
					clientInstrumentDTO.setCurrentLocation(clientInstrument.getCurrentLocation());
					clientInstrumentDTO.setStatus(clientInstrument.getStatus());
					clientInstrumentDTO.setTestId(clientInstrument.getTestId());
					clientInstrumentDTO.setCalibrationDueDate(clientInstrument.getCalibrationDueDate());
					clientInstrumentDTO.setLastCalibrationDate(clientInstrument.getLastCalibrationDate());
					clientInstrumentDTO.setCreationDate(UtilityService.dateToString(clientInstrument.getCreationDate()));
					
					clientInstrumentDTOs.add(clientInstrumentDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("ClientInstrumentServiceImpl.getClientInstrumentDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("ClientInstrumentServiceImpl.getClientInstrumentDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return clientInstrumentDTOs;
	}

	@Override
	public ClientInstrumentDTO getObject(Integer id) throws ValdocException {

		try {
			ClientInstrument clientInstrument = dao.getObject(id);
			ClientInstrumentDTO clientInstrumentDTO = new ClientInstrumentDTO();
			if (null != clientInstrument) {
				
				clientInstrumentDTO.setcInstrumentId(clientInstrument.getcInstrumentId());
				clientInstrumentDTO.setInstrumentId(clientInstrument.getInstrumentId());
				clientInstrumentDTO.setMake(clientInstrument.getMake());
				clientInstrumentDTO.setSerialNo(clientInstrument.getSerialNo());
				clientInstrumentDTO.setcInstrumentName(clientInstrument.getcInstrumentName());
				clientInstrumentDTO.setModel(clientInstrument.getModel());
				clientInstrumentDTO.setCurrentLocation(clientInstrument.getCurrentLocation());
				clientInstrumentDTO.setStatus(clientInstrument.getStatus());
				clientInstrumentDTO.setTestId(clientInstrument.getTestId());
				clientInstrumentDTO.setCalibrationDueDate(clientInstrument.getCalibrationDueDate());
				clientInstrumentDTO.setLastCalibrationDate(clientInstrument.getLastCalibrationDate());
				clientInstrumentDTO.setCreationDate(UtilityService.dateToString(clientInstrument.getCreationDate()));									
			}
			return clientInstrumentDTO;

		} catch (DaoException ex) {
			logger.error("ClientInstrumentServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("ClientInstrumentServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void addClientInstrument(ClientInstrumentDTO clientInstrumentDTO) throws ValdocException {
		try {
			
			ClientInstrument clientInstrument = new ClientInstrument();
			
			clientInstrument.setInstrumentId(clientInstrumentDTO.getInstrumentId());
			clientInstrument.setMake(clientInstrumentDTO.getMake());
			clientInstrument.setSerialNo(clientInstrumentDTO.getSerialNo());
			clientInstrument.setcInstrumentName(clientInstrumentDTO.getcInstrumentName());
			clientInstrument.setModel(clientInstrumentDTO.getModel());
			clientInstrument.setCurrentLocation(clientInstrumentDTO.getCurrentLocation());
			clientInstrument.setStatus(clientInstrumentDTO.getStatus());
			clientInstrument.setTestId(clientInstrumentDTO.getTestId());
			clientInstrument.setCalibrationDueDate(clientInstrumentDTO.getCalibrationDueDate());
			clientInstrument.setLastCalibrationDate(clientInstrumentDTO.getLastCalibrationDate());
			
			System.out.println("date2="+clientInstrumentDTO.getCalibrationDueDate());
			
			dao.add(clientInstrument);

		} catch (DaoException ex) {
			logger.error("ClientInstrumentServiceImpl.add() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("ClientInstrumentServiceImpl.add() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		
	}
	
	@Override
	public void update(ClientInstrumentDTO clientInstrumentDTO) throws ValdocException {
		try {
			ClientInstrument clientInstrument = new ClientInstrument();
		
			clientInstrument.setcInstrumentId(clientInstrumentDTO.getcInstrumentId());
			clientInstrument.setInstrumentId(clientInstrumentDTO.getInstrumentId());
			clientInstrument.setMake(clientInstrumentDTO.getMake());
			clientInstrument.setSerialNo(clientInstrumentDTO.getSerialNo());
			clientInstrument.setcInstrumentName(clientInstrumentDTO.getcInstrumentName());
			clientInstrument.setModel(clientInstrumentDTO.getModel());
			clientInstrument.setCurrentLocation(clientInstrumentDTO.getCurrentLocation());
			clientInstrument.setStatus(clientInstrumentDTO.getStatus());
			clientInstrument.setTestId(clientInstrumentDTO.getTestId());
			clientInstrument.setCalibrationDueDate(clientInstrumentDTO.getCalibrationDueDate());
			clientInstrument.setLastCalibrationDate(clientInstrumentDTO.getLastCalibrationDate());
					
		dao.update(clientInstrument);
	} catch (DaoException ex) {
		logger.error("AreaServiceImpl.updateArea() " + ex);
		throw new DaoException(ex.getMessage());
	} catch (Exception ex) {
		logger.error("AreaServiceImpl.updateArea() " + ex);
		throw new ValdocException(ex.getMessage());
	}
}

//	ApplicableTestRoom applicableTestRoom = new ApplicableTestRoom();
	//applicableTestRoom.setAplicableTestId(applicableTestRoomDTO.getAplicableTestId());
	
	//dao.deleteApplicableTestRoomDetails(applicableTestRoom);
	@Override
	public void delete(ClientInstrumentDTO clientInstrumentDTO) throws ValdocException {
		try {
			ClientInstrument clientInstrument=new ClientInstrument();
			clientInstrument.setcInstrumentId(clientInstrumentDTO.getcInstrumentId());
			dao.delete(clientInstrument);
		} catch (DaoException ex) {
			logger.error("ClientInstrumentServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("ClientInstrumentServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

}
