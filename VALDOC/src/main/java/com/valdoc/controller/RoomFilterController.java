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
import com.valdoc.dto.GrillDTO;
import com.valdoc.dto.AreaDTO;
import com.valdoc.dto.RoomFilterDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.exception.ValdocException;
import com.valdoc.service.RoomFilterService;
import com.valdoc.service.RoomService;

@RestController
@RequestMapping("/roomFilter")
public class RoomFilterController {

	protected static Logger logger = LoggerFactory.getLogger(RoomFilterController.class);

	private final static String VIEWNAME = "roomFilter-list";
	private final static String VIEWNAMEGRILL = "grill-list";

	@Autowired
	RoomFilterService roomFilterService;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getCalanderView() {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	//Grill view
	
	@RequestMapping(value = "/grill/view", method = RequestMethod.GET)
	public ModelAndView getCalanderViewGrill() {
		final ModelAndView mv1 = new ModelAndView();
		mv1.setViewName(VIEWNAMEGRILL);
		return mv1;
	}


	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RoomFilterDTO>> getJsonData() {
		List<RoomFilterDTO> roomFilterDTOs = new ArrayList<RoomFilterDTO>();
		try {
			roomFilterDTOs = roomFilterService.getRoomFilterDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<RoomFilterDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<RoomFilterDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<RoomFilterDTO>>(roomFilterDTOs, HttpStatus.OK);
	}
	
	
	//grill data
	
	@RequestMapping(method = RequestMethod.GET, value = "/grill/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<GrillDTO>> getJsonDataGrill() {
		List<GrillDTO> grillDTOs = new ArrayList<GrillDTO>();
		try {
			grillDTOs = roomFilterService.getGrillDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<GrillDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<GrillDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<GrillDTO>>(grillDTOs, HttpStatus.OK);
	}

	
	@RequestMapping(method = RequestMethod.GET, value = "/roomData", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RoomDTO>> getJsonData1() {
		List<RoomDTO> roomDTOs = new ArrayList<RoomDTO>();
		try {
			roomDTOs = roomFilterService.getRoomDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<RoomDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<RoomDTO>>(roomDTOs, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleRoom(@RequestBody RoomFilterDTO roomFilterDTO) {
		logger.info(roomFilterDTO.toString());

		final ModelAndView mv = new ModelAndView();
		try {
			roomFilterService.addRoomFilter(roomFilterDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}	
	//Create grill
	
	@RequestMapping(value = "/grill/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleAddGrill(@RequestBody GrillDTO grillDTO) {
System.out.println("grill create caling");
		logger.info(grillDTO.toString());

		final ModelAndView mv3 = new ModelAndView();
		try {
			roomFilterService.saveGrillDetails(grillDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv3.setViewName(VIEWNAMEGRILL);
		return mv3;
	}


	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateRoomFilter(@RequestBody RoomFilterDTO roomFilterDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			roomFilterService.update(roomFilterDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	//update grill
	
	@RequestMapping(value = "/grill/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateGrill(@RequestBody GrillDTO grillDTO) {System.out.println("grill update caling");
		final ModelAndView mv2 = new ModelAndView();
		try {
			roomFilterService.updateGrillDetails(grillDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv2.setViewName(VIEWNAMEGRILL);
		return mv2;
	}


	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteRoomFilter(@RequestBody RoomFilterDTO roomFilterDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			roomFilterService.delete(roomFilterDTO.getFilterId());
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	//Delete grill
	
	@RequestMapping(value = "/grill/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteGrill(@RequestBody GrillDTO grillDTO) {
		final ModelAndView mv2 = new ModelAndView();
		try {
			roomFilterService.deleteGrillDetails(grillDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv2.setViewName(VIEWNAMEGRILL);
		return mv2;
	}
}
