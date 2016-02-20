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

import com.valdoc.dto.RoleDTO;
import com.valdoc.exception.ValdocException;
import com.valdoc.service.RoleService;

@RestController
@RequestMapping("/role")
public class UserRoleController {

	protected static Logger logger = LoggerFactory.getLogger(UserRoleController.class);

	private final static String VIEWNAME = "role-list";

	@Autowired
	RoleService service;

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getView() {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RoleDTO>> getJsonData() {
		List<RoleDTO> roleDTOs = new ArrayList<RoleDTO>();
		try {
			roleDTOs = service.getRoleDetails();
		} catch (ValdocException e) {
			logger.error("ERROR  JsonData() {}", e.getMessage());
			return new ResponseEntity<List<RoleDTO>>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			logger.error("ERROR  JsonData() {}", e);
			return new ResponseEntity<List<RoleDTO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<RoleDTO>>(roleDTOs, HttpStatus.OK);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleAddUser(@RequestBody RoleDTO dto) {

		final ModelAndView mv = new ModelAndView();
		try {
			service.add(dto);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleUpdateUser(@RequestBody RoleDTO dto) {
		final ModelAndView mv = new ModelAndView();
		try {
			service.update(dto);
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView handleDeleteUser(@RequestBody RoleDTO dto) {
		final ModelAndView mv = new ModelAndView();
		try {
			service.delete(dto.getId());
		} catch (ValdocException e) {
			e.printStackTrace();
		}
		mv.setViewName(VIEWNAME);
		return mv;
	}
}
