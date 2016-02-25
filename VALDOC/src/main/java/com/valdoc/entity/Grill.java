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
@Table(name="grill")
@NamedQuery(name="Grill.findById", query="SELECT gr FROM Grill gr WHERE gr.grillId = :grillId")
public class Grill implements Serializable {
	
	private static final long serialVersionUID = -7024939202962534619L;

	@Id
	@Column(name="grillId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer grillId;
	
	@Column(name="grillCode")
	private String grillCode;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "roomId", insertable = true, updatable = true, nullable = true, unique = true)
	private Room roomId;
	
	@Column(name="width")
	private Double width;
	
	@Column(name="length")
	private Double length;
	
	@Column(name="grillArea")
	private Double grillArea;
	
	@Column(name="effectiveArea")
	private Double effectiveArea;  
	
	@Column(name = "isSupplyGrill", columnDefinition = "BIT", length = 1)
	private boolean isSupplyGrill;  
	
	@Column(name = "additionalDetail", columnDefinition = "BIT", length = 1)
	private boolean additionalDetail;


	@Column(name = "creationDate", columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;


	public Integer getGrillId() {
		return grillId;
	}


	public void setGrillId(Integer grillId) {
		this.grillId = grillId;
	}


	public String getGrillCode() {
		return grillCode;
	}


	public void setGrillCode(String grillCode) {
		this.grillCode = grillCode;
	}


	public Room getRoomId() {
		return roomId;
	}


	public void setRoomId(Room roomId) {
		this.roomId = roomId;
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


	public Double getEffectiveArea() {
		return effectiveArea;
	}


	public void setEffectiveArea(Double effectiveArea) {
		this.effectiveArea = effectiveArea;
	}


	public boolean isSupplyGrill() {
		return isSupplyGrill;
	}


	public void setSupplyGrill(boolean isSupplyGrill) {
		this.isSupplyGrill = isSupplyGrill;
	}


	public boolean isAdditionalDetail() {
		return additionalDetail;
	}


	public void setAdditionalDetail(boolean additionalDetail) {
		this.additionalDetail = additionalDetail;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	@Override
	public String toString() {
		return "Grill [grillId=" + grillId + ", grillCode=" + grillCode + ", roomId=" + roomId + ", width=" + width
				+ ", length=" + length + ", grillArea=" + grillArea + ", effectiveArea=" + effectiveArea
				+ ", isSupplyGrill=" + isSupplyGrill + ", additionalDetail=" + additionalDetail + ", creationDate="
				+ creationDate + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (additionalDetail ? 1231 : 1237);
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((effectiveArea == null) ? 0 : effectiveArea.hashCode());
		result = prime * result + ((grillArea == null) ? 0 : grillArea.hashCode());
		result = prime * result + ((grillCode == null) ? 0 : grillCode.hashCode());
		result = prime * result + ((grillId == null) ? 0 : grillId.hashCode());
		result = prime * result + (isSupplyGrill ? 1231 : 1237);
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
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
		Grill other = (Grill) obj;
		if (additionalDetail != other.additionalDetail)
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (effectiveArea == null) {
			if (other.effectiveArea != null)
				return false;
		} else if (!effectiveArea.equals(other.effectiveArea))
			return false;
		if (grillArea == null) {
			if (other.grillArea != null)
				return false;
		} else if (!grillArea.equals(other.grillArea))
			return false;
		if (grillCode == null) {
			if (other.grillCode != null)
				return false;
		} else if (!grillCode.equals(other.grillCode))
			return false;
		if (grillId == null) {
			if (other.grillId != null)
				return false;
		} else if (!grillId.equals(other.grillId))
			return false;
		if (isSupplyGrill != other.isSupplyGrill)
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

}
