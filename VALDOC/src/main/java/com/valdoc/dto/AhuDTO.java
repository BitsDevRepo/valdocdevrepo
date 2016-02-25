package com.valdoc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class AhuDTO implements Serializable{
	
	private static final long serialVersionUID = 4372561060836867137L;
	
	private Integer ahuId;
	
	private String ahuNo;
	
	private String ahuType;
	
	private Double capacity;
	
	private Double returnAirCFM;

	private Double exhaustAirCFM;
	
	private String bleedFilterType;
	
	private Double bleedFilterEfficiency;
	
	private Double bleedAirCFM;
	
	private Integer bleedFilterQty;
	
	private String bleedFilterSize;
	
	private String freshFilterType;
	
	private Double freshAirCFM;
	
	private Integer freshFilterQty;
	
	private String freshFilterSize;
	
	private Integer ahuHEPAFilterQty;
	
	private Double hepaFilterEfficiency;
	
	private String hepaParticleSize;
	
	private Double hepaFilterSpecification;

	private String creationDate;

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

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "AhuDTO [ahuId=" + ahuId + ", ahuNo=" + ahuNo + ", ahuType=" + ahuType + ", capacity=" + capacity
				+ ", returnAirCFM=" + returnAirCFM + ", exhaustAirCFM=" + exhaustAirCFM + ", bleedFilterType="
				+ bleedFilterType + ", bleedFilterEfficiency=" + bleedFilterEfficiency + ", bleedAirCFM=" + bleedAirCFM
				+ ", bleedFilterQty=" + bleedFilterQty + ", bleedFilterSize=" + bleedFilterSize + ", freshFilterType="
				+ freshFilterType + ", freshAirCFM=" + freshAirCFM + ", freshFilterQty=" + freshFilterQty
				+ ", freshFilterSize=" + freshFilterSize + ", ahuHEPAFilterQty=" + ahuHEPAFilterQty
				+ ", hepaFilterEfficiency=" + hepaFilterEfficiency + ", hepaParticleSize=" + hepaParticleSize
				+ ", hepaFilterSpecification=" + hepaFilterSpecification + ", creationDate=" + creationDate + "]";
	}

}
