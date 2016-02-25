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
import com.valdoc.dto.ClientInstrumentDTO;
import com.valdoc.dto.RoomDTO;
import com.valdoc.exception.ValdocException;
import com.valdoc.service.ClientInstrumentService;
import com.valdoc.service.RoomService;

@RestController
@RequestMapping("/clientInstrument")
public class ClientInstrumentController {

	protected static Logger logger = LoggerFactory.getLogger(ClientInstrumentController.class);

	private final static String VIEWNAME = "clientInstrument-list";

	@Autowired
	ClientInstrumentService clientInstrumentService;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getCalanderView() {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClientInstrumentDTO>> getJsonData() {
		List<ClientInstrumentDTO> clientInstrumentDTOs = new ArrayList<ClientInstrumentDTO>();
		try {
			clientInstrumentDTOs = clientInstrumentService.getClientInstrumentDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<ClientInstrumentDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<ClientInstrumentDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ClientInstrumentDTO>>(clientInstrumentDTOs, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleRoom(@RequestBody ClientInstrumentDTO clientInstrumentDTO) {
		logger.info(clientInstrumentDTO.toString());

		final ModelAndView mv = new ModelAndView();
		try {
			clientInstrumentService.addClientInstrument(clientInstrumentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}	

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateClientInstrument(@RequestBody ClientInstrumentDTO clientInstrumentDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			clientInstrumentService.update(clientInstrumentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteClientInstrument(@RequestBody ClientInstrumentDTO clientInstrumentDTO) {
		final ModelAndView mv = new ModelAndView();
		try {
			clientInstrumentService.delete(clientInstrumentDTO);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
}
