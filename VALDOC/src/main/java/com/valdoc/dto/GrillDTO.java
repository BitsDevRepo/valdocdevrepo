package com.valdoc.dto;

import java.io.Serializable;

public class GrillDTO implements Serializable {
	
	private static final long serialVersionUID = 6844924175018791667L;

	private Integer grillId;
	
	private String grillCode;
	
	private RoomDTO room;
	
	private Double width;
	
	private Double length;
	
	private Double grillArea;
	
	private Double effectiveArea;  
	
	private boolean supplyGrill;  
	
	private boolean additionalDetail;

	private String creationDate;

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

	public RoomDTO getRoom() {
		return room;
	}

	public void setRoom(RoomDTO room) {
		this.room = room;
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
		return supplyGrill;
	}

	public void setSupplyGrill(boolean supplyGrill) {
		this.supplyGrill = supplyGrill;
	}

	public boolean isAdditionalDetail() {
		return additionalDetail;
	}

	public void setAdditionalDetail(boolean additionalDetail) {
		this.additionalDetail = additionalDetail;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "GrillDTO [grillId=" + grillId + ", grillCode=" + grillCode + ", room=" + room + ", width=" + width
				+ ", length=" + length + ", grillArea=" + grillArea + ", effectiveArea=" + effectiveArea
				+ ", supplyGrill=" + supplyGrill + ", additionalDetail=" + additionalDetail + ", creationDate="
				+ creationDate + "]";
	}
	
}
