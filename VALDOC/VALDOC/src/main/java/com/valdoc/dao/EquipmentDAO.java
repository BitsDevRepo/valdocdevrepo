package com.valdoc.dao;

import java.util.List;

import com.valdoc.entity.ApplicableTestEquipment;
import com.valdoc.entity.Equipment;
import com.valdoc.entity.EquipmentFilter;
import com.valdoc.exception.DaoException;

public interface EquipmentDAO {

	public List<Equipment> getEquipmentDetails() throws DaoException;

	public Equipment getObject(Integer id) throws DaoException;
	
	public void deleteEquipment(Integer equipmentId) throws DaoException;
	
	public void saveEquipment(Equipment equipment) throws DaoException;
	
	public void updateEquipment(Equipment equipment) throws DaoException;
	
	//Operations for Equipment Filter
	
	public EquipmentFilter getObjectEquipmentFilter(Integer id) throws DaoException;
	
	public List<EquipmentFilter> getEquipmentFilterDetails() throws DaoException;
	
	public void saveEquipmentFilterDetails(EquipmentFilter equipmentFilter) throws DaoException;
	
	public void updateEquipmentFilterDetails(EquipmentFilter equipmentFilter) throws DaoException;
	
	public void deleteEquipmentFilterDetails(Integer id) throws DaoException;
	
	
	//Operations for ApplicableTestEquipment	

	public ApplicableTestEquipment getObjectApplicableTestEquipment(Integer id) throws DaoException;
	
	public List<ApplicableTestEquipment> getApplicableTestEquipmentDetails() throws DaoException;
	
	public void saveApplicableTestEquipmentDetails(ApplicableTestEquipment applicableTestEquipment) throws DaoException;
	
	public void updateApplicableTestEquipmentDetails(ApplicableTestEquipment applicableTestEquipment) throws DaoException;
	
	public void deleteApplicableTestEquipmentDetails(Integer id) throws DaoException;
}