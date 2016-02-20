package com.valdoc.dto;

import java.io.Serializable;

public class AreaDTO implements Serializable {
	
	private static final long serialVersionUID = 4834497184932428211L;

	private Integer areaId;

	private PlantDTO plant;

	//private Integer plantId;

	private String areaName;
	
	private String additionalDetails;

	private String createdDate;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public PlantDTO getPlant() {
		return plant;
	}

	public void setPlant(PlantDTO plant) {
		this.plant = plant;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "AreaDTO [areaId=" + areaId + ", plant=" + plant + ", areaName=" + areaName + ", additionalDetails="
				+ additionalDetails + ", createdDate=" + createdDate + "]";
	}

}
