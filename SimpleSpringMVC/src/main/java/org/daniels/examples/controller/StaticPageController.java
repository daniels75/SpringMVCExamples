package org.daniels.examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticPageController {

   @RequestMapping(value = "/samplestatic", method = RequestMethod.GET)
   public String index() {
	   return "samplestatic";
   }
   
   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
   public String redirect() {
     
      return "redirect:/pages/finalpage.html";
   }
}