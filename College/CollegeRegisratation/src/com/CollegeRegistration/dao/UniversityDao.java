package com.CollegeRegistration.dao;

import java.util.ArrayList;

import com.CollegeRegistration.entity.Details;
import com.CollegeRegistration.exceptions.DaoException;

public interface UniversityDao {

	String inUniversityDao(int universityId, String universityName) throws DaoException;

	ArrayList<Integer> getUidsDao() throws DaoException;

	ArrayList<Details> getDetailsDao(int uid) throws DaoException;

	ArrayList<Details> getDetailsDao(double rating) throws DaoException;
}
