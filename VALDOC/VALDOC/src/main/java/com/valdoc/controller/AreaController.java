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

import com.valdoc.dto.AreaDTO;
import com.valdoc.exception.ValdocException;
import com.valdoc.service.AhuService;
import com.valdoc.service.AreaService;

@RestController
@RequestMapping("/area")
public class AreaController {

	protected static Logger logger = LoggerFactory.getLogger(AreaController.class);

	private final static String VIEWNAME = "area-list";

	@Autowired
	AreaService areaService;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getCalanderView() {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AreaDTO>> getJsonData() {
		List<AreaDTO> areaDTOs = new ArrayList<AreaDTO>();
		try {
			areaDTOs = areaService.getAreaDetails();
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
	public ModelAndView handleArea(@RequestBody AreaDTO areaDTO) {

		logger.info(areaDTO.toString());

		final ModelAndView mv = new ModelAndView();
		try {
			areaService.addArea(areaDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateArea(@RequestBody AreaDTO areaDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			areaService.update(areaDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteArea(@RequestBody AreaDTO areaDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			areaService.delete(areaDTO.getAreaId());
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
}
