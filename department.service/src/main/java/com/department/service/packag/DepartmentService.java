package com.department.service.packag;

import com.department.service.entity.Department;

public interface DepartmentService {
	Department saveDepartment(Department department);

	Department getDepartmentById(Long departmentId);
}
