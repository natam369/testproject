package com.CollegeRegistration.service;

import java.util.ArrayList;

import com.CollegeRegistration.entity.Details;
import com.CollegeRegistration.exceptions.DaoException;
import com.CollegeRegistration.exceptions.ServiceException;

public interface UniversityService {

	String inUniversity(int universityId, String universityName) throws ServiceException;

	ArrayList<Integer> getUids() throws ServiceException;

	ArrayList<Details> getDetails(int uid) throws ServiceException;

	ArrayList<Details> getDetails(double rating) throws ServiceException;

	String validateUniversityID(int universityId) throws ServiceException;

	ArrayList<Integer> getUniversity(int universityId1) throws ServiceException;

	String validateUniversity(int universityId1) throws ServiceException;

}
