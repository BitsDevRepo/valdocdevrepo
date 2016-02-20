package com.valdoc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.valdoc.dto.UserDTO;
import com.valdoc.exception.ValdocException;
import com.valdoc.service.UserService;
import com.valdoc.util.UtilityService;

@Controller
public class HomeController {

	protected static Logger logger = LoggerFactory.getLogger(HomeController.class);

	private static final String VIEWNAME_LOGIN = "index";
	private static final String VIEWNAME_HOME = "landing";
	private static final String VIEWNAME_CONSTRUCT = "underconstruction";

	@Autowired
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView handleGetHome() throws Exception {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME_LOGIN);
		return mv;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView handlePostLogin(@ModelAttribute("form") UserDTO userDTO, HttpServletRequest req, HttpServletResponse res) throws Exception {
		final ModelAndView mv = new ModelAndView();

		try {

			UserDTO user = userService.validateLogin(userDTO);
			if (null != user && (user.getPassword() != null)) {
				String decodedPass = UtilityService.decode(user.getPassword());
				if (decodedPass.equals(userDTO.getPassword())) {
					mv.addObject("uNameNotValid", false);
					mv.addObject("user", user);
					mv.setViewName(VIEWNAME_HOME);
				} else {
					mv.addObject("uNameNotValid", true);
					mv.setViewName(VIEWNAME_LOGIN);
				}

			} else {
				mv.addObject("uNameNotValid", false);
				mv.setViewName(VIEWNAME_LOGIN);
			}

		} catch (ValdocException e) {
			logger.error("ERROR handlePostLogin() {}", e.getMessage());
			return new ModelAndView("redirect:/home-exception");

		} catch (Exception e) {
			logger.error("ERROR handlePostLogin() {}", e);
			return new ModelAndView("redirect:/home-exception");

		}

		return mv;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView handleGetLogin(@ModelAttribute("form") UserDTO userDTO, HttpServletRequest req, HttpServletResponse res) throws Exception {
		final ModelAndView mv = new ModelAndView();

		try {

			UserDTO user = userService.validateLogin(userDTO);
			if (null != user && (user.getPassword() != null)) {
				String decodedPass = UtilityService.decode(user.getPassword());
				if (decodedPass.equals(userDTO.getPassword())) {
					mv.addObject("uNameNotValid", false);
					mv.addObject("user", user);
					mv.setViewName(VIEWNAME_HOME);
				} else {
					mv.addObject("uNameNotValid", true);
					mv.setViewName(VIEWNAME_LOGIN);
				}

			} else {
				mv.addObject("uNameNotValid", false);
				mv.setViewName(VIEWNAME_LOGIN);
			}

		} catch (ValdocException e) {
			logger.error("ERROR handlePostLogin() {}", e.getMessage());
			return new ModelAndView("redirect:/home-exception");

		} catch (Exception e) {
			logger.error("ERROR handlePostLogin() {}", e);
			return new ModelAndView("redirect:/home-exception");

		}

		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/view")
	public ModelAndView handleSubView() throws Exception {

		final ModelAndView mv = new ModelAndView();
		try {
			mv.setViewName(VIEWNAME_HOME);

		} catch (Exception e) {
			logger.error("ERROR handleSubView() {}", e.getMessage());
		}
		return mv;
	}

	@RequestMapping(value = "/underconstruction", method = RequestMethod.GET)
	public ModelAndView handleUnderConstruction() throws Exception {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME_CONSTRUCT);
		return mv;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView handleLogout(HttpServletRequest req) throws Exception {
		final ModelAndView mv = new ModelAndView();
		HttpSession session = req.getSession();
		session.invalidate();
		mv.setViewName(VIEWNAME_LOGIN);
		return mv;
	}

}