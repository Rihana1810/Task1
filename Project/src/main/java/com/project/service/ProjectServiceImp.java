package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.ProjectRepository;
import com.project.model.Project;

@Service
public class ProjectServiceImp implements ProjectService {
    
	@Autowired
	ProjectRepository repository;
	
	@Override
	public List<Project> getAllRequirements() {//list
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Project getRequirementById(int id) {//search
		// TODO Auto-generated method stub
		Optional<Project> requirement=repository.findById(id);
		return requirement.get();
	}

	@Override
	public Project insertRequirement(Project r) {
		// TODO Auto-generated method stub
		return repository.save(r);
	}

	@Override
	public Project updateRequirement(Project r) {
		// TODO Auto-generated method stub
		Optional<Project> req=repository.findById(r.getId());
		Project requirement=req.get();
		requirement.setStatus(r.getStatus());
		return repository.save(requirement);
	}

	@Override
	public void deleteRequirement(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}