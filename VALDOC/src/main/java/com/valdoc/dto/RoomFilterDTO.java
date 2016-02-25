package com.valdoc.dto;

import java.io.Serializable;

public class RoomFilterDTO implements Serializable {
	
	private static final long serialVersionUID = -4702341927993099633L;

	private Integer filterId;
	
	private String filterCode;
	
	private RoomDTO room;
	
	private String filterType;

	private Double efficiency;

	private String particleSize;
	
	private Double specification;
	
	private Double width;
	
	private Double length;
	
	private Double grillArea;
	
	private Double effectiveGrillArea;  
	
	private boolean isSupplyFilter;

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

	public RoomDTO getRoom() {
		return room;
	}

	public void setRoom(RoomDTO room) {
		this.room = room;
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

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "RoomFilterDTO [filterId=" + filterId + ", filterCode=" + filterCode + ", room=" + room + ", filterType="
				+ filterType + ", efficiency=" + efficiency + ", particleSize=" + particleSize + ", specification="
				+ specification + ", width=" + width + ", length=" + length + ", grillArea=" + grillArea
				+ ", effectiveGrillArea=" + effectiveGrillArea + ", isSupplyFilter=" + isSupplyFilter
				+ ", creationDate=" + creationDate + "]";
	}


}
