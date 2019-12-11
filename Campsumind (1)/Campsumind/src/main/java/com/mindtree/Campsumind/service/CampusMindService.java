package com.mindtree.Campsumind.service;

import com.mindtree.Campsumind.entity.CampusMind;
import com.mindtree.Campsumind.entity.Laptop;
import com.mindtree.Campsumind.exception.NoSuchIdException;

public interface CampusMindService {

	CampusMind addCampusmind(CampusMind campusMind);

	Laptop getlaptopfromcampusmind(String mid) throws NoSuchIdException;

}
