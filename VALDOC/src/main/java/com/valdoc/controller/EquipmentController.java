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

import com.valdoc.dto.ApplicableTestEquipmentDTO;
import com.valdoc.dto.EquipmentDTO;
import com.valdoc.dto.EquipmentFilterDTO;
import com.valdoc.exception.ValdocException;
import com.valdoc.service.EquipmentService;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {

	protected static Logger logger = LoggerFactory.getLogger(EquipmentController.class);

	private final static String VIEWNAME = "equipment-list";
	private final static String VIEWNAMEFILTER = "filter-list";
	private final static String VIEWNAMEAPPLICABLEEQUIPMENT = "applicable-test-equipment-list";

	@Autowired
	EquipmentService equipmentService;
	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getCalanderView() {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	//Filter view
	
	@RequestMapping(value = "/filter/view", method = RequestMethod.GET)
	public ModelAndView getCalanderViewFilter() {
		final ModelAndView mv1 = new ModelAndView();
		logger.info(VIEWNAMEFILTER);
		mv1.setViewName(VIEWNAMEFILTER);
		logger.info(VIEWNAMEFILTER);
		return mv1;
	}
	
	//ApplicableTestEquipment view
	
	@RequestMapping(value = "/applicabletestequipment/view", method = RequestMethod.GET)
	public ModelAndView getCalanderViewApplicableTestEquipment() {
		final ModelAndView mv2 = new ModelAndView();
		mv2.setViewName(VIEWNAMEAPPLICABLEEQUIPMENT);
		return mv2;
	}
	//Equipment Data
	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EquipmentDTO>> getJsonData() {
		List<EquipmentDTO> equipmentDTOs = new ArrayList<EquipmentDTO>();
		try {
			equipmentDTOs = equipmentService.getEquipmentDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<EquipmentDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<EquipmentDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EquipmentDTO>>(equipmentDTOs, HttpStatus.OK);
	}
	
	// Method for filter Data Retreival
	@RequestMapping(method = RequestMethod.GET, value = "/filter/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EquipmentFilterDTO>> getJsonDataFilter() {
		List<EquipmentFilterDTO> equipmentFilterDTOs = new ArrayList<EquipmentFilterDTO>();
		try {
			equipmentFilterDTOs = equipmentService.getEquipmentFilterDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<EquipmentFilterDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<EquipmentFilterDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EquipmentFilterDTO>>(equipmentFilterDTOs, HttpStatus.OK);
	}
	
	//Applicable test equipment data
	
	@RequestMapping(method = RequestMethod.GET, value = "/applicabletestequipment/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ApplicableTestEquipmentDTO>> getJsonDataApplicableTestEquipment() {
		List<ApplicableTestEquipmentDTO> applicableTestEquipmentDTOs = new ArrayList<ApplicableTestEquipmentDTO>();
		try {
			applicableTestEquipmentDTOs = equipmentService.getApplicableTestEquipmentDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<ApplicableTestEquipmentDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<ApplicableTestEquipmentDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ApplicableTestEquipmentDTO>>(applicableTestEquipmentDTOs, HttpStatus.OK);
	}
	
	//Create Equipment
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleAddEquipment(@RequestBody EquipmentDTO equipmentDTO) {

		logger.info(equipmentDTO.toString());

		final ModelAndView mv = new ModelAndView();
		try {
			equipmentService.save(equipmentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	//Create Filter
	
	@RequestMapping(value = "/filter/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleAddFilter(@RequestBody EquipmentFilterDTO equipmentFilterDTO) {

		logger.info(equipmentFilterDTO.toString());

		final ModelAndView mv1 = new ModelAndView();
		try {
			equipmentService.saveEquipmentFilterDetails(equipmentFilterDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv1.setViewName(VIEWNAMEFILTER);
		return mv1;
	}
	
	//Create Applicable Test Equipment
	
	@RequestMapping(value = "/applicabletestequipment/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleAddApplicableTestEquipment(@RequestBody ApplicableTestEquipmentDTO applicableTestEquipmentDTO) {

		logger.info(applicableTestEquipmentDTO.toString());

		final ModelAndView mv3 = new ModelAndView();
		try {
			equipmentService.saveApplicableTestEquipmentDetails(applicableTestEquipmentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv3.setViewName(VIEWNAMEAPPLICABLEEQUIPMENT);
		return mv3;
	}
	
	//update Equipment

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateEquipment(@RequestBody EquipmentDTO equipmentDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			equipmentService.update(equipmentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	//update Filter
	
	@RequestMapping(value = "/filter/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateFilter(@RequestBody EquipmentFilterDTO equipmentFilterDTO) {
		final ModelAndView mv1 = new ModelAndView();
		try {
			logger.info(equipmentFilterDTO.toString());
			equipmentService.updateEquipmentFilterDetails(equipmentFilterDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv1.setViewName(VIEWNAMEFILTER);
		return mv1;
	}
	
	//update Applicable Test Equipment
	
	@RequestMapping(value = "/applicabletestequipment/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateApplicableTestEquipment(@RequestBody ApplicableTestEquipmentDTO applicableTestEquipmentDTO) {
		final ModelAndView mv2 = new ModelAndView();
		try {
			equipmentService.updateApplicableTestEquipmentDetails(applicableTestEquipmentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv2.setViewName(VIEWNAMEAPPLICABLEEQUIPMENT);
		return mv2;
	}
	
	//Delete Equipment

	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteEquipment(@RequestBody EquipmentDTO equipmentDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			logger.info(equipmentDTO.toString());
			equipmentService.delete(equipmentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	// Delete Filter
	
	@RequestMapping(value = "/filter/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteFilter(@RequestBody EquipmentFilterDTO equipmentFilterDTO) {
		final ModelAndView mv1 = new ModelAndView();
		try {
			equipmentService.deleteEquipmentFilterDetails(equipmentFilterDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv1.setViewName(VIEWNAMEFILTER);
		return mv1;
	}
	
	//Delete ApplicableTestEquipment
	
	@RequestMapping(value = "/applicabletestequipment/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteApplicableTestEquipment(@RequestBody ApplicableTestEquipmentDTO applicableTestEquipmentDTO) {
		final ModelAndView mv2 = new ModelAndView();
		try {
			equipmentService.deleteApplicableTestEquipmentDetails(applicableTestEquipmentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv2.setViewName(VIEWNAMEAPPLICABLEEQUIPMENT);
		return mv2;
	}
}