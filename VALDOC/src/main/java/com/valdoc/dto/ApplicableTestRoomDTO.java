package com.valdoc.dto;
import java.io.Serializable;



public class ApplicableTestRoomDTO implements Serializable {
	
	private static final long serialVersionUID = -4372526419552186144L;


	private Integer aplicableTestId;
	
	private RoomDTO room;
		
	private String testName;
	
	private String periodicity;	
	
	private String location;	
	
	private Integer noOfCycle;	
	
	private String creationDate;

	public Integer getAplicableTestId() {
		return aplicableTestId;
	}

	public void setAplicableTestId(Integer aplicableTestId) {
		this.aplicableTestId = aplicableTestId;
	}

	public RoomDTO getRoom() {
		return room;
	}

	public void setRoom(RoomDTO room) {
		this.room = room;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	@Override
	public String toString() {
		return "ApplicableTestRoomDTO [aplicableTestId=" + aplicableTestId + ", room=" + room + ", testName=" + testName
				+ ", periodicity=" + periodicity + ", location=" + location + ", noOfCycle=" + noOfCycle
				+ ", creationDate=" + creationDate + "]";
	}

}
