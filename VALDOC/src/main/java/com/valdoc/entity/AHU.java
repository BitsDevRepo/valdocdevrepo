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
@Table(name="ahu")
@NamedQuery(name="AHU.findById", query="SELECT ah FROM AHU ah WHERE ah.ahuId = :ahuId")

public class AHU implements Serializable{

	private static final long serialVersionUID = -6190788294812453975L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ahuId")
	private Integer ahuId;
	
	@Column(name="ahuNo")
	private String ahuNo;
	
	@Column(name="ahuType")
	private String ahuType;
	
	@Column(name="capacity")
	private Double capacity;
	
	@Column(name="returnAirCFM")
	private Double returnAirCFM;

	@Column(name="exhaustAirCFM")
	private Double exhaustAirCFM;
	
	@Column(name="bleedFilterType")
	private String bleedFilterType;
	
	@Column(name="bleedFilterEfficiency")
	private Double bleedFilterEfficiency;
	
	@Column(name="bleedAirCFM")
	private Double bleedAirCFM;
	
	@Column(name="bleedFilterQty")
	private Integer bleedFilterQty;
	
	@Column(name="bleedFilterSize")
	private String bleedFilterSize;
	
	@Column(name="freshFilterType")
	private String freshFilterType;
	
	@Column(name="freshAirCFM")
	private Double freshAirCFM;
	
	@Column(name="freshFilterQty")
	private Integer freshFilterQty;
	
	@Column(name="freshFilterSize")
	private String freshFilterSize;
	
	@Column(name="ahuHEPAFilterQty")
	private Integer ahuHEPAFilterQty;
	
	@Column(name="hepaFilterEfficiency")
	private Double hepaFilterEfficiency;
	
	@Column(name="hepaParticleSize")
	private String hepaParticleSize;
	
	@Column(name="hepaFilterSpecification")
	private Double hepaFilterSpecification;

	@Column(name = "creationDate", columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	public Integer getAhuId() {
		return ahuId;
	}

	public void setAhuId(Integer ahuId) {
		this.ahuId = ahuId;
	}

	public String getAhuNo() {
		return ahuNo;
	}

	public void setAhuNo(String ahuNo) {
		this.ahuNo = ahuNo;
	}

	public String getAhuType() {
		return ahuType;
	}

	public void setAhuType(String ahuType) {
		this.ahuType = ahuType;
	}

	public Double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}

	public Double getReturnAirCFM() {
		return returnAirCFM;
	}

	public void setReturnAirCFM(Double returnAirCFM) {
		this.returnAirCFM = returnAirCFM;
	}

	public Double getExhaustAirCFM() {
		return exhaustAirCFM;
	}

	public void setExhaustAirCFM(Double exhaustAirCFM) {
		this.exhaustAirCFM = exhaustAirCFM;
	}

	public String getBleedFilterType() {
		return bleedFilterType;
	}

	public void setBleedFilterType(String bleedFilterType) {
		this.bleedFilterType = bleedFilterType;
	}

	public Double getBleedFilterEfficiency() {
		return bleedFilterEfficiency;
	}

	public void setBleedFilterEfficiency(Double bleedFilterEfficiency) {
		this.bleedFilterEfficiency = bleedFilterEfficiency;
	}

	public Double getBleedAirCFM() {
		return bleedAirCFM;
	}

	public void setBleedAirCFM(Double bleedAirCFM) {
		this.bleedAirCFM = bleedAirCFM;
	}

	public Integer getBleedFilterQty() {
		return bleedFilterQty;
	}

	public void setBleedFilterQty(Integer bleedFilterQty) {
		this.bleedFilterQty = bleedFilterQty;
	}

	public String getBleedFilterSize() {
		return bleedFilterSize;
	}

	public void setBleedFilterSize(String bleedFilterSize) {
		this.bleedFilterSize = bleedFilterSize;
	}

	public String getFreshFilterType() {
		return freshFilterType;
	}

	public void setFreshFilterType(String freshFilterType) {
		this.freshFilterType = freshFilterType;
	}

	public Double getFreshAirCFM() {
		return freshAirCFM;
	}

	public void setFreshAirCFM(Double freshAirCFM) {
		this.freshAirCFM = freshAirCFM;
	}

	public Integer getFreshFilterQty() {
		return freshFilterQty;
	}

	public void setFreshFilterQty(Integer freshFilterQty) {
		this.freshFilterQty = freshFilterQty;
	}

	public String getFreshFilterSize() {
		return freshFilterSize;
	}

	public void setFreshFilterSize(String freshFilterSize) {
		this.freshFilterSize = freshFilterSize;
	}

	public Integer getAhuHEPAFilterQty() {
		return ahuHEPAFilterQty;
	}

	public void setAhuHEPAFilterQty(Integer ahuHEPAFilterQty) {
		this.ahuHEPAFilterQty = ahuHEPAFilterQty;
	}

	public Double getHepaFilterEfficiency() {
		return hepaFilterEfficiency;
	}

	public void setHepaFilterEfficiency(Double hepaFilterEfficiency) {
		this.hepaFilterEfficiency = hepaFilterEfficiency;
	}

	public String getHepaParticleSize() {
		return hepaParticleSize;
	}

	public void setHepaParticleSize(String hepaParticleSize) {
		this.hepaParticleSize = hepaParticleSize;
	}

	public Double getHepaFilterSpecification() {
		return hepaFilterSpecification;
	}

	public void setHepaFilterSpecification(Double hepaFilterSpecification) {
		this.hepaFilterSpecification = hepaFilterSpecification;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "AHU [ahuId=" + ahuId + ", ahuNo=" + ahuNo + ", ahuType=" + ahuType + ", capacity=" + capacity
				+ ", returnAirCFM=" + returnAirCFM + ", exhaustAirCFM=" + exhaustAirCFM + ", bleedFilterType="
				+ bleedFilterType + ", bleedFilterEfficiency=" + bleedFilterEfficiency + ", bleedAirCFM=" + bleedAirCFM
				+ ", bleedFilterQty=" + bleedFilterQty + ", bleedFilterSize=" + bleedFilterSize + ", freshFilterType="
				+ freshFilterType + ", freshAirCFM=" + freshAirCFM + ", freshFilterQty=" + freshFilterQty
				+ ", freshFilterSize=" + freshFilterSize + ", ahuHEPAFilterQty=" + ahuHEPAFilterQty
				+ ", hepaFilterEfficiency=" + hepaFilterEfficiency + ", hepaParticleSize=" + hepaParticleSize
				+ ", hepaFilterSpecification=" + hepaFilterSpecification + ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ahuHEPAFilterQty == null) ? 0 : ahuHEPAFilterQty.hashCode());
		result = prime * result + ((ahuId == null) ? 0 : ahuId.hashCode());
		result = prime * result + ((ahuNo == null) ? 0 : ahuNo.hashCode());
		result = prime * result + ((ahuType == null) ? 0 : ahuType.hashCode());
		result = prime * result + ((bleedAirCFM == null) ? 0 : bleedAirCFM.hashCode());
		result = prime * result + ((bleedFilterEfficiency == null) ? 0 : bleedFilterEfficiency.hashCode());
		result = prime * result + ((bleedFilterQty == null) ? 0 : bleedFilterQty.hashCode());
		result = prime * result + ((bleedFilterSize == null) ? 0 : bleedFilterSize.hashCode());
		result = prime * result + ((bleedFilterType == null) ? 0 : bleedFilterType.hashCode());
		result = prime * result + ((capacity == null) ? 0 : capacity.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((exhaustAirCFM == null) ? 0 : exhaustAirCFM.hashCode());
		result = prime * result + ((freshAirCFM == null) ? 0 : freshAirCFM.hashCode());
		result = prime * result + ((freshFilterQty == null) ? 0 : freshFilterQty.hashCode());
		result = prime * result + ((freshFilterSize == null) ? 0 : freshFilterSize.hashCode());
		result = prime * result + ((freshFilterType == null) ? 0 : freshFilterType.hashCode());
		result = prime * result + ((hepaFilterEfficiency == null) ? 0 : hepaFilterEfficiency.hashCode());
		result = prime * result + ((hepaFilterSpecification == null) ? 0 : hepaFilterSpecification.hashCode());
		result = prime * result + ((hepaParticleSize == null) ? 0 : hepaParticleSize.hashCode());
		result = prime * result + ((returnAirCFM == null) ? 0 : returnAirCFM.hashCode());
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
		AHU other = (AHU) obj;
		if (ahuHEPAFilterQty == null) {
			if (other.ahuHEPAFilterQty != null)
				return false;
		} else if (!ahuHEPAFilterQty.equals(other.ahuHEPAFilterQty))
			return false;
		if (ahuId == null) {
			if (other.ahuId != null)
				return false;
		} else if (!ahuId.equals(other.ahuId))
			return false;
		if (ahuNo == null) {
			if (other.ahuNo != null)
				return false;
		} else if (!ahuNo.equals(other.ahuNo))
			return false;
		if (ahuType == null) {
			if (other.ahuType != null)
				return false;
		} else if (!ahuType.equals(other.ahuType))
			return false;
		if (bleedAirCFM == null) {
			if (other.bleedAirCFM != null)
				return false;
		} else if (!bleedAirCFM.equals(other.bleedAirCFM))
			return false;
		if (bleedFilterEfficiency == null) {
			if (other.bleedFilterEfficiency != null)
				return false;
		} else if (!bleedFilterEfficiency.equals(other.bleedFilterEfficiency))
			return false;
		if (bleedFilterQty == null) {
			if (other.bleedFilterQty != null)
				return false;
		} else if (!bleedFilterQty.equals(other.bleedFilterQty))
			return false;
		if (bleedFilterSize == null) {
			if (other.bleedFilterSize != null)
				return false;
		} else if (!bleedFilterSize.equals(other.bleedFilterSize))
			return false;
		if (bleedFilterType == null) {
			if (other.bleedFilterType != null)
				return false;
		} else if (!bleedFilterType.equals(other.bleedFilterType))
			return false;
		if (capacity == null) {
			if (other.capacity != null)
				return false;
		} else if (!capacity.equals(other.capacity))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (exhaustAirCFM == null) {
			if (other.exhaustAirCFM != null)
				return false;
		} else if (!exhaustAirCFM.equals(other.exhaustAirCFM))
			return false;
		if (freshAirCFM == null) {
			if (other.freshAirCFM != null)
				return false;
		} else if (!freshAirCFM.equals(other.freshAirCFM))
			return false;
		if (freshFilterQty == null) {
			if (other.freshFilterQty != null)
				return false;
		} else if (!freshFilterQty.equals(other.freshFilterQty))
			return false;
		if (freshFilterSize == null) {
			if (other.freshFilterSize != null)
				return false;
		} else if (!freshFilterSize.equals(other.freshFilterSize))
			return false;
		if (freshFilterType == null) {
			if (other.freshFilterType != null)
				return false;
		} else if (!freshFilterType.equals(other.freshFilterType))
			return false;
		if (hepaFilterEfficiency == null) {
			if (other.hepaFilterEfficiency != null)
				return false;
		} else if (!hepaFilterEfficiency.equals(other.hepaFilterEfficiency))
			return false;
		if (hepaFilterSpecification == null) {
			if (other.hepaFilterSpecification != null)
				return false;
		} else if (!hepaFilterSpecification.equals(other.hepaFilterSpecification))
			return false;
		if (hepaParticleSize == null) {
			if (other.hepaParticleSize != null)
				return false;
		} else if (!hepaParticleSize.equals(other.hepaParticleSize))
			return false;
		if (returnAirCFM == null) {
			if (other.returnAirCFM != null)
				return false;
		} else if (!returnAirCFM.equals(other.returnAirCFM))
			return false;
		return true;
	}
}
