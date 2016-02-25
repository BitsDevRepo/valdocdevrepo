package com.valdoc.dao;

import java.util.List;

import com.valdoc.entity.Room;
import com.valdoc.entity.AHU;
import com.valdoc.entity.ApplicableTestRoom;
import com.valdoc.entity.Area;
import com.valdoc.exception.DaoException;

public interface RoomDAO {

	public List<Room> getRoomDetails() throws DaoException;

	public Room getObject(Integer id) throws DaoException;

	public void add(Room room) throws DaoException;

	public void update(Room room) throws DaoException;

	public void delete(Integer id) throws DaoException;

	public AHU getAhuObject(Integer ahuId) throws DaoException;

	public Area getAreaObject(Integer areaId) throws DaoException;

	public List<AHU> getAhuDetails() throws DaoException;

	public List<ApplicableTestRoom> getApplicableTestRoomDetails() throws DaoException;

	public void saveApplicableTestRoomDetails(ApplicableTestRoom applicableTestRoom) throws DaoException;

	public Room getRoomObject(Integer roomId)throws DaoException;

	public void updateApplicableTestRoomDetails(ApplicableTestRoom applicableTestRoom) throws DaoException;

	public void deleteApplicableTestRoomDetails(ApplicableTestRoom applicableTestRoom) throws DaoException;

	public List<Room> getRoomId() throws DaoException;

	public ApplicableTestRoom getObjectApplicableTestRoom(Integer id) throws DaoException;

	public List<Area> getAreaDetails() throws DaoException;


}
