package com.valdoc.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.valdoc.entity.AHU;
import com.valdoc.entity.Area;

public class RoomDTO implements Serializable {
	
	private static final long serialVersionUID = -6355090981634404368L;
	
	private Integer roomId;

	private AreaDTO areaId;

	private AhuDTO ahu;
	
	/*
	private Integer areaId;
	
	private Integer ahuId;
	*/
	
	private String roomName;
	
	private String roomNo;
	
	private Double width;
	
	private Double height;
	
	private Double length;
	
	private Double area;
	
	private Double volume;
	
	private Integer acphNLT;
	
	private String testRef;

	private String isoClause;

	private String occupancyState;
	
	private Double roomSupplyAirflowCFM;
	
	private Double ahuFlowCFM;
	
	private Double roomPressurePA;
	
	private Double freshAirCFM;
	
	private Double bleedAirCFM;
	
	private Double exhaustAirCFM;
	
	private Double temperature;
	
	private Double rh;
	
	private Double returnAirCFM;
	
	private Integer supplyAirGrillQTY;
	
	private Integer returnAirGrillQTY;
	
	private Integer supplyAirFilterQTY;
	
	private Integer returnAirFilterQTY;
	
	private String remarks;
	
	private String creationDate;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public AreaDTO getAreaId() {
		return areaId;
	}

	public void setAreaId(AreaDTO areaId) {
		this.areaId = areaId;
	}

	public AhuDTO getAhu() {
		return ahu;
	}

	public void setAhu(AhuDTO ahu) {
		this.ahu = ahu;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Integer getAcphNLT() {
		return acphNLT;
	}

	public void setAcphNLT(Integer acphNLT) {
		this.acphNLT = acphNLT;
	}

	public String getTestRef() {
		return testRef;
	}

	public void setTestRef(String testRef) {
		this.testRef = testRef;
	}

	public String getIsoClause() {
		return isoClause;
	}

	public void setIsoClause(String isoClause) {
		this.isoClause = isoClause;
	}

	public String getOccupancyState() {
		return occupancyState;
	}

	public void setOccupancyState(String occupancyState) {
		this.occupancyState = occupancyState;
	}

	public Double getRoomSupplyAirflowCFM() {
		return roomSupplyAirflowCFM;
	}

	public void setRoomSupplyAirflowCFM(Double roomSupplyAirflowCFM) {
		this.roomSupplyAirflowCFM = roomSupplyAirflowCFM;
	}

	public Double getAhuFlowCFM() {
		return ahuFlowCFM;
	}

	public void setAhuFlowCFM(Double ahuFlowCFM) {
		this.ahuFlowCFM = ahuFlowCFM;
	}

	public Double getRoomPressurePA() {
		return roomPressurePA;
	}

	public void setRoomPressurePA(Double roomPressurePA) {
		this.roomPressurePA = roomPressurePA;
	}

	public Double getFreshAirCFM() {
		return freshAirCFM;
	}

	public void setFreshAirCFM(Double freshAirCFM) {
		this.freshAirCFM = freshAirCFM;
	}

	public Double getBleedAirCFM() {
		return bleedAirCFM;
	}

	public void setBleedAirCFM(Double bleedAirCFM) {
		this.bleedAirCFM = bleedAirCFM;
	}

	public Double getExhaustAirCFM() {
		return exhaustAirCFM;
	}

	public void setExhaustAirCFM(Double exhaustAirCFM) {
		this.exhaustAirCFM = exhaustAirCFM;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public Double getRh() {
		return rh;
	}

	public void setRh(Double rh) {
		this.rh = rh;
	}

	public Double getReturnAirCFM() {
		return returnAirCFM;
	}

	public void setReturnAirCFM(Double returnAirCFM) {
		this.returnAirCFM = returnAirCFM;
	}

	public Integer getSupplyAirGrillQTY() {
		return supplyAirGrillQTY;
	}

	public void setSupplyAirGrillQTY(Integer supplyAirGrillQTY) {
		this.supplyAirGrillQTY = supplyAirGrillQTY;
	}

	public Integer getReturnAirGrillQTY() {
		return returnAirGrillQTY;
	}

	public void setReturnAirGrillQTY(Integer returnAirGrillQTY) {
		this.returnAirGrillQTY = returnAirGrillQTY;
	}

	public Integer getSupplyAirFilterQTY() {
		return supplyAirFilterQTY;
	}

	public void setSupplyAirFilterQTY(Integer supplyAirFilterQTY) {
		this.supplyAirFilterQTY = supplyAirFilterQTY;
	}

	public Integer getReturnAirFilterQTY() {
		return returnAirFilterQTY;
	}

	public void setReturnAirFilterQTY(Integer returnAirFilterQTY) {
		this.returnAirFilterQTY = returnAirFilterQTY;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "RoomDTO [roomId=" + roomId + ", areaId=" + areaId + ", ahu=" + ahu + ", roomName=" + roomName
				+ ", roomNo=" + roomNo + ", width=" + width + ", height=" + height + ", length=" + length + ", area="
				+ area + ", volume=" + volume + ", acphNLT=" + acphNLT + ", testRef=" + testRef + ", isoClause="
				+ isoClause + ", occupancyState=" + occupancyState + ", roomSupplyAirflowCFM=" + roomSupplyAirflowCFM
				+ ", ahuFlowCFM=" + ahuFlowCFM + ", roomPressurePA=" + roomPressurePA + ", freshAirCFM=" + freshAirCFM
				+ ", bleedAirCFM=" + bleedAirCFM + ", exhaustAirCFM=" + exhaustAirCFM + ", temperature=" + temperature
				+ ", rh=" + rh + ", returnAirCFM=" + returnAirCFM + ", supplyAirGrillQTY=" + supplyAirGrillQTY
				+ ", returnAirGrillQTY=" + returnAirGrillQTY + ", supplyAirFilterQTY=" + supplyAirFilterQTY
				+ ", returnAirFilterQTY=" + returnAirFilterQTY + ", remarks=" + remarks + ", creationDate="
				+ creationDate + "]";
	}
}
