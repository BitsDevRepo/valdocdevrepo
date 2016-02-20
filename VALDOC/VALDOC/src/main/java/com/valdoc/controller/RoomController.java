package com.valdoc.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.valdoc.dto.AhuDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.exception.ValdocException;
import com.valdoc.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	protected static Logger logger = LoggerFactory.getLogger(RoomController.class);

	private final static String VIEWNAME = "room-list";

	@Autowired
	RoomService roomService;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getCalanderView() {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RoomDTO>> getJsonData1() {
		List<RoomDTO> roomDTOs = new ArrayList<RoomDTO>();
		try {
			roomDTOs = roomService.getRoomDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData1() {}", e.getMessage());
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<RoomDTO>>(roomDTOs, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/ahudata", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AhuDTO>> getJsonData() {
		List<AhuDTO> ahuDTOs = new ArrayList<AhuDTO>();
		try {
			ahuDTOs = roomService.getAhuDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<AhuDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<AhuDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<AhuDTO>>(ahuDTOs, HttpStatus.OK);
	}

	
	

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleRoom(@RequestBody RoomDTO roomDTO) {

		logger.info(roomDTO.toString());

		final ModelAndView mv = new ModelAndView();
		try {
			roomService.addRoom(roomDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateRoom(@RequestBody RoomDTO roomDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			roomService.update(roomDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteRoom(@RequestBody RoomDTO roomDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			roomService.delete(roomDTO.getRoomId());
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
}
