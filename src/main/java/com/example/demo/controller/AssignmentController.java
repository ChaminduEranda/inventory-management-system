package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Assignment;
import com.example.demo.service.AssignmentService;

@Controller
public class AssignmentController {

	@Autowired
	private AssignmentService assignmentService;
	
	public AssignmentController(AssignmentService assignmentService) {
		super();
		this.assignmentService = assignmentService;
	}
	
	@GetMapping("/assignments")
	public String listAssignments(Model model) {
		model.addAttribute("assignments", assignmentService.getAllAssignments());
		return "assignments";
	}
	
	@GetMapping("/assignments/new")
	public String createAssignmentForm(Model model) {
		Assignment assignment = new Assignment();
		model.addAttribute("assignment", assignment);
		return "create_assignment";
	}
	
	@PostMapping("/assignments")
	public String saveAssignment(@ModelAttribute("assignment") Assignment assignment) {
		assignmentService.saveAssignment(assignment);
		return "redirect:/assignments";
	}
	
	@GetMapping("/assignments/edit/{id}")
	public String editAssignmentForm(@PathVariable Long id,Model model) {
		model.addAttribute("assignment", assignmentService.getAssignmentById(id));
		return "edit_assignment";
	}
	
	@PostMapping("/assignments/{id}")
	public String updateAssignment(@PathVariable Long id, @ModelAttribute("assignment") Assignment assignment,
			Model model) {

		Assignment existingAssignment = assignmentService.getAssignmentById(id);
		existingAssignment.setId(id);
		existingAssignment.setEmployeeId(assignment.getEmployeeId());
		existingAssignment.setProductId(assignment.getProductId());
		existingAssignment.setIssuedDate(assignment.getIssuedDate());
		existingAssignment.setReturnedDate(assignment.getReturnedDate());

		assignmentService.updateAssignment(existingAssignment);
		return "redirect:/assignments";
	}
	
	@GetMapping("/assignments/{id}")
	public String deleteAssignment(@PathVariable Long id) {
		assignmentService.deleteAssignmentById(id);
		return "redirect:/assignments";
	}
			
}
