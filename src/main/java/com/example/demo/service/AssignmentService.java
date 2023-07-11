package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Assignment;

public interface AssignmentService {

	List<Assignment> getAllAssignments();
	
	Assignment saveAssignment(Assignment assignment);
	
	Assignment getAssignmentById(Long id);
	
	Assignment updateAssignment(Assignment assignment);
	
	void deleteAssignmentById(Long id);
}
