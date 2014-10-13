package org.daniels.examples.controller;

import org.daniels.examples.exceptions.SampleSpringException;
import org.daniels.examples.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("user", "command", new User());
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	@ExceptionHandler({ SampleSpringException.class })
	public String addStudent(@ModelAttribute("HelloWeb") User user,
			ModelMap model) {

		if (user.getName().length() < 5) {
			throw new SampleSpringException("Given name is too short");
		} else {
			model.addAttribute("name", user.getName());
		}
		if (user.getAge() < 10) {
			throw new SampleSpringException("Given age is too low");
		} else {
			model.addAttribute("age", user.getAge());
		}
		model.addAttribute("id", user.getId());
		return "userresult";
	}
}