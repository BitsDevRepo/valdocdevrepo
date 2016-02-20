package com.valdoc.service;

import java.util.List;

import com.valdoc.dto.ApplicableTestEquipmentDTO;
import com.valdoc.dto.EquipmentDTO;
import com.valdoc.dto.EquipmentFilterDTO;
import com.valdoc.exception.ValdocException;

public interface EquipmentService {

	public List<EquipmentDTO> getEquipmentDetails() throws ValdocException;

	public EquipmentDTO getObject(Integer id) throws ValdocException;

	public void save(EquipmentDTO equipmentDTO) throws ValdocException;

	public void update(EquipmentDTO equipmentDTO) throws ValdocException;

	public void delete(Integer equipmentId) throws ValdocException;

	// Operations for Equipment Filter

	public EquipmentFilterDTO getObjectEquipmentFilter(Integer id) throws ValdocException;

	public List<EquipmentFilterDTO> getEquipmentFilterDetails() throws ValdocException;

	public void saveEquipmentFilterDetails(EquipmentFilterDTO equipmentFilterDTO) throws ValdocException;

	public void updateEquipmentFilterDetails(EquipmentFilterDTO equipmentFilterDTO) throws ValdocException;

	public void deleteEquipmentFilterDetails(Integer id) throws ValdocException;

	// Operations for ApplicableTestEquipment

	public ApplicableTestEquipmentDTO getObjectApplicableTestEquipment(Integer id) throws ValdocException;

	public List<ApplicableTestEquipmentDTO> getApplicableTestEquipmentDetails() throws ValdocException;

	public void saveApplicableTestEquipmentDetails(ApplicableTestEquipmentDTO applicableTestEquipmentDTO) throws ValdocException;

	public void updateApplicableTestEquipmentDetails(ApplicableTestEquipmentDTO applicableTestEquipmentDTO)
			throws ValdocException;

	public void deleteApplicableTestEquipmentDetails(Integer id) throws ValdocException;

}
