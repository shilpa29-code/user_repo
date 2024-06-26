package com.department.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.service.entity.Department;
import com.department.service.packag.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

	private DepartmentService departmentService;

	@PostMapping
	public ResponseEntity<Department> saveDepartment(@RequestBody Department department) {
		Department savedDepartment = departmentService.saveDepartment(department);
		return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId) {
		Department department = departmentService.getDepartmentById(departmentId);
		return ResponseEntity.ok(department);
	}

	public DepartmentController(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

}
