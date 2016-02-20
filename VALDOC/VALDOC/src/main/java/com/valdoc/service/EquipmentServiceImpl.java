package com.valdoc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdoc.dao.EquipmentDAO;
import com.valdoc.dto.ApplicableTestEquipmentDTO;
import com.valdoc.dto.EquipmentDTO;
import com.valdoc.dto.EquipmentFilterDTO;
import com.valdoc.entity.ApplicableTestEquipment;
import com.valdoc.entity.Equipment;
import com.valdoc.entity.EquipmentFilter;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;
import com.valdoc.util.UtilityService;

@Service
public class EquipmentServiceImpl implements EquipmentService {

	public static final Logger logger = LoggerFactory.getLogger(EquipmentServiceImpl.class);

	@Autowired
	public EquipmentDAO dao;

	@Override
	public List<EquipmentDTO> getEquipmentDetails() throws ValdocException {
		List<EquipmentDTO> equipmentDtoList = new ArrayList<EquipmentDTO>();
		try {
			List<Equipment> list = dao.getEquipmentDetails();
			if (list != null && list.size() > 0) {
				for (Equipment equipment : list) {
					EquipmentDTO equipmentDto = new EquipmentDTO();
					equipmentDto.setEquipmentId(equipment.getEquipmentId());
					equipmentDto.setEquipmentLoad(equipment.getEquipmentLoad());
					equipmentDto.setFilterQuantity(equipment.getFilterQuantity());
					equipmentDto.setOccupancyState(equipment.getOccupancyState());
					equipmentDto.setRoomId(equipment.getRoomId());
					equipmentDto.setVelocity(equipment.getVelocity());
					equipmentDto.setEquipmentName(equipment.getEquipmentName());
					equipmentDto.setEquipmentNo(equipment.getEquipmentNo());
					equipmentDto.setTestReference(equipment.getTestReference());
					equipmentDto.setCreationDate(UtilityService.dateToString(equipment.getCreationDate()));
					equipmentDtoList.add(equipmentDto);
				}
			}
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.getEquipmentDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.getEquipmentDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return equipmentDtoList;
	}

	@Override
	public EquipmentDTO getObject(Integer id) throws ValdocException {
		try {
			Equipment equipment = dao.getObject(id);
			EquipmentDTO equipmentDto = new EquipmentDTO();
			if (null != equipment) {
				equipmentDto.setEquipmentId(equipment.getEquipmentId());
				equipmentDto.setEquipmentLoad(equipment.getEquipmentLoad());
				equipmentDto.setFilterQuantity(equipment.getFilterQuantity());
				equipmentDto.setOccupancyState(equipment.getOccupancyState());
				equipmentDto.setRoomId(equipment.getRoomId());
				equipmentDto.setVelocity(equipment.getVelocity());
				equipmentDto.setEquipmentName(equipment.getEquipmentName());
				equipmentDto.setEquipmentNo(equipment.getEquipmentNo());
				equipmentDto.setTestReference(equipment.getTestReference());
				equipmentDto.setCreationDate(UtilityService.dateToString(equipment.getCreationDate()));
			}
			return equipmentDto;

		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public void save(EquipmentDTO equipmentDTO) throws ValdocException {

		try {
			Equipment equipment = new Equipment();
			equipment.setEquipmentLoad(equipmentDTO.getEquipmentLoad());
			equipment.setFilterQuantity(equipmentDTO.getFilterQuantity());
			equipment.setOccupancyState(equipmentDTO.getOccupancyState());
			equipment.setRoomId(equipmentDTO.getRoomId());
			equipment.setVelocity(equipmentDTO.getVelocity());
			equipment.setEquipmentName(equipmentDTO.getEquipmentName());
			equipment.setEquipmentNo(equipmentDTO.getEquipmentNo());
			equipment.setTestReference(equipmentDTO.getTestReference());
			dao.saveEquipment(equipment);

		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.save() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.save() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void update(EquipmentDTO equipmentDTO) throws ValdocException {
		try {
			Equipment equipment = new Equipment();
			equipment.setEquipmentId(equipmentDTO.getEquipmentId());
			equipment.setEquipmentLoad(equipmentDTO.getEquipmentLoad());
			equipment.setFilterQuantity(equipmentDTO.getFilterQuantity());
			equipment.setOccupancyState(equipmentDTO.getOccupancyState());
			equipment.setRoomId(equipmentDTO.getRoomId());
			equipment.setVelocity(equipmentDTO.getVelocity());
			equipment.setEquipmentName(equipmentDTO.getEquipmentName());
			equipment.setEquipmentNo(equipmentDTO.getEquipmentNo());
			equipment.setTestReference(equipmentDTO.getTestReference());
			logger.info(equipment.toString());
			dao.updateEquipment(equipment);
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.update() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.update() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	// Operations for Equipment Filter

	@Override
	public void delete(Integer equipmentId) throws ValdocException {
		try {
			dao.deleteEquipment(equipmentId);
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public EquipmentFilterDTO getObjectEquipmentFilter(Integer id) throws ValdocException {
		try {
			EquipmentFilter equipmentFilter = dao.getObjectEquipmentFilter(id);
			EquipmentFilterDTO equipmentFilterDTO = new EquipmentFilterDTO();
			if (null != equipmentFilter) {
				equipmentFilterDTO.setCreationDate(UtilityService.dateToString(equipmentFilter.getCreationDate()));
				equipmentFilterDTO.setEffectiveGrillArea(equipmentFilter.getEffectiveGrillArea());
				equipmentFilterDTO.setEquipmentId(equipmentFilter.getEquipmentId());
				equipmentFilterDTO.setFilterCode(equipmentFilter.getFilterCode());
				equipmentFilterDTO.setFilterId(equipmentFilter.getFilterId());
				equipmentFilterDTO.setGrillArea(equipmentFilter.getGrillArea());
				equipmentFilterDTO.setIsSupplyFilter(equipmentFilter.getIsSupplyFilter());
				equipmentFilterDTO.setLength(equipmentFilter.getLength());
				equipmentFilterDTO.setWidth(equipmentFilter.getWidth());
			}
			return equipmentFilterDTO;
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.getObjectEquipmentFilter() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.getObjectEquipmentFilter() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public List<EquipmentFilterDTO> getEquipmentFilterDetails() throws ValdocException {
		try {
			List<EquipmentFilter> equipmentFilterList = dao.getEquipmentFilterDetails();
			List<EquipmentFilterDTO> equipmentFilterDTOList = new ArrayList<EquipmentFilterDTO>();
			if (equipmentFilterList != null && equipmentFilterList.size() > 0) {
				for (EquipmentFilter equipmentFilter : equipmentFilterList) {
					EquipmentFilterDTO equipmentFilterDTO = new EquipmentFilterDTO();
					equipmentFilterDTO.setCreationDate(UtilityService.dateToString(equipmentFilter.getCreationDate()));
					equipmentFilterDTO.setEffectiveGrillArea(equipmentFilter.getEffectiveGrillArea());
					equipmentFilterDTO.setEquipmentId(equipmentFilter.getEquipmentId());
					equipmentFilterDTO.setFilterCode(equipmentFilter.getFilterCode());
					equipmentFilterDTO.setFilterId(equipmentFilter.getFilterId());
					equipmentFilterDTO.setGrillArea(equipmentFilter.getGrillArea());
					equipmentFilterDTO.setIsSupplyFilter(equipmentFilter.getIsSupplyFilter());
					equipmentFilterDTO.setLength(equipmentFilter.getLength());
					equipmentFilterDTO.setWidth(equipmentFilter.getWidth());
					equipmentFilterDTOList.add(equipmentFilterDTO);
				}
			}
			return equipmentFilterDTOList;
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.getObjectEquipmentFilter() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.getObjectEquipmentFilter() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public void saveEquipmentFilterDetails(EquipmentFilterDTO equipmentFilterDTO) throws ValdocException {
		try {
			EquipmentFilter equipmentFilter = new EquipmentFilter();
			equipmentFilter.setEffectiveGrillArea(equipmentFilterDTO.getEffectiveGrillArea());
			equipmentFilter.setEquipmentId(equipmentFilterDTO.getEquipmentId());
			equipmentFilter.setFilterCode(equipmentFilterDTO.getFilterCode());
			equipmentFilter.setGrillArea(equipmentFilterDTO.getGrillArea());
			equipmentFilter.setIsSupplyFilter(equipmentFilterDTO.getIsSupplyFilter());
			equipmentFilter.setLength(equipmentFilterDTO.getLength());
			equipmentFilter.setWidth(equipmentFilterDTO.getWidth());
			dao.saveEquipmentFilterDetails(equipmentFilter);
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.saveEquipmentFilterDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.saveEquipmentFilterDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public void updateEquipmentFilterDetails(EquipmentFilterDTO equipmentFilterDTO) throws ValdocException {
		try {
			EquipmentFilter equipmentFilter = new EquipmentFilter();
			equipmentFilter.setFilterId(equipmentFilterDTO.getFilterId());
			equipmentFilter.setEffectiveGrillArea(equipmentFilterDTO.getEffectiveGrillArea());
			equipmentFilter.setEquipmentId(equipmentFilterDTO.getEquipmentId());
			equipmentFilter.setFilterCode(equipmentFilterDTO.getFilterCode());
			equipmentFilter.setGrillArea(equipmentFilterDTO.getGrillArea());
			equipmentFilter.setIsSupplyFilter(equipmentFilterDTO.getIsSupplyFilter());
			equipmentFilter.setLength(equipmentFilterDTO.getLength());
			equipmentFilter.setWidth(equipmentFilterDTO.getWidth());
			dao.saveEquipmentFilterDetails(equipmentFilter);
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.updateEquipmentFilterDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.updateEquipmentFilterDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void deleteEquipmentFilterDetails(Integer id) throws ValdocException {
		try {
			dao.deleteEquipmentFilterDetails(id);
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.deleteEquipmentFilterDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.deleteEquipmentFilterDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	// Operations for ApplicableTestEquipment

	@Override
	public ApplicableTestEquipmentDTO getObjectApplicableTestEquipment(Integer id) throws ValdocException {
		try {
			ApplicableTestEquipmentDTO applicableTestEquipmentDTO = new ApplicableTestEquipmentDTO();
			ApplicableTestEquipment applicableTestEquipment = dao.getObjectApplicableTestEquipment(id);
			if (null != applicableTestEquipmentDTO) {
				applicableTestEquipmentDTO.setAplicableTestId(applicableTestEquipment.getAplicableTestId());
				applicableTestEquipmentDTO
						.setCreationDate(UtilityService.dateToString(applicableTestEquipment.getCreationDate()));
				applicableTestEquipmentDTO.setEquipmentId(applicableTestEquipment.getEquipmentId());
				applicableTestEquipmentDTO.setNoOfCycle(applicableTestEquipment.getNoOfCycle());
				applicableTestEquipmentDTO.setOcation(applicableTestEquipment.getOcation());
				applicableTestEquipmentDTO.setPeriodicity(applicableTestEquipment.getPeriodicity());
				applicableTestEquipmentDTO.setTestName(applicableTestEquipment.getTestName());
			}
			return applicableTestEquipmentDTO;

		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.getObjectApplicableTestEquipment() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.getObjectApplicableTestEquipment() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public List<ApplicableTestEquipmentDTO> getApplicableTestEquipmentDetails() throws ValdocException {
		try {
			List<ApplicableTestEquipment> applicableTestEquipments = dao.getApplicableTestEquipmentDetails();
			List<ApplicableTestEquipmentDTO> applicableTestEquipmentDTOs = new ArrayList<ApplicableTestEquipmentDTO>();
			if (applicableTestEquipments != null && applicableTestEquipments.size() > 0) {
				for (ApplicableTestEquipment applicableTestEquipment : applicableTestEquipments) {
					ApplicableTestEquipmentDTO applicableTestEquipmentDTO = new ApplicableTestEquipmentDTO();
					applicableTestEquipmentDTO.setAplicableTestId(applicableTestEquipment.getAplicableTestId());
					applicableTestEquipmentDTO
							.setCreationDate(UtilityService.dateToString(applicableTestEquipment.getCreationDate()));
					applicableTestEquipmentDTO.setEquipmentId(applicableTestEquipment.getEquipmentId());
					applicableTestEquipmentDTO.setNoOfCycle(applicableTestEquipment.getNoOfCycle());
					applicableTestEquipmentDTO.setOcation(applicableTestEquipment.getOcation());
					applicableTestEquipmentDTO.setPeriodicity(applicableTestEquipment.getPeriodicity());
					applicableTestEquipmentDTO.setTestName(applicableTestEquipment.getTestName());
					applicableTestEquipmentDTOs.add(applicableTestEquipmentDTO);
				}
			}
			return applicableTestEquipmentDTOs;

		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.getApplicableTestEquipmentDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.getApplicableTestEquipmentDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

	@Override
	public void saveApplicableTestEquipmentDetails(ApplicableTestEquipmentDTO applicableTestEquipmentDTO)
			throws ValdocException {
		try {
			ApplicableTestEquipment applicableTestEquipment = new ApplicableTestEquipment();
			applicableTestEquipment.setEquipmentId(applicableTestEquipmentDTO.getEquipmentId());
			applicableTestEquipment.setNoOfCycle(applicableTestEquipmentDTO.getNoOfCycle());
			applicableTestEquipment.setOcation(applicableTestEquipmentDTO.getOcation());
			applicableTestEquipment.setPeriodicity(applicableTestEquipmentDTO.getPeriodicity());
			applicableTestEquipment.setTestName(applicableTestEquipmentDTO.getTestName());
			dao.saveApplicableTestEquipmentDetails(applicableTestEquipment);
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.saveApplicableTestEquipmentDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.saveApplicableTestEquipmentDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void updateApplicableTestEquipmentDetails(ApplicableTestEquipmentDTO applicableTestEquipmentDTO)
			throws ValdocException {
		try {
			ApplicableTestEquipment applicableTestEquipment = new ApplicableTestEquipment();
			applicableTestEquipment.setAplicableTestId(applicableTestEquipmentDTO.getAplicableTestId());
			applicableTestEquipment.setEquipmentId(applicableTestEquipmentDTO.getEquipmentId());
			applicableTestEquipment.setNoOfCycle(applicableTestEquipmentDTO.getNoOfCycle());
			applicableTestEquipment.setOcation(applicableTestEquipmentDTO.getOcation());
			applicableTestEquipment.setPeriodicity(applicableTestEquipmentDTO.getPeriodicity());
			applicableTestEquipment.setTestName(applicableTestEquipmentDTO.getTestName());
			dao.saveApplicableTestEquipmentDetails(applicableTestEquipment);
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.updateApplicableTestEquipmentDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.updateApplicableTestEquipmentDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void deleteApplicableTestEquipmentDetails(Integer id) throws ValdocException {
		try {
			dao.deleteApplicableTestEquipmentDetails(id);
		} catch (DaoException ex) {
			logger.error("EquipmentServiceImpl.deleteApplicableTestEquipmentDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("EquipmentServiceImpl.deleteApplicableTestEquipmentDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}
}