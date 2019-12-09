package com.CollegeRegistration.service;

import com.CollegeRegistration.exceptions.ServiceException;

public interface CollegeService {

	String inCollege(int universityId1, int collegeId, String collegeName, double rating) throws ServiceException;

	String validateRating(double rating) throws ServiceException;

}
