package com.valdoc.dao;

import java.util.List;

import com.valdoc.entity.RoomFilter;
import com.valdoc.entity.Grill;
import com.valdoc.entity.Room;
import com.valdoc.exception.ValdocException;

public interface RoomFilterDAO {

	List<RoomFilter> getRoomFilterDetails() throws ValdocException;

	RoomFilter getObject(Integer id) throws ValdocException;

	void add(RoomFilter roomFilter) throws ValdocException;

	void delete(Integer id) throws ValdocException;

	Room getRoomObject(Integer roomId) throws ValdocException;

	List<Room> getRoomDetails() throws ValdocException;

	void update(RoomFilter roomFilter) throws ValdocException;

	List<Grill> getGrillDetails() throws ValdocException;

	Grill getGrillObject(Integer id)throws ValdocException;

	void saveGrill(Grill grill) throws ValdocException;

	void updateGrillDetails(Grill grill) throws ValdocException;

	void deleteGrill(Grill grillId) throws ValdocException;

}
