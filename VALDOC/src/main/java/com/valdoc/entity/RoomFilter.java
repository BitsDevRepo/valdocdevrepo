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
@Table(name="roomFilter")
@NamedQuery(name="RoomFilter.findById", query="SELECT rf FROM RoomFilter rf WHERE rf.filterId = :filterId")
public class RoomFilter implements Serializable {
	
	private static final long serialVersionUID = 8738185829101004742L;
	
	@Id
	@Column(name="filterId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer filterId;
	
	@Column(name="filterCode")
	private String filterCode;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roomId", insertable = true, updatable = true, nullable = true, unique = true)
	private Room roomId;
	
	@Column(name="filterType")
	private String filterType;

	@Column(name="efficiency")
	private Double efficiency;

	@Column(name="particleSize")
	private String particleSize;
	
	@Column(name="specification")
	private Double specification;
	
	@Column(name="width")
	private Double width;
	
	@Column(name="length")
	private Double length;
	
	@Column(name="grillArea")
	private Double grillArea;
	
	@Column(name="effectiveGrillArea")
	private Double effectiveGrillArea;  
	
	@Column(name = "isSupplyFilter", columnDefinition = "BIT", length = 1)
	private boolean isSupplyFilter;

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

	public Room getRoomId() {
		return roomId;
	}

	public void setRoomId(Room roomId) {
		this.roomId = roomId;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public Double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(Double efficiency) {
		this.efficiency = efficiency;
	}

	public String getParticleSize() {
		return particleSize;
	}

	public void setParticleSize(String particleSize) {
		this.particleSize = particleSize;
	}

	public Double getSpecification() {
		return specification;
	}

	public void setSpecification(Double specification) {
		this.specification = specification;
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

	public boolean isSupplyFilter() {
		return isSupplyFilter;
	}

	public void setSupplyFilter(boolean isSupplyFilter) {
		this.isSupplyFilter = isSupplyFilter;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "RoomFilter [filterId=" + filterId + ", filterCode=" + filterCode + ", roomId=" + roomId
				+ ", filterType=" + filterType + ", efficiency=" + efficiency + ", particleSize=" + particleSize
				+ ", specification=" + specification + ", width=" + width + ", length=" + length + ", grillArea="
				+ grillArea + ", effectiveGrillArea=" + effectiveGrillArea + ", isSupplyFilter=" + isSupplyFilter
				+ ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((effectiveGrillArea == null) ? 0 : effectiveGrillArea.hashCode());
		result = prime * result + ((efficiency == null) ? 0 : efficiency.hashCode());
		result = prime * result + ((filterCode == null) ? 0 : filterCode.hashCode());
		result = prime * result + ((filterId == null) ? 0 : filterId.hashCode());
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		result = prime * result + ((grillArea == null) ? 0 : grillArea.hashCode());
		result = prime * result + (isSupplyFilter ? 1231 : 1237);
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((particleSize == null) ? 0 : particleSize.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((specification == null) ? 0 : specification.hashCode());
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
		RoomFilter other = (RoomFilter) obj;
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
		if (efficiency == null) {
			if (other.efficiency != null)
				return false;
		} else if (!efficiency.equals(other.efficiency))
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
		if (filterType == null) {
			if (other.filterType != null)
				return false;
		} else if (!filterType.equals(other.filterType))
			return false;
		if (grillArea == null) {
			if (other.grillArea != null)
				return false;
		} else if (!grillArea.equals(other.grillArea))
			return false;
		if (isSupplyFilter != other.isSupplyFilter)
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (particleSize == null) {
			if (other.particleSize != null)
				return false;
		} else if (!particleSize.equals(other.particleSize))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (specification == null) {
			if (other.specification != null)
				return false;
		} else if (!specification.equals(other.specification))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

}
