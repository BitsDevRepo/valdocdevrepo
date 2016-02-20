package com.valdoc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

	protected static Logger logger = LoggerFactory.getLogger(ExceptionController.class);

	private static final String VIEWNAME_EXCEPTION = "404";
	private static final String VIEWNAME_HOME_EXP = "405";

	@RequestMapping(value = "/exception", method = RequestMethod.GET)
	public ModelAndView handleException() throws Exception {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME_EXCEPTION);
		return mv;
	}

	@RequestMapping(value = "/home-exception", method = RequestMethod.GET)
	public ModelAndView handleHomeException() throws Exception {
		final ModelAndView mv = new ModelAndView();
		mv.setViewName(VIEWNAME_HOME_EXP);
		return mv;
	}

}