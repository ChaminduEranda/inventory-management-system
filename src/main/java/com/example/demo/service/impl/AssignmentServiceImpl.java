package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Assignment;
import com.example.demo.repo.AssignmentRepository;
import com.example.demo.service.AssignmentService;

@Service
public class AssignmentServiceImpl implements AssignmentService {

	private AssignmentRepository assignmentRepository;
	
	public AssignmentServiceImpl(AssignmentRepository assignmentRepository) {
		super();
		this.assignmentRepository=assignmentRepository;
	}
	
	@Override
	public List<Assignment> getAllAssignments() {
		return assignmentRepository.findAll();
	}

	@Override
	public Assignment saveAssignment(Assignment assignment) {
		return assignmentRepository.save(assignment);
	}

	@Override
	public Assignment getAssignmentById(Long id) {
		return assignmentRepository.findById(id).get();
	}

	@Override
	public Assignment updateAssignment(Assignment assignment) {
		return assignmentRepository.save(assignment);
	}

	@Override
	public void deleteAssignmentById(Long id) {
		assignmentRepository.deleteById(id);
	}

}
