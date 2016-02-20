package com.valdoc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "equipment")
@NamedQuery(name="Equipment.findById", query="SELECT u FROM Equipment u WHERE u.equipmentId = :id")
public class Equipment implements Serializable {
	private static final long serialVersionUID = -1449934963056217598L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "equipmentId")
	private Integer equipmentId;
	
	@Column(name = "roomId")
	private Integer roomId;
	
	@Column(name = "occupancyState")
	private String occupancyState;
	
	@Column(name = "velocity")
	private Double velocity;
	
	@Column(name = "filterQuantity")
	private Integer filterQuantity;
	
	@Column(name = "equipmentLoad")
	private Double equipmentLoad;
	
	@Column(name = "equipmentName")
	private String equipmentName;
	
	
	@Column(name = "equipmentNo")
	private String equipmentNo;

	@Column(name = "testReference")
	private String testReference;
	
	@Column(name = "creationDate", columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

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

	public String getEquipmentNo() {
		return equipmentNo;
	}

	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}

	public String getTestReference() {
		return testReference;
	}

	public void setTestReference(String testReference) {
		this.testReference = testReference;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Equipment [equipmentId=" + equipmentId + ", roomId=" + roomId + ", occupancyState=" + occupancyState
				+ ", velocity=" + velocity + ", filterQuantity=" + filterQuantity + ", equipmentLoad=" + equipmentLoad
				+ ", equipmentName=" + equipmentName + ", equipmentNo=" + equipmentNo + ", testReference="
				+ testReference + ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((equipmentId == null) ? 0 : equipmentId.hashCode());
		result = prime * result + ((equipmentLoad == null) ? 0 : equipmentLoad.hashCode());
		result = prime * result + ((equipmentName == null) ? 0 : equipmentName.hashCode());
		result = prime * result + ((equipmentNo == null) ? 0 : equipmentNo.hashCode());
		result = prime * result + ((filterQuantity == null) ? 0 : filterQuantity.hashCode());
		result = prime * result + ((occupancyState == null) ? 0 : occupancyState.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((testReference == null) ? 0 : testReference.hashCode());
		result = prime * result + ((velocity == null) ? 0 : velocity.hashCode());
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
		Equipment other = (Equipment) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (equipmentId == null) {
			if (other.equipmentId != null)
				return false;
		} else if (!equipmentId.equals(other.equipmentId))
			return false;
		if (equipmentLoad == null) {
			if (other.equipmentLoad != null)
				return false;
		} else if (!equipmentLoad.equals(other.equipmentLoad))
			return false;
		if (equipmentName == null) {
			if (other.equipmentName != null)
				return false;
		} else if (!equipmentName.equals(other.equipmentName))
			return false;
		if (equipmentNo == null) {
			if (other.equipmentNo != null)
				return false;
		} else if (!equipmentNo.equals(other.equipmentNo))
			return false;
		if (filterQuantity == null) {
			if (other.filterQuantity != null)
				return false;
		} else if (!filterQuantity.equals(other.filterQuantity))
			return false;
		if (occupancyState == null) {
			if (other.occupancyState != null)
				return false;
		} else if (!occupancyState.equals(other.occupancyState))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (testReference == null) {
			if (other.testReference != null)
				return false;
		} else if (!testReference.equals(other.testReference))
			return false;
		if (velocity == null) {
			if (other.velocity != null)
				return false;
		} else if (!velocity.equals(other.velocity))
			return false;
		return true;
	}

		
}