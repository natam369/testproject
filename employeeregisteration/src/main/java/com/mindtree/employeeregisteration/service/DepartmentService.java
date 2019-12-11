package com.mindtree.employeeregisteration.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employeeregisteration.dao.DepartmentDao;
import com.mindtree.employeeregisteration.entity.DepartmentEntity;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao departmentDao;

	Set<DepartmentEntity> departments = new HashSet<DepartmentEntity>();

	public DepartmentEntity addDepartment(DepartmentEntity departmentEntity) {
		System.out.println(" In Service" + departmentEntity);
		departments.add(departmentEntity);
		return departmentEntity;
	}

	public Set<DepartmentEntity> getAllDepartments() {
		return departments;
	}

	public DepartmentEntity updateDepartmentNameById(int departmentid, DepartmentEntity departmentEntity) {
	
	DepartmentEntity departmentEntity2=new DepartmentEntity();
	departmentEntity2.setDepartmentId(departmentid);
if(departments.remove(departmentEntity2))
{
	departmentEntity.setDepartmentId(departmentid);
	departments.add(departmentEntity);
}
	return departmentEntity;
	}
	

}
