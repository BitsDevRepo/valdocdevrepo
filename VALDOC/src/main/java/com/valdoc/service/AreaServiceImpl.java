package com.valdoc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdoc.dao.AhuDAO;
import com.valdoc.dao.AreaDAO;
import com.valdoc.dto.AhuDTO;
import com.valdoc.dto.AreaDTO;
import com.valdoc.dto.PlantDTO;
import com.valdoc.entity.AHU;
import com.valdoc.entity.Area;
import com.valdoc.entity.Plant;
import com.valdoc.entity.Role;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;
import com.valdoc.util.UtilityService;

@Service
public class AreaServiceImpl implements AreaService {

	public static final Logger logger = LoggerFactory.getLogger(AreaServiceImpl.class);

	@Autowired
	public AreaDAO dao;

	@Override
	public List<AreaDTO> getAreaDetails() throws ValdocException {
		List<AreaDTO> areaDTOs = new ArrayList<AreaDTO>();
		try {
			List<Area> areas = dao.getAreaDetails();
			if (areas != null && areas.size() > 0) {

				PlantDTO plantDTO = new PlantDTO();
				for (Area area : areas) {
					AreaDTO areaDTO = new AreaDTO();
					areaDTO.setAreaId(area.getAreaId());
					areaDTO.setAreaName(area.getAreaName());
					areaDTO.setAdditionalDetails(area.getAdditionalDetails());

				//	plantDTO.setPlantName(area.getPlant().getPlantName());

					//areaDTO.setPlantId(plantDTO);
					areaDTO.setCreatedDate(UtilityService.dateToString(area.getCreationDate()));
					areaDTOs.add(areaDTO);
				}
			}
		} catch (DaoException ex) {
			logger.error("AreaServiceImpl.getAreaDetails() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AreaServiceImpl.getAreaDetails() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		return areaDTOs;
	}

	@Override
	public AreaDTO getObject(Integer id) throws ValdocException {

		try {
			Area area = dao.getObject(id);
			AreaDTO areaDTO = new AreaDTO();
			PlantDTO plantDTO = new PlantDTO();
			if (null != area) {
				areaDTO.setAreaId(area.getAreaId());
				areaDTO.setAreaName(area.getAreaName());
				areaDTO.setAdditionalDetails(area.getAdditionalDetails());
				areaDTO.setCreatedDate(UtilityService.dateToString(area.getCreationDate()));
				
				//plantDTO.setPlantName(area.getPlant().getPlantName());
				
				//areaDTO.setPlantId(plantDTO);
			}
			return areaDTO;

		} catch (DaoException ex) {
			logger.error("AreaServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AreaServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void addArea(AreaDTO areaDTO) throws ValdocException {
		try {
			
			Area area = new Area();
			area.setAreaName(areaDTO.getAreaName());
			area.setAdditionalDetails(areaDTO.getAdditionalDetails());
			area.setPlant(getRoleObjById(areaDTO.getPlant().getPlantId()));
			dao.add(area);

		} catch (DaoException ex) {
			logger.error("AreaServiceImpl.add() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AreaServiceImpl.add() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}


	private Plant getRoleObjById(Integer plantId) {
		Plant plant = new Plant();
		try {
			plant = dao.getRoleObject(plantId);
		} catch (DaoException e) {
			logger.error("UserServiceImpl.getRoleObjById() " + e);
			e.printStackTrace();
		}

		return plant;
	}

	@Override
	public void update(AreaDTO areaDTO) throws ValdocException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) throws ValdocException {
		try {
			dao.delete(id);
		} catch (DaoException ex) {
			logger.error("AreaServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AreaServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}
	}

}
