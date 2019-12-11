package com.mindtree.Campsumind.controller;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Campsumind.entity.CampusMind;
import com.mindtree.Campsumind.entity.Laptop;
import com.mindtree.Campsumind.exception.NoSuchIdException;
import com.mindtree.Campsumind.service.CampusMindService;
import com.mindtree.Campsumind.service.LaptopService;

@RestController
public class CampusMindController {

	@Autowired
	CampusMindService campusMindService;

	@Autowired
	LaptopService laptopService;

	@PostMapping(value = "/add/campusmind")
	public CampusMind addcampusmind(@RequestBody CampusMind campusMind) {

		Laptop laptop = campusMind.getLaptop();
		laptopService.insertlaptop(laptop);
		return campusMindService.addCampusmind(campusMind);

	}

	@RequestMapping(value = "/get/laptop/{id}")
	public Laptop getlaptop(@PathVariable("id") String mid) throws NoSuchIdException {
		try {
			return campusMindService.getlaptopfromcampusmind(mid);
		} catch (ServiceException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
