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
@Table(name="equipmentfilter")
@NamedQuery(name="EquipmentFilter.findById", query="SELECT u FROM EquipmentFilter u WHERE u.filterId = :id")
public class EquipmentFilter implements Serializable {
	
	private static final long serialVersionUID = -3279060247298461995L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="filterId")
	private Integer filterId;
	
	@Column(name="filterCode")
	private String filterCode;
	
	@Column(name="equipmentId")
	private Integer equipmentId;
		
	@Column(name="width")
	private Double width;
	
	@Column(name="length")
	private Double length;
	
	@Column(name="grillArea")
	private Double grillArea;
	
	@Column(name="effectiveGrillArea")
	private Double effectiveGrillArea;  
	
	@Column(name = "isSupplyFilter" , columnDefinition = "BIT", length = 1)
	private Boolean isSupplyFilter;
	
	@Column(name = "creationDate", columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	public Integer getFilterId() {
		return filterId;
	}

	public void setFilterId(Integer filterId) {
		this.filterId = filterId;
	}

	public String getFilterCode() {
		return filterCode;
	}

	public void setFilterCode(String filterCode) {
		this.filterCode = filterCode;
	}

	public Integer getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(Integer equipmentId) {
		this.equipmentId = equipmentId;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getGrillArea() {
		return grillArea;
	}

	public void setGrillArea(Double grillArea) {
		this.grillArea = grillArea;
	}

	public Double getEffectiveGrillArea() {
		return effectiveGrillArea;
	}

	public void setEffectiveGrillArea(Double effectiveGrillArea) {
		this.effectiveGrillArea = effectiveGrillArea;
	}

	public Boolean getIsSupplyFilter() {
		return isSupplyFilter;
	}

	public void setIsSupplyFilter(Boolean isSupplyFilter) {
		this.isSupplyFilter = isSupplyFilter;
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
		return "EquipmentFilter [filterId=" + filterId + ", filterCode=" + filterCode + ", equipmentId=" + equipmentId
				+ ", width=" + width + ", length=" + length + ", grillArea=" + grillArea + ", effectiveGrillArea="
				+ effectiveGrillArea + ", isSupplyFilter=" + isSupplyFilter + ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((effectiveGrillArea == null) ? 0 : effectiveGrillArea.hashCode());
		result = prime * result + ((equipmentId == null) ? 0 : equipmentId.hashCode());
		result = prime * result + ((filterCode == null) ? 0 : filterCode.hashCode());
		result = prime * result + ((filterId == null) ? 0 : filterId.hashCode());
		result = prime * result + ((grillArea == null) ? 0 : grillArea.hashCode());
		result = prime * result + ((isSupplyFilter == null) ? 0 : isSupplyFilter.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
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
		EquipmentFilter other = (EquipmentFilter) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (effectiveGrillArea == null) {
			if (other.effectiveGrillArea != null)
				return false;
		} else if (!effectiveGrillArea.equals(other.effectiveGrillArea))
			return false;
		if (equipmentId == null) {
			if (other.equipmentId != null)
				return false;
		} else if (!equipmentId.equals(other.equipmentId))
			return false;
		if (filterCode == null) {
			if (other.filterCode != null)
				return false;
		} else if (!filterCode.equals(other.filterCode))
			return false;
		if (filterId == null) {
			if (other.filterId != null)
				return false;
		} else if (!filterId.equals(other.filterId))
			return false;
		if (grillArea == null) {
			if (other.grillArea != null)
				return false;
		} else if (!grillArea.equals(other.grillArea))
			return false;
		if (isSupplyFilter == null) {
			if (other.isSupplyFilter != null)
				return false;
		} else if (!isSupplyFilter.equals(other.isSupplyFilter))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}


}
