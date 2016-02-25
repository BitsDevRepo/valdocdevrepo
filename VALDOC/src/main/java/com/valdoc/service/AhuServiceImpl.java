package com.valdoc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdoc.dao.AhuDAO;
import com.valdoc.dto.AhuDTO;
import com.valdoc.entity.AHU;
import com.valdoc.exception.DaoException;
import com.valdoc.exception.ValdocException;
import com.valdoc.util.UtilityService;

@Service
public class AhuServiceImpl implements AhuService {

	public static final Logger logger = LoggerFactory.getLogger(AhuServiceImpl.class);

	@Autowired
	public AhuDAO dao;
	
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
					ahuDTO.setAhuType(ahu.getAhuType());
					ahuDTO.setCapacity(ahu.getCapacity());
					ahuDTO.setReturnAirCFM(ahu.getReturnAirCFM());
					ahuDTO.setExhaustAirCFM(ahu.getExhaustAirCFM());
					ahuDTO.setBleedFilterType(ahu.getBleedFilterType());
					ahuDTO.setBleedFilterEfficiency(ahu.getBleedFilterEfficiency());
					ahuDTO.setBleedAirCFM(ahu.getBleedAirCFM());
					ahuDTO.setBleedFilterQty(ahu.getBleedFilterQty());
					ahuDTO.setBleedFilterSize(ahu.getBleedFilterSize());
					ahuDTO.setFreshFilterType(ahu.getBleedFilterType());
					ahuDTO.setFreshAirCFM(ahu.getFreshAirCFM());
					ahuDTO.setFreshFilterQty(ahu.getFreshFilterQty());
					ahuDTO.setFreshFilterSize(ahu.getFreshFilterSize());
					ahuDTO.setAhuHEPAFilterQty(ahu.getAhuHEPAFilterQty());
					ahuDTO.setHepaFilterEfficiency(ahu.getHepaFilterEfficiency());
					ahuDTO.setHepaParticleSize(ahu.getHepaParticleSize());
					ahuDTO.setHepaFilterSpecification(ahu.getHepaFilterSpecification());
					ahuDTO.setCreationDate(UtilityService.dateToString(ahu.getCreationDate()));					
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

	@Override
	public AhuDTO getObject(Integer id) throws ValdocException {

		try {
			AHU ahu = dao.getObject(id);
			AhuDTO ahuDTO = new AhuDTO();
			
			if (null != ahu) {
				ahuDTO.setAhuId(ahu.getAhuId());
				ahuDTO.setAhuNo(ahu.getAhuNo());
				ahuDTO.setAhuType(ahu.getAhuType());
				ahuDTO.setCapacity(ahu.getCapacity());
				ahuDTO.setReturnAirCFM(ahu.getReturnAirCFM());
				ahuDTO.setExhaustAirCFM(ahu.getExhaustAirCFM());
				ahuDTO.setBleedFilterType(ahu.getBleedFilterType());
				ahuDTO.setBleedFilterEfficiency(ahu.getBleedFilterEfficiency());
				ahuDTO.setBleedAirCFM(ahu.getBleedAirCFM());
				ahuDTO.setBleedFilterQty(ahu.getBleedFilterQty());
				ahuDTO.setBleedFilterSize(ahu.getBleedFilterSize());
				ahuDTO.setFreshFilterType(ahu.getBleedFilterType());
				ahuDTO.setFreshAirCFM(ahu.getFreshAirCFM());
				ahuDTO.setFreshFilterQty(ahu.getFreshFilterQty());
				ahuDTO.setFreshFilterSize(ahu.getFreshFilterSize());
				ahuDTO.setAhuHEPAFilterQty(ahu.getAhuHEPAFilterQty());
				ahuDTO.setHepaFilterEfficiency(ahu.getHepaFilterEfficiency());
				ahuDTO.setHepaParticleSize(ahu.getHepaParticleSize());
				ahuDTO.setHepaFilterSpecification(ahu.getHepaFilterSpecification());
				ahuDTO.setCreationDate(UtilityService.dateToString(ahu.getCreationDate()));
									
			}
			return ahuDTO;

		} catch (DaoException ex) {
			logger.error("AhuServiceImpl.getObject() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AhuServiceImpl.getObject() " + ex);
			throw new ValdocException(ex.getMessage());
		}

	}

	@Override
	public void addAppAhu(AhuDTO ahuDTO) throws ValdocException {
		try {

			AHU ahu = new AHU();
			ahu.setAhuNo(ahuDTO.getAhuNo());
			ahu.setAhuType(ahuDTO.getAhuType());
			ahu.setCapacity(ahuDTO.getCapacity());
			ahu.setReturnAirCFM(ahuDTO.getReturnAirCFM());
			ahu.setExhaustAirCFM(ahuDTO.getExhaustAirCFM());
			ahu.setBleedFilterType(ahuDTO.getBleedFilterType());
			ahu.setBleedFilterEfficiency(ahuDTO.getBleedFilterEfficiency());
			ahu.setBleedAirCFM(ahuDTO.getBleedAirCFM());
			ahu.setBleedFilterQty(ahuDTO.getBleedFilterQty());
			ahu.setBleedFilterSize(ahuDTO.getBleedFilterSize());
			ahu.setFreshFilterType(ahuDTO.getBleedFilterType());
			ahu.setFreshAirCFM(ahuDTO.getFreshAirCFM());
			ahu.setFreshFilterQty(ahuDTO.getFreshFilterQty());
			ahu.setFreshFilterSize(ahuDTO.getFreshFilterSize());
			ahu.setAhuHEPAFilterQty(ahuDTO.getAhuHEPAFilterQty());
			ahu.setHepaFilterEfficiency(ahuDTO.getHepaFilterEfficiency());
			ahu.setHepaParticleSize(ahuDTO.getHepaParticleSize());
			ahu.setHepaFilterSpecification(ahuDTO.getHepaFilterSpecification());
			
			dao.add(ahu);

		} catch (DaoException ex) {
			logger.error("AhuServiceImpl.add() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AhuServiceImpl.add() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		
	}

	@Override
	public void update(AhuDTO ahuDTO) throws ValdocException {
		try {

			AHU ahu = new AHU();
			
			if (ahuDTO != null) {

				ahu.setAhuId(ahuDTO.getAhuId());
				ahu.setAhuNo(ahuDTO.getAhuNo());
				ahu.setAhuType(ahuDTO.getAhuType());
				ahu.setCapacity(ahuDTO.getCapacity());
				ahu.setReturnAirCFM(ahuDTO.getReturnAirCFM());
				ahu.setExhaustAirCFM(ahuDTO.getExhaustAirCFM());
				ahu.setBleedFilterType(ahuDTO.getBleedFilterType());
				ahu.setBleedFilterEfficiency(ahuDTO.getBleedFilterEfficiency());
				ahu.setBleedAirCFM(ahuDTO.getBleedAirCFM());
				ahu.setBleedFilterQty(ahuDTO.getBleedFilterQty());
				ahu.setBleedFilterSize(ahuDTO.getBleedFilterSize());
				ahu.setFreshFilterType(ahuDTO.getBleedFilterType());
				ahu.setFreshAirCFM(ahuDTO.getFreshAirCFM());
				ahu.setFreshFilterQty(ahuDTO.getFreshFilterQty());
				ahu.setFreshFilterSize(ahuDTO.getFreshFilterSize());
				ahu.setAhuHEPAFilterQty(ahuDTO.getAhuHEPAFilterQty());
				ahu.setHepaFilterEfficiency(ahuDTO.getHepaFilterEfficiency());
				ahu.setHepaParticleSize(ahuDTO.getHepaParticleSize());
				ahu.setHepaFilterSpecification(ahuDTO.getHepaFilterSpecification());
			}
			dao.update(ahu);
		} catch (DaoException ex) {
			logger.error("AhuServiceImpl.update() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AhuServiceImpl.update() " + ex);
			throw new ValdocException(ex.getMessage());
		}

		
	}

	@Override
	public void delete(Integer id) throws ValdocException {
		try {
			dao.delete(id);
		} catch (DaoException ex) {
			logger.error("AhuServiceImpl.delete() " + ex);
			throw new DaoException(ex.getMessage());
		} catch (Exception ex) {
			logger.error("AhuServiceImpl.delete() " + ex);
			throw new ValdocException(ex.getMessage());
		}
		
	}

}
