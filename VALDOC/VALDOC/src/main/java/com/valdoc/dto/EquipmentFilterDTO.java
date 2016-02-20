package com.valdoc.dto;
import java.io.Serializable;

public class EquipmentFilterDTO implements Serializable {
	
	private static final long serialVersionUID = -3279060247298461995L;

	private Integer filterId;
	
	
	private String filterCode;
	
	private Integer equipmentId;
		
	
	private Double width;
	
	
	private Double length;
	
	
	private Double grillArea;
	
	private Double effectiveGrillArea;  
	
	
	private Boolean isSupplyFilter;
	
	
	private String creationDate;


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


	public String getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}


	@Override
	public String toString() {
		return "EquipmentFilterDTO [filterId=" + filterId + ", filterCode=" + filterCode + ", equipmentId="
				+ equipmentId + ", width=" + width + ", length=" + length + ", grillArea=" + grillArea
				+ ", effectiveGrillArea=" + effectiveGrillArea + ", isSupplyFilter=" + isSupplyFilter
				+ ", creationDate=" + creationDate + "]";
	}


}
