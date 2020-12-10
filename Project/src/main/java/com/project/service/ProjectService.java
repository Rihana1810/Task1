package com.project.service;

import java.util.List;

import com.project.model.Project;

public interface ProjectService {

	public List<Project> getAllRequirements();

	public Project getRequirementById(int id);

	public Project insertRequirement(Project r);

	public Project updateRequirement(Project r);

	public void deleteRequirement(int id);

}