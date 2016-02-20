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
@Table(name="aplicable_test_equipment")
@NamedQuery(name="ApplicableTestEquipment.findById", query="SELECT u FROM ApplicableTestEquipment u WHERE u.aplicableTestId = :id")
public class ApplicableTestEquipment implements Serializable {
	
	private static final long serialVersionUID = -3279060247298461995L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aplicable_testId")
	private Integer aplicableTestId;
	
	@Column(name="testName")
	private String testName;
	
	@Column(name="equipmentId")
	private Integer equipmentId;
	 
	@Column(name="periodicity")
	private String periodicity;
	
	@Column(name = "location")
	private String ocation;
	
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
		return "ApplicableTestEquipment [aplicableTestId=" + aplicableTestId + ", testName=" + testName
				+ ", equipmentId=" + equipmentId + ", periodicity=" + periodicity + ", ocation=" + ocation
				+ ", noOfCycle=" + noOfCycle + ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aplicableTestId == null) ? 0 : aplicableTestId.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((equipmentId == null) ? 0 : equipmentId.hashCode());
		result = prime * result + ((noOfCycle == null) ? 0 : noOfCycle.hashCode());
		result = prime * result + ((ocation == null) ? 0 : ocation.hashCode());
		result = prime * result + ((periodicity == null) ? 0 : periodicity.hashCode());
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
		ApplicableTestEquipment other = (ApplicableTestEquipment) obj;
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
		if (equipmentId == null) {
			if (other.equipmentId != null)
				return false;
		} else if (!equipmentId.equals(other.equipmentId))
			return false;
		if (noOfCycle == null) {
			if (other.noOfCycle != null)
				return false;
		} else if (!noOfCycle.equals(other.noOfCycle))
			return false;
		if (ocation == null) {
			if (other.ocation != null)
				return false;
		} else if (!ocation.equals(other.ocation))
			return false;
		if (periodicity == null) {
			if (other.periodicity != null)
				return false;
		} else if (!periodicity.equals(other.periodicity))
			return false;
		if (testName == null) {
			if (other.testName != null)
				return false;
		} else if (!testName.equals(other.testName))
			return false;
		return true;
	}

}
