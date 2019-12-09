package com.CollegeRegistration.service.impl;

import com.CollegeRegistration.dao.CollegeDao;
import com.CollegeRegistration.dao.daoimpl.CollegeDaoImpl;
import com.CollegeRegistration.exceptions.DaoException;
import com.CollegeRegistration.exceptions.InvalidRatingException;
import com.CollegeRegistration.exceptions.ServiceException;
import com.CollegeRegistration.service.CollegeService;

public class CollegeServiceImpl implements CollegeService {

	CollegeDao cDao = new CollegeDaoImpl();

	@Override
	public String inCollege(int universityId1, int collegeId, String collegeName, double rating)
			throws ServiceException {
		// TODO Auto-generated method stub
		String msg;
		try {
			msg = cDao.inCollegeDao(universityId1, collegeId, collegeName, rating);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		}
		return msg;
	}

	@Override
	public String validateRating(double rating) throws ServiceException {
		// TODO Auto-generated method stub
		String msg="";
		try {
			if(rating<0 || rating >10)
			{
				throw new InvalidRatingException("rating ranges from 0 to 10");
			}
		}
		catch(InvalidRatingException e)
		{
			throw new ServiceException(e);
		}
		return msg;
	}

}
