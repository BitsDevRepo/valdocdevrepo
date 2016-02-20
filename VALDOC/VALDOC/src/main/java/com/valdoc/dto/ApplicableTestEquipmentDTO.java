package com.valdoc.dto;
import java.io.Serializable;



public class ApplicableTestEquipmentDTO implements Serializable {
	
	private static final long serialVersionUID = -3279060247298461995L;

	
	private Integer aplicableTestId;
	
	
	private String testName;
	
	
	private Integer equipmentId;
	 
	
	private String periodicity;
	
	
	private String ocation;
	
	
	private Integer noOfCycle;	
	
	private String creationDate;

	public Integer getAplicableTestId() {
		return aplicableTestId;
	}

	public void setAplicableTestId(Integer aplicableTestId) {
		this.aplicableTestId = aplicableTestId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Integer getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public String getOcation() {
		return ocation;
	}

	public void setOcation(String ocation) {
		this.ocation = ocation;
	}

	public Integer getNoOfCycle() {
		return noOfCycle;
	}

	public void setNoOfCycle(Integer noOfCycle) {
		this.noOfCycle = noOfCycle;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ApplicableTestEquipmentDTO [aplicableTestId=" + aplicableTestId + ", testName=" + testName
				+ ", equipmentId=" + equipmentId + ", periodicity=" + periodicity + ", ocation=" + ocation
				+ ", noOfCycle=" + noOfCycle + ", creationDate=" + creationDate + "]";
	}

}
