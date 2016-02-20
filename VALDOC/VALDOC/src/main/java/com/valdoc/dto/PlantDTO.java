package com.valdoc.dto;

import java.io.Serializable;

import javax.persistence.Column;

public class PlantDTO implements Serializable {
	
	private static final long serialVersionUID = -3223683657602919426L;

	private Integer plantId;
	
	private String plantName;
	
	private String address;
	
	private String additionalDetails;
	
	private String directorName;
	
	private String directorContactNo;
	
	private String directorEmailId;
	
	private String contactPersonName;
	
	private String contactPersonNo;

	public Integer getPlantId() {
		return plantId;
	}

	public void setPlantId(Integer plantId) {
		this.plantId = plantId;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getDirectorContactNo() {
		return directorContactNo;
	}

	public void setDirectorContactNo(String directorContactNo) {
		this.directorContactNo = directorContactNo;
	}

	public String getDirectorEmailId() {
		return directorEmailId;
	}

	public void setDirectorEmailId(String directorEmailId) {
		this.directorEmailId = directorEmailId;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getContactPersonNo() {
		return contactPersonNo;
	}

	public void setContactPersonNo(String contactPersonNo) {
		this.contactPersonNo = contactPersonNo;
	}

	@Override
	public String toString() {
		return "plantDTO [plantId=" + plantId + ", plantName=" + plantName + ", address=" + address
				+ ", additionalDetails=" + additionalDetails + ", directorName=" + directorName + ", directorContactNo="
				+ directorContactNo + ", directorEmailId=" + directorEmailId + ", contactPersonName="
				+ contactPersonName + ", contactPersonNo=" + contactPersonNo + "]";
	}	
}
