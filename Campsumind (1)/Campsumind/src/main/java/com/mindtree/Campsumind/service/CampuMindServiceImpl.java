package com.mindtree.Campsumind.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.Campsumind.entity.CampusMind;
import com.mindtree.Campsumind.entity.Laptop;
import com.mindtree.Campsumind.exception.NoSuchIdException;
import com.mindtree.Campsumind.repository.CampuMindRepository;

@Service
public class CampuMindServiceImpl implements CampusMindService {

	@Autowired
	CampuMindRepository campuMindRepository;

	@Override
	public CampusMind addCampusmind(CampusMind campusMind) {
		// TODO Auto-generated method stub
		return campuMindRepository.save(campusMind);
	}

	@Override
	public Laptop getlaptopfromcampusmind(String mid) throws NoSuchIdException {
		// TODO Auto-generated method stub

		try {
			return campuMindRepository.findById(mid).get().getLaptop();
		} catch (NoSuchElementException e) {
			throw new NoSuchIdException("invalid mid", e);
		}
	}

}
