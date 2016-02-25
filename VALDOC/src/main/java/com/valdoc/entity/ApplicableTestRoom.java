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
@Table(name="aplicable_test_room")
@NamedQuery(name="ApplicableTestRoom.findById", query="SELECT u FROM ApplicableTestRoom u WHERE u.aplicableTestId = :id")
public class ApplicableTestRoom implements Serializable {
	
	private static final long serialVersionUID = 6446315713628395379L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aplicableTestId")
	private Integer aplicableTestId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roomId", insertable = true, updatable = true, nullable = true, unique = true)
	private Room roomId;
	
	@Column(name="testName")
	private String testName;
	 
	@Column(name="periodicity")
	private String periodicity;
	
	@Column(name = "location")
	private String location;
	
	@Column(name="noOfCycle")
	private Integer noOfCycle;
	
	@Column(name = "creationDate", columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;


	public Integer getAplicableTestId() {
		return aplicableTestId;
	}

	public void setAplicableTestId(Integer aplicableTestId) {
		this.aplicableTestId = aplicableTestId;
	}

	public Room getRoomId() {
		return roomId;
	}

	public void setRoomId(Room roomId) {
		this.roomId = roomId;
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@Override
	public String toString() {
		return "ApplicableTestRoom [aplicableTestId=" + aplicableTestId + ", roomId=" + roomId + ", testName="
				+ testName + ", periodicity=" + periodicity + ", location=" + location + ", noOfCycle=" + noOfCycle
				+ ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aplicableTestId == null) ? 0 : aplicableTestId.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((noOfCycle == null) ? 0 : noOfCycle.hashCode());
		result = prime * result + ((periodicity == null) ? 0 : periodicity.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((testName == null) ? 0 : testName.hashCode());
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
		ApplicableTestRoom other = (ApplicableTestRoom) obj;
		if (aplicableTestId == null) {
			if (other.aplicableTestId != null)
				return false;
		} else if (!aplicableTestId.equals(other.aplicableTestId))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (noOfCycle == null) {
			if (other.noOfCycle != null)
				return false;
		} else if (!noOfCycle.equals(other.noOfCycle))
			return false;
		if (periodicity == null) {
			if (other.periodicity != null)
				return false;
		} else if (!periodicity.equals(other.periodicity))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (testName == null) {
			if (other.testName != null)
				return false;
		} else if (!testName.equals(other.testName))
			return false;
		return true;
	}

}
