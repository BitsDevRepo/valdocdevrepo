package com.valdoc.dto;

import java.io.Serializable;

public class EquipmentDTO implements Serializable {

	private static final long serialVersionUID = -1449934963056217598L;


	private Integer equipmentId;
	
	
	private Integer roomId;
	
	
	private String occupancyState;
	
	
	private Double velocity;
	
	
	private Integer filterQuantity;
	
	
	private Double equipmentLoad;
	
	
	private String equipmentName;
	
	private String testReference;
	
	private String equipmentNo;
	
	private String creationDate;



	public Integer getEquipmentId() {
		return equipmentId;
	}



	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}



	public Integer getRoomId() {
		return roomId;
	}



	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}



	public String getOccupancyState() {
		return occupancyState;
	}



	public void setOccupancyState(String occupancyState) {
		this.occupancyState = occupancyState;
	}



	public Double getVelocity() {
		return velocity;
	}



	public void setVelocity(Double velocity) {
		this.velocity = velocity;
	}



	public Integer getFilterQuantity() {
		return filterQuantity;
	}



	public void setFilterQuantity(Integer filterQuantity) {
		this.filterQuantity = filterQuantity;
	}



	public Double getEquipmentLoad() {
		return equipmentLoad;
	}



	public void setEquipmentLoad(Double equipmentLoad) {
		this.equipmentLoad = equipmentLoad;
	}



	public String getEquipmentName() {
		return equipmentName;
	}



	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}



	public String getTestReference() {
		return testReference;
	}



	public void setTestReference(String testReference) {
		this.testReference = testReference;
	}



	public String getEquipmentNo() {
		return equipmentNo;
	}



	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
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
		return "EquipmentDTO [equipmentId=" + equipmentId + ", roomId=" + roomId + ", occupancyState=" + occupancyState
				+ ", velocity=" + velocity + ", filterQuantity=" + filterQuantity + ", equipmentLoad=" + equipmentLoad
				+ ", equipmentName=" + equipmentName + ", testReference=" + testReference + ", equipmentNo="
				+ equipmentNo + ", creationDate=" + creationDate + "]";
	}

}
