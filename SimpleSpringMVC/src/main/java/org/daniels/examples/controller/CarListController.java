package org.daniels.examples.controller;

import org.daniels.examples.service.CarManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarListController {
	 
	@RequestMapping(value = "/carlist", method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
 
		CarManager carManager = new CarManager();
 
		ModelAndView modelAndView = new ModelAndView("carList");
		modelAndView.addObject("carList", carManager.getCarList());
 
		return modelAndView;
	}
}