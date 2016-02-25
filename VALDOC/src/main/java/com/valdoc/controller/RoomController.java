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
import com.valdoc.dto.ApplicableTestRoomDTO;
import com.valdoc.dto.AreaDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.exception.ValdocException;
import com.valdoc.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	protected static Logger logger = LoggerFactory.getLogger(RoomController.class);

	private final static String VIEWNAME = "room-list";
	private final static String VIEWNAMEAPPLICABLEROOM = "applicable-test-room-list";

	@Autowired
	RoomService roomService;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getCalanderView() {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	//ApplicableTestRoom view
	
	@RequestMapping(value = "/applicabletestroom/view", method = RequestMethod.GET)
	public ModelAndView getCalanderViewApplicableTestRoom() {
		final ModelAndView mv1 = new ModelAndView();
		mv1.setViewName(VIEWNAMEAPPLICABLEROOM);
		return mv1;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RoomDTO>> getJsonData() {
		List<RoomDTO> roomDTOs = new ArrayList<RoomDTO>();
		try {
			roomDTOs = roomService.getRoomDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<RoomDTO>>(roomDTOs, HttpStatus.OK);
	}
	
	//for Room Id
	
	@RequestMapping(method = RequestMethod.GET, value = "/applicabletestroom/roomData", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RoomDTO>> getJsonData4() {
		List<RoomDTO> roomDTOs = new ArrayList<RoomDTO>();
		try {
			roomDTOs = roomService.getRoomId();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<RoomDTO>>(roomDTOs, HttpStatus.OK);
	}
	
	//Applicable test room data
	
	@RequestMapping(method = RequestMethod.GET, value = "/applicabletestroom/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ApplicableTestRoomDTO>> getJsonDataApplicableTestRoom() {
		List<ApplicableTestRoomDTO> applicableTestRoomDTOs = new ArrayList<ApplicableTestRoomDTO>();
		try {
			applicableTestRoomDTOs = roomService.getApplicableTestRoomDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<ApplicableTestRoomDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<ApplicableTestRoomDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ApplicableTestRoomDTO>>(applicableTestRoomDTOs, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/ahuData", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AhuDTO>> getJsonData1() {
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

	
	@RequestMapping(method = RequestMethod.GET, value = "/areaData", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AreaDTO>> getJsonData2() {
		List<AreaDTO> areaDTOs = new ArrayList<AreaDTO>();
		try {
			areaDTOs = roomService.getAreaDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<AreaDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<AreaDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<AreaDTO>>(areaDTOs, HttpStatus.OK);
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
	
	//Create Applicable Test Room
	
	@RequestMapping(value = "/applicabletestroom/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleAddApplicableTestRoom(@RequestBody ApplicableTestRoomDTO applicableTestRoomDTO) {

		logger.info(applicableTestRoomDTO.toString());

		final ModelAndView mv3 = new ModelAndView();
		try {
			roomService.saveApplicableTestRoomDetails(applicableTestRoomDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv3.setViewName(VIEWNAMEAPPLICABLEROOM);
		return mv3;
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
	
	//update Applicable Test Room
	
	@RequestMapping(value = "/applicabletestroom/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateApplicableTestRoom(@RequestBody ApplicableTestRoomDTO applicableTestRoomDTO) {
		final ModelAndView mv2 = new ModelAndView();
		try {
			roomService.updateApplicableTestRoomDetails(applicableTestRoomDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv2.setViewName(VIEWNAMEAPPLICABLEROOM);
		return mv2;
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
	
	//Delete ApplicableTestRoom
	
	@RequestMapping(value = "/applicabletestroom/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteApplicableTestRoom(@RequestBody ApplicableTestRoomDTO applicableTestRoomDTO) {
		final ModelAndView mv2 = new ModelAndView();
		try {
			roomService.deleteApplicableTestRoomDetails(applicableTestRoomDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv2.setViewName(VIEWNAMEAPPLICABLEROOM);
		return mv2;
	}
}
