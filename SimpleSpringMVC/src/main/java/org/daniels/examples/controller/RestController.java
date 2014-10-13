package org.daniels.examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/restexample")
public class RestController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getName(@PathVariable String name, ModelMap model) {

		model.addAttribute("samplename", name);
		return "testname";

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefaultName(ModelMap model) {

		model.addAttribute("samplename", "this is default name");
		return "testname";

	}

}