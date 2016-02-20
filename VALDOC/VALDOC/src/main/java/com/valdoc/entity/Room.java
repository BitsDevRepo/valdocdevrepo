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
@Table(name="room")
@NamedQuery(name="Room.findById", query="SELECT r FROM Room r WHERE r.roomId = :roomId")

public class Room implements Serializable{

	private static final long serialVersionUID = -2368583057160438555L;
	
	@Id
	@Column(name="roomId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "areaId", insertable = true, updatable = true, nullable = true, unique = true)
	private Area areaId;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ahuId", insertable = true, updatable = true, nullable = true, unique = true)
	private AHU ahu;
	
	/*@Column(name="areaId")
	private Integer areaId;
	
	@Column(name="ahuId")
	private Integer ahuId;
	*/
	
	@Column(name="roomName")
	private String roomName;
	
	@Column(name="roomNo")
	private String roomNo;
	
	@Column(name="width")
	private Double width;
	
	@Column(name="height")
	private Double height;
	
	@Column(name="length")
	private Double length;
	
	@Column(name="area")
	private Double area;
	
	@Column(name="volume")
	private Double volume;
	
	@Column(name="acphNLT")
	private Integer acphNLT;
	
	@Column(name="testRef")
	private String testRef;

	@Column(name="isoClause")
	private String isoClause;

	@Column(name="occupancyState")
	private String occupancyState;
	
	@Column(name="roomSupplyAirflowCFM")
	private Double roomSupplyAirflowCFM;
	
	@Column(name="ahuFlowCFM")
	private Double ahuFlowCFM;
	
	@Column(name="roomPressurePA")
	private Double roomPressurePA;
	
	@Column(name="freshAirCFM")
	private Double freshAirCFM;
	
	@Column(name="bleedAirCFM")
	private Double bleedAirCFM;
	
	@Column(name="exhaustAirCFM")
	private Double exhaustAirCFM;
	
	@Column(name="temperature")
	private Double temperature;
	
	@Column(name="rh")
	private Double rh;
	
	@Column(name="returnAirCFM")
	private Double returnAirCFM;
	
	@Column(name="supplyAirGrillQTY")
	private Integer supplyAirGrillQTY;
	
	@Column(name="returnAirGrillQTY")
	private Integer returnAirGrillQTY;
	
	@Column(name="supplyAirFilterQTY")
	private Integer supplyAirFilterQTY;
	
	@Column(name="returnAirFilterQTY")
	private Integer returnAirFilterQTY;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name = "creationDate", columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Area getAreaId() {
		return areaId;
	}

	public void setAreaId(Area areaId) {
		this.areaId = areaId;
	}

	public AHU getAhu() {
		return ahu;
	}

	public void setAhu(AHU ahu) {
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", areaId=" + areaId + ", ahu=" + ahu + ", roomName=" + roomName + ", roomNo="
				+ roomNo + ", width=" + width + ", height=" + height + ", length=" + length + ", area=" + area
				+ ", volume=" + volume + ", acphNLT=" + acphNLT + ", testRef=" + testRef + ", isoClause=" + isoClause
				+ ", occupancyState=" + occupancyState + ", roomSupplyAirflowCFM=" + roomSupplyAirflowCFM
				+ ", ahuFlowCFM=" + ahuFlowCFM + ", roomPressurePA=" + roomPressurePA + ", freshAirCFM=" + freshAirCFM
				+ ", bleedAirCFM=" + bleedAirCFM + ", exhaustAirCFM=" + exhaustAirCFM + ", temperature=" + temperature
				+ ", rh=" + rh + ", returnAirCFM=" + returnAirCFM + ", supplyAirGrillQTY=" + supplyAirGrillQTY
				+ ", returnAirGrillQTY=" + returnAirGrillQTY + ", supplyAirFilterQTY=" + supplyAirFilterQTY
				+ ", returnAirFilterQTY=" + returnAirFilterQTY + ", remarks=" + remarks + ", creationDate="
				+ creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acphNLT == null) ? 0 : acphNLT.hashCode());
		result = prime * result + ((ahu == null) ? 0 : ahu.hashCode());
		result = prime * result + ((ahuFlowCFM == null) ? 0 : ahuFlowCFM.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((areaId == null) ? 0 : areaId.hashCode());
		result = prime * result + ((bleedAirCFM == null) ? 0 : bleedAirCFM.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((exhaustAirCFM == null) ? 0 : exhaustAirCFM.hashCode());
		result = prime * result + ((freshAirCFM == null) ? 0 : freshAirCFM.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((isoClause == null) ? 0 : isoClause.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((occupancyState == null) ? 0 : occupancyState.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result + ((returnAirCFM == null) ? 0 : returnAirCFM.hashCode());
		result = prime * result + ((returnAirFilterQTY == null) ? 0 : returnAirFilterQTY.hashCode());
		result = prime * result + ((returnAirGrillQTY == null) ? 0 : returnAirGrillQTY.hashCode());
		result = prime * result + ((rh == null) ? 0 : rh.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((roomName == null) ? 0 : roomName.hashCode());
		result = prime * result + ((roomNo == null) ? 0 : roomNo.hashCode());
		result = prime * result + ((roomPressurePA == null) ? 0 : roomPressurePA.hashCode());
		result = prime * result + ((roomSupplyAirflowCFM == null) ? 0 : roomSupplyAirflowCFM.hashCode());
		result = prime * result + ((supplyAirFilterQTY == null) ? 0 : supplyAirFilterQTY.hashCode());
		result = prime * result + ((supplyAirGrillQTY == null) ? 0 : supplyAirGrillQTY.hashCode());
		result = prime * result + ((temperature == null) ? 0 : temperature.hashCode());
		result = prime * result + ((testRef == null) ? 0 : testRef.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
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
		Room other = (Room) obj;
		if (acphNLT == null) {
			if (other.acphNLT != null)
				return false;
		} else if (!acphNLT.equals(other.acphNLT))
			return false;
		if (ahu == null) {
			if (other.ahu != null)
				return false;
		} else if (!ahu.equals(other.ahu))
			return false;
		if (ahuFlowCFM == null) {
			if (other.ahuFlowCFM != null)
				return false;
		} else if (!ahuFlowCFM.equals(other.ahuFlowCFM))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (areaId == null) {
			if (other.areaId != null)
				return false;
		} else if (!areaId.equals(other.areaId))
			return false;
		if (bleedAirCFM == null) {
			if (other.bleedAirCFM != null)
				return false;
		} else if (!bleedAirCFM.equals(other.bleedAirCFM))
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
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (isoClause == null) {
			if (other.isoClause != null)
				return false;
		} else if (!isoClause.equals(other.isoClause))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (occupancyState == null) {
			if (other.occupancyState != null)
				return false;
		} else if (!occupancyState.equals(other.occupancyState))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (returnAirCFM == null) {
			if (other.returnAirCFM != null)
				return false;
		} else if (!returnAirCFM.equals(other.returnAirCFM))
			return false;
		if (returnAirFilterQTY == null) {
			if (other.returnAirFilterQTY != null)
				return false;
		} else if (!returnAirFilterQTY.equals(other.returnAirFilterQTY))
			return false;
		if (returnAirGrillQTY == null) {
			if (other.returnAirGrillQTY != null)
				return false;
		} else if (!returnAirGrillQTY.equals(other.returnAirGrillQTY))
			return false;
		if (rh == null) {
			if (other.rh != null)
				return false;
		} else if (!rh.equals(other.rh))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (roomName == null) {
			if (other.roomName != null)
				return false;
		} else if (!roomName.equals(other.roomName))
			return false;
		if (roomNo == null) {
			if (other.roomNo != null)
				return false;
		} else if (!roomNo.equals(other.roomNo))
			return false;
		if (roomPressurePA == null) {
			if (other.roomPressurePA != null)
				return false;
		} else if (!roomPressurePA.equals(other.roomPressurePA))
			return false;
		if (roomSupplyAirflowCFM == null) {
			if (other.roomSupplyAirflowCFM != null)
				return false;
		} else if (!roomSupplyAirflowCFM.equals(other.roomSupplyAirflowCFM))
			return false;
		if (supplyAirFilterQTY == null) {
			if (other.supplyAirFilterQTY != null)
				return false;
		} else if (!supplyAirFilterQTY.equals(other.supplyAirFilterQTY))
			return false;
		if (supplyAirGrillQTY == null) {
			if (other.supplyAirGrillQTY != null)
				return false;
		} else if (!supplyAirGrillQTY.equals(other.supplyAirGrillQTY))
			return false;
		if (temperature == null) {
			if (other.temperature != null)
				return false;
		} else if (!temperature.equals(other.temperature))
			return false;
		if (testRef == null) {
			if (other.testRef != null)
				return false;
		} else if (!testRef.equals(other.testRef))
			return false;
		if (volume == null) {
			if (other.volume != null)
				return false;
		} else if (!volume.equals(other.volume))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

}
