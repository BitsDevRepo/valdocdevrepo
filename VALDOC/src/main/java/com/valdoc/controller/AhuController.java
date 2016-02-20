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
import com.valdoc.exception.ValdocException;
import com.valdoc.service.AhuService;

@RestController
@RequestMapping("/ahu")
public class AhuController {

	protected static Logger logger = LoggerFactory.getLogger(AhuController.class);

	private final static String VIEWNAME = "ahu-list";

	@Autowired
	AhuService ahuService;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getCalanderView() {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AhuDTO>> getJsonData() {
		List<AhuDTO> ahuDTOs = new ArrayList<AhuDTO>();
		try {
			ahuDTOs = ahuService.getAhuDetails();
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
	public ModelAndView handleAddAhu(@RequestBody AhuDTO ahuDTO) {

		logger.info(ahuDTO.toString());

		final ModelAndView mv = new ModelAndView();
		try {
			ahuService.addAppAhu(ahuDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateUser(@RequestBody AhuDTO ahuDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			ahuService.update(ahuDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteAhu(@RequestBody AhuDTO ahuDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			ahuService.delete(ahuDTO.getAhuId());
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
}
