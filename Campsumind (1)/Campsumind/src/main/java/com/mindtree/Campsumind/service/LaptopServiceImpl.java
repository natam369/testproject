package com.mindtree.Campsumind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.Campsumind.entity.Laptop;
import com.mindtree.Campsumind.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	LaptopRepository laptopRepository;

	@Override
	public Laptop insertlaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

}
