package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Project;
import com.project.service.ProjectService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="http://localhost:4200")
public class MyController {
	
	@Autowired
	ProjectService service;
	
	@GetMapping("/ProjectDetails")
	public List<Project> getAllRequirements(){
		return service.getAllRequirements();
	}
	
	@GetMapping("/ProjectDetails/{id}")
	public Project getRequirementById(@PathVariable int id){
		return service.getRequirementById(id);
	}
	
	@PostMapping("/ProjectDetails")
	public Project insertRequirement(@RequestBody Project r) {
		return service.insertRequirement(r);
	}
	
	@PutMapping("/ProjectDetails")
	public Project updateRequirement(@RequestBody Project r) {
		return service.updateRequirement(r);
	}
	
	@GetMapping("/ProjectDetails/afterDelete/{id}")
	public List<Project> deleteRequirement(@PathVariable int id){
		service.deleteRequirement(id);
		return service.getAllRequirements();
	}

}