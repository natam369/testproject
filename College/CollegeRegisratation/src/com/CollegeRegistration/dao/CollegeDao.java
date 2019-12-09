package com.CollegeRegistration.dao;

import com.CollegeRegistration.exceptions.DaoException;

public interface CollegeDao {

	String inCollegeDao(int universityId1, int collegeId, String collegeName, double rating) throws DaoException;

}
