package com.department.service.packag.impl;

import org.springframework.stereotype.Service;

import com.department.service.entity.Department;
import com.department.service.packag.DepartmentService;
import com.department.service.repository.DepartmentRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}

	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

}
