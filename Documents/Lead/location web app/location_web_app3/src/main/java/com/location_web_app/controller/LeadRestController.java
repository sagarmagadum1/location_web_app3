package com.location_web_app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location_web_app.entity.Lead;
import com.location_web_app.repository.LeadREpository;

@RestController
@RequestMapping("locations")
public class LeadRestController {
	    @Autowired
	    LeadREpository leadRepo;
	
	     @GetMapping
	    public List<Lead> getAllLoctions(){
	    	return leadRepo.findAll() ;
	    }
        
	     @PostMapping
	     public Lead saveLocation(@RequestBody Lead location) {
	    	 return leadRepo.save(location);
	     }
	     
	     @DeleteMapping("/{id}")
	     public void deleteLocation(@PathVariable("id") Long id) {
	    		leadRepo.deleteById(id);
	     
	     }
	     
	     @PutMapping
	     public Lead updateLocation(@RequestBody Lead location) {
	    	 return leadRepo.save(location);
	     }
}
