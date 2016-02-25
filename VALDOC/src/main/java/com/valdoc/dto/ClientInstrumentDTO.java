package com.valdoc.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ClientInstrumentDTO implements Serializable {
	
	private static final long serialVersionUID = 3671359358321340859L;

	private Integer cInstrumentId;
	
	private String instrumentId;
	
	private String serialNo;
	
	private String cInstrumentName;
	
	private String make;
	
	private String model;  

	private Date lastCalibrationDate;
	
	private Date calibrationDueDate;
	
	private String currentLocation;
	
	private String status;
	
	private String testId;  
	
	private String creationDate;

	public Integer getcInstrumentId() {
		return cInstrumentId;
	}

	public void setcInstrumentId(Integer cInstrumentId) {
		this.cInstrumentId = cInstrumentId;
	}

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getcInstrumentName() {
		return cInstrumentName;
	}

	public void setcInstrumentName(String cInstrumentName) {
		this.cInstrumentName = cInstrumentName;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getLastCalibrationDate() {
		return lastCalibrationDate;
	}

	public void setLastCalibrationDate(Date lastCalibrationDate) {
		this.lastCalibrationDate = lastCalibrationDate;
	}

	public Date getCalibrationDueDate() {
		return calibrationDueDate;
	}

	public void setCalibrationDueDate(Date calibrationDueDate) {
		this.calibrationDueDate = calibrationDueDate;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "ClientInstrumentDTO [cInstrumentId=" + cInstrumentId + ", instrumentId=" + instrumentId + ", serialNo="
				+ serialNo + ", cInstrumentName=" + cInstrumentName + ", make=" + make + ", model=" + model
				+ ", lastCalibrationDate=" + lastCalibrationDate + ", calibrationDueDate=" + calibrationDueDate
				+ ", currentLocation=" + currentLocation + ", status=" + status + ", testId=" + testId
				+ ", creationDate=" + creationDate + "]";
	}
	
}
