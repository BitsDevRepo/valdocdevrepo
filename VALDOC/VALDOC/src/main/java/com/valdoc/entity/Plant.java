package com.valdoc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="plant")
@NamedQuery(name="Plant.findById", query="SELECT p FROM Plant p WHERE p.plantId = :plantId")

public class Plant implements Serializable{
	
	private static final long serialVersionUID = -4547347574568943341L;

	@Id
	@Column(name="plantId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer plantId;

	@Column(name="plantName")
	private String plantName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="additionalDetails")
	private String additionalDetails;
	
	@Column(name="directorName")
	private String directorName;
	
	@Column(name="directorContactNo")
	private String directorContactNo;
	
	@Column(name="directorEmailId")
	private String directorEmailId;
	
	@Column(name="contactPersonName")
	private String contactPersonName;
	
	@Column(name="contactPersonNo")
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
		return "plant [plantId=" + plantId + ", plantName=" + plantName + ", address=" + address
				+ ", additionalDetails=" + additionalDetails + ", directorName=" + directorName + ", directorContactNo="
				+ directorContactNo + ", directorEmailId=" + directorEmailId + ", contactPersonName="
				+ contactPersonName + ", contactPersonNo=" + contactPersonNo + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalDetails == null) ? 0 : additionalDetails.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((contactPersonName == null) ? 0 : contactPersonName.hashCode());
		result = prime * result + ((contactPersonNo == null) ? 0 : contactPersonNo.hashCode());
		result = prime * result + ((directorContactNo == null) ? 0 : directorContactNo.hashCode());
		result = prime * result + ((directorEmailId == null) ? 0 : directorEmailId.hashCode());
		result = prime * result + ((directorName == null) ? 0 : directorName.hashCode());
		result = prime * result + ((plantId == null) ? 0 : plantId.hashCode());
		result = prime * result + ((plantName == null) ? 0 : plantName.hashCode());
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
		Plant other = (Plant) obj;
		if (additionalDetails == null) {
			if (other.additionalDetails != null)
				return false;
		} else if (!additionalDetails.equals(other.additionalDetails))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactPersonName == null) {
			if (other.contactPersonName != null)
				return false;
		} else if (!contactPersonName.equals(other.contactPersonName))
			return false;
		if (contactPersonNo == null) {
			if (other.contactPersonNo != null)
				return false;
		} else if (!contactPersonNo.equals(other.contactPersonNo))
			return false;
		if (directorContactNo == null) {
			if (other.directorContactNo != null)
				return false;
		} else if (!directorContactNo.equals(other.directorContactNo))
			return false;
		if (directorEmailId == null) {
			if (other.directorEmailId != null)
				return false;
		} else if (!directorEmailId.equals(other.directorEmailId))
			return false;
		if (directorName == null) {
			if (other.directorName != null)
				return false;
		} else if (!directorName.equals(other.directorName))
			return false;
		if (plantId == null) {
			if (other.plantId != null)
				return false;
		} else if (!plantId.equals(other.plantId))
			return false;
		if (plantName == null) {
			if (other.plantName != null)
				return false;
		} else if (!plantName.equals(other.plantName))
			return false;
		return true;
	}

}
