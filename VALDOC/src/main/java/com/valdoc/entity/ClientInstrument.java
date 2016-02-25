package com.valdoc.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="client_instrument")
@NamedQuery(name="ClientInstrument.findById", query="SELECT ci FROM ClientInstrument ci WHERE ci.cInstrumentId = :id")
public class ClientInstrument implements Serializable {
	
	private static final long serialVersionUID = 2006651319607004642L;

	@Id
	@Column(name="cInstrumentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cInstrumentId;
	
	@Column(name="instrumentId")
	private String instrumentId;
	
	@Column(name="serialNo")
	private String serialNo;
	
	@Column(name="cInstrumentName")
	private String cInstrumentName;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;  

	@Column(name = "lastCalibrationDate", columnDefinition = "DATE")
	@Temporal(TemporalType.DATE)
	private Date lastCalibrationDate;
	
	@Column(name = "calibrationDueDate", columnDefinition = "DATE")
	@Temporal(TemporalType.DATE)
	private Date calibrationDueDate;
	
	@Column(name="currentLocation")
	private String currentLocation;
	
	@Column(name="status")
	private String status;
	
	@Column(name="testId")
	private String testId;  
	
	@Column(name = "creationDate", columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "ClientInstrument [cInstrumentId=" + cInstrumentId + ", instrumentId=" + instrumentId + ", serialNo="
				+ serialNo + ", cInstrumentName=" + cInstrumentName + ", make=" + make + ", model=" + model
				+ ", lastCalibrationDate=" + lastCalibrationDate + ", calibrationDueDate=" + calibrationDueDate
				+ ", currentLocation=" + currentLocation + ", status=" + status + ", testId=" + testId
				+ ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cInstrumentId == null) ? 0 : cInstrumentId.hashCode());
		result = prime * result + ((cInstrumentName == null) ? 0 : cInstrumentName.hashCode());
		result = prime * result + ((calibrationDueDate == null) ? 0 : calibrationDueDate.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((currentLocation == null) ? 0 : currentLocation.hashCode());
		result = prime * result + ((instrumentId == null) ? 0 : instrumentId.hashCode());
		result = prime * result + ((lastCalibrationDate == null) ? 0 : lastCalibrationDate.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((serialNo == null) ? 0 : serialNo.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((testId == null) ? 0 : testId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientInstrument other = (ClientInstrument) obj;
		if (cInstrumentId == null) {
			if (other.cInstrumentId != null)
				return false;
		} else if (!cInstrumentId.equals(other.cInstrumentId))
			return false;
		if (cInstrumentName == null) {
			if (other.cInstrumentName != null)
				return false;
		} else if (!cInstrumentName.equals(other.cInstrumentName))
			return false;
		if (calibrationDueDate == null) {
			if (other.calibrationDueDate != null)
				return false;
		} else if (!calibrationDueDate.equals(other.calibrationDueDate))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (currentLocation == null) {
			if (other.currentLocation != null)
				return false;
		} else if (!currentLocation.equals(other.currentLocation))
			return false;
		if (instrumentId == null) {
			if (other.instrumentId != null)
				return false;
		} else if (!instrumentId.equals(other.instrumentId))
			return false;
		if (lastCalibrationDate == null) {
			if (other.lastCalibrationDate != null)
				return false;
		} else if (!lastCalibrationDate.equals(other.lastCalibrationDate))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (serialNo == null) {
			if (other.serialNo != null)
				return false;
		} else if (!serialNo.equals(other.serialNo))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (testId == null) {
			if (other.testId != null)
				return false;
		} else if (!testId.equals(other.testId))
			return false;
		return true;
	}

}
