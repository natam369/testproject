package com.mindtree.employeeregisteration.dao;

import org.springframework.stereotype.Component;

import com.mindtree.employeeregisteration.entity.DepartmentEntity;

@Component
public class DepartmentDao {
	
	public DepartmentEntity  addDepartment(DepartmentEntity departmentEntity)
	{
		//logic to save to db and generate a key
		//logic to get key and set in Department entity
		System.out.println("in dao"+departmentEntity);
		return departmentEntity;
	}

}
