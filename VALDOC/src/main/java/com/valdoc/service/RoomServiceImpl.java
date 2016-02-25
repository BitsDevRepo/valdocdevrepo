package com.valdoc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdoc.dao.RoomDAO;
import com.valdoc.dto.AhuDTO;
import com.valdoc.dto.ApplicableTestRoomDTO;
import com.valdoc.dto.ApplicableTestRoomDTO;
import com.valdoc.dto.AreaDTO;
import com.valdoc.dto.PermissionDTO;
import com.valdoc.dto.RoleDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.dto.UserDTO;
import com.valdoc.entity.AHU;
import com.valdoc.entity.ApplicableTestRoom;
import com.valdoc.entity.Area;
import com.valdoc.entity.Room;
import com.valdoc.entity.User;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;
import com.valdoc.util.UtilityService;

@Service
public class RoomServiceImpl implements RoomService {

	public static final Logger logger = LoggerFactory.getLogger(RoomServiceImpl.class);

	@Autowired
	public RoomDAO dao;
	
	@Override
	public List<RoomDTO> getRoomDetails() throws ValdocException {
			
		List<RoomDTO> roomDTOs = new ArrayList<RoomDTO>();
		try {
			List<Room> rooms = dao.getRoomDetails();
			if (rooms != null && rooms.size() > 0) {

				AhuDTO ahuDTO=new AhuDTO();
				AreaDTO areaDTO=new AreaDTO();
				
				for (Room room : rooms) {
					RoomDTO roomDTO = new RoomDTO();
					roomDTO.setRoomId(room.getRoomId());
					
					ahuDTO.setAhuId(room.getAhu().getAhuId());
					ahuDTO.setAhuNo(room.getAhu().getAhuNo());
					roomDTO.setAhu(ahuDTO);
					areaDTO.setAreaId(room.getAreaId().getAreaId());
					areaDTO.setAreaName(room.getAreaId().getAreaName());
					roomDTO.setAreaId(areaDTO);
					roomDTO.setRoomName(room.getRoomName());
					roomDTO.setRoomNo(room.getRoomNo());
					roomDTO.setWidth(room.getWidth());
					roomDTO.setLength(room.getLength());
					roomDTO.setHeight(room.getHeight());
					roomDTO.setArea(room.getArea());
					roomDTO.setVolume(room.getVolume());
					roomDTO.setAcphNLT(room.getAcphNLT());
					roomDTO.setTestRef(room.getTestRef());
					roomDTO.setIsoClause(room.getIsoClause());
					roomDTO.setOccupancyState(room.getOccupancyState());
					roomDTO.setRoomSupplyAirflowCFM(room.getRoomSupplyAirflowCFM());
					roomDTO.setAhuFlowCFM(room.getAhuFlowCFM());
					roomDTO.setRoomPressurePA(room.getRoomPressurePA());
					roomDTO.setFreshAirCFM(room.getFreshAirCFM());
					roomDTO.setBleedAirCFM(room.getBleedAirCFM());
					roomDTO.setExhaustAirCFM(room.getExhaustAirCFM());
					roomDTO.setTemperature(room.getTemperature());
					roomDTO.setRh(room.getRh());
					roomDTO.setReturnAirCFM(room.getReturnAirCFM());
					roomDTO.setSupplyAirGrillQTY(room.getSupplyAirGrillQTY());
					roomDTO.setReturnAirGrillQTY(room.getReturnAirGrillQTY());
					roomDTO.setSupplyAirFilterQTY(room.getSupplyAirFilterQTY());
					roomDTO.setReturnAirFilterQTY(room.getReturnAirFilterQTY());
					roomDTO.setRemarks(room.getRemarks());
					roomDTO.setCreationDate(UtilityService.dateToString(room.getCreationDate()));					
					roomDTOs.add(roomDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.getRoomDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.getRoomDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return roomDTOs;
	}

	@Override
	public RoomDTO getObject(Integer id) throws ValdocException {

		try {
			Room room = dao.getObject(id);
			RoomDTO roomDTO = new RoomDTO();
			AhuDTO ahuDTO=new AhuDTO();
			AreaDTO areaDTO=new AreaDTO();
			
			if (null != room) {
				roomDTO.setRoomId(room.getRoomId());
				ahuDTO.setAhuId(room.getAhu().getAhuId());
				ahuDTO.setAhuNo(room.getAhu().getAhuNo());
				roomDTO.setAhu(ahuDTO);
				areaDTO.setAreaId(room.getAreaId().getAreaId());
				areaDTO.setAreaName(room.getAreaId().getAreaName());
				roomDTO.setAreaId(areaDTO);
				roomDTO.setRoomName(room.getRoomName());
				roomDTO.setRoomNo(room.getRoomNo());
				roomDTO.setWidth(room.getWidth());
				roomDTO.setLength(room.getLength());
				roomDTO.setHeight(room.getHeight());
				roomDTO.setArea(room.getArea());
				roomDTO.setVolume(room.getVolume());
				roomDTO.setAcphNLT(room.getAcphNLT());
				roomDTO.setTestRef(room.getTestRef());
				roomDTO.setIsoClause(room.getIsoClause());
				roomDTO.setOccupancyState(room.getOccupancyState());
				roomDTO.setRoomSupplyAirflowCFM(room.getRoomSupplyAirflowCFM());
				roomDTO.setAhuFlowCFM(room.getAhuFlowCFM());
				roomDTO.setRoomPressurePA(room.getRoomPressurePA());
				roomDTO.setFreshAirCFM(room.getFreshAirCFM());
				roomDTO.setBleedAirCFM(room.getBleedAirCFM());
				roomDTO.setExhaustAirCFM(room.getExhaustAirCFM());
				roomDTO.setTemperature(room.getTemperature());
				roomDTO.setRh(room.getRh());
				roomDTO.setReturnAirCFM(room.getReturnAirCFM());
				roomDTO.setSupplyAirGrillQTY(room.getSupplyAirGrillQTY());
				roomDTO.setReturnAirGrillQTY(room.getReturnAirGrillQTY());
				roomDTO.setSupplyAirFilterQTY(room.getSupplyAirFilterQTY());
				roomDTO.setReturnAirFilterQTY(room.getReturnAirFilterQTY());
				roomDTO.setRemarks(room.getRemarks());
				roomDTO.setCreationDate(UtilityService.dateToString(room.getCreationDate()));
									
			}
			return roomDTO;

		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void addRoom(RoomDTO roomDTO) throws ValdocException {
		try {

			Room room = new Room();

			room.setRoomName(roomDTO.getRoomName());
			room.setRoomNo(roomDTO.getRoomNo());
			room.setWidth(roomDTO.getWidth());
			room.setLength(roomDTO.getLength());
			room.setHeight(roomDTO.getHeight());
			room.setArea(roomDTO.getArea());
			room.setVolume(roomDTO.getVolume());
			room.setAcphNLT(roomDTO.getAcphNLT());
			room.setTestRef(roomDTO.getTestRef());
			room.setIsoClause(roomDTO.getIsoClause());
			room.setOccupancyState(roomDTO.getOccupancyState());
			room.setRoomSupplyAirflowCFM(roomDTO.getRoomSupplyAirflowCFM());
			room.setAhuFlowCFM(roomDTO.getAhuFlowCFM());
			room.setRoomPressurePA(roomDTO.getRoomPressurePA());
			room.setFreshAirCFM(roomDTO.getFreshAirCFM());
			room.setBleedAirCFM(roomDTO.getBleedAirCFM());
			room.setExhaustAirCFM(roomDTO.getExhaustAirCFM());
			room.setTemperature(roomDTO.getTemperature());
			room.setRh(roomDTO.getRh());
			room.setReturnAirCFM(roomDTO.getReturnAirCFM());
			room.setSupplyAirGrillQTY(roomDTO.getSupplyAirGrillQTY());
			room.setReturnAirGrillQTY(roomDTO.getReturnAirGrillQTY());
			room.setSupplyAirFilterQTY(roomDTO.getSupplyAirFilterQTY());
			room.setReturnAirFilterQTY(roomDTO.getReturnAirFilterQTY());
			room.setRemarks(roomDTO.getRemarks());

			room.setAreaId(getAreaObjById(roomDTO.getAreaId().getAreaId()));
			room.setAhu(getAhuObjById(roomDTO.getAhu().getAhuId()));
			
			dao.add(room);

		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.add() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.add() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		
	}

	private AHU getAhuObjById(Integer ahuId) {
		
		AHU ahu = new AHU();
	try {
		ahu = dao.getAhuObject(ahuId);
	} catch (DaoException e) {
		logger.error("RoomServiceImpl.getAhuObjById() " + e);
		e.printStackTrace();
	}

	return ahu;

	}

	private Area getAreaObjById(Integer areaId) {
		
		Area area = new Area();
	try {
		area = dao.getAreaObject(areaId);
	} catch (DaoException e) {
		logger.error("RoomServiceImpl.getAhuObjById() " + e);
		e.printStackTrace();
	}

	return area;

	}

	@Override
	public void update(RoomDTO roomDTO) throws ValdocException {
		try {
		Room room = new Room();
		
		room.setRoomId(roomDTO.getRoomId());
		room.setRoomNo(roomDTO.getRoomNo());
		room.setRoomName(roomDTO.getRoomName());
		room.setWidth(roomDTO.getWidth());
		room.setLength(roomDTO.getLength());
		room.setHeight(roomDTO.getHeight());
		room.setArea(roomDTO.getArea());
		room.setVolume(roomDTO.getVolume());
		room.setAcphNLT(roomDTO.getAcphNLT());
		room.setTestRef(roomDTO.getTestRef());
		room.setIsoClause(roomDTO.getIsoClause());
		room.setOccupancyState(roomDTO.getOccupancyState());
		room.setRoomSupplyAirflowCFM(roomDTO.getRoomSupplyAirflowCFM());
		room.setAhuFlowCFM(roomDTO.getAhuFlowCFM());
		room.setRoomPressurePA(roomDTO.getRoomPressurePA());
		room.setFreshAirCFM(roomDTO.getFreshAirCFM());
		room.setBleedAirCFM(roomDTO.getBleedAirCFM());
		room.setExhaustAirCFM(roomDTO.getExhaustAirCFM());
		room.setTemperature(roomDTO.getTemperature());
		room.setRh(roomDTO.getRh());
		room.setReturnAirCFM(roomDTO.getReturnAirCFM());
		room.setSupplyAirGrillQTY(roomDTO.getSupplyAirGrillQTY());
		room.setReturnAirGrillQTY(roomDTO.getReturnAirGrillQTY());
		room.setSupplyAirFilterQTY(roomDTO.getSupplyAirFilterQTY());
		room.setReturnAirFilterQTY(roomDTO.getReturnAirFilterQTY());
		room.setRemarks(roomDTO.getRemarks());

		room.setAreaId(getAreaObjById(roomDTO.getAreaId().getAreaId()));
		room.setAhu(getAhuObjById(roomDTO.getAhu().getAhuId()));
		
		dao.update(room);
	} catch (DaoException ex) {
		logger.error("RoomServiceImpl.updateApplicableTestRoomDetails() " + ex);
		throw new DaoException(ex.getMessage());
	} catch (Exception ex) {
		logger.error("RoomServiceImpl.updateApplicableTestRoomDetails() " + ex);
		throw new ValdocException(ex.getMessage());
	}
	}

	@Override
	public void delete(Integer id) throws ValdocException {
		try {
			dao.delete(id);
		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		
	}

	@Override
	public List<AhuDTO> getAhuDetails() throws ValdocException {
		List<AhuDTO> ahuDTOs = new ArrayList<AhuDTO>();
		try {
			List<AHU> ahus = dao.getAhuDetails();
			if (ahus != null && ahus.size() > 0) {

				for (AHU ahu : ahus) {
					AhuDTO ahuDTO = new AhuDTO();
					ahuDTO.setAhuId(ahu.getAhuId());
					ahuDTO.setAhuNo(ahu.getAhuNo());					
					ahuDTOs.add(ahuDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("AhuServiceImpl.getAhuDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AhuServiceImpl.getAhuDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return ahuDTOs;
	}

	// Operations for ApplicableTestRoom
	
	@Override
	public List<ApplicableTestRoomDTO> getApplicableTestRoomDetails() throws ValdocException {
		try {
			List<ApplicableTestRoom> applicableTestRooms = dao.getApplicableTestRoomDetails();
			List<ApplicableTestRoomDTO> applicableTestRoomDTOs = new ArrayList<ApplicableTestRoomDTO>();
			RoomDTO roomDTO=new RoomDTO();
			
			if (applicableTestRooms != null && applicableTestRooms.size() > 0) {
				for (ApplicableTestRoom applicableTestRoom : applicableTestRooms) {
					ApplicableTestRoomDTO applicableTestRoomDTO = new ApplicableTestRoomDTO();
					
					applicableTestRoomDTO.setAplicableTestId(applicableTestRoom.getAplicableTestId());
					applicableTestRoomDTO.setCreationDate(UtilityService.dateToString(applicableTestRoom.getCreationDate()));
					
					roomDTO.setRoomId(applicableTestRoom.getRoomId().getRoomId());
					roomDTO.setRoomName(applicableTestRoom.getRoomId().getRoomName());
					applicableTestRoomDTO.setRoom(roomDTO);
					//applicableTestRoomDTO.setRoomId(applicableTestRoom.getRoomId());
					applicableTestRoomDTO.setNoOfCycle(applicableTestRoom.getNoOfCycle());
					applicableTestRoomDTO.setLocation(applicableTestRoom.getLocation());
					applicableTestRoomDTO.setPeriodicity(applicableTestRoom.getPeriodicity());
					applicableTestRoomDTO.setTestName(applicableTestRoom.getTestName());
					applicableTestRoomDTOs.add(applicableTestRoomDTO);
				}
			}
			return applicableTestRoomDTOs;

		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.getApplicableTestRoomDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.getApplicableTestRoomDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public void saveApplicableTestRoomDetails(ApplicableTestRoomDTO applicableTestRoomDTO) throws ValdocException {
		try {
			ApplicableTestRoom applicableTestRoom = new ApplicableTestRoom();
			
			//applicableTestRoom.setRoomId(applicableTestRoomDTO.getRoomId());

			applicableTestRoom.setRoomId(getRoomObjById(applicableTestRoomDTO.getRoom().getRoomId()));
			
			applicableTestRoom.setNoOfCycle(applicableTestRoomDTO.getNoOfCycle());
			applicableTestRoom.setLocation(applicableTestRoomDTO.getLocation());
			applicableTestRoom.setPeriodicity(applicableTestRoomDTO.getPeriodicity());
			applicableTestRoom.setTestName(applicableTestRoomDTO.getTestName());
			
			dao.saveApplicableTestRoomDetails(applicableTestRoom);
		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.saveApplicableTestRoomDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.saveApplicableTestRoomDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	private Room getRoomObjById(Integer roomId) {
		
		Room room = new Room();
		try {
			room = dao.getRoomObject(roomId);
		} catch (ValdocException e) {
			logger.error("RoomFilterServiceImpl.getRoomObjById() " + e);
			e.printStackTrace();
		}
		return room;
	}

	@Override
	public void updateApplicableTestRoomDetails(ApplicableTestRoomDTO applicableTestRoomDTO) throws ValdocException {
		try {
			ApplicableTestRoom applicableTestRoom = new ApplicableTestRoom();
			
			applicableTestRoom.setAplicableTestId(applicableTestRoomDTO.getAplicableTestId());
			//applicableTestRoom.setRoomId(applicableTestRoomDTO.getRoomId());
			applicableTestRoom.setRoomId(getRoomObjById(applicableTestRoomDTO.getRoom().getRoomId()));
			applicableTestRoom.setNoOfCycle(applicableTestRoomDTO.getNoOfCycle());
			applicableTestRoom.setLocation(applicableTestRoomDTO.getLocation());
			applicableTestRoom.setPeriodicity(applicableTestRoomDTO.getPeriodicity());
			applicableTestRoom.setTestName(applicableTestRoomDTO.getTestName());
			
			dao.updateApplicableTestRoomDetails(applicableTestRoom);
		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.updateApplicableTestRoomDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.updateApplicableTestRoomDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void deleteApplicableTestRoomDetails(ApplicableTestRoomDTO applicableTestRoomDTO) throws ValdocException {
		try {
			ApplicableTestRoom applicableTestRoom = new ApplicableTestRoom();
			applicableTestRoom.setAplicableTestId(applicableTestRoomDTO.getAplicableTestId());
			
			dao.deleteApplicableTestRoomDetails(applicableTestRoom);
		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.deleteApplicableTestRoomDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.deleteApplicableTestRoomDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public List<RoomDTO> getRoomId() throws ValdocException {
		List<RoomDTO> roomDTOs = new ArrayList<RoomDTO>();
		try {
			List<Room> rooms = dao.getRoomId();
			if (rooms != null && rooms.size() > 0) {

				for (Room room : rooms) {
					RoomDTO roomDTO = new RoomDTO();
					roomDTO.setRoomId(room.getRoomId());
					roomDTO.setRoomName(room.getRoomName());				
					roomDTOs.add(roomDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("RoomFilterServiceImpl.getRoomDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomFilterServiceImpl.getRoomDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return roomDTOs;

	}

	@Override
	public ApplicableTestRoomDTO getObjectApplicableTestRoom(Integer id) throws ValdocException {
		try {
			ApplicableTestRoomDTO applicableTestRoomDTO = new ApplicableTestRoomDTO();
			RoomDTO roomDTO=new RoomDTO();
			ApplicableTestRoom applicableTestRoom = dao.getObjectApplicableTestRoom(id);
			if (null != applicableTestRoomDTO) {
				applicableTestRoomDTO.setAplicableTestId(applicableTestRoom.getAplicableTestId());
				applicableTestRoomDTO.setCreationDate(UtilityService.dateToString(applicableTestRoom.getCreationDate()));
				
				roomDTO.setRoomId(applicableTestRoom.getRoomId().getRoomId());
				roomDTO.setRoomName(applicableTestRoom.getRoomId().getRoomName());
				applicableTestRoomDTO.setRoom(roomDTO);
				
				applicableTestRoomDTO.setNoOfCycle(applicableTestRoom.getNoOfCycle());
				applicableTestRoomDTO.setLocation(applicableTestRoom.getLocation());
				applicableTestRoomDTO.setPeriodicity(applicableTestRoom.getPeriodicity());
				applicableTestRoomDTO.setTestName(applicableTestRoom.getTestName());
			}
			return applicableTestRoomDTO;

		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.getObjectApplicableTestRoom() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.getObjectApplicableTestRoom() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public List<AreaDTO> getAreaDetails() throws ValdocException {
		List<AreaDTO> areaDTOs = new ArrayList<AreaDTO>();
		try {
			List<Area> areas = dao.getAreaDetails();
			if (areas != null && areas.size() > 0) {

				for (Area area : areas) {
					AreaDTO areaDTO = new AreaDTO();
					areaDTO.setAreaId(area.getAreaId());
					areaDTO.setAreaName(area.getAreaName());
					areaDTOs.add(areaDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.getAreaDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.getAreaDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return areaDTOs;

	}

}

