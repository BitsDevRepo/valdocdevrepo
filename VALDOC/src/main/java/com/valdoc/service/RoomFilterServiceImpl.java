package com.valdoc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdoc.dao.RoomFilterDAO;
import com.valdoc.dto.RoomFilterDTO;
import com.valdoc.dto.GrillDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.entity.RoomFilter;
import com.valdoc.entity.ApplicableTestRoom;
import com.valdoc.entity.Area;
import com.valdoc.entity.Grill;
import com.valdoc.entity.Room;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;
import com.valdoc.util.UtilityService;

@Service
public class RoomFilterServiceImpl implements RoomFilterService {

	public static final Logger logger = LoggerFactory.getLogger(RoomFilterServiceImpl.class);

	@Autowired
	public RoomFilterDAO dao;
	
	@Override
	public List<RoomFilterDTO> getRoomFilterDetails() throws ValdocException {
			
		List<RoomFilterDTO> roomFilterDTOs = new ArrayList<RoomFilterDTO>();
		try {
			List<RoomFilter> roomFilters = dao.getRoomFilterDetails();
			if (roomFilters != null && roomFilters.size() > 0) {
				
				for (RoomFilter roomFilter : roomFilters) {
					RoomFilterDTO roomFilterDTO = new RoomFilterDTO();
					RoomDTO roomDTO=new RoomDTO();
					
					roomFilterDTO.setFilterId(roomFilter.getFilterId());
					roomDTO.setRoomId(roomFilter.getRoomId().getRoomId());
					roomDTO.setRoomName(roomFilter.getRoomId().getRoomName());
					roomFilterDTO.setRoom(roomDTO);
					roomFilterDTO.setFilterCode(roomFilter.getFilterCode());
					roomFilterDTO.setWidth(roomFilter.getWidth());
					roomFilterDTO.setLength(roomFilter.getLength());
					roomFilterDTO.setEffectiveGrillArea(roomFilter.getEffectiveGrillArea());
					roomFilterDTO.setSupplyFilter(roomFilter.isSupplyFilter());
					roomFilterDTO.setCreationDate(UtilityService.dateToString(roomFilter.getCreationDate()));
					roomFilterDTO.setEfficiency(roomFilter.getEfficiency());
					roomFilterDTO.setFilterType(roomFilter.getFilterType());
					roomFilterDTO.setGrillArea(roomFilter.getGrillArea());
					roomFilterDTO.setSpecification(roomFilter.getSpecification());
					roomFilterDTO.setParticleSize(roomFilter.getParticleSize());
					
					roomFilterDTOs.add(roomFilterDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("RoomFilterServiceImpl.getRoomFilterDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomFilterServiceImpl.getRoomFilterDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return roomFilterDTOs;
	}

	@Override
	public RoomFilterDTO getObject(Integer id) throws ValdocException {

		try {
			RoomFilter roomFilter = dao.getObject(id);
			RoomFilterDTO roomFilterDTO = new RoomFilterDTO();
			RoomDTO roomDTO=new RoomDTO();
			if (null != roomFilter) {
				roomFilterDTO.setFilterId(roomFilter.getFilterId());
				
				roomDTO.setRoomId(roomFilter.getRoomId().getRoomId());
				roomDTO.setRoomName(roomFilter.getRoomId().getRoomName());
				roomFilterDTO.setRoom(roomDTO);
				roomFilterDTO.setFilterCode(roomFilter.getFilterCode());
				roomFilterDTO.setWidth(roomFilter.getWidth());
				roomFilterDTO.setLength(roomFilter.getLength());
				roomFilterDTO.setEffectiveGrillArea(roomFilter.getEffectiveGrillArea());
				roomFilterDTO.setSupplyFilter(roomFilter.isSupplyFilter());
				roomFilterDTO.setCreationDate(UtilityService.dateToString(roomFilter.getCreationDate()));
				roomFilterDTO.setEfficiency(roomFilter.getEfficiency());
				roomFilterDTO.setFilterType(roomFilter.getFilterType());
				roomFilterDTO.setGrillArea(roomFilter.getGrillArea());
				roomFilterDTO.setSpecification(roomFilter.getSpecification());
				roomFilterDTO.setParticleSize(roomFilter.getParticleSize());
									
			}
			return roomFilterDTO;

		} catch (DaoException ex) {
			logger.error("RoomFilterServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomFilterServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void addRoomFilter(RoomFilterDTO roomFilterDTO) throws ValdocException {
		try {
			
			RoomFilter roomFilter = new RoomFilter();
			
			roomFilter.setFilterCode(roomFilterDTO.getFilterCode());
			roomFilter.setRoomId(getRoomObjById(roomFilterDTO.getRoom().getRoomId()));
			roomFilter.setFilterType(roomFilterDTO.getFilterType());
			roomFilter.setEfficiency(roomFilterDTO.getEfficiency());
			roomFilter.setParticleSize(roomFilterDTO.getParticleSize());
			roomFilter.setSpecification(roomFilterDTO.getSpecification());
			roomFilter.setSupplyFilter(roomFilterDTO.isSupplyFilter());
			roomFilter.setLength(roomFilterDTO.getLength());
			roomFilter.setWidth(roomFilterDTO.getWidth());
			roomFilter.setGrillArea(roomFilterDTO.getGrillArea());
			roomFilter.setEffectiveGrillArea(roomFilterDTO.getEffectiveGrillArea());
			
			dao.add(roomFilter);

		} catch (DaoException ex) {
			logger.error("RoomFilterServiceImpl.add() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomFilterServiceImpl.add() " + ex);
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
	public void update(RoomFilterDTO roomFilterDTO) throws ValdocException {
		try {
			RoomFilter roomFilter = new RoomFilter();
		
			roomFilter.setFilterId(roomFilterDTO.getFilterId());
			roomFilter.setFilterCode(roomFilterDTO.getFilterCode());
		roomFilter.setRoomId(getRoomObjById(roomFilterDTO.getRoom().getRoomId()));
		roomFilter.setFilterType(roomFilterDTO.getFilterType());
		roomFilter.setEfficiency(roomFilterDTO.getEfficiency());
		roomFilter.setParticleSize(roomFilterDTO.getParticleSize());
		roomFilter.setSpecification(roomFilterDTO.getSpecification());
		roomFilter.setSupplyFilter(roomFilterDTO.isSupplyFilter());
		roomFilter.setLength(roomFilterDTO.getLength());
		roomFilter.setWidth(roomFilterDTO.getWidth());
		roomFilter.setGrillArea(roomFilterDTO.getGrillArea());
		roomFilter.setEffectiveGrillArea(roomFilterDTO.getEffectiveGrillArea());
		
		dao.update(roomFilter);
	} catch (DaoException ex) {
		logger.error("AreaServiceImpl.updateArea() " + ex);
		throw new DaoException(ex.getMessage());
	} catch (Exception ex) {
		logger.error("AreaServiceImpl.updateArea() " + ex);
		throw new ValdocException(ex.getMessage());
	}
}

	@Override
	public void delete(Integer id) throws ValdocException {
		try {
			dao.delete(id);
		} catch (DaoException ex) {
			logger.error("RoomFilterServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomFilterServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		
	}


	@Override
	public List<RoomDTO> getRoomDetails() throws ValdocException {
		List<RoomDTO> roomDTOs = new ArrayList<RoomDTO>();
		try {
			List<Room> rooms = dao.getRoomDetails();
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
	
	// Operations for Grill

	@Override
	public List<GrillDTO> getGrillDetails() throws ValdocException {
		
	List<GrillDTO> grillDTOs = new ArrayList<GrillDTO>();
	try {
		List<Grill> grills = dao.getGrillDetails();
		if (grills != null && grills.size() > 0) {
		
			for (Grill grill : grills) {
				GrillDTO grillDTO = new GrillDTO();
				RoomDTO roomDTO=new RoomDTO();
				grillDTO.setGrillId(grill.getGrillId());
				
				roomDTO.setRoomId(grill.getRoomId().getRoomId());
				roomDTO.setRoomName(grill.getRoomId().getRoomName());
				grillDTO.setRoom(roomDTO);
				grillDTO.setGrillCode(grill.getGrillCode());
				grillDTO.setWidth(grill.getWidth());
				grillDTO.setLength(grill.getLength());
				grillDTO.setEffectiveArea(grill.getEffectiveArea());
				grillDTO.setSupplyGrill(grill.isSupplyGrill());
				grillDTO.setCreationDate(UtilityService.dateToString(grill.getCreationDate()));
				grillDTO.setGrillArea(grill.getGrillArea());
				grillDTO.setAdditionalDetail(grill.isAdditionalDetail());
				
				grillDTOs.add(grillDTO);
			}
		}
	} catch (DaoException ex) {
		logger.error("RoomFilterServiceImpl.getGrillDetails() " + ex);
		throw new DaoException(ex.getMessage());
	} catch (Exception ex) {
		logger.error("RoomFilterServiceImpl.getGrillDetails() " + ex);
		throw new ValdocException(ex.getMessage());
	}
	return grillDTOs;
	}

	@Override
	public void saveGrillDetails(GrillDTO grillDTO) throws ValdocException {
		try {
			
			Grill grill = new Grill();
			
			grill.setGrillCode(grillDTO.getGrillCode());
			grill.setRoomId(getRoomObjById(grillDTO.getRoom().getRoomId()));
			grill.setSupplyGrill(grillDTO.isSupplyGrill());
			grill.setLength(grillDTO.getLength());
			grill.setWidth(grillDTO.getWidth());
			grill.setGrillArea(grillDTO.getGrillArea());
			grill.setEffectiveArea(grillDTO.getEffectiveArea());
			grill.setAdditionalDetail(grillDTO.isAdditionalDetail());
			
			dao.saveGrill(grill);

		} catch (DaoException ex) {
			logger.error("GrillServiceImpl.add() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("GrillServiceImpl.add() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		
	}

	@Override
	public void updateGrillDetails(GrillDTO grillDTO) throws ValdocException {
		try {
			Grill grill = new Grill();
			
			grill.setGrillId(grillDTO.getGrillId());
			grill.setGrillCode(grillDTO.getGrillCode());
			grill.setRoomId(getRoomObjById(grillDTO.getRoom().getRoomId()));
			grill.setSupplyGrill(grillDTO.isSupplyGrill());
			grill.setLength(grillDTO.getLength());
			grill.setWidth(grillDTO.getWidth());
			grill.setGrillArea(grillDTO.getGrillArea());
			grill.setEffectiveArea(grillDTO.getEffectiveArea());
			grill.setSupplyGrill(grillDTO.isSupplyGrill());
			grill.setAdditionalDetail(grillDTO.isAdditionalDetail());
			
			dao.updateGrillDetails(grill);
		} catch (DaoException ex) {
			logger.error("RoomServiceImpl.updateGrillDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomServiceImpl.updateGrillDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void deleteGrillDetails(GrillDTO grillDTO) throws ValdocException {
		try {
			Grill grill = new Grill();
			grill.setGrillId(grillDTO.getGrillId());
			
			dao.deleteGrill(grill);
		} catch (DaoException ex) {
			logger.error("RoomFilterServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("RoomFilterServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public GrillDTO getGrillObject(Integer id) throws ValdocException {

		try {
			Grill grill = dao.getGrillObject(id);
			GrillDTO grillDTO = new GrillDTO();
			RoomDTO roomDTO=new RoomDTO();
			if (null != grill) {
				grillDTO.setGrillId(grill.getGrillId());
				
				roomDTO.setRoomId(grill.getRoomId().getRoomId());
				roomDTO.setRoomName(grill.getRoomId().getRoomName());
				grillDTO.setRoom(roomDTO);
				grillDTO.setGrillCode(grill.getGrillCode());
				grillDTO.setWidth(grill.getWidth());
				grillDTO.setLength(grill.getLength());
				grillDTO.setEffectiveArea(grill.getEffectiveArea());
				grillDTO.setSupplyGrill(grill.isSupplyGrill());
				grillDTO.setCreationDate(UtilityService.dateToString(grill.getCreationDate()));
				grillDTO.setGrillArea(grill.getGrillArea());
				grillDTO.setAdditionalDetail(grill.isAdditionalDetail());
									
			}
			return grillDTO;

		} catch (DaoException ex) {
			logger.error("GrillServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("GrillServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

}
