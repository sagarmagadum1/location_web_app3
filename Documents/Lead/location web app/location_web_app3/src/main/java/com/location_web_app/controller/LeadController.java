package com.location_web_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location_web_app.entity.Lead;
import com.location_web_app.repository.LeadREpository;


@Controller
public class LeadController {
	@Autowired
	LeadREpository leadRepo;
	//localhost:9090/show
      
	  @RequestMapping("/show")
	  public String showLocation() {
		  return "showLead";
	  }
	  @RequestMapping("/savLoc")
	  public String saveLoc(@ModelAttribute("location") Lead location,ModelMap modelMap) {
		
		  leadRepo.save(location);
		  
		  modelMap.addAttribute("msg", "location saved!!");
		  return "showLead";
	  }
	  
	  @RequestMapping("/getLocations")
	  public String getLocations(ModelMap modelMap) {
		  List<Lead> locations = leadRepo.findAll();
		  modelMap.addAttribute("locations", locations);
		  return "getLocations";
	  }
	  @RequestMapping("/deleteLocation")
	  public String deleteLocation(@RequestParam("id") long id,ModelMap modelMap) {
		  leadRepo.deleteById(id);
		  List<Lead> locations = leadRepo.findAll();
		  modelMap.addAttribute("locations", locations);
		  return "getLocations";
	  }
	  

}
