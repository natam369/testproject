package com.mindtree.employeeregisteration.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.employeeregisteration.entity.DepartmentEntity;
import com.mindtree.employeeregisteration.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	

	@PostMapping(value = "/department")
	public DepartmentEntity addDepartment(@RequestBody DepartmentEntity departmentEntity) {

		System.out.println(departmentEntity);
		departmentService.addDepartment(departmentEntity);
		return departmentEntity;

	}

	@GetMapping(value="/departments")
	public Set<DepartmentEntity>getAllDepartment(){
		
		return departmentService.getAllDepartments();
	}
	
@PutMapping(value="/department")

public DepartmentEntity updateDepartmentNameById(@RequestParam("departmentId") int departmentid,@RequestBody DepartmentEntity departmentEntity) 
{
	return departmentService.updateDepartmentNameById(departmentid,departmentEntity);
}
}
